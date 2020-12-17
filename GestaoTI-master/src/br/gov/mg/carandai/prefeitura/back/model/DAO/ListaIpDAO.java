
package br.gov.mg.carandai.prefeitura.back.model.DAO;


import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.ListaIp;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ListaIpDAO {

   
    
    public void adicionar(ListaIp listip) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO listaip (nomedisp,ip,mac,destinado)VALUES(?,?,?,?)");
            stmt.setString(1, listip.getNomedispositivo());
            stmt.setString(2, listip.getIp());
            stmt.setString(3, listip.getMac());
            stmt.setString(4, listip.getDestino());
    
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!","Operação bem sucedida",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao adicionar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt);
        }
    }
    
   
    
    
    public List<ListaIp> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<ListaIp> ips = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM listaip");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ListaIp ip = new ListaIp();

                ip.setNomedispositivo(rs.getString("nomedisp"));
                ip.setDestino(rs.getString("destinado"));                
                ip.setMac(rs.getString("mac"));
                ip.setIp(rs.getString("ip"));
               
               
                ips.add(ip);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return ips;

    }
    
    
   
    
    public static ListaIp listarPorIp (String IP) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        ListaIp ip = new ListaIp();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

       

        try {
            stmt = con.prepareStatement("SELECT * FROM listaip WHERE ip = ?");
            stmt.setString(1, IP);
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {

                

                ip.setNomedispositivo(rs.getString("nomedisp"));
                ip.setDestino(rs.getString("destinado"));                
                ip.setMac(rs.getString("mac"));
                ip.setIp(rs.getString("ip"));
                
               
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return ip;

    }
    
    public void atualizar(ListaIp ip) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "Lista IP Alterada com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE listaip SET nomedisp= ?, destinado=? , mac= ? WHERE ip = ?");
            stmt.setString(1, ip.getNomedispositivo());
            stmt.setString(2, ip.getDestino());
            stmt.setString(3, ip.getMac());
            stmt.setString(4, ip.getIp());
            
            
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
