/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ComputadorDAO;
import br.gov.mg.carandai.prefeitura.back.model.DAO.MemoDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Computador;
import br.gov.mg.carandai.prefeitura.back.model.beans.Memorando;
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
public class TelaConsMemorando extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConsUsuario
     */
    public TelaConsMemorando() throws ClassNotFoundException {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaMemorando.getModel();
        TabelaMemorando.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
     public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaMemorando.getModel();
        modelo.setNumRows(0);
        MemoDAO memdao = new MemoDAO();
    try{
        for (Memorando mem : memdao.listar()) {

            modelo.addRow(new Object[]{
                mem.getId(),
                mem.getNumMemo(),
                mem.getAnoMemo(),
                mem.getData(),
                mem.getDe(),
                mem.getPara(),
                mem.getAssunto()               
                
             
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
        TabelaMemorando = new javax.swing.JTable();
        BotaoExcluir = new javax.swing.JButton();
        BotaoCancelar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Memorandos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        TabelaMemorando.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelaMemorando.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaMemorando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMemorandoMouseClicked(evt);
            }
        });
        TabelaMemorando.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaMemorandoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaMemorando);
        if (TabelaMemorando.getColumnModel().getColumnCount() > 0) {
            TabelaMemorando.getColumnModel().getColumn(0).setMinWidth(50);
            TabelaMemorando.getColumnModel().getColumn(0).setPreferredWidth(50);
            TabelaMemorando.getColumnModel().getColumn(0).setMaxWidth(70);
            TabelaMemorando.getColumnModel().getColumn(1).setMinWidth(50);
            TabelaMemorando.getColumnModel().getColumn(1).setPreferredWidth(50);
            TabelaMemorando.getColumnModel().getColumn(1).setMaxWidth(70);
            TabelaMemorando.getColumnModel().getColumn(2).setMinWidth(70);
            TabelaMemorando.getColumnModel().getColumn(2).setPreferredWidth(70);
            TabelaMemorando.getColumnModel().getColumn(2).setMaxWidth(100);
            TabelaMemorando.getColumnModel().getColumn(3).setMinWidth(100);
            TabelaMemorando.getColumnModel().getColumn(3).setPreferredWidth(100);
            TabelaMemorando.getColumnModel().getColumn(3).setMaxWidth(120);
            TabelaMemorando.getColumnModel().getColumn(4).setMinWidth(150);
            TabelaMemorando.getColumnModel().getColumn(4).setPreferredWidth(150);
            TabelaMemorando.getColumnModel().getColumn(4).setMaxWidth(300);
            TabelaMemorando.getColumnModel().getColumn(5).setMinWidth(150);
            TabelaMemorando.getColumnModel().getColumn(5).setPreferredWidth(150);
            TabelaMemorando.getColumnModel().getColumn(5).setMaxWidth(170);
            TabelaMemorando.getColumnModel().getColumn(6).setMinWidth(300);
            TabelaMemorando.getColumnModel().getColumn(6).setPreferredWidth(380);
            TabelaMemorando.getColumnModel().getColumn(6).setMaxWidth(500);
        }

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(204, 51, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/page_delete.png"))); // NOI18N
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

        if (TabelaMemorando.getSelectedRow() != -1) {
            Memorando memo = new Memorando();
            MemoDAO memdao = new MemoDAO();

            memo.setId((Integer) TabelaMemorando.getValueAt(TabelaMemorando.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados. Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    memdao.excluir(memo);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsMemorando.class.getName()).log(Level.SEVERE, null, ex);
                }

                
                try {
                    atualizaTabela();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsMemorando.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um computador para excluir.");
        }
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaMemorandoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaMemorandoKeyReleased

    }//GEN-LAST:event_TabelaMemorandoKeyReleased

    private void TabelaMemorandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMemorandoMouseClicked

    }//GEN-LAST:event_TabelaMemorandoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JTable TabelaMemorando;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
