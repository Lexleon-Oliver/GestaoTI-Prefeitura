/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.mg.carandai.prefeitura.programa;

import br.gov.mg.carandai.prefeitura.back.model.DAO.ComputadorDAO;
import br.gov.mg.carandai.prefeitura.back.model.beans.Computador;
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
public class TelaConsComputador extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConsUsuario
     */
    public TelaConsComputador() throws ClassNotFoundException {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        TabelaComputador.setRowSorter(new TableRowSorter(modelo));

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
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();
    try{
        for (Computador comp : compdao.listar()) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
             
            });
        }
    }catch(Exception erro){
        JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao gerar tabela",JOptionPane.ERROR_MESSAGE);
    }

    }
    public void listarPorAndar(String rede, boolean prefeitura) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorAndar(rede, prefeitura)) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
            });

        }

    }
    
        
    public void listarPorDepartamento (String departamento, boolean prefeitura) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorDepartamento(departamento, prefeitura)) {

            modelo.addRow(new Object[]{
               comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
            });

        }

    }
    
     public void listarPorModeloProcessador (String modelproc) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorModeloproc(modelproc)) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
            });

        }

    }
     
      public void listarPorModeloMemoria (String modelmem) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorModeloMem(modelmem)) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
            });

        }

    }
      
       public void listarPorCapacidadeMemoria (String capmem) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorCapMemoria(capmem)) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
            });

        }

    }
       
    public void listarPorCapacidadeHD (String caphd) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorCapHD(caphd)) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
            });

        }

    }
    
    public void listarPorIP (String ip) throws ClassNotFoundException {
        
        DefaultTableModel modelo = (DefaultTableModel) TabelaComputador.getModel();
        modelo.setNumRows(0);
        ComputadorDAO compdao = new ComputadorDAO();

        for (Computador comp : compdao.listarPorCapHD(ip)) {

            modelo.addRow(new Object[]{
                comp.getNome(),
                comp.getSo(),
                comp.getFormatacao(),
                comp.getGrupotrab(),
                comp.getSerial(),
                comp.getIp(),               
                comp.isPrefeitura(),
                comp.getAndar(),
                comp.getUsuario(),
                comp.isCorbranco(),
                comp.isCorpreto(),
                comp.isCorprata(),
                comp.isCorcinza(),
                comp.getDepartamento(),
                comp.getNumbaia(),
                comp.getMarcaplacamae(),
                comp.getModeloplacamae(),
                comp.getMac(),
                comp.getMarcaprocessador(),
                comp.getModeloprocessador(),
                comp.getFreqprocessador(),
                comp.getCapacidadememoria(),
                comp.getModelomemoria(),
                comp.getFreqmemoria(),
                comp.getCapacidadehd(),
                comp.getModelohd(),
                comp.isDrive(),
                comp.getModelodrive()
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
        TabelaComputador = new javax.swing.JTable();
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
        setResizable(true);
        setTitle("Setor de Informática");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Computadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        CampoPesquisa.setEditable(false);
        CampoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/zoom.png"))); // NOI18N
        jLabel1.setText("Pesquisar");

        TabelaComputador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sistema Operacional", "Data de Formatação", "Grupo de Trabalho", "Serial", "IP", "Prefeitura", "Andar", "Usuário", "Branco", "Preto", "Prata", "Cinza", "Departamento", "Número de Baias", "Marca Placa-Mãe", "Modelo Placa-Mãe", "MAC", "Marca Processador", "Modelo Processador", "Frequência Processador", "Capacidade Memória", "Modelo Memória", "Frequência Memória", "Capacidade HD", "Modelo HD", "Drive", "Modelo Drive"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaComputador.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaComputador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaComputadorMouseClicked(evt);
            }
        });
        TabelaComputador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaComputadorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaComputador);
        if (TabelaComputador.getColumnModel().getColumnCount() > 0) {
            TabelaComputador.getColumnModel().getColumn(0).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(1).setPreferredWidth(150);
            TabelaComputador.getColumnModel().getColumn(2).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(3).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(4).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(5).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(13).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(14).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(15).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(16).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(17).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(18).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(19).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(20).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(21).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(22).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(23).setPreferredWidth(120);
            TabelaComputador.getColumnModel().getColumn(24).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(25).setPreferredWidth(100);
            TabelaComputador.getColumnModel().getColumn(27).setPreferredWidth(100);
        }

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
        BotaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/computer_delete.png"))); // NOI18N
        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por:");

        CampoTipoBusca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Andar", "Departamento", "IP", "Modelo Processador", "Modelo Memória", "Capacidade Memória", "Capacidade HD" }));
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
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gov/mg/carandai/prefeitura/images/computer_edit.png"))); // NOI18N
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
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoPrefSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoPrefNão)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BotaoLimpar, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(CampoTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CampoPrefSim)
                    .addComponent(CampoPrefNão))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoLimpar)
                    .addComponent(jButton1)
                    .addComponent(BotaoEditar))
                .addGap(15, 15, 15))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
      
            if (TabelaComputador.getSelectedRow() != -1) {
                Computador comp = new Computador();
                ComputadorDAO compdao = new ComputadorDAO();

                comp.setMac((String) TabelaComputador.getValueAt(TabelaComputador.getSelectedRow(), 17));
                if(JOptionPane.showConfirmDialog(null, "Ao excluir esse registro, ele será deletado permanentemente da base de dados. Deseja prosseguir?","Confirmar Exclusão!",JOptionPane.YES_NO_OPTION)== 0){
                    try {
                        compdao.excluir(comp);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try {
                        limparCampos();

                        atualizaTabela();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    CampoTipoBusca.requestFocus();
                }
           } else {
                JOptionPane.showMessageDialog(null, "Selecione um computador para excluir.");
            }
       
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void TabelaComputadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaComputadorMouseClicked
        
    }//GEN-LAST:event_TabelaComputadorMouseClicked

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
       limparCampos();
        try {
            atualizaTabela();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void TabelaComputadorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaComputadorKeyReleased
        
    }//GEN-LAST:event_TabelaComputadorKeyReleased

    private void CampoPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPesquisaKeyReleased
      switch (CampoTipoBusca.getSelectedIndex()) {
   case 0:
          {
              try {
                  listarPorAndar(CampoPesquisa.getText(), CampoPrefSim.isSelected());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
           break;


   case 1:
          {
              try {
                  listarPorDepartamento(CampoPesquisa.getText(), CampoPrefSim.isSelected());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
           break;


   case 2:
          {
              try {
                  listarPorIP(CampoPesquisa.getText());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
           break;
   case 3: 
          {
              try {
                  listarPorModeloProcessador(CampoPesquisa.getText());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
           break;
   case 4:
          {
              try {
                  listarPorModeloMemoria(CampoPesquisa.getText());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
           break;
   case 5:
          {
              try {
                  listarPorCapacidadeMemoria(CampoPesquisa.getText());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
           break;
   default:
           {
              try {
                  listarPorCapacidadeHD(CampoPesquisa.getText());
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(TelaConsComputador.class.getName()).log(Level.SEVERE, null, ex);
              }
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
        if (TabelaComputador.getSelectedRow() != -1) {
            String mac= null;

            mac = ((String)TabelaComputador.getValueAt(TabelaComputador.getSelectedRow(), 17));
            if(JOptionPane.showConfirmDialog(null, "Ao alterar esse registro, ele será modificado permanentemente na base de dados.Deseja prosseguir?","Confirmar Alteração!",JOptionPane.YES_NO_OPTION)== 0){
                TelaEditComputador EditComputador = null;
                try {
                    EditComputador = new TelaEditComputador(mac);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                TelaPrincipal.jDesktopPane1.add(EditComputador);
                centralizaForm(EditComputador);
                EditComputador.setVisible(true);
                this.dispose();
            }else{
                CampoTipoBusca.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um computador para editar.");
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
    private javax.swing.JTable TabelaComputador;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
