
package br.gov.mg.carandai.prefeitura.back.model.DAO;


import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Computador;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ComputadorDAO {

   
    
    public void adicionar(Computador comp) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action= "Computador Cadastrado com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO computador(nome,so,serial,usuario,numbaia,grupotrab,ip,mac,formatacao,branco,preto,prata,cinza,marcaplacamae," +
                 "modeloplacamae,marcaprocessador,modeloprocessador,freqprocessador,capacidadememoria,modelomemoria,freqmemoria,capacidadehd,modelohd,"+
                    "drive,modelodrive,marcaplacavideo,modeloplacavideo,capacidadeplacavideo,prefeitura,andar,departamento)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, comp.getNome());
            stmt.setString(2, comp.getSo());
            stmt.setString(3, comp.getSerial());
            stmt.setString(4, comp.getUsuario());
            stmt.setString(5, String.valueOf(comp.getNumbaia()));
            stmt.setString(6, comp.getGrupotrab());
            stmt.setString(7, comp.getIp());
            stmt.setString(8, comp.getMac());
            stmt.setString(9, comp.getFormatacao());
            stmt.setBoolean(10, comp.isCorbranco());
            stmt.setBoolean(11, comp.isCorpreto());
            stmt.setBoolean(12, comp.isCorprata());
            stmt.setBoolean(13, comp.isCorcinza());
            stmt.setString(14, comp.getMarcaplacamae());
            stmt.setString(15, comp.getModeloplacamae());
            stmt.setString(16, comp.getMarcaprocessador());
            stmt.setString(17, comp.getModeloprocessador());
            stmt.setString(18, comp.getFreqprocessador());
            stmt.setString(19, comp.getCapacidadememoria());
            stmt.setString(20, comp.getModelomemoria());
            stmt.setString(21, comp.getFreqmemoria());
            stmt.setString(22, comp.getCapacidadehd());
            stmt.setString(23, comp.getModelohd());
            stmt.setBoolean(24, comp.isDrive());
            stmt.setString(25, comp.getModelodrive());
            stmt.setString(26, comp.getMarcaplacavideo());
            stmt.setString(27, comp.getModeloplacavideo());
            stmt.setString(28, comp.getCapacidadeplacavideo());
            stmt.setBoolean(29, comp.isPrefeitura());
            stmt.setString(30, String.valueOf(comp.getAndar()));
            stmt.setString(31, comp.getDepartamento());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!","Operação bem sucedida",JOptionPane.INFORMATION_MESSAGE);
            UsuLog.DataHora();
            Logdao.gravarLog(Action);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao desconectar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt);
        }
    }
    
   
    public void excluir(Computador comp) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "Computador Excluído com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM computador WHERE mac = ?");
            stmt.setString(1, comp.getMac());

            stmt.executeUpdate();
            

            JOptionPane.showMessageDialog(null,"Excluído com sucesso!","Operação Bem Sucedida",JOptionPane.INFORMATION_MESSAGE);
            UsuLog.DataHora();
            Logdao.gravarLog(Action);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao desconectar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt);
        }
    }
    
    public List<Computador> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadores.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadores;

    }
    
    
    
    
    public List<Computador> listarPorAndar(String andar, boolean prefeitura) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE andar = ? AND prefeitura = ?");
            stmt.setString(1, andar);
            stmt.setBoolean(2, prefeitura);
            
            rs = stmt.executeQuery();

            while (rs.next()) {
               
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadores.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadores;

    }
    
    public List<Computador> listarPorDepartamento (String departamento, boolean prefeitura) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadors = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE departamento LIKE ? AND prefeitura = ?");
            stmt.setString(1, "%"+departamento+"%");
            stmt.setBoolean(2, prefeitura);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

               
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadors.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadors;

    }
    
    public static Computador listarPorMac (String mac) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Computador computador = new Computador();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

       

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE mac LIKE ?");
            stmt.setString(1, "%"+mac+"%");
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {            

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computador;

    }
    
    public void atualizar(Computador comp) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "Computador Alterado com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE computador SET nome =?, so=?, serial=?, usuario=?, numbaia=?, grupotrab=?, ip=?, formatacao=? ,branco=?," +
                    "preto=?, prata=?, cinza=?, marcaplacamae=?, modeloplacamae=?, marcaprocessador=?, modeloprocessador=?, freqprocessador=?, capacidadememoria=?, modelomemoria=?,"+
                    " freqmemoria=?, capacidadehd=?, modelohd=?, drive=?, modelodrive=?, marcaplacavideo=?, modeloplacavideo=?, capacidadeplacavideo=?,"+
                    "prefeitura=?, andar=?, departamento=? WHERE mac = ?");
            stmt.setString(1, comp.getNome());
            stmt.setString(2, comp.getSo());
            stmt.setString(3, comp.getSerial());
            stmt.setString(4, comp.getUsuario());
            stmt.setString(5, String.valueOf(comp.getNumbaia()));
            stmt.setString(6, comp.getGrupotrab());
            stmt.setString(7, comp.getIp());
            
            stmt.setString(8, comp.getFormatacao());
            stmt.setBoolean(9, comp.isCorbranco());
            stmt.setBoolean(10, comp.isCorpreto());
            stmt.setBoolean(11, comp.isCorprata());
            stmt.setBoolean(12, comp.isCorcinza());
            stmt.setString(13, comp.getMarcaplacamae());
            stmt.setString(14, comp.getModeloplacamae());
            stmt.setString(15, comp.getMarcaprocessador());
            stmt.setString(16, comp.getModeloprocessador());
            stmt.setString(17, comp.getFreqprocessador());
            stmt.setString(18, comp.getCapacidadememoria());
            stmt.setString(19, comp.getModelomemoria());
            stmt.setString(20, comp.getFreqmemoria());
            stmt.setString(21, comp.getCapacidadehd());
            stmt.setString(22, comp.getModelohd());
            stmt.setBoolean(23, comp.isDrive());
            stmt.setString(24, comp.getModelodrive());
            stmt.setString(25, comp.getMarcaplacavideo());
            stmt.setString(26, comp.getModeloplacavideo());
            stmt.setString(27, comp.getCapacidadeplacavideo());
            stmt.setBoolean(28, comp.isPrefeitura());
            stmt.setString(29, String.valueOf(comp.getAndar()));
            stmt.setString(30, comp.getDepartamento());
            stmt.setString(31, comp.getMac());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            UsuLog.DataHora();
            Logdao.gravarLog(Action);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Conexao.desconectar(con, stmt);
        }

    }
    
    public static Computador listarPorIp (String ip) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Computador computador = new Computador();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

       

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE mac LIKE ?");
            stmt.setString(1, "%"+ip+"%");
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {
                

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computador;

    }
    
   public List<Computador> listarPorModeloproc (String modelproc) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadors = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE modeloprocessador LIKE ?");
            stmt.setString(1, "%"+modelproc+"%");
            
            
            rs = stmt.executeQuery();

            while (rs.next()) {

               
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadors.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadors;

    }
   
   public List<Computador> listarPorModeloMem (String modelmem) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadors = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE modelomemoria LIKE ?");
            stmt.setString(1, "%"+modelmem+"%");
            
            
            rs = stmt.executeQuery();

            while (rs.next()) {

               
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadors.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadors;

    }
   
   public List<Computador> listarPorCapMemoria (String capmem) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadors = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE capacidadememoria = ?");
            stmt.setString(1, capmem);
            
            
            rs = stmt.executeQuery();

            while (rs.next()) {

              
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadors.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadors;

    }
   
   public List<Computador> listarPorCapHD (String caphd) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadors = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE capacidadehd = ?");
            stmt.setString(1, caphd);
            
            
            rs = stmt.executeQuery();

            while (rs.next()) {

               
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadors.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadors;

    }
   
    public List<Computador> listarPorIP (String ip) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Computador> computadors = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM computador WHERE ip = ?");
            stmt.setString(1, ip);
            
            
            rs = stmt.executeQuery();

            while (rs.next()) {

               
                Computador computador = new Computador();

                computador.setNome(rs.getString("nome"));
                computador.setSo(rs.getString("so"));
                computador.setSerial(rs.getString("serial"));
                computador.setUsuario(rs.getString("usuario"));
                computador.setNumbaia(rs.getString("numbaia"));
                computador.setGrupotrab(rs.getString("grupotrab"));
                computador.setIp(rs.getString("ip"));
                computador.setMac(rs.getString("mac"));
                computador.setFormatacao(rs.getString("formatacao"));
                computador.setCorbranco(rs.getBoolean("branco"));
                computador.setCorpreto(rs.getBoolean("preto"));
                computador.setCorprata(rs.getBoolean("prata"));
                computador.setCorcinza(rs.getBoolean("cinza"));
                computador.setMarcaplacamae(rs.getString("marcaplacamae"));            
                computador.setModeloplacamae(rs.getString("modeloplacamae"));
                computador.setMarcaprocessador(rs.getString("marcaprocessador"));
                computador.setModeloprocessador(rs.getString("modeloprocessador"));
                computador.setFreqprocessador(rs.getString("freqprocessador"));
                computador.setCapacidadememoria(rs.getString("capacidadememoria"));
                computador.setModelomemoria(rs.getString("modelomemoria"));
                computador.setFreqmemoria(rs.getString("freqmemoria"));
                computador.setCapacidadehd(rs.getString("capacidadehd"));
                computador.setModelohd(rs.getString("modelohd"));
                computador.setDrive(rs.getBoolean("drive"));
                computador.setModelodrive(rs.getString("modelodrive"));
                computador.setMarcaplacavideo(rs.getString("marcaplacavideo"));
                computador.setModeloplacavideo(rs.getString("modeloplacavideo"));
                computador.setCapacidadeplacavideo(rs.getString("capacidadeplacavideo"));
                computador.setPrefeitura(rs.getBoolean("prefeitura"));
                computador.setAndar(rs.getString("andar"));
                computador.setDepartamento(rs.getString("departamento"));
               
                computadors.add(computador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return computadors;

    }   
}
