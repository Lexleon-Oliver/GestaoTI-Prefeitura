
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.RIMSDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Rims;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaConsRims extends javax.swing.JInternalFrame {

    
    public TelaConsRims() throws ClassNotFoundException {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaRims.getModel();
        TabelaRims.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
     public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaRims.getModel();
        modelo.setNumRows(0);
        RIMSDAO rimsdao = new RIMSDAO();
    try{
        for (Rims rim : rimsdao.listar()) {

            modelo.addRow(new Object[]{
                rim.getId(),
                rim.getNumRims(),
                rim.getAnoRims(),
                rim.getNumProc(),
                rim.getAnoProc(),
                rim.getFicha(),
                rim.getFonte(),
                rim.getDataPed(),
                rim.getSolicit(),
                rim.getFornec(),
                rim.getProd(),
                rim.isEntregue(),
                
             
            });
        }
    }catch(Exception erro){
        JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao gerar tabela",JOptionPane.ERROR_MESSAGE);
    }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaRims = new javax.swing.JTable();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RIMS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        TabelaRims.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Número", "Ano", "Processo", "Ano", "Ficha", "Fonte", "Data", "Solicitante ", "Fornecedor", "Produtos", "Entregue"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaRims.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaRims.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaRimsMouseClicked(evt);
            }
        });
        TabelaRims.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaRimsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaRims);
        if (TabelaRims.getColumnModel().getColumnCount() > 0) {
            TabelaRims.getColumnModel().getColumn(0).setMinWidth(50);
            TabelaRims.getColumnModel().getColumn(0).setPreferredWidth(50);
            TabelaRims.getColumnModel().getColumn(0).setMaxWidth(70);
            TabelaRims.getColumnModel().getColumn(1).setMinWidth(50);
            TabelaRims.getColumnModel().getColumn(1).setPreferredWidth(50);
            TabelaRims.getColumnModel().getColumn(1).setMaxWidth(70);
            TabelaRims.getColumnModel().getColumn(2).setMinWidth(50);
            TabelaRims.getColumnModel().getColumn(2).setPreferredWidth(50);
            TabelaRims.getColumnModel().getColumn(2).setMaxWidth(70);
            TabelaRims.getColumnModel().getColumn(3).setMinWidth(70);
            TabelaRims.getColumnModel().getColumn(3).setPreferredWidth(70);
            TabelaRims.getColumnModel().getColumn(3).setMaxWidth(90);
            TabelaRims.getColumnModel().getColumn(4).setMinWidth(50);
            TabelaRims.getColumnModel().getColumn(4).setPreferredWidth(50);
            TabelaRims.getColumnModel().getColumn(4).setMaxWidth(70);
            TabelaRims.getColumnModel().getColumn(5).setMinWidth(50);
            TabelaRims.getColumnModel().getColumn(5).setPreferredWidth(50);
            TabelaRims.getColumnModel().getColumn(5).setMaxWidth(70);
            TabelaRims.getColumnModel().getColumn(6).setMinWidth(50);
            TabelaRims.getColumnModel().getColumn(6).setPreferredWidth(50);
            TabelaRims.getColumnModel().getColumn(6).setMaxWidth(70);
            TabelaRims.getColumnModel().getColumn(7).setMinWidth(70);
            TabelaRims.getColumnModel().getColumn(7).setPreferredWidth(70);
            TabelaRims.getColumnModel().getColumn(7).setMaxWidth(100);
            TabelaRims.getColumnModel().getColumn(8).setMinWidth(120);
            TabelaRims.getColumnModel().getColumn(8).setPreferredWidth(120);
            TabelaRims.getColumnModel().getColumn(8).setMaxWidth(150);
            TabelaRims.getColumnModel().getColumn(9).setMinWidth(150);
            TabelaRims.getColumnModel().getColumn(9).setPreferredWidth(150);
            TabelaRims.getColumnModel().getColumn(9).setMaxWidth(200);
            TabelaRims.getColumnModel().getColumn(10).setMinWidth(300);
            TabelaRims.getColumnModel().getColumn(10).setPreferredWidth(300);
            TabelaRims.getColumnModel().getColumn(10).setMaxWidth(500);
            TabelaRims.getColumnModel().getColumn(11).setMinWidth(70);
            TabelaRims.getColumnModel().getColumn(11).setPreferredWidth(70);
            TabelaRims.getColumnModel().getColumn(11).setMaxWidth(90);
        }

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(204, 51, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/table_delete.png"))); // NOI18N
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
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/table_edit.png"))); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoCancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BotaoCancelar, BotaoExcluir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoEditar))
                .addGap(15, 15, 15))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BotaoCancelar, BotaoExcluir});

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed

        if (TabelaRims.getSelectedRow() != -1) {
            Rims rim = new Rims();
            RIMSDAO rimsdao = new RIMSDAO();

            rim.setId((Integer) TabelaRims.getValueAt(TabelaRims.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados. Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    rimsdao.excluir(rim);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsRims.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                try {
                    atualizaTabela();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsRims.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um computador para excluir.");
        }
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaRimsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaRimsKeyReleased

    }//GEN-LAST:event_TabelaRimsKeyReleased

    private void TabelaRimsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaRimsMouseClicked

    }//GEN-LAST:event_TabelaRimsMouseClicked

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        if (TabelaRims.getSelectedRow() != -1) {
            int id = 0;
           

            id = ((Integer)TabelaRims.getValueAt(TabelaRims.getSelectedRow(), 0));
            
           if(JOptionPane.showConfirmDialog(null, "Ao Alterar esse registro, ele será modificado permanentemente na base de dados. Deseja prosseguir?","Confirmar Alteração!",JOptionPane.YES_NO_OPTION)== 0){
                TelaEditRims EditRims = null;
                try {
                    EditRims = new TelaEditRims(id);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                TelaPrincipal.jDesktopPane1.add(EditRims);
                centralizaForm(EditRims);
                EditRims.setVisible(true);
                this.dispose();
           
            } else {
               JOptionPane.showMessageDialog(null, "Selecione um roteador para editar.");
            }
        }
    }//GEN-LAST:event_BotaoEditarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTable TabelaRims;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
