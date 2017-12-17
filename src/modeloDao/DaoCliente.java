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
import modeloBeans.BeansCliente;
import modeloConection.ConexaoBD;

/**
 *
 * @author Lab-NTM-01
 */
public class DaoCliente {
    ConexaoBD conex = new ConexaoBD();
    BeansCliente mod = new BeansCliente();
    private int contador=0;
    
    
    public void Salvar(BeansCliente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes (nome_cliente,cpf_cliente) values(?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public void Excluir(BeansCliente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where cpf_cliente=?");
            pst.setString(1, mod.getCpf());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    
    public void Editar(BeansCliente mod){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome_cliente=?,cpf_cliente=? where cpf_cliente=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getCpf());
            pst.setString(3, mod.getAuxiliar());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o produto:\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
        public int ContarClientes(){
        conex.conexao();
        conex.executaSql("select *from clientes order by nome_cliente");
        try {
            conex.rs.first();
            do{
                contador++;
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao contar o numero de clientes! \n"+ex.getMessage());
        }
        conex.desconecta();
        return contador;
    }
    
    
}
