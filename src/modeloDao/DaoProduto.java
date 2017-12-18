/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansProduto;


/**
 *
 * @author Cayque
 */
public class DaoProduto {
    
    ConexaoBD conex = new ConexaoBD();
    BeansProduto mod = new BeansProduto();
    private double total=0;
    DecimalFormat df = new DecimalFormat("0.00");
    
    
    public void Salvar(BeansProduto mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos (nome_produto,p_entrada_produto,p_saida_produto,quantidade_produto,codigo_produto,total_gasto) values(?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getpCompra());
            pst.setDouble(3, mod.getpVenda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, mod.getCodigo());
            pst.setDouble(6,Double.parseDouble(df.format(mod.getpCompra()*mod.getQuantidade()).replaceAll(",", ".")));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void Excluir(BeansProduto mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from produtos where codigo_produto=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    public void Editar(BeansProduto mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos set nome_produto=?,p_entrada_produto=?,p_saida_produto=?,quantidade_produto=?,codigo_produto=?,total_gasto=? where codigo_produto=?");
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getpCompra());
            pst.setDouble(3, mod.getpVenda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, mod.getCodigo());
            pst.setDouble(6, mod.getpCompra()*mod.getQuantidade());
            pst.setInt(7, mod.getAuxiliar());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    public Double PegarGastoTotal(){
        conex.conexao();
        conex.executaSql("select sum(total_gasto) as soma from produtos");
        try {
            conex.rs.first();
            total= conex.rs.getDouble("soma");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel calcular o preço total gasto com compras de produtos!\n"+ex.getMessage());
        }
        conex.desconecta();
        return total;
    }

    public Double PegarVendasTotal(){
        conex.conexao();
        conex.executaSql("SELECT SUM(valor_final) AS soma FROM produtos_vendas");
        try {
            conex.rs.first();
            total= conex.rs.getDouble("soma");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel calcular o valor final das vendas!\n"+ex.getMessage());
        }
        conex.desconecta();
        return total;
    }
    
    public Double PegarLucroReal(){
        total = PegarVendasTotal()-PegarGastoTotal();
        return total;
    }

    public double PegarLucroPorcento(){
        total = (PegarLucroReal()/PegarGastoTotal())*100;
        return total;
    }
    

}
