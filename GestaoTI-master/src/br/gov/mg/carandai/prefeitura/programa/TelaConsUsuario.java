/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.UsuarioDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Usuario;
import static br.gov.mg.carandai.prefeitura.programa.TelaPrincipal.jDesktopPane1;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Lexleon
 */
public class TelaConsUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConsUsuario
     */
    public TelaConsUsuario() throws ClassNotFoundException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuario.getModel();
        TabelaUsuario.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
    public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDAO pdao = new UsuarioDAO();

        for (Usuario user : pdao.listar()) {

            modelo.addRow(new Object[]{
                user.getId(),
                user.getNome(),
                user.getSobrenome(),
                user.getLogin()
            });
        }

    }
    public void listarPorNome(String nome) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaUsuario.getModel();
        modelo.setNumRows(0);
        UsuarioDAO pdao = new UsuarioDAO();

        for (Usuario user : pdao.listarPorNome(nome)) {

            modelo.addRow(new Object[]{
                user.getId(),
                user.getNome(),
                user.getSobrenome(),
                user.getLogin()
            });

        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CampoPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaUsuario = new javax.swing.JTable();
        BotaoExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/zoom.png"))); // NOI18N
        jLabel1.setText("Pesquisar");

        TabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Sobrenome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaUsuarioMouseClicked(evt);
            }
        });
        TabelaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaUsuarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaUsuario);
        if (TabelaUsuario.getColumnModel().getColumnCount() > 0) {
            TabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
        }

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(204, 51, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/user_delete.png"))); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/cancel.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BotaoEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/user_edit.png"))); // NOI18N
        BotaoEditar.setText("Editar");
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoPesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(jButton1)
                    .addComponent(BotaoEditar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        if (TabelaUsuario.getSelectedRow() != -1) {

            Usuario user = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            user.setId((int) TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados.Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    dao.excluir(user);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                
                    atualizaTabela();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                CampoPesquisa.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um usuário para excluir.");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaUsuarioMouseClicked
        
    }//GEN-LAST:event_TabelaUsuarioMouseClicked

    private void TabelaUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaUsuarioKeyReleased
        
    }//GEN-LAST:event_TabelaUsuarioKeyReleased

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
        try {
            listarPorNome(CampoPesquisa.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaConsUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CampoPesquisaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        if (TabelaUsuario.getSelectedRow() != -1) {
           int id= 0;
           
            
            id = ((int)TabelaUsuario.getValueAt(TabelaUsuario.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null, "Ao alterar esse registro, ele será modificado permanentemente na base de dados. Deseja prosseguir?","Confirmar Alteração!",JOptionPane.YES_NO_OPTION)== 0){
            
                TelaEditUsuario EditUsuario = null;
                try {
                    EditUsuario = new TelaEditUsuario(id);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                jDesktopPane1.add(EditUsuario);
                centralizaForm(EditUsuario);
                EditUsuario.setVisible(true);
                this.dispose();
            }    
        }else {
            JOptionPane.showMessageDialog(null, "Selecione um usuário para editar.");
        }   
    }//GEN-LAST:event_BotaoEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTable TabelaUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
