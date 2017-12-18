/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansVenda;
import modeloConection.ConexaoBD;

/**
 *
 * @author Lab-NTM-01
 */
public class DaoVendas {
    ConexaoBD conex = new ConexaoBD();
    BeansVenda mod = new BeansVenda();
    DecimalFormat df = new DecimalFormat("0.00");
    
    private int quantidade=0;
    
    
    
    public void AtualizaProdutosVenda(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update produtos_vendas set id_venda=? where id_venda=?");
            pst.setInt(1, mod.getId_venda());
            pst.setInt(2, 0);
            pst.execute();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar id de venda: \n"+ex);        
        }
        conex.desconecta();
    }
  
    public void AtualizaProdutosEstoque(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("UPDATE produtos p INNER JOIN produtos_vendas pv ON p.`id_produto` = pv.`id_produtos` SET p.`quantidade_produto` = p.`quantidade_produto`- pv.`quantidade_produto` WHERE pv.`id_venda`= ?");
            pst.setInt(1, mod.getId_venda());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a quantidade de produtos no estoque:\n"+ex);        
        }
        conex.desconecta();
    }
    
    public void SalvarProdutos(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos_vendas (id_produtos,id_cliente,quantidade_produto,valor_final) values (?,?,?,?)");
            pst.setInt(1, mod.getId_produto());
            pst.setInt(2, mod.getId_cliente());
            pst.setInt(3, mod.getQuant_produto());
            pst.setDouble(4, Double.parseDouble(df.format(mod.getSubTotal()).replaceAll(",", ".")));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void SalvarVendas(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into vendas_finalizadas (clientes,subtotal) values (?,?)");
            pst.setInt(1, mod.getId_cliente());
            pst.setDouble(2, mod.getSubTotal());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a venda\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void CompraCanceladaExcluir(){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from produtos_vendas where id_venda=?");
            pst.setInt(1, 0);
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a venda cancelada:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
 public int PegarQuantProduto(int id_produto){
        conex.conexao();
        conex.executaSql("select quantidade_produto from produtos where id_produto="+id_produto+"");
        try {
            conex.rs.first();
            quantidade = conex.rs.getInt("quantidade_produto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao obter a quantidade de produtos!\n"+ex);        
        }
        conex.desconecta();
        return quantidade;
    }
    
}
