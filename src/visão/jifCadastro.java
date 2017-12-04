/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloDao.DaoProduto;
import modeloConection.ConexaoBD;
import modeloBeans.BeansProduto;
import modeloBeans.ModeloTabela;

/**
 *
 * @author Cayque
 */
public class jifCadastro extends javax.swing.JInternalFrame {

    BeansProduto mod = new BeansProduto();
    ConexaoBD conex = new ConexaoBD();
    DaoProduto control = new DaoProduto();
    int flag = 0;
    int auxiliar;
    /**
     * Creates new form jifCadastro
     */
    public jifCadastro() {
        initComponents();
        preencherTabela("select *from produtos order by nome_produto");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLblNome = new javax.swing.JLabel();
        jLblCodigo = new javax.swing.JLabel();
        jLblQuantidade = new javax.swing.JLabel();
        jLblVenda = new javax.swing.JLabel();
        jLblCompra = new javax.swing.JLabel();
        jLblId = new javax.swing.JLabel();
        jBtnCadastrar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jTxtNome = new javax.swing.JTextField();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtQuantidade = new javax.swing.JTextField();
        jTxtCompra = new javax.swing.JTextField();
        jTxtVenda = new javax.swing.JTextField();
        jTxtID = new javax.swing.JTextField();
        jBtnNovo = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();

        setTitle("eFeira - Cadastro de Produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLblNome.setText("Nome:");

        jLblCodigo.setText("Código:");

        jLblQuantidade.setText("Quantidade:");

        jLblVenda.setText("Preço de venda:");

        jLblCompra.setText("Preço de compra:");

        jLblId.setText("ID:");
        jLblId.setEnabled(false);

        jBtnCadastrar.setText("Salvar");
        jBtnCadastrar.setEnabled(false);
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jTxtCodigo.setEnabled(false);

        jTxtQuantidade.setEnabled(false);

        jTxtCompra.setEnabled(false);

        jTxtVenda.setEnabled(false);

        jTxtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTxtID.setEnabled(false);

        jBtnNovo.setText("Novo");
        jBtnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoActionPerformed(evt);
            }
        });

        jBtnEditar.setText("Editar");
        jBtnEditar.setEnabled(false);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.setEnabled(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.setEnabled(false);
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jBtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jBtnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jBtnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jBtnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jBtnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLblVenda)
                                            .addComponent(jLblCompra))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTxtCompra)
                                            .addComponent(jTxtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLblNome)
                                            .addComponent(jLblCodigo))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLblQuantidade)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(104, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblId)
                    .addComponent(jTxtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLblQuantidade)
                                .addComponent(jTxtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblCompra)
                            .addComponent(jTxtCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLblVenda)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCadastrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSair)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(100, 0, 502, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed
        if(jTxtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o 'Nome' para continuar");
            jTxtNome.requestFocus();
        }else if(jTxtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o 'Código' para continuar");
            jTxtCodigo.requestFocus();
        }else if(jTxtQuantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha a 'Quantidade' para continuar");
            jTxtQuantidade.requestFocus();
        }else if(jTxtCompra.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o 'Preço de compra' para continuar");
            jTxtCompra.requestFocus();
        }else if(jTxtVenda.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o 'Preço de venda' para continuar");
            jTxtVenda.requestFocus();
        }else if(flag==1){
            mod.setNome(jTxtNome.getText());
            mod.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
            mod.setpCompra(Double.parseDouble(jTxtCompra.getText()));
            mod.setpVenda(Double.parseDouble(jTxtVenda.getText()));
            mod.setQuantidade(Integer.parseInt(jTxtQuantidade.getText()));
            control.Salvar(mod);
            jTxtCodigo.setText("");
            jTxtVenda.setText("");
            jTxtCompra.setText("");
            jTxtNome.setText("");
            jTxtQuantidade.setText("");
            jTxtID.setText("");
            jBtnCadastrar.setEnabled(false);
            jBtnCancelar.setEnabled(false);
            jBtnEditar.setEnabled(false);
            jTxtVenda.setEnabled(false);
            jTxtCompra.setEnabled(false);
            jTxtCodigo.setEnabled(false);
            jTxtQuantidade.setEnabled(false);
            preencherTabela("select *from produtos order by nome_produto");
            }else{
                mod.setNome(jTxtNome.getText());
                mod.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
                mod.setpCompra(Double.parseDouble(jTxtCompra.getText()));
                mod.setpVenda(Double.parseDouble(jTxtVenda.getText()));
                mod.setQuantidade(Integer.parseInt(jTxtQuantidade.getText()));
                control.Editar(mod);
                jTxtCodigo.setText("");
                jTxtVenda.setText("");
                jTxtCompra.setText("");
                jTxtNome.setText("");
                jTxtQuantidade.setText("");
                jTxtID.setText("");
                jBtnCadastrar.setEnabled(false);
                jBtnCancelar.setEnabled(false);
                jBtnEditar.setEnabled(false);
                jTxtVenda.setEnabled(false);
                jTxtCompra.setEnabled(false);
                jTxtCodigo.setEnabled(false);
                jTxtQuantidade.setEnabled(false);
                preencherTabela("select *from produtos order by nome_produto");
            }
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    private void jBtnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoActionPerformed
        flag=1;
        jBtnCadastrar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jTxtCodigo.setEnabled(true);
        jTxtVenda.setEnabled(true);
        jTxtCompra.setEnabled(true);
        jTxtNome.setEnabled(true);
        jTxtQuantidade.setEnabled(true); 
        jTxtCodigo.setText("");
        jTxtVenda.setText("");
        jTxtCompra.setText("");
        jTxtNome.setText("");
        jTxtQuantidade.setText("");
        jTxtID.setText("");
    }//GEN-LAST:event_jBtnNovoActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Preç. Entrada","Preç. Saída","Qntd."};
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+jTxtNome.getText()+"%'");
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getString("nome_produto"),conex.rs.getDouble("p_entrada_produto"),conex.rs.getDouble("p_saida_produto"),conex.rs.getInt("quantidade_produto")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos.setModel(modelo);
        jTProdutos.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos.getColumnModel().getColumn(1).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos.getColumnModel().getColumn(2).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos.getColumnModel().getColumn(3).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos.getTableHeader().setReorderingAllowed(false);
        jTProdutos.setAutoResizeMode(jTProdutos.AUTO_RESIZE_OFF);
        jTProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        jTxtCodigo.setText("");
        jTxtVenda.setText("");
        jTxtCompra.setText("");
        jTxtNome.setText("");
        jTxtQuantidade.setText("");
        jTxtID.setText("");
        jBtnCadastrar.setEnabled(false);
        jBtnCancelar.setEnabled(false);
        jTxtCodigo.setEnabled(false);
        jTxtVenda.setEnabled(false);
        jTxtCompra.setEnabled(false);
        jTxtQuantidade.setEnabled(false);
        jBtnEditar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        flag=2;
        jBtnCadastrar.setEnabled(true);
        jBtnCancelar.setEnabled(true);
        jTxtCodigo.setEnabled(true);
        jTxtVenda.setEnabled(true);
        jTxtCompra.setEnabled(true);
        jTxtNome.setEnabled(true);
        jTxtQuantidade.setEnabled(true);
        jBtnEditar.setEnabled(false);
        jBtnExcluir.setEnabled(false);
        jBtnCancelar.setEnabled(true);
        mod.setAuxiliar(Integer.parseInt(jTxtCodigo.getText()));
    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setCodigo(Integer.parseInt(jTxtCodigo.getText()));
            control.Excluir(mod);
        }   
        preencherTabela("select *from produtos order by nome_produto");
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        String nome_produto = ""+jTProdutos.getValueAt(jTProdutos.getSelectedRow(),0);
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto='"+nome_produto+"'");
        try {
            conex.rs.first();
            jTxtID.setText(String.valueOf(conex.rs.getInt("id_produto")));
            jTxtNome.setText(conex.rs.getString("nome_produto"));
            jTxtCodigo.setText(String.valueOf(conex.rs.getInt("codigo_produto")));
            jTxtCompra.setText(String.valueOf(conex.rs.getDouble("p_entrada_produto")));
            jTxtVenda.setText(String.valueOf(conex.rs.getDouble("p_saida_produto")));
            jTxtQuantidade.setText(String.valueOf(conex.rs.getInt("quantidade_produto")));
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!\n"+ex.getMessage());
        }
        conex.desconecta();
        jBtnEditar.setEnabled(true);
        jBtnExcluir.setEnabled(true);
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Preç. Entrada","Preç. Saída","Qntd."};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getString("nome_produto"),conex.rs.getDouble("p_entrada_produto"),conex.rs.getDouble("p_saida_produto"),conex.rs.getInt("quantidade_produto")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos.setModel(modelo);
        jTProdutos.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos.getColumnModel().getColumn(1).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos.getColumnModel().getColumn(2).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos.getColumnModel().getColumn(3).setPreferredWidth(92);
        jTProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos.getTableHeader().setReorderingAllowed(false);
        jTProdutos.setAutoResizeMode(jTProdutos.AUTO_RESIZE_OFF);
        jTProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnNovo;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLblCodigo;
    private javax.swing.JLabel jLblCompra;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblQuantidade;
    private javax.swing.JLabel jLblVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtCompra;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtQuantidade;
    private javax.swing.JTextField jTxtVenda;
    // End of variables declaration//GEN-END:variables
}
