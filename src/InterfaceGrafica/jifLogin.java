/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import java.awt.event.KeyEvent;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Cayque
 */
public class jifLogin extends javax.swing.JInternalFrame {

    /**
     * Creates new form jifClientes
     * @param x
     */
    public jifLogin(JDesktopPane x) {
        this.desk = x;
        initComponents();
    }
    private JDesktopPane desk;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLogin = new javax.swing.JPanel();
        jLblNome = new javax.swing.JLabel();
        jLblCpf = new javax.swing.JLabel();
        jBtnLogin = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jTxtUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setTitle("eFeira - Autenticação");

        jLblNome.setText("Usuário:");

        jLblCpf.setText("Senha:");

        jBtnLogin.setText("Login");
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addComponent(jBtnLogin)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSair)
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPLoginLayout.createSequentialGroup()
                        .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPLoginLayout.createSequentialGroup()
                                .addComponent(jLblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPLoginLayout.createSequentialGroup()
                                .addComponent(jLblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNome)
                    .addComponent(jTxtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCpf)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSair)
                    .addComponent(jBtnLogin))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(100, 0, 220, 150);
    }// </editor-fold>//GEN-END:initComponents
    public boolean checkLogin(String login, String senha){
        return login.equals("usuario") && senha.equals("123");         
    }
    
    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        // TODO add your handling code here:
        if(checkLogin(jTxtUser.getText(),new String(jPasswordField1.getPassword()))){
            JOptionPane.showMessageDialog(null, "Bem vindo!");
            dispose();
            jifCadastro obj = new jifCadastro();
            desk.add(obj);
            obj.setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }
    }//GEN-LAST:event_jBtnLoginActionPerformed
    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            if(checkLogin(jTxtUser.getText(),new String(jPasswordField1.getPassword()))){
                JOptionPane.showMessageDialog(null, "Bem vindo!");
                dispose();
                jifCadastro obj = new jifCadastro();
                desk.add(obj);
                obj.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            }
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLblCpf;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTxtUser;
    // End of variables declaration//GEN-END:variables
}