/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloConection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Lab-NTM-01
 */
public class ConexaoBD {
    
    public Statement stm; //responsável por realizar pesquisa no BD
    public ResultSet rs; //responsável por armazenar o resultado da pesquisa
    private String driver = "com.mysql.jdbc.Driver"; //Identifica o serviço do BD
    private String caminho = "jdbc:mysql://179.183.95.13/projeto_efeira"; //Caminho do BD
    private String usuario = "root"; //User do bd
    private String senha = "vertrigo"; //Senha do bd
    public Connection con; //conexão do banco de dados
    
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!"); //Retorna caso conectado.
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n "+ex.getMessage());
        }
    }
    
    public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY); //não importa maiusculo ou minusculo, e percorre do inicio ao fim e do inicio ao fim
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar comando SQL:\n "+ex.getMessage());
        }
    }
    
    
    
    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso!"); retorna caso desconectado
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Desconexão Falhou:\n"+ex.getMessage());
        }
    }
    
}
