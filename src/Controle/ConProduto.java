/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloProduto;


/**
 *
 * @author Cayque
 */
public class ConProduto {
    
    ConexaoBD conex = new ConexaoBD();
    ModeloProduto mod = new ModeloProduto();
    
    
    public void Salvar(ModeloProduto mod){
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
            Logger.getLogger(ConProduto.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados:\n"+ex.getMessage());
        }
        
        
        conex.desconecta();
    }


}
