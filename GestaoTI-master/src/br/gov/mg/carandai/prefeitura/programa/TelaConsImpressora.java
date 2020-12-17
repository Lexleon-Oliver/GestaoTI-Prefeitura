/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ImpressoraDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Impressora;
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
public class TelaConsImpressora extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConsUsuario
     */
    public TelaConsImpressora() throws ClassNotFoundException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaImpressora.getModel();
        TabelaImpressora.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
     public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    public void limparCampos(){
        CampoTipoBusca.setSelectedIndex(-1);
        buttonGroup1.clearSelection();
        CampoPrefNão.setEnabled(false);
        CampoPrefSim.setEnabled(false);
        CampoPesquisa.setEditable(false);
        CampoPesquisa.setText("");
       
    }

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaImpressora.getModel();
        modelo.setNumRows(0);
        ImpressoraDAO pdao = new ImpressoraDAO();

        for (Impressora imp : pdao.listar()) {

            modelo.addRow(new Object[]{
                imp.getNome(),
                imp.getMarca(),
                imp.getModelo(),
                imp.getNumserie(),
                imp.getMac(),
                imp.getIp(),
                imp.getDepartamento(),
                imp.isPrefeitura(),
                imp.getAndar(),
                imp.getLogin(),
                imp.getSenha()
             
            });
        }

    }
    public void listarPorNome(String nome,boolean prefeitura) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaImpressora.getModel();
        modelo.setNumRows(0);
        ImpressoraDAO pdao = new ImpressoraDAO();

        for (Impressora imp : pdao.listarPorNome(nome,prefeitura)) {

            modelo.addRow(new Object[]{
                imp.getNome(),
                imp.getMarca(),
                imp.getModelo(),
                imp.getNumserie(),
                imp.getMac(),
                imp.getIp(),
                imp.getDepartamento(),
                imp.isPrefeitura(),
                imp.getAndar(),
                imp.getLogin(),
                imp.getSenha()
            });

        }

    }
    
    public void listarPorAndar(String andar,boolean prefeitura) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaImpressora.getModel();
        modelo.setNumRows(0);
        ImpressoraDAO pdao = new ImpressoraDAO();

        for (Impressora imp : pdao.listarPorAndar(andar,prefeitura)) {

            modelo.addRow(new Object[]{
                imp.getNome(),
                imp.getMarca(),
                imp.getModelo(),
                imp.getNumserie(),
                imp.getMac(),
                imp.getIp(),
                imp.getDepartamento(),
                imp.isPrefeitura(),
                imp.getAndar(),
                imp.getLogin(),
                imp.getSenha()
            });

        }

    }
    
    public void listarPorDepartamento (String departamento, boolean prefeitura) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaImpressora.getModel();
        modelo.setNumRows(0);
        ImpressoraDAO pdao = new ImpressoraDAO();

        for (Impressora imp : pdao.listarPorDepartamento(departamento,prefeitura)) {

            modelo.addRow(new Object[]{
                imp.getNome(),
                imp.getMarca(),
                imp.getModelo(),
                imp.getNumserie(),
                imp.getMac(),
                imp.getIp(),
                imp.getDepartamento(),
                imp.isPrefeitura(),
                imp.getAndar(),
                imp.getLogin(),
                imp.getSenha()
            });

        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CampoPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaImpressora = new javax.swing.JTable();
        BotaoLimpar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CampoTipoBusca = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        CampoPrefSim = new javax.swing.JRadioButton();
        CampoPrefNão = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Impressoras", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        CampoPesquisa.setEditable(false);
        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/zoom.png"))); // NOI18N
        jLabel1.setText("Pesquisar");

        TabelaImpressora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Marca", "Modelo", "Número de Série", "MAC", "IP", "Departamento", "Prefeitura", "Andar", "Login", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaImpressora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaImpressoraMouseClicked(evt);
            }
        });
        TabelaImpressora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaImpressoraKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaImpressora);

        BotaoLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/arrow_left.png"))); // NOI18N
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        BotaoExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoExcluir.setForeground(new java.awt.Color(204, 51, 0));
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/printer_delete.png"))); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por:");

        CampoTipoBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Departamento", "Andar" }));
        CampoTipoBusca.setSelectedIndex(-1);
        CampoTipoBusca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CampoTipoBuscaItemStateChanged(evt);
            }
        });

        jLabel3.setText("Prefeitura:");

        buttonGroup1.add(CampoPrefSim);
        CampoPrefSim.setText("Sim");
        CampoPrefSim.setEnabled(false);
        CampoPrefSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CampoPrefSimItemStateChanged(evt);
            }
        });

        buttonGroup1.add(CampoPrefNão);
        CampoPrefNão.setText("Não");
        CampoPrefNão.setEnabled(false);
        CampoPrefNão.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CampoPrefNãoItemStateChanged(evt);
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
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/pencil.png"))); // NOI18N
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
                        .addComponent(BotaoLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoPrefSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoPrefNão)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BotaoLimpar, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(CampoTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CampoPrefSim)
                    .addComponent(CampoPrefNão))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoLimpar)
                    .addComponent(jButton1)
                    .addComponent(BotaoEditar)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BotaoLimpar, jButton1});

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
        if (TabelaImpressora.getSelectedRow() != -1) {

            Impressora imp = new Impressora();
            ImpressoraDAO impdao = new ImpressoraDAO();

            imp.setNumserie((String) TabelaImpressora.getValueAt(TabelaImpressora.getSelectedRow(), 0));
            if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados. Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    impdao.excluir(imp);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsImpressora.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    limparCampos();

                    atualizaTabela();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaConsImpressora.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                CampoTipoBusca.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma impressora para excluir.");
        }
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaImpressoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaImpressoraMouseClicked
        
    }//GEN-LAST:event_TabelaImpressoraMouseClicked

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
       limparCampos();
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void TabelaImpressoraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaImpressoraKeyReleased
        
    }//GEN-LAST:event_TabelaImpressoraKeyReleased

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
       if (CampoTipoBusca.getSelectedIndex()== 0){
            try {
                listarPorNome(CampoPesquisa.getText(),CampoPrefSim.isSelected());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaConsImpressora.class.getName()).log(Level.SEVERE, null, ex);
            }
       }else if(CampoTipoBusca.getSelectedIndex()== 1){
            try {
                listarPorDepartamento(CampoPesquisa.getText(), CampoPrefSim.isSelected());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaConsImpressora.class.getName()).log(Level.SEVERE, null, ex);
            }
       }else {
            try {
                listarPorAndar(CampoPesquisa.getText(), CampoPrefSim.isSelected());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaConsImpressora.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
    }//GEN-LAST:event_CampoPesquisaKeyReleased

    private void CampoTipoBuscaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CampoTipoBuscaItemStateChanged
       CampoPrefNão.setEnabled(true);
       CampoPrefSim.setEnabled(true);
    }//GEN-LAST:event_CampoTipoBuscaItemStateChanged

    private void CampoPrefSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CampoPrefSimItemStateChanged
        CampoPesquisa.setEditable(true);
    }//GEN-LAST:event_CampoPrefSimItemStateChanged

    private void CampoPrefNãoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CampoPrefNãoItemStateChanged
        CampoPesquisa.setEditable(true);
    }//GEN-LAST:event_CampoPrefNãoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
        if (TabelaImpressora.getSelectedRow() != -1) {
            String numSerie= null;

            numSerie = ((String)TabelaImpressora.getValueAt(TabelaImpressora.getSelectedRow(), 3));
            if(JOptionPane.showConfirmDialog(null, "Ao alterar esse registro, ele será modificado permanentemente na base de dados.Deseja prosseguir?","Confirmar Alteração!",JOptionPane.YES_NO_OPTION)== 0){
                TelaEditImpressora EditImpressora = null;
                try {
                    EditImpressora = new TelaEditImpressora(numSerie);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                TelaPrincipal.jDesktopPane1.add(EditImpressora);
                centralizaForm(EditImpressora);
                EditImpressora.setVisible(true);
                this.dispose();
            }else{
                CampoTipoBusca.requestFocus();
            }    
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma impressora para alterar.");
        }
    }//GEN-LAST:event_BotaoEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JRadioButton CampoPrefNão;
    private javax.swing.JRadioButton CampoPrefSim;
    private javax.swing.JComboBox CampoTipoBusca;
    private javax.swing.JTable TabelaImpressora;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
