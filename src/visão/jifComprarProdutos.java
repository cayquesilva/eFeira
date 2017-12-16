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
import modeloBeans.BeansProduto;
import modeloBeans.BeansVenda;
import modeloBeans.ModeloTabela;
import modeloConection.ConexaoBD;
import modeloDao.DaoProduto;
import modeloDao.DaoVendas;


/**
 *
 * @author Cayque
 */
public class jifComprarProdutos extends javax.swing.JInternalFrame {

    BeansProduto mod = new BeansProduto();
    BeansVenda modd = new BeansVenda();
    ConexaoBD conex = new ConexaoBD();
    DaoProduto control = new DaoProduto();
    DaoVendas control2 = new DaoVendas();
    String auxiliar;
    int op=0,auxiliar2,id_cliente,id_venda,id_cliente2;
    private double aux,total=0;
    
    public jifComprarProdutos() {
        initComponents();
        preencherTabela("select *from produtos order by nome_produto");
        PreencherCbox();
        id_cliente = PegarID();
        modd.setId_cliente(id_cliente);
        control2.AbrirVenda(modd);
        modd.setId_venda(PegarIDVenda("select id from vendas_finalizadas where clientes like "+id_cliente+""));
        control2.AbrirVenda2(modd);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProdutos2 = new javax.swing.JTable();
        jBtnFinalCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBtnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbProdutos1 = new javax.swing.JTable();
        jBtnAddCarrinho = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCbCliente = new javax.swing.JComboBox<>();

        setTitle("eFeira - Compra de produtos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTProdutos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTProdutos2);

        jBtnFinalCompra.setText("Finalizar compra");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Valor Total:");

        jLblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblTotal.setText("Preço");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("R$:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBtnFinalCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblTotal)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnFinalCompra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnSair.setText("Sair");
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTbProdutos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTbProdutos1);

        jBtnAddCarrinho.setText("Adicionar produto ao meu carrinho");
        jBtnAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jBtnAddCarrinho)
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtnAddCarrinho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Cliente em atendimento: ");

        jCbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCbClienteItemStateChanged(evt);
            }
        });
        jCbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCbClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCbClienteMouseReleased(evt);
            }
        });
        jCbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnSair)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCarrinhoActionPerformed
        id_cliente2 = PegarID();
        modd.setId_cliente(id_cliente2);
        if(op==1){
            id_venda = PegarIDVenda("select id from vendas_finalizadas where clientes like "+id_cliente2+"");
        }else{
            id_venda = PegarIDVenda("select id from vendas_finalizadas where clientes like "+id_cliente+"");
        }
        modd.setId_venda(id_venda);
        control2.SalvarVendas(modd);
        modd.setId_produto(PegarIDProduto());
        modd.setQuant_produto(Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos desse tipo você quer? ")));
        modd.setSubTotal(modd.getQuant_produto()*PegarPrecoProduto());
        modd.setAuxiliar(id_venda);
        control2.SalvarProdutos(modd);
        preencherTabela2("select produtos.nome_produto, produtos.p_saida_produto,produtos.quantidade_produto,produtos_vendas.quantidade_produto from produtos,produtos_vendas where produtos_vendas.id_cliente like "+id_cliente2+" and produtos_vendas.id_produtos = produtos.id_produto");
        jLblTotal.setText(String.valueOf(PegarTotal()));
        op=1;
    }//GEN-LAST:event_jBtnAddCarrinhoActionPerformed

    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jCbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbClienteActionPerformed
        
    }//GEN-LAST:event_jCbClienteActionPerformed

    private void jCbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbClienteMouseClicked

    }//GEN-LAST:event_jCbClienteMouseClicked

    private void jCbClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCbClienteMouseReleased
        
    }//GEN-LAST:event_jCbClienteMouseReleased

    private void jCbClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCbClienteItemStateChanged

    }//GEN-LAST:event_jCbClienteItemStateChanged
    
    private void preencherTabela2(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Valor Und.","Qntd.","Valor Total"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
            dados.add(new Object[]{conex.rs.getString("produtos.nome_produto"),conex.rs.getDouble("produtos.p_saida_produto"),conex.rs.getInt("produtos_vendas.quantidade_produto"),(conex.rs.getInt("produtos_vendas.quantidade_produto")*conex.rs.getDouble("produtos.p_saida_produto"))});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTProdutos2.setModel(modelo);
        jTProdutos2.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTProdutos2.getColumnModel().getColumn(0).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(1).setPreferredWidth(93);
        jTProdutos2.getColumnModel().getColumn(1).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(2).setPreferredWidth(45);
        jTProdutos2.getColumnModel().getColumn(2).setResizable(false);
        jTProdutos2.getColumnModel().getColumn(3).setPreferredWidth(93);
        jTProdutos2.getColumnModel().getColumn(3).setResizable(false);
        jTProdutos2.getTableHeader().setReorderingAllowed(false);
        jTProdutos2.setAutoResizeMode(jTProdutos2.AUTO_RESIZE_OFF);
        jTProdutos2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }

    private void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Nome","Preço"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getString("nome_produto"),conex.rs.getDouble("p_saida_produto")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao preencher o Array: \n"+ex.getMessage());
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTbProdutos1.setModel(modelo);
        jTbProdutos1.getColumnModel().getColumn(0).setPreferredWidth(180);
        jTbProdutos1.getColumnModel().getColumn(0).setResizable(false);
        jTbProdutos1.getColumnModel().getColumn(1).setPreferredWidth(92);
        jTbProdutos1.getColumnModel().getColumn(1).setResizable(false);
        jTbProdutos1.getTableHeader().setReorderingAllowed(false);
        jTbProdutos1.setAutoResizeMode(jTbProdutos1.AUTO_RESIZE_OFF);
        jTbProdutos1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conex.desconecta();
    }
    
    public void PreencherCbox(){
        conex.conexao();
        conex.executaSql("select *from clientes order by nome_cliente");
        try {
            conex.rs.first();
            jCbCliente.removeAllItems();
            do{
                jCbCliente.addItem(conex.rs.getString("nome_cliente")); 
            }while(conex.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher opções de clientes\n"+ex.getMessage());
        }
        conex.desconecta();
    }
    
    public int PegarID(){
        conex.conexao();
        auxiliar = (String)jCbCliente.getSelectedItem();
        conex.executaSql("select *from clientes where nome_cliente like'%"+auxiliar+"%'");
        try {
            conex.rs.first();
            auxiliar2 = conex.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o id do cliente!\n"+ex.getMessage());
        }
        conex.desconecta();
        return auxiliar2;
    }
    
    public int PegarIDProduto(){
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+jTbProdutos1.getValueAt(jTbProdutos1.getSelectedRow(), 0)+"%'");
        try {
            conex.rs.first();
            auxiliar2 = conex.rs.getInt("id_produto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o id do produto!\n"+ex.getMessage());
        }
        conex.desconecta();
        return auxiliar2;
    }
    
    public int PegarIDVenda(String sql){
        conex.conexao();
        conex.executaSql(sql);
        try {
            conex.rs.first();
            auxiliar2 = conex.rs.getInt("id");
            JOptionPane.showMessageDialog(null, ""+auxiliar2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o id da venda!\n"+ex.getMessage());
        }
        conex.desconecta();
        return auxiliar2;
    }
    
    public Double PegarPrecoProduto(){
        conex.conexao();
        conex.executaSql("select *from produtos where nome_produto like'%"+jTbProdutos1.getValueAt(jTbProdutos1.getSelectedRow(), 0)+"%'");
        try {
            conex.rs.first();
            aux = conex.rs.getDouble("p_saida_produto");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o preço do produto!\n"+ex.getMessage());
        }
        conex.desconecta();
        return aux;
    }
    
    public Double PegarTotal(){
        conex.conexao();
        conex.executaSql("select sum(valor_final) as soma from produtos_vendas,vendas_finalizadas where produtos_vendas.id_cliente = vendas_finalizadas.clientes");
        try {
            conex.rs.first();
            total= conex.rs.getDouble("soma");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel calcular o preço total da venda!\n"+ex.getMessage());
        }
        conex.desconecta();
        return total;
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddCarrinho;
    private javax.swing.JButton jBtnFinalCompra;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JComboBox<String> jCbCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTProdutos2;
    private javax.swing.JTable jTbProdutos1;
    // End of variables declaration//GEN-END:variables
}
