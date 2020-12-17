
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ServidorDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Servidor;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaConsServidor extends javax.swing.JInternalFrame {

    
    public TelaConsServidor() throws ClassNotFoundException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaServidor.getModel();
        TabelaServidor.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
     public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    public void limparCampos(){     
        
        CampoPesquisa.setEditable(false);
        CampoPesquisa.setText("");
       
    }

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaServidor.getModel();
        modelo.setNumRows(0);
        ServidorDAO servdao = new ServidorDAO();

        for (Servidor serv : servdao.listar()) {

            modelo.addRow(new Object[]{
                serv.getNome(),
                serv.getMac(),
                serv.getMac2(),
                serv.getSo(),
                serv.getIp(),
                serv.getLogin(),
                serv.getSenha(),
                serv.getSenhabios()
             
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
        TabelaServidor = new javax.swing.JTable();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servidores", 2, 2, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/zoom.png"))); // NOI18N
        jLabel1.setText("Pesquisar");

        TabelaServidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "MAC", "MAC2", "Sistema Operacional", "IP", "Login", "Senha", "Senha BIOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaServidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaServidorMouseClicked(evt);
            }
        });
        TabelaServidor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaServidorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaServidor);

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(204, 51, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/server_delete.png"))); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/cancel.png"))); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/server_edit.png"))); // NOI18N
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
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoCancelar)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 550, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoEditar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        if (TabelaServidor.getSelectedRow() != -1) {

            Servidor serv = new Servidor();
            ServidorDAO servdao = new ServidorDAO();

            serv.setMac((String) TabelaServidor.getValueAt(TabelaServidor.getSelectedRow(), 1));
            if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados. Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    servdao.excluir(serv);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsServidor.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    limparCampos();

                    atualizaTabela();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsServidor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                CampoPesquisa.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um servidor para excluir.");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaServidorMouseClicked
        
    }//GEN-LAST:event_TabelaServidorMouseClicked

    private void TabelaServidorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaServidorKeyReleased
        
    }//GEN-LAST:event_TabelaServidorKeyReleased

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
        try {
            ServidorDAO servdao = new ServidorDAO();
            servdao.listarPorNome(CampoPesquisa.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaConsUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    

    }//GEN-LAST:event_CampoPesquisaKeyReleased

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        if (TabelaServidor.getSelectedRow() != -1) {
            String mac= null;

            mac = ((String)TabelaServidor.getValueAt(TabelaServidor.getSelectedRow(), 1));
            if(JOptionPane.showConfirmDialog(null, "Ao alterar esse registro, ele será modificado permanentemente na base de dados. Deseja prosseguir?","Confirmar Alteração!",JOptionPane.YES_NO_OPTION)== 0){
                TelaEditServidor EditServidor =null;
                try {
                    EditServidor = new TelaEditServidor(mac);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsServidor.class.getName()).log(Level.SEVERE, null, ex);
                }
           
                TelaPrincipal.jDesktopPane1.add(EditServidor);
                centralizaForm(EditServidor);
                EditServidor.setVisible(true);
                this.dispose();
            }else{
                CampoPesquisa.requestFocus();
            }    
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um servidor para editar.");
        }
    }//GEN-LAST:event_BotaoEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTable TabelaServidor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
