/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    
    
    public void Salvar(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into vendas (id_produto,id_cliente) values(?,?)");
            pst.setInt(1, mod.getId_produto());
            pst.setInt(2, mod.getId_cliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(DaoProduto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void Excluir(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from vendas where id_produto=?");
            pst.setInt(1, mod.getId_produto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    public void Editar(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update vendas set id_produto=?,id_cliente=?, where id_produto=?");
            pst.setInt(1, mod.getId_produto());
            pst.setInt(2, mod.getId_cliente());
            pst.setInt(3, mod.getAuxiliar());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    public void Finalizar(BeansVenda mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into finalizadas (clientes,subtotal) values(?,?)");
            pst.setInt(1, mod.getId_cliente());
            pst.setDouble(2,mod.getSubTotal());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar a venda:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
}
