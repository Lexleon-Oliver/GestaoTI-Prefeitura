
package br.gov.mg.carandai.prefeitura.back.model.DAO;


import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Servidor;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ServidorDAO {

    
    
    public void adicionar(Servidor servidor) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action = "Servidor Cadastrado com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO servidor(nome,so,ip,mac,mac2,login,senha,bios)VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, servidor.getNome());
            stmt.setString(2, servidor.getSo());
            stmt.setString(3, servidor.getIp());
            stmt.setString(4, servidor.getMac());
            stmt.setString(5, servidor.getMac2());
            stmt.setString(6, servidor.getLogin());
            stmt.setString(7, servidor.getSenha());
            stmt.setString(8, servidor.getSenhabios());
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Adicionado com sucesso!","Operação Bem Sucedida",JOptionPane.INFORMATION_MESSAGE);
            UsuLog.DataHora();
            Logdao.gravarLog(Action);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao salvar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt);
        }
    }
    
   
    public void excluir(Servidor servidor) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Servidor Excluído com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM servidor WHERE mac = ?");
            stmt.setString(1, servidor.getMac());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Excluído com sucesso!","Operação Bem Sucedida",JOptionPane.INFORMATION_MESSAGE);
            UsuLog.DataHora();
            Logdao.gravarLog(Action);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao excluir",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt);
        }
    }
    
    public List<Servidor> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Servidor> servidores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM servidor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Servidor servidor = new Servidor();

                servidor.setNome(rs.getString("nome"));
                servidor.setSo(rs.getString("so"));
                servidor.setIp(rs.getString("ip"));
                servidor.setMac(rs.getString("mac"));
                servidor.setMac2(rs.getString("mac2"));
                servidor.setLogin(rs.getString("login"));
                servidor.setSenha(rs.getString("senha"));
                servidor.setSenhabios(rs.getString("bios"));
                
                servidores.add(servidor);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao salvar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return servidores;

    }
    
     public List<Servidor> listarPorNome(String nome) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Servidor> servidores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM servidor WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Servidor serv = new Servidor();

                serv.setNome(rs.getString("nome"));
                serv.setMac(rs.getString("mac"));
                serv.setMac2(rs.getString("mac2"));
                serv.setSo(rs.getString("so"));
                serv.setIp(rs.getString("ip"));
                serv.setLogin(rs.getString("login"));
                serv.setSenha(rs.getString("senha"));
                serv.setSenhabios(rs.getString("bios"));
                               
                servidores.add(serv);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return servidores;

    }
     
     public static Servidor editarPorNumeroDeMac (String mac) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Servidor serv = new Servidor();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

       

        try {
            stmt = con.prepareStatement("SELECT * FROM servidor WHERE mac = ?");
            stmt.setString(1, mac);
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {                

                serv.setNome(rs.getString("nome"));
                serv.setMac(rs.getString("mac"));
                serv.setMac2(rs.getString("mac2"));
                serv.setSo(rs.getString("so"));
                serv.setIp(rs.getString("ip"));
                serv.setLogin(rs.getString("login"));
                serv.setSenha(rs.getString("senha"));
                serv.setSenhabios(rs.getString("bios"));
               
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return serv;

    }
     public void atualizar(Servidor serv) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Servidor Alterado com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE servidor SET nome= ?, mac2= ?, so= ?, ip=? ,login=? ,senha= ?, bios= ? WHERE mac = ?");
            stmt.setString(1, serv.getNome());
            stmt.setString(2, serv.getMac2());
            stmt.setString(3, serv.getSo());
            stmt.setString(4, serv.getIp());
            stmt.setString(5, serv.getLogin());
            stmt.setString(6, serv.getSenha());
            stmt.setString(7, serv.getSenhabios());
            stmt.setString(8, serv.getMac());
            
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
