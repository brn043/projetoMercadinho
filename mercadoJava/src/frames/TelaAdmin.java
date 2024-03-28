/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

public class TelaAdmin extends javax.swing.JFrame {
Produtos produtoAtual = new Produtos();
    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
        initComponents();
      readJTable();
    tabelaAdmin.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event){
                if(!event.getValueIsAdjusting()){
                    int linhaSelecionada= tabelaAdmin.getSelectedRow();
                   if(linhaSelecionada != -1){
                     int idAtual = (int) tabelaAdmin.getValueAt(linhaSelecionada,0);
                     String nomeAtual = (String) tabelaAdmin.getValueAt(linhaSelecionada,1);
                     String categoriaAtual = (String) tabelaAdmin.getValueAt(linhaSelecionada,2);
                     float precoAtual = (float) tabelaAdmin.getValueAt(linhaSelecionada,3);
                     int quantidadeAtual = (int) tabelaAdmin.getValueAt(linhaSelecionada,4);
                     
                       System.out.println(idAtual+" "+nomeAtual+" "+categoriaAtual+" "+precoAtual);
                       produtoAtual.setIdProduto(idAtual);
                       produtoAtual.setNome(nomeAtual);
                       produtoAtual.setCategoria(categoriaAtual);      
                       produtoAtual.setPreco(precoAtual);
                       produtoAtual.setQuantidade(quantidadeAtual);
                   }
                }
            }
        });
    
      tabelaAdmin.setRowHeight(23);
      tabelaAdmin.getTableHeader().setOpaque(false);
      tabelaAdmin.setFont(new Font("Segoe UI",Font.BOLD,12));
      tabelaAdmin.getTableHeader().setBackground(new Color(0,0,255));
      tabelaAdmin.getTableHeader().setForeground(new Color(240,240,240));
    }
public void readJTable(){
    DefaultTableModel modelo = (DefaultTableModel) tabelaAdmin.getModel();
        modelo.setNumRows(0);
       ProdutosDAO dao = new ProdutosDAO();
        for(Produtos c: dao.listarProdutos()) {
         modelo.addRow(new Object[]{
          c.getIdProduto(),   
          c.getNome(),
          c.getCategoria(),
          c.getPreco(),
          c.getQuantidade(),
        });           
    }    
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
        btnDeletar = new javax.swing.JToggleButton();
        btnInserir = new javax.swing.JToggleButton();
        btnEditar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAdmin = new javax.swing.JTable();
        inputCategoria = new javax.swing.JTextField();
        inputPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        btnDeslogar = new javax.swing.JButton();
        inputBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnDeletar.setBackground(new java.awt.Color(204, 0, 0));
        btnDeletar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(102, 255, 51));
        btnInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 255, 51));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tabelaAdmin.setAutoCreateRowSorter(true);
        tabelaAdmin.setBackground(new java.awt.Color(153, 153, 153));
        tabelaAdmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaAdmin.setForeground(new java.awt.Color(204, 255, 204));
        tabelaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null, null},
                {"", "", null, null, null},
                {"", "", null, null, null},
                {"", "", null, null, null},
                {"", "", null, null, null},
                {"", "", null, null, null},
                {"", "", null, null, null},
                {"", "", null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Preço", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tabelaAdmin);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 51));
        jLabel7.setText("Quantidade:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 51));
        jLabel8.setText("Categoria:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 51));
        jLabel9.setText("Preço:");

        btnDeslogar.setBackground(new java.awt.Color(255, 102, 102));
        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });

        inputBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBuscaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo-removebg-preview (2).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 51));
        jLabel10.setText("Busca:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(inputBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(185, 185, 185)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeslogar)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(251, 251, 251))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(inputCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        TelaLogin tl = new TelaLogin();
        this.dispose();
        tl.setVisible(true);
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        ProdutosDAO dao = new ProdutosDAO();
       
        produtoAtual.setNome(inputNome.getText());
        produtoAtual.setCategoria(inputCategoria.getText());
        produtoAtual.setPreco(Float.parseFloat(inputPreco.getText()));
        produtoAtual.setQuantidade(Integer.parseInt(inputQuantidade.getText()));
        if(produtoAtual.getNome().trim().equals("") || produtoAtual.getCategoria().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Insira Todos os Dados!");
        }else{
           dao.adicionarProduto( produtoAtual);  
        }
          readJTable(); 
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       ProdutosDAO dao = new ProdutosDAO();
       
        produtoAtual.setNome(inputNome.getText());
        produtoAtual.setCategoria(inputCategoria.getText());
        produtoAtual.setPreco(Float.parseFloat(inputPreco.getText()));
        produtoAtual.setQuantidade(Integer.parseInt(inputQuantidade.getText()));

       if (produtoAtual.getNome().trim().equals("") ||produtoAtual.getCategoria().trim().equals("") ){
           JOptionPane.showMessageDialog(null,"Insira Todos os Dados!");
       }else{
           dao.editarProduto(produtoAtual);
       }
       readJTable();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
      ProdutosDAO dao = new ProdutosDAO();
        
        if(produtoAtual.getNome().equals("")            
           || produtoAtual.getCategoria().trim().equals("")){
            JOptionPane.showMessageDialog(null, "");
        }else{
            dao.removerProduto(produtoAtual);
        } 
      readJTable();  
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void inputBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBuscaActionPerformed
         DefaultTableModel modelo = (DefaultTableModel) tabelaAdmin.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(modelo);
        tabelaAdmin.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(inputBusca.getText()));
    }//GEN-LAST:event_inputBuscaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDeletar;
    private javax.swing.JButton btnDeslogar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnInserir;
    private javax.swing.JTextField inputBusca;
    private javax.swing.JTextField inputCategoria;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPreco;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAdmin;
    // End of variables declaration//GEN-END:variables
}
