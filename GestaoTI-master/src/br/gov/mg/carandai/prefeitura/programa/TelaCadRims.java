
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.RIMSDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Rims;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadRims extends javax.swing.JInternalFrame {


    
    
    public TelaCadRims() throws ClassNotFoundException {
        initComponents();
        
    }
    
    public void limparCampos(){
        CampoData.setText("");
        CampoFicha.setText("");
        CampoFonte.setText("");
        CampoForn.setText("");
        CampoNumProc.setText("");
        CampoNumProc2.setSelectedIndex(-1);
        CampoNumRims.setText("");
        CampoNumRims2.setSelectedIndex(-1);
        CampoMat.setText("");
        CampoSol.setText("");
        buttonGroup2.clearSelection();
    }
    
     
    
      
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BotaoCancelar = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoNumRims = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoNumRims2 = new javax.swing.JComboBox<>();
        CampoNumProc = new javax.swing.JFormattedTextField();
        CampoNumProc2 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CampoFicha = new javax.swing.JFormattedTextField();
        CampoFonte = new javax.swing.JFormattedTextField();
        CampoSol = new javax.swing.JTextField();
        CampoForn = new javax.swing.JTextField();
        CampoData = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        CampoMat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoSim = new javax.swing.JRadioButton();
        CampoNao = new javax.swing.JRadioButton();

        setClosable(true);
        setTitle("Setor de Informática");
        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de RIMS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        BotaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoCancelar.setForeground(new java.awt.Color(204, 0, 0));
        BotaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/cancel.png"))); // NOI18N
        BotaoCancelar.setText("Cancelar");
        BotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarActionPerformed(evt);
            }
        });

        BotaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotaoSalvar.setForeground(new java.awt.Color(0, 153, 0));
        BotaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/accept.png"))); // NOI18N
        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Número da RIMS:");

        jLabel2.setText("Número do processo:");

        jLabel3.setText("Solicitante:");

        jLabel4.setText("Ficha:");

        jLabel5.setText("Fonte:");

        jLabel6.setText("Fornecedor:");

        jLabel9.setText("Data Pedido:");

        CampoNumRims.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel10.setText("/ ");

        CampoNumRims2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));

        CampoNumProc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        CampoNumProc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023" }));

        jLabel11.setText("/ ");

        CampoFicha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        CampoFonte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        CampoData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        CampoMat.setColumns(20);
        CampoMat.setRows(5);
        jScrollPane2.setViewportView(CampoMat);

        jLabel7.setText("Materiais:");

        jLabel8.setText("Materiais Entregues:");

        buttonGroup2.add(CampoSim);
        CampoSim.setText("Sim");

        buttonGroup2.add(CampoNao);
        CampoNao.setText("Não");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoNumRims, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoNumRims2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoSol, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(45, 45, 45)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoNumProc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoNumProc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(CampoForn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(57, 57, 57)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CampoFonte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CampoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(CampoSim)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoNao))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(BotaoCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(BotaoSalvar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CampoFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CampoNumRims, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(CampoNumRims2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(CampoNumProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(CampoNumProc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CampoSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(CampoForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(CampoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(CampoSim)
                        .addComponent(CampoNao)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar)
                    .addComponent(BotaoCancelar))
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

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
         
        if("".equals(CampoNumRims.getText())) {
            JOptionPane.showMessageDialog(null, "O Numero da RIMS deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoNumRims.requestFocus();
        }else if(CampoNumRims2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "O Ano da RIMS deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoNumRims2.requestFocus();
        }else if("".equals(CampoNumProc.getText())) {
            JOptionPane.showMessageDialog(null, "O Número do Processo deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoNumProc.requestFocus();
        }else if(CampoNumProc2.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "O Ano do Processo deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoNumProc2.requestFocus();
        }else if("".equals(CampoFicha.getText())) {
            JOptionPane.showMessageDialog(null, "A Ficha deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoFicha.requestFocus();
        }else if("".equals(CampoFonte.getText())) {
            JOptionPane.showMessageDialog(null, "A Fonte deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoFonte.requestFocus();
        }else if("".equals(CampoSol.getText())) {
            JOptionPane.showMessageDialog(null, "O Solicitante prefeitura deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoSol.requestFocus();
        }else if("".equals(CampoForn.getText())) {
            JOptionPane.showMessageDialog(null, "O Fornecedor deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoForn.requestFocus();
         }else if("".equals(CampoMat.getText())) {
            JOptionPane.showMessageDialog(null, "Os Materiais devem ser informados!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoMat.requestFocus();
          }else if(CampoSim.isSelected()==false && CampoNao.isSelected()==false) {
            JOptionPane.showMessageDialog(null, "Deve ser informado se o(s) produto(s) ainda não chegou!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
            CampoSim.requestFocus();
       
        }else {
            if(JOptionPane.showConfirmDialog(null, "Deseja salvar o registro?","Confirmar Cadastro!",JOptionPane.YES_NO_OPTION)== 0){
                Rims  rims= new Rims();
                RIMSDAO rdao = new RIMSDAO();
                
                rims.setNumRims(CampoNumRims.getText());
                rims.setAnoRims(CampoNumRims2.getSelectedItem().toString());
                rims.setNumProc(CampoNumProc.getText());
                rims.setAnoProc(CampoNumProc2.getSelectedItem().toString());
                rims.setFicha(CampoFicha.getText());
                rims.setFonte(CampoFonte.getText());
                rims.setSolicit(CampoSol.getText().toUpperCase());
                rims.setFornec(CampoForn.getText().toUpperCase());
                rims.setProd(CampoMat.getText().toUpperCase());
                rims.setDataPed(CampoData.getText());
                rims.setEntregue(CampoSim.isSelected());
                
                try {
                    rdao.adicionar(rims);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaCadRims.class.getName()).log(Level.SEVERE, null, ex);
                }
                limparCampos();
            }else{
                CampoNumRims.requestFocus();
            }
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JFormattedTextField CampoData;
    private javax.swing.JFormattedTextField CampoFicha;
    private javax.swing.JFormattedTextField CampoFonte;
    private javax.swing.JTextField CampoForn;
    private javax.swing.JTextArea CampoMat;
    private javax.swing.JRadioButton CampoNao;
    private javax.swing.JFormattedTextField CampoNumProc;
    private javax.swing.JComboBox<String> CampoNumProc2;
    private javax.swing.JFormattedTextField CampoNumRims;
    private javax.swing.JComboBox<String> CampoNumRims2;
    private javax.swing.JRadioButton CampoSim;
    private javax.swing.JTextField CampoSol;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

   
}
