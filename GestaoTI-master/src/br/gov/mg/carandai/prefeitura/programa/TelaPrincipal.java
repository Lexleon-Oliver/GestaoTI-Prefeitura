/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.Logdao;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author TI
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
   
     private void centralizaForm(JInternalFrame frame) {
        Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
        (desktopSize.height - jInternalFrameSize.height) / 2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuUsuario = new javax.swing.JMenu();
        UsuarioCad = new javax.swing.JMenuItem();
        UsuarioCons = new javax.swing.JMenuItem();
        MenuImpressora = new javax.swing.JMenu();
        ImpressoraCad = new javax.swing.JMenuItem();
        ImpressoraCons = new javax.swing.JMenuItem();
        MenuServidor = new javax.swing.JMenu();
        ServidorCad = new javax.swing.JMenuItem();
        ServidorCons = new javax.swing.JMenuItem();
        MenuComputador = new javax.swing.JMenu();
        ComputadorCad = new javax.swing.JMenuItem();
        ComputadorCons = new javax.swing.JMenuItem();
        MenuRoteador = new javax.swing.JMenu();
        RoteadorCad = new javax.swing.JMenuItem();
        RoteadorCons = new javax.swing.JMenuItem();
        MenuRims = new javax.swing.JMenu();
        RimsCad = new javax.swing.JMenuItem();
        RimsCons = new javax.swing.JMenuItem();
        MenuOficio = new javax.swing.JMenu();
        OficCad = new javax.swing.JMenuItem();
        OficCons = new javax.swing.JMenuItem();
        MenuMemo = new javax.swing.JMenu();
        MemoCad = new javax.swing.JMenuItem();
        MemoCons = new javax.swing.JMenuItem();
        MenuSenha = new javax.swing.JMenu();
        SenhaAlt = new javax.swing.JMenuItem();
        MenuTabIp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Setor de Informática");
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/52a51e8670a95c9379714656f3bfd3f1.jpg"))); // NOI18N

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 1920, 1080);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setInheritsPopupMenu(true);

        MenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/user.png"))); // NOI18N
        MenuUsuario.setText("Usuário");

        UsuarioCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/user_add.png"))); // NOI18N
        UsuarioCad.setText("Cadastrar");
        UsuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioCadActionPerformed(evt);
            }
        });
        MenuUsuario.add(UsuarioCad);

        UsuarioCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        UsuarioCons.setText("Consultar");
        UsuarioCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioConsActionPerformed(evt);
            }
        });
        MenuUsuario.add(UsuarioCons);

        jMenuBar1.add(MenuUsuario);

        MenuImpressora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/printer.png"))); // NOI18N
        MenuImpressora.setText("Impressora");

        ImpressoraCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/printer_add.png"))); // NOI18N
        ImpressoraCad.setText("Cadastrar");
        ImpressoraCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpressoraCadActionPerformed(evt);
            }
        });
        MenuImpressora.add(ImpressoraCad);

        ImpressoraCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        ImpressoraCons.setText("Consultar");
        ImpressoraCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpressoraConsActionPerformed(evt);
            }
        });
        MenuImpressora.add(ImpressoraCons);

        jMenuBar1.add(MenuImpressora);

        MenuServidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/server.png"))); // NOI18N
        MenuServidor.setText("Servidor");

        ServidorCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/server_add.png"))); // NOI18N
        ServidorCad.setText("Cadastrar");
        ServidorCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServidorCadActionPerformed(evt);
            }
        });
        MenuServidor.add(ServidorCad);

        ServidorCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        ServidorCons.setText("Consultar");
        ServidorCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServidorConsActionPerformed(evt);
            }
        });
        MenuServidor.add(ServidorCons);

        jMenuBar1.add(MenuServidor);

        MenuComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/computer.png"))); // NOI18N
        MenuComputador.setText("Computador");

        ComputadorCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/computer_add.png"))); // NOI18N
        ComputadorCad.setText("Cadastrar");
        ComputadorCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputadorCadActionPerformed(evt);
            }
        });
        MenuComputador.add(ComputadorCad);

        ComputadorCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        ComputadorCons.setText("Consultar");
        ComputadorCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComputadorConsActionPerformed(evt);
            }
        });
        MenuComputador.add(ComputadorCons);

        jMenuBar1.add(MenuComputador);

        MenuRoteador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/wifi2.png"))); // NOI18N
        MenuRoteador.setText("Roteador");

        RoteadorCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/add.png"))); // NOI18N
        RoteadorCad.setText("Cadastrar");
        RoteadorCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoteadorCadActionPerformed(evt);
            }
        });
        MenuRoteador.add(RoteadorCad);

        RoteadorCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        RoteadorCons.setText("Consultar");
        RoteadorCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoteadorConsActionPerformed(evt);
            }
        });
        MenuRoteador.add(RoteadorCons);

        jMenuBar1.add(MenuRoteador);

        MenuRims.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/table.png"))); // NOI18N
        MenuRims.setText("RIMS");
        MenuRims.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRimsActionPerformed(evt);
            }
        });

        RimsCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/table_add.png"))); // NOI18N
        RimsCad.setText("Cadastrar");
        RimsCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RimsCadActionPerformed(evt);
            }
        });
        MenuRims.add(RimsCad);

        RimsCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        RimsCons.setText("Consultar");
        RimsCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RimsConsActionPerformed(evt);
            }
        });
        MenuRims.add(RimsCons);

        jMenuBar1.add(MenuRims);

        MenuOficio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/page_word.png"))); // NOI18N
        MenuOficio.setText("Oficio");

        OficCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/add.png"))); // NOI18N
        OficCad.setText("Cadastrar");
        OficCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OficCadActionPerformed(evt);
            }
        });
        MenuOficio.add(OficCad);

        OficCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        OficCons.setText("Consultar");
        OficCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OficConsActionPerformed(evt);
            }
        });
        MenuOficio.add(OficCons);

        jMenuBar1.add(MenuOficio);

        MenuMemo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/page.png"))); // NOI18N
        MenuMemo.setText("Memorando");

        MemoCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/page_add.png"))); // NOI18N
        MemoCad.setText("Cadastrar");
        MemoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoCadActionPerformed(evt);
            }
        });
        MenuMemo.add(MemoCad);

        MemoCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        MemoCons.setText("Consultar");
        MemoCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoConsActionPerformed(evt);
            }
        });
        MenuMemo.add(MemoCons);

        jMenuBar1.add(MenuMemo);

        MenuSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/key.png"))); // NOI18N
        MenuSenha.setText("Senha ");

        SenhaAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/pencil.png"))); // NOI18N
        SenhaAlt.setText("Alterar");
        SenhaAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaAltActionPerformed(evt);
            }
        });
        MenuSenha.add(SenhaAlt);

        jMenuBar1.add(MenuSenha);

        MenuTabIp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/application_view_columns.png"))); // NOI18N
        MenuTabIp.setText("Tabela de IP");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/book_open.png"))); // NOI18N
        jMenuItem1.setText("Consultar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuTabIp.add(jMenuItem1);

        jMenuBar1.add(MenuTabIp);

        MenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/information.png"))); // NOI18N
        MenuSobre.setText("Sobre");
        MenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSobreMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuSobreMousePressed(evt);
            }
        });
        jMenuBar1.add(MenuSobre);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImpressoraCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpressoraCadActionPerformed
             
        TelaCadImpressora CadImpressora = null;
        try {
            CadImpressora = new TelaCadImpressora();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(CadImpressora);
        centralizaForm(CadImpressora);
        CadImpressora.setVisible(true);
    }//GEN-LAST:event_ImpressoraCadActionPerformed

    private void ImpressoraConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpressoraConsActionPerformed
        TelaConsImpressora ConsImpressora = null;
        try {
            ConsImpressora = new TelaConsImpressora();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(ConsImpressora);
        centralizaForm(ConsImpressora);
        ConsImpressora.setVisible(true);
    }//GEN-LAST:event_ImpressoraConsActionPerformed

    private void ServidorCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServidorCadActionPerformed
        TelaCadServidor CadServidor = null;
        try {
            CadServidor = new TelaCadServidor();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(CadServidor);
        centralizaForm(CadServidor);
        CadServidor.setVisible(true);
    }//GEN-LAST:event_ServidorCadActionPerformed

    private void RoteadorCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoteadorCadActionPerformed
        TelaCadRoteador CadRoteador = null;
        try {
            CadRoteador = new TelaCadRoteador();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(CadRoteador);
        centralizaForm(CadRoteador);
        CadRoteador.setVisible(true);
    }//GEN-LAST:event_RoteadorCadActionPerformed

    private void SenhaAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaAltActionPerformed
        TelaEditSenha EditSenha = null;
        try {
            EditSenha = new TelaEditSenha();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(EditSenha);
        centralizaForm(EditSenha);
        EditSenha.setVisible(true);
    }//GEN-LAST:event_SenhaAltActionPerformed

    private void UsuarioConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioConsActionPerformed

        TelaConsUsuario ConsUsuario = null;
        try {
            ConsUsuario = new TelaConsUsuario();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(ConsUsuario);
        centralizaForm(ConsUsuario);
        ConsUsuario.setVisible(true);
    }//GEN-LAST:event_UsuarioConsActionPerformed

    private void UsuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioCadActionPerformed
        TelaCadUsuario CadUsuario = null;
        try {
            CadUsuario = new TelaCadUsuario();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(CadUsuario);
        centralizaForm(CadUsuario);
        CadUsuario.setVisible(true);

    }//GEN-LAST:event_UsuarioCadActionPerformed

    private void ServidorConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServidorConsActionPerformed
        TelaConsServidor ConsServidor = null;
        try {
            ConsServidor = new TelaConsServidor();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(ConsServidor);
        centralizaForm(ConsServidor);
        ConsServidor.setVisible(true);
    }//GEN-LAST:event_ServidorConsActionPerformed

    private void RoteadorConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoteadorConsActionPerformed
        TelaConsRoteador ConsRoteador = null;
        try {
            ConsRoteador = new TelaConsRoteador();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(ConsRoteador);
        centralizaForm(ConsRoteador);
        ConsRoteador.setVisible(true);
    }//GEN-LAST:event_RoteadorConsActionPerformed

    private void ComputadorCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputadorCadActionPerformed
        TelaCadComputador CadComputador = null;
        try {
            CadComputador = new TelaCadComputador();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(CadComputador);
        centralizaForm(CadComputador);
        CadComputador.setVisible(true);
    }//GEN-LAST:event_ComputadorCadActionPerformed

    private void ComputadorConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComputadorConsActionPerformed
        TelaConsComputador ConsComputador = null;
        try {
            ConsComputador = new TelaConsComputador();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(ConsComputador);
        centralizaForm(ConsComputador);
        ConsComputador.setVisible(true);
    }//GEN-LAST:event_ComputadorConsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        TelaTabelaIp TabelaIP = null;
        try {
            TabelaIP = new TelaTabelaIp();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(TabelaIP);
        centralizaForm(TabelaIP);
        TabelaIP.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobreMouseClicked
       TelaSobre sobre;
        try {
            sobre = new TelaSobre();
            jDesktopPane1.add(sobre);
            centralizaForm(sobre);
            sobre.setVisible(true);
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }//GEN-LAST:event_MenuSobreMouseClicked

    private void MenuSobreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSobreMousePressed
        TelaSobre sobre;
        try {
            sobre = new TelaSobre();
            jDesktopPane1.add(sobre);
            centralizaForm(sobre);
            sobre.setVisible(true);
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_MenuSobreMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String Action = "Logout Realizado com Sucesso!";
        UsuLog.DataHora();
        Logdao.gravarLog(Action);
    }//GEN-LAST:event_formWindowClosing

    private void MenuRimsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRimsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuRimsActionPerformed

    private void OficConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OficConsActionPerformed
        TelaConsOficio of = null;
        try {
            of = new TelaConsOficio();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(of);
        centralizaForm(of);
        of.setVisible(true);
    }//GEN-LAST:event_OficConsActionPerformed

    private void RimsCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RimsCadActionPerformed
        TelaCadRims rims = null;
        try {
            rims = new TelaCadRims();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(rims);
        centralizaForm(rims);
        rims.setVisible(true);
    }//GEN-LAST:event_RimsCadActionPerformed

    private void OficCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OficCadActionPerformed
        TelaCadOficio ofic = null;
        try {
            ofic = new TelaCadOficio();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(ofic);
        centralizaForm(ofic);
        ofic.setVisible(true);
    }//GEN-LAST:event_OficCadActionPerformed

    private void MemoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoCadActionPerformed
         TelaCadMemo memo = null;
        try {
            memo = new TelaCadMemo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(memo);
        centralizaForm(memo);
        memo.setVisible(true);
    }//GEN-LAST:event_MemoCadActionPerformed

    private void MemoConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoConsActionPerformed
         TelaConsMemorando memo = null;
        try {
            memo = new TelaConsMemorando();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(memo);
        centralizaForm(memo);
        memo.setVisible(true);
    }//GEN-LAST:event_MemoConsActionPerformed

    private void RimsConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RimsConsActionPerformed
        TelaConsRims rims = null;
        try {
            rims = new TelaConsRims();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(rims);
        centralizaForm(rims);
        rims.setVisible(true);
    }//GEN-LAST:event_RimsConsActionPerformed

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ComputadorCad;
    private javax.swing.JMenuItem ComputadorCons;
    private javax.swing.JMenuItem ImpressoraCad;
    private javax.swing.JMenuItem ImpressoraCons;
    private javax.swing.JMenuItem MemoCad;
    private javax.swing.JMenuItem MemoCons;
    private javax.swing.JMenu MenuComputador;
    private javax.swing.JMenu MenuImpressora;
    private javax.swing.JMenu MenuMemo;
    private javax.swing.JMenu MenuOficio;
    private javax.swing.JMenu MenuRims;
    private javax.swing.JMenu MenuRoteador;
    private javax.swing.JMenu MenuSenha;
    private javax.swing.JMenu MenuServidor;
    private javax.swing.JMenu MenuSobre;
    private javax.swing.JMenu MenuTabIp;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenuItem OficCad;
    private javax.swing.JMenuItem OficCons;
    private javax.swing.JMenuItem RimsCad;
    private javax.swing.JMenuItem RimsCons;
    private javax.swing.JMenuItem RoteadorCad;
    private javax.swing.JMenuItem RoteadorCons;
    private javax.swing.JMenuItem SenhaAlt;
    private javax.swing.JMenuItem ServidorCad;
    private javax.swing.JMenuItem ServidorCons;
    private javax.swing.JMenuItem UsuarioCad;
    private javax.swing.JMenuItem UsuarioCons;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
