
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ComputadorDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Computador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadComputador extends javax.swing.JInternalFrame {

    String cor = null; 
    
    
    public TelaCadComputador() throws ClassNotFoundException {
        initComponents();
        
    }
    
    public void limparCampos(){
        CampoNome.setText("");
        CampoGrupoTrab.setText("");
        CampoSO.setSelectedIndex(-1);
        CampoFormatacao.setText("");
        CampoSerial.setText("");
        CampoIP.setText("");
        buttonGroup1.clearSelection();
        CampoAndar.setSelectedIndex(-1);
        CampoUsuario.setText("");
        CampoCorBranco.setSelected(false);
        CampoCorPreto.setSelected(false);
        CampoCorPrata.setSelected(false);
        CampoCorCinza.setSelected(false);
        CampoDepartamento.setText("");
        CampoBaia.setSelectedIndex(-1);
        CampoModelPMae.setText("");
        CampoMarcaPMae.setText("");
        CampoMAC.setText("");
        CampoMarcaProcessador.setText("");
        CampoModelProc.setText("");
        CampoFreqproc.setSelectedIndex(-1);
        CampoCpMem.setSelectedIndex(-1);
        CampoModelMem.setSelectedIndex(-1);
        CampoFreqMem.setSelectedIndex(-1);
        CampoCapHD.setSelectedIndex(-1);
        CampoModelHD.setSelectedIndex(-1);
        buttonGroup2.clearSelection();
        CampoModelDrive.setSelectedIndex(-1);
        
        
        
        
        
        
        
    }
    
     
    
      
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        CampoMarcaPMae = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CampoModelPMae = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        CampoMAC = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        CampoMarcaProcessador = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        CampoModelProc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        CampoFreqproc = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        CampoFreqMem = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        CampoCpMem = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        CampoModelMem = new javax.swing.JComboBox<>();
        BotaoCancelar = new javax.swing.JButton();
        BotaoSalvar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        CampoCapHD = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        CampoModelHD = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        CampoDriveSim = new javax.swing.JRadioButton();
        CampoDriveNao = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        CampoModelDrive = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CampoNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        CampoGrupoTrab = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CampoPrefSim = new javax.swing.JRadioButton();
        CampoPrefNao = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        CampoAndar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CampoDepartamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoSO = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CampoSerial = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CampoBaia = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CampoFormatacao = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        CampoIP = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        CampoCorBranco = new javax.swing.JCheckBox();
        CampoCorPreto = new javax.swing.JCheckBox();
        CampoCorPrata = new javax.swing.JCheckBox();
        CampoCorCinza = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("Setor de Informática");
        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Computador", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hardware", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Placa-Mãe:");

        CampoMarcaPMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoMarcaPMaeFocusLost(evt);
            }
        });
        CampoMarcaPMae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMarcaPMaeActionPerformed(evt);
            }
        });

        jLabel16.setText("Marca:");

        jLabel6.setText("Modelo:");

        CampoModelPMae.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoModelPMaeFocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Processador:");

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

        jLabel18.setText("Marca:");

        CampoMarcaProcessador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoMarcaProcessadorFocusLost(evt);
            }
        });
        CampoMarcaProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoMarcaProcessadorActionPerformed(evt);
            }
        });

        jLabel19.setText("Modelo:");

        CampoModelProc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoModelProcFocusLost(evt);
            }
        });

        jLabel20.setText("Frequência(GHz)");

        CampoFreqproc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.7", "1.8", "2.0", "2.5", "2.6", "2.7", "2.8", "2.9", "3.0", "3.1", "3.3", "3.5", "3.9" }));
        CampoFreqproc.setSelectedIndex(-1);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Memória:");

        jLabel24.setText("Frequência(MHz)");

        CampoFreqMem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "533", "667", "800", "1333", "1600", "2133", "2400" }));
        CampoFreqMem.setSelectedIndex(-1);

        jLabel25.setText("Capacidade (GB):");

        CampoCpMem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "8", "16" }));
        CampoCpMem.setSelectedIndex(-1);

        jLabel26.setText("Modelo:");

        CampoModelMem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DDR2", "DDR3", "DDR4" }));
        CampoModelMem.setSelectedIndex(-1);

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

        jLabel22.setText("MAC:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("HD:");

        jLabel27.setText("Capacidade (GB):");

        CampoCapHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "80", "160", "320", "500", "1000", "2000" }));
        CampoCapHD.setSelectedIndex(-1);

        jLabel28.setText("Modelo:");

        CampoModelHD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IDE", "SATA" }));
        CampoModelHD.setSelectedIndex(-1);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Drive:");

        jLabel30.setText("Possui:");

        buttonGroup2.add(CampoDriveSim);
        CampoDriveSim.setText("Sim");
        CampoDriveSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CampoDriveSimItemStateChanged(evt);
            }
        });
        CampoDriveSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDriveSimActionPerformed(evt);
            }
        });

        buttonGroup2.add(CampoDriveNao);
        CampoDriveNao.setText("Não");

        jLabel31.setText("Modelo:");

        CampoModelDrive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NENHUM", "IDE", "SATA" }));
        CampoModelDrive.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSalvar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CampoModelPMae)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(CampoMAC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(CampoMarcaPMae, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoModelHD, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoCapHD, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CampoFreqproc, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel19))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CampoModelProc)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel17)
                                                        .addComponent(CampoMarcaProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel26)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CampoModelDrive, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CampoFreqMem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoModelMem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoCpMem, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CampoDriveSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CampoDriveNao)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel24, jLabel25});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel16, jLabel22});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CampoMarcaPMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CampoModelPMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(CampoMarcaProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(CampoCpMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(CampoModelProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoModelMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGap(1, 1, 1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(CampoFreqproc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoFreqMem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoMAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(CampoCapHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30)
                                    .addComponent(CampoDriveSim)
                                    .addComponent(CampoDriveNao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(6, 6, 6))
                                    .addComponent(CampoModelHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(6, 6, 6))
                                .addComponent(CampoModelDrive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoSalvar)
                    .addComponent(BotaoCancelar))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel18, jLabel19, jLabel20});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel24, jLabel25, jLabel26});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel16, jLabel22, jLabel6});

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setText("Nome:");

        CampoNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoNomeFocusLost(evt);
            }
        });

        jLabel14.setText("Grupo de Trabalho:");

        CampoGrupoTrab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoGrupoTrabFocusLost(evt);
            }
        });

        jLabel10.setText("Prefeitura:");

        buttonGroup1.add(CampoPrefSim);
        CampoPrefSim.setText("Sim");

        buttonGroup1.add(CampoPrefNao);
        CampoPrefNao.setText("Não");

        jLabel9.setText("Andar:");

        CampoAndar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        CampoAndar.setSelectedIndex(-1);

        jLabel4.setText("Departamento:");

        CampoDepartamento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoDepartamentoFocusLost(evt);
            }
        });
        CampoDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDepartamentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Sistema Operacional:");

        CampoSO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WINDOWS 7 ULTIMATE x86", "WINDOWS 7 ULTIMATE x64", "WINDOWS 10 PRO x86", "WINDOWS 10 PRO x64", "LINUX MINT x86", "LINUX MINT x64", "ENDLESS OS", "OUTRO" }));
        CampoSO.setSelectedIndex(-1);
        CampoSO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoSOFocusLost(evt);
            }
        });

        jLabel2.setText("Serial:");

        try {
            CampoSerial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAAAA-AAAAA-AAAAA-AAAAA-AAAAA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CampoSerial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoSerialFocusLost(evt);
            }
        });

        jLabel3.setText("Usuário:");

        CampoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoUsuarioFocusLost(evt);
            }
        });

        jLabel12.setText("Número de Baias:");

        CampoBaia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        CampoBaia.setSelectedIndex(-1);

        jLabel13.setText("Data de Formatação:");

        CampoFormatacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        CampoFormatacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoFormatacaoFocusLost(evt);
            }
        });

        jLabel11.setText("IP:");

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

        jLabel5.setText("Cor Predominante:");

        CampoCorBranco.setText("Branco");
        CampoCorBranco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CampoCorBrancoFocusLost(evt);
            }
        });

        CampoCorPreto.setText("Preto");

        CampoCorPrata.setText("Prata");

        CampoCorCinza.setText("Cinza");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoGrupoTrab))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoPrefSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoPrefNao)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoAndar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoNome))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CampoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CampoSO, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoUsuario))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoBaia, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoFormatacao))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoIP, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoCorBranco)
                            .addComponent(CampoCorPreto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoCorCinza)
                            .addComponent(CampoCorPrata)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(CampoGrupoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(CampoPrefSim)
                            .addComponent(CampoPrefNao)
                            .addComponent(jLabel9)
                            .addComponent(CampoAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(CampoBaia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(CampoSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(CampoSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(CampoFormatacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(CampoIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCorBranco)
                            .addComponent(CampoCorPrata))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCorPreto)
                            .addComponent(CampoCorCinza))))
                .addGap(17, 17, 17))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CampoNome, CampoUsuario});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoCancelarActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
   
        
        if("".equals(CampoNome.getText())) {
           JOptionPane.showMessageDialog(null, "O Nome deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoNome.requestFocus();
        }else if(CampoSO.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "Sistema Operacional deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoSO.requestFocus();
        }else if("".equals(CampoFormatacao.getText())) {
           JOptionPane.showMessageDialog(null, "A Data de Formatação deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoFormatacao.requestFocus();
        }else if("".equals(CampoGrupoTrab.getText())) {
           JOptionPane.showMessageDialog(null, "O Grupo de Trabalho deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoGrupoTrab.requestFocus();
        }else if("     -     -     -     -     ".equals(CampoSerial.getText())) {
           JOptionPane.showMessageDialog(null, "O Serial deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoSerial.requestFocus();
        }else if("   .   .   .   ".equals(CampoIP.getText())) {
           JOptionPane.showMessageDialog(null, "O IP deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoIP.requestFocus();
        }else if(CampoPrefNao.isSelected() == false && CampoPrefSim.isSelected() == false) {
           JOptionPane.showMessageDialog(null, "O Campo prefeitura deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoPrefSim.requestFocus();
        }else if(CampoAndar.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "O Andar deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoAndar.requestFocus();
        }else if("".equals(CampoUsuario.getText())) {
           JOptionPane.showMessageDialog(null, "O Usuario deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoUsuario.requestFocus();
        }else if(CampoCorBranco.isSelected() == false && CampoCorCinza.isSelected() == false && CampoCorPrata.isSelected() == false && CampoCorPreto.isSelected() == false) {
           JOptionPane.showMessageDialog(null, "A Cor deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoCorBranco.requestFocus();
        }else if("".equals(CampoDepartamento.getText())) {
           JOptionPane.showMessageDialog(null, "O Departamento deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoDepartamento.requestFocus(); 
        }else if(CampoBaia.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "O Número de Baias deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoBaia.requestFocus();
        }else if("".equals(CampoMarcaPMae.getText())) {
           JOptionPane.showMessageDialog(null, "A Marca da Placa-Mãe deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoMarcaPMae.requestFocus(); 
        }else if("".equals(CampoModelPMae.getText())) {
           JOptionPane.showMessageDialog(null, "O Modelo da Placa-Mãe deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoModelPMae.requestFocus();
        }else  if("  :  :  :  :  :  ".equals(CampoMAC.getText())) {
           JOptionPane.showMessageDialog(null, "O MAC deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoMAC.requestFocus();   
        }else if("".equals(CampoMarcaProcessador.getText())) {
           JOptionPane.showMessageDialog(null, "A Marca do Processador deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoMarcaProcessador.requestFocus(); 
        }else if("".equals(CampoModelProc.getText())) {
           JOptionPane.showMessageDialog(null, "O Modelo do Processador deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoModelProc.requestFocus(); 
        }else if(CampoFreqproc.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "A Frequência do Processador deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoFreqproc.requestFocus();
        }else if(CampoCpMem.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "A Capacidade da Memória deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoCpMem.requestFocus();
        }else if(CampoModelMem.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "O Modelo da Memória deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoModelMem.requestFocus();
        }else if(CampoFreqMem.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "A Frequência da Memória deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoFreqMem.requestFocus();   
        }else if(CampoCapHD.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "A Capacidade do HD deve ser informada!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoCapHD.requestFocus();
        }else if(CampoModelHD.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "O Modelo do HD deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoModelHD.requestFocus();  
        }else if(CampoDriveNao.isSelected()==false && CampoDriveSim.isSelected() == false) {
           JOptionPane.showMessageDialog(null, "Deve ser informado se possui Drive!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoDriveSim.requestFocus();
        }else if(CampoModelDrive.getSelectedIndex() == -1) {
           JOptionPane.showMessageDialog(null, "O tipo de drive deve ser informado!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
           CampoModelDrive.requestFocus();
        }else {
           if(JOptionPane.showConfirmDialog(null, "Deseja salvar o registro?","Confirmar Cadastro!",JOptionPane.YES_NO_OPTION)== 0){
                try {
                    Computador comp = new Computador();
                    ComputadorDAO compdao = new ComputadorDAO();
                    String cor =null;

                    comp.setNome(CampoNome.getText().toUpperCase());
                    comp.setGrupotrab(CampoGrupoTrab.getText().toUpperCase());
                    comp.setSo(CampoSO.getSelectedItem().toString());
                    comp.setFormatacao(CampoFormatacao.getText());
                    comp.setSerial(CampoSerial.getText().toUpperCase());
                    comp.setIp(CampoIP.getText());
                    comp.setPrefeitura(CampoPrefSim.isSelected());
                    comp.setAndar(CampoAndar.getSelectedItem().toString());
                    comp.setUsuario(CampoUsuario.getText().toUpperCase());
                    comp.setCorbranco(CampoCorBranco.isSelected());
                    comp.setCorpreto(CampoCorPreto.isSelected());
                    comp.setCorprata(CampoCorPrata.isSelected());
                    comp.setCorcinza(CampoCorCinza.isSelected());
                    comp.setDepartamento(CampoDepartamento.getText().toUpperCase());
                    comp.setNumbaia(CampoBaia.getSelectedItem().toString());
                    comp.setModeloplacamae(CampoModelPMae.getText().toUpperCase());
                    comp.setMarcaplacamae(CampoMarcaPMae.getText().toUpperCase());               
                    comp.setMac(CampoMAC.getText().toUpperCase());
                    comp.setMarcaprocessador(CampoMarcaProcessador.getText().toUpperCase());
                    comp.setModeloprocessador(CampoModelProc.getText().toUpperCase());
                    comp.setFreqprocessador(CampoFreqproc.getSelectedItem().toString());
                    comp.setCapacidadememoria(CampoCpMem.getSelectedItem().toString());
                    comp.setModelomemoria(CampoModelMem.getSelectedItem().toString());
                    comp.setFreqmemoria(CampoFreqMem.getSelectedItem().toString());
                    comp.setCapacidadehd(CampoCapHD.getSelectedItem().toString());
                    comp.setModelohd(CampoModelHD.getSelectedItem().toString());
                    comp.setDrive(CampoDriveSim.isSelected());
                    comp.setModelodrive(CampoModelDrive.getSelectedItem().toString());
   
                    compdao.adicionar(comp);
                    limparCampos();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaCadComputador.class.getName()).log(Level.SEVERE, null, ex);
                }
           }else{
               CampoNome.requestFocus();
           }    
        }
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void CampoDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDepartamentoActionPerformed

    private void CampoMarcaPMaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMarcaPMaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMarcaPMaeActionPerformed

    private void CampoMarcaProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoMarcaProcessadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoMarcaProcessadorActionPerformed

    private void CampoDriveSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDriveSimActionPerformed
        
    }//GEN-LAST:event_CampoDriveSimActionPerformed

    private void CampoDriveSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CampoDriveSimItemStateChanged
        
    }//GEN-LAST:event_CampoDriveSimItemStateChanged

    private void CampoCorBrancoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoCorBrancoFocusLost

    }//GEN-LAST:event_CampoCorBrancoFocusLost

    private void CampoNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoNomeFocusLost
       
    }//GEN-LAST:event_CampoNomeFocusLost

    private void CampoFormatacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoFormatacaoFocusLost
        
    }//GEN-LAST:event_CampoFormatacaoFocusLost

    private void CampoGrupoTrabFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoGrupoTrabFocusLost
        
    }//GEN-LAST:event_CampoGrupoTrabFocusLost

    private void CampoSerialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSerialFocusLost
        
    }//GEN-LAST:event_CampoSerialFocusLost

    private void CampoIPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoIPFocusLost
       
    }//GEN-LAST:event_CampoIPFocusLost

    private void CampoUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoUsuarioFocusLost
       
    }//GEN-LAST:event_CampoUsuarioFocusLost

    private void CampoDepartamentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDepartamentoFocusLost
       
    }//GEN-LAST:event_CampoDepartamentoFocusLost

    private void CampoMarcaPMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoMarcaPMaeFocusLost
        
    }//GEN-LAST:event_CampoMarcaPMaeFocusLost

    private void CampoModelPMaeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoModelPMaeFocusLost
        
    }//GEN-LAST:event_CampoModelPMaeFocusLost

    private void CampoMACFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoMACFocusLost
        
    }//GEN-LAST:event_CampoMACFocusLost

    private void CampoMarcaProcessadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoMarcaProcessadorFocusLost
       
    }//GEN-LAST:event_CampoMarcaProcessadorFocusLost

    private void CampoModelProcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoModelProcFocusLost
        
    }//GEN-LAST:event_CampoModelProcFocusLost

    private void CampoSOFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoSOFocusLost
       
    }//GEN-LAST:event_CampoSOFocusLost
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelar;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JComboBox<String> CampoAndar;
    private javax.swing.JComboBox<String> CampoBaia;
    private javax.swing.JComboBox<String> CampoCapHD;
    private javax.swing.JCheckBox CampoCorBranco;
    private javax.swing.JCheckBox CampoCorCinza;
    private javax.swing.JCheckBox CampoCorPrata;
    private javax.swing.JCheckBox CampoCorPreto;
    private javax.swing.JComboBox<String> CampoCpMem;
    private javax.swing.JTextField CampoDepartamento;
    private javax.swing.JRadioButton CampoDriveNao;
    private javax.swing.JRadioButton CampoDriveSim;
    private javax.swing.JFormattedTextField CampoFormatacao;
    private javax.swing.JComboBox<String> CampoFreqMem;
    private javax.swing.JComboBox<String> CampoFreqproc;
    private javax.swing.JTextField CampoGrupoTrab;
    private javax.swing.JFormattedTextField CampoIP;
    private javax.swing.JFormattedTextField CampoMAC;
    private javax.swing.JTextField CampoMarcaPMae;
    private javax.swing.JTextField CampoMarcaProcessador;
    private javax.swing.JComboBox<String> CampoModelDrive;
    private javax.swing.JComboBox<String> CampoModelHD;
    private javax.swing.JComboBox<String> CampoModelMem;
    private javax.swing.JTextField CampoModelPMae;
    private javax.swing.JTextField CampoModelProc;
    private javax.swing.JTextField CampoNome;
    private javax.swing.JRadioButton CampoPrefNao;
    private javax.swing.JRadioButton CampoPrefSim;
    private javax.swing.JComboBox<String> CampoSO;
    private javax.swing.JFormattedTextField CampoSerial;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

   
}
