/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    
    public void Salvar(BeansProduto mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into produtos (nome_produto,p_entrada_produto,p_saida_produto,quantidade_produto,codigo_produto) values(?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getpCompra());
            pst.setDouble(3, mod.getpVenda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, mod.getCodigo());
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
            PreparedStatement pst = conex.con.prepareStatement("update produtos set nome_produto=?,p_entrada_produto=?,p_saida_produto=?,quantidade_produto=?,codigo_produto=? where codigo_produto=?");
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getpCompra());
            pst.setDouble(3, mod.getpVenda());
            pst.setInt(4, mod.getQuantidade());
            pst.setInt(5, mod.getCodigo());
            pst.setInt(6, mod.getAuxiliar());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    public BeansProduto buscaProduto(BeansProduto mod){
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setId(conex.rs.getInt("id_produto"));
            mod.setCodigo(conex.rs.getInt("codigo_produto"));
            mod.setNome(conex.rs.getString("nome_produto"));
            mod.setpCompra(conex.rs.getDouble("p_entrada_produto"));
            mod.setpVenda(conex.rs.getDouble("p_saida_produto"));
            mod.setQuantidade(conex.rs.getInt("quantidade_produto"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o produto:\n"+ex.getMessage());
        }
        conex.desconecta();
        return mod;
    }


}
