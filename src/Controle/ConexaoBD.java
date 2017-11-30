/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

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
    private String caminho = "jdbc:mysql://localhost/projeto_efeira"; //Caminho do BD
    private String usuario = "root"; //User do bd
    private String senha = "vertrigo"; //Senha do bd
    public Connection con; //conexão do banco de dados
    
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados:\n "+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Desconexão Falhou:\n"+ex.getMessage());
        }
    }
    
}
