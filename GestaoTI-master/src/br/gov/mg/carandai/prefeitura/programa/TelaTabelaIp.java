
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ListaIpDAO;
import br.gov.mg.carandai.prefeitura.back.model.DAO.ServidorDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.ListaIp;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class TelaTabelaIp extends javax.swing.JInternalFrame {

    
    public TelaTabelaIp() throws ClassNotFoundException {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) TabelaIp.getModel();
        TabelaIp.setRowSorter(new TableRowSorter(modelo));

        atualizaTabela();

    }
    
     public void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    
    public void limparCampos(){     
        
        
        CampoPesquisa.setText("");
       
    }

    public void atualizaTabela() throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaIp.getModel();
        modelo.setNumRows(0);
        ListaIpDAO ipdao = new ListaIpDAO();

        for (ListaIp ip : ipdao.listar()) {

            modelo.addRow(new Object[]{
                ip.getIp(),
                ip.getNomedispositivo(),
                ip.getMac(),
                ip.getDestino()
             
            });
        }

    }
   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        CampoPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaIp = new javax.swing.JTable();
        BotaoCancelar = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        CampoIP = new javax.swing.JFormattedTextField();
        CampoMAC = new javax.swing.JFormattedTextField();
        CampoNomeDisp = new javax.swing.JTextField();
        CampoDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setClosable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabela IP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/zoom.png"))); // NOI18N
        jLabel1.setText("Pesquisar");

        TabelaIp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
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
                "IP", "Nome do Dispositivo", "MAC", "Destinado a"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaIp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaIpMouseClicked(evt);
            }
        });
        TabelaIp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaIpKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaIp);

        BotaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/cancel.png"))); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/arrow_refresh.png"))); // NOI18N
        BotaoAlterar.setText("Atualizar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        try {
            CampoIP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoIP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoIPFocusLost(evt);
            }
        });

        try {
            CampoMAC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA:AA:AA:AA:AA:AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoMAC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoMACFocusLost(evt);
            }
        });

        jLabel2.setText("IP:");

        jLabel3.setText("Dispositivo:");

        jLabel4.setText("MAC:");

        jLabel5.setText("Destinado à:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 550, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoCancelar)
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoNomeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoMAC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoMAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancelar)
                    .addComponent(BotaoAlterar)))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaIpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaIpMouseClicked
              
        CampoIP.setText((String)TabelaIp.getValueAt(TabelaIp.getSelectedRow(), 0));
        CampoNomeDisp.setText((String)TabelaIp.getValueAt(TabelaIp.getSelectedRow(), 1));
        CampoMAC.setText((String)TabelaIp.getValueAt(TabelaIp.getSelectedRow(), 2));
        CampoDestino.setText((String)TabelaIp.getValueAt(TabelaIp.getSelectedRow(), 3));
    }//GEN-LAST:event_TabelaIpMouseClicked

    private void TabelaIpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaIpKeyReleased
        
    }//GEN-LAST:event_TabelaIpKeyReleased

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
       if("".equals(CampoNomeDisp.getText())) {
           JOptionPane.showMessageDialog(null, "O Nome do Dispositivo deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoNomeDisp.requestFocus();
        }else  if("  :  :  :  :  :  ".equals(CampoMAC.getText())) {
           JOptionPane.showMessageDialog(null, "O MAC deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoMAC.requestFocus();
        }else if("".equals(CampoDestino.getText())) {
           JOptionPane.showMessageDialog(null, "Deve ser informado a que o IP está destinado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoDestino.requestFocus();   
        }else if("   .   .   .   ".equals(CampoIP.getText())) {
           JOptionPane.showMessageDialog(null, "O IP deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoIP.requestFocus();
        
        }else{
             if (TabelaIp.getSelectedRow() != -1) {
                if(JOptionPane.showConfirmDialog(null, "Ao alterar esse registro, ele será modificado permanentemente na base de dados. Deseja prosseguir?","Confirmar Alteração!",JOptionPane.YES_NO_OPTION)== 0){
                    try {
                        ListaIp listip = new ListaIp();
                        ListaIpDAO ipdao = new ListaIpDAO();

                        listip.setIp(CampoIP.getText());
                        listip.setNomedispositivo(CampoNomeDisp.getText().toUpperCase());
                        listip.setMac(CampoMAC.getText().toUpperCase());
                        listip.setDestino(CampoDestino.getText().toUpperCase());
                
                
                

                        ipdao.atualizar(listip);
                        limparCampos();

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TelaCadServidor.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
                } else {
                     CampoPesquisa.requestFocus();
                }
             }else{
                 JOptionPane.showMessageDialog(null, "Selecione um registro para atualizar.");
             }
        }
        try {
            atualizaTabela();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaTabelaIp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
        try {
            ServidorDAO servdao = new ServidorDAO();
            servdao.listarPorNome(CampoPesquisa.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaConsUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CampoPesquisaKeyReleased

    private void CampoIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIPFocusLost

    }//GEN-LAST:event_CampoIPFocusLost

    private void CampoMACFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoMACFocusLost

    }//GEN-LAST:event_CampoMACFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JTextField CampoDestino;
    private javax.swing.JFormattedTextField CampoIP;
    private javax.swing.JFormattedTextField CampoMAC;
    private javax.swing.JTextField CampoNomeDisp;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JTable TabelaIp;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
