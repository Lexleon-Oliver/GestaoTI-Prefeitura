
package br.gov.mg.carandai.prefeitura.back.model.DAO;


import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Impressora;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ImpressoraDAO {

   
    
    public void adicionar(Impressora imp) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action = "Impressora Cadastrada com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO impressora(nome,marca,modelo,departamento,login,senha,numserie,ip,mac,andar,prefeitura)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, imp.getNome());
            stmt.setString(2, imp.getMarca());
            stmt.setString(3, imp.getModelo());
            stmt.setString(4, imp.getDepartamento());
            stmt.setString(5, imp.getLogin());
            stmt.setString(6, String.valueOf(imp.getSenha()));
            stmt.setString(7, imp.getNumserie());
            stmt.setString(8, imp.getIp());
            stmt.setString(9, imp.getMac());
            stmt.setString(10, imp.getAndar());
            stmt.setBoolean(11, imp.isPrefeitura());
            
            
            

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
    
   
    public void excluir(Impressora imp) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Impressora Excluída com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM impressora WHERE numserie = ?");
            stmt.setString(1, imp.getNumserie());

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
    
    public List<Impressora> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Impressora> impressoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM impressora");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Impressora impressora = new Impressora();

                impressora.setNome(rs.getString("nome"));
                impressora.setMarca(rs.getString("marca"));
                impressora.setModelo(rs.getString("modelo"));
                impressora.setDepartamento(rs.getString("departamento"));                
                impressora.setMac(rs.getString("mac"));
                impressora.setLogin(rs.getString("login"));
                impressora.setSenha(String.valueOf(rs.getString("senha")));            
                impressora.setPrefeitura(rs.getBoolean("prefeitura"));
                impressora.setNumserie(rs.getString("numserie"));
                impressora.setIp(rs.getString("ip"));
                impressora.setAndar(rs.getString("andar"));
               
                impressoras.add(impressora);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return impressoras;

    }
    
    
    public List<Impressora> listarPorNome(String nome,boolean prefeitura) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Impressora> impressoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM impressora WHERE nome LIKE ? AND prefeitura = ?");
            stmt.setString(1, "%"+nome+"%");
            stmt.setBoolean(2, prefeitura);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Impressora impressora = new Impressora();

                impressora.setNome(rs.getString("nome"));
                impressora.setMarca(rs.getString("marca"));
                impressora.setModelo(rs.getString("modelo"));
                impressora.setDepartamento(rs.getString("departamento"));                
                impressora.setMac(rs.getString("mac"));
                impressora.setLogin(rs.getString("login"));
                impressora.setSenha(String.valueOf(rs.getString("senha")));            
                impressora.setPrefeitura(rs.getBoolean("prefeitura"));
                impressora.setNumserie(rs.getString("numserie"));
                impressora.setIp(rs.getString("ip"));
                impressora.setAndar(rs.getString("andar"));
               
                impressoras.add(impressora);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return impressoras;

    }
    
    public List<Impressora> listarPorAndar(String andar, boolean prefeitura) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Impressora> impressoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM impressora WHERE andar = ? AND prefeitura = ?");
            stmt.setString(1, andar);
            stmt.setBoolean(2, prefeitura);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Impressora impressora = new Impressora();

                impressora.setNome(rs.getString("nome"));
                impressora.setMarca(rs.getString("marca"));
                impressora.setModelo(rs.getString("modelo"));
                impressora.setDepartamento(rs.getString("departamento"));                
                impressora.setMac(rs.getString("mac"));
                impressora.setLogin(rs.getString("login"));
                impressora.setSenha(String.valueOf(rs.getString("senha")));            
                impressora.setPrefeitura(rs.getBoolean("prefeitura"));
                impressora.setNumserie(rs.getString("numserie"));
                impressora.setIp(rs.getString("ip"));
                impressora.setAndar(rs.getString("andar"));
               
                impressoras.add(impressora);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return impressoras;

    }
    
    public List<Impressora> listarPorDepartamento (String departamento, boolean prefeitura) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Impressora> impressoras = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM impressora WHERE departamento LIKE ? AND prefeitura = ?");
            stmt.setString(1, "%"+departamento+"%");
            stmt.setBoolean(2, prefeitura);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Impressora impressora = new Impressora();

                impressora.setNome(rs.getString("nome"));
                impressora.setMarca(rs.getString("marca"));
                impressora.setModelo(rs.getString("modelo"));
                impressora.setDepartamento(rs.getString("departamento"));                
                impressora.setMac(rs.getString("mac"));
                impressora.setLogin(rs.getString("login"));
                impressora.setSenha(String.valueOf(rs.getString("senha")));            
                impressora.setPrefeitura(rs.getBoolean("prefeitura"));
                impressora.setNumserie(rs.getString("numserie"));
                impressora.setIp(rs.getString("ip"));
                impressora.setAndar(rs.getString("andar"));
               
                impressoras.add(impressora);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return impressoras;

    }
    
    public static Impressora listarPorNumeroDeSerie (String NumSerie) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Impressora impressora = new Impressora();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

       

        try {
            stmt = con.prepareStatement("SELECT * FROM impressora WHERE numserie LIKE ?");
            stmt.setString(1, "%"+NumSerie+"%");
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {

                

                impressora.setNome(rs.getString("nome"));
                impressora.setMarca(rs.getString("marca"));
                impressora.setModelo(rs.getString("modelo"));
                impressora.setDepartamento(rs.getString("departamento"));                
                impressora.setMac(rs.getString("mac"));
                impressora.setLogin(rs.getString("login"));
                impressora.setSenha(String.valueOf(rs.getString("senha")));            
                impressora.setPrefeitura(rs.getBoolean("prefeitura"));
                impressora.setNumserie(rs.getString("numserie"));
                impressora.setIp(rs.getString("ip"));
                impressora.setAndar(rs.getString("andar"));
               
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return impressora;

    }
    
    public void atualizar(Impressora imp) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Impressora Alterada com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE impressora SET nome= ?, marca= ?, modelo= ?, departamento=? ,login=? ,senha= ?, ip= ?, numserie= ?, andar= ?, prefeitura = ? WHERE mac = ?");
            stmt.setString(1, imp.getNome());
            stmt.setString(2, imp.getMarca());
            stmt.setString(3, imp.getModelo());
            stmt.setString(4, imp.getDepartamento());
            stmt.setString(5, imp.getLogin());
            stmt.setString(6, String.valueOf(imp.getSenha()));
            stmt.setString(7, imp.getIp());
            stmt.setString(8, imp.getNumserie());
            stmt.setString(9, imp.getAndar());
            stmt.setBoolean(10, imp.isPrefeitura());
            
            
            stmt.setString(11,imp.getMac());
            
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
}
