/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ComputadorDAO;
import br.gov.mg.carandai.prefeitura.back.model.DAO.OficioDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Computador;
import br.gov.mg.carandai.prefeitura.back.model.beans.Oficio;
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
public class TelaConsOficio extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConsUsuario
     */
    public TelaConsOficio() throws ClassNotFoundException {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaOficio.getModel();
        TabelaOficio.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
     public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaOficio.getModel();
        modelo.setNumRows(0);
        OficioDAO ofdao = new OficioDAO();
    try{
        for (Oficio of : ofdao.listar()) {

            modelo.addRow(new Object[]{
                of.getId(),
                of.getNumOfic(),
                of.getAnoOfic(),
                of.getData(),
                of.getDe(),
                of.getPara(),
                of.getAssunto()               
                
             
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
        TabelaOficio = new javax.swing.JTable();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ofícios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        TabelaOficio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Número", "Ano", "Data", "Remetente", "Destinatário", "Assunto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaOficio.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaOficio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaOficioMouseClicked(evt);
            }
        });
        TabelaOficio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaOficioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaOficio);
        if (TabelaOficio.getColumnModel().getColumnCount() > 0) {
            TabelaOficio.getColumnModel().getColumn(0).setMinWidth(50);
            TabelaOficio.getColumnModel().getColumn(0).setPreferredWidth(50);
            TabelaOficio.getColumnModel().getColumn(0).setMaxWidth(70);
            TabelaOficio.getColumnModel().getColumn(1).setMinWidth(50);
            TabelaOficio.getColumnModel().getColumn(1).setPreferredWidth(50);
            TabelaOficio.getColumnModel().getColumn(1).setMaxWidth(70);
            TabelaOficio.getColumnModel().getColumn(2).setMinWidth(70);
            TabelaOficio.getColumnModel().getColumn(2).setPreferredWidth(70);
            TabelaOficio.getColumnModel().getColumn(2).setMaxWidth(100);
            TabelaOficio.getColumnModel().getColumn(3).setMinWidth(100);
            TabelaOficio.getColumnModel().getColumn(3).setPreferredWidth(100);
            TabelaOficio.getColumnModel().getColumn(3).setMaxWidth(120);
            TabelaOficio.getColumnModel().getColumn(4).setMinWidth(150);
            TabelaOficio.getColumnModel().getColumn(4).setPreferredWidth(150);
            TabelaOficio.getColumnModel().getColumn(4).setMaxWidth(300);
            TabelaOficio.getColumnModel().getColumn(5).setMinWidth(150);
            TabelaOficio.getColumnModel().getColumn(5).setPreferredWidth(150);
            TabelaOficio.getColumnModel().getColumn(5).setMaxWidth(170);
            TabelaOficio.getColumnModel().getColumn(6).setMinWidth(300);
            TabelaOficio.getColumnModel().getColumn(6).setPreferredWidth(380);
            TabelaOficio.getColumnModel().getColumn(6).setMaxWidth(500);
        }

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(204, 51, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/printer_delete.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoCancelar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BotaoCancelar, BotaoExcluir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoCancelar))
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

        if (TabelaOficio.getSelectedRow() != -1) {
            Oficio of = new Oficio();
            OficioDAO ofdao = new OficioDAO();

            of.setId((Integer) TabelaOficio.getValueAt(TabelaOficio.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados. Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    ofdao.excluir(of);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsOficio.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                try {
                    atualizaTabela();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsOficio.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um computador para excluir.");
        }
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaOficioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaOficioKeyReleased

    }//GEN-LAST:event_TabelaOficioKeyReleased

    private void TabelaOficioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaOficioMouseClicked

    }//GEN-LAST:event_TabelaOficioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTable TabelaOficio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
