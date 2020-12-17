
package br.gov.mg.carandai.prefeitura.back.model.DAO;


import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Roteador;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class RoteadorDAO {

   
    
    public void adicionar(Roteador router) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action = "Roteador Cadastrado com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO roteador(marca,modelo,andar,mac,ip,redewifi,senhawifi,login,senha,departamento,prefeitura)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, router.getMarca());
            stmt.setString(2, router.getModelo());
            stmt.setString(3, router.getAndar());
            stmt.setString(4, router.getMac());
            stmt.setString(5, router.getIp());
            stmt.setString(6, router.getRedewifi());
            stmt.setString(7, router.getSenhawifi());
            stmt.setString(8, router.getLogin());
            stmt.setString(9, router.getSenha());
            stmt.setString(10, router.getDepartamento());
            stmt.setBoolean(11, router.isPrefeitura());
            

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
    
   
    public void excluir(Roteador router) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Roteador Excluído com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM roteador WHERE mac = ?");
            stmt.setString(1, router.getMac());

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
    
    public List<Roteador> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Roteador> roteadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM roteador");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Roteador roteador = new Roteador();

                roteador.setMarca(rs.getString("marca"));
                roteador.setModelo(rs.getString("modelo"));
                roteador.setMac(rs.getString("mac"));
                roteador.setAndar(rs.getString("andar"));
                roteador.setIp(rs.getString("ip"));
                roteador.setRedewifi(rs.getString("redewifi"));
                roteador.setSenhawifi(rs.getString("senhawifi"));
                roteador.setLogin(rs.getString("login"));
                roteador.setSenha(rs.getString("senha"));
                roteador.setDepartamento(rs.getString("departamento"));
                roteador.setPrefeitura(rs.getBoolean("prefeitura"));
                
                roteadores.add(roteador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao listar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return roteadores;

    }
    public List<Roteador> listarPorRede(String rede) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Roteador> roteadores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM roteador WHERE redewifi LIKE ?");
            stmt.setString(1, "%"+rede+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Roteador roteador = new Roteador();

                roteador.setMarca(rs.getString("marca"));
                roteador.setModelo(rs.getString("modelo"));
                roteador.setMac(rs.getString("mac"));
                roteador.setAndar(rs.getString("andar"));
                roteador.setIp(rs.getString("ip"));
                roteador.setRedewifi(rs.getString("redewifi"));
                roteador.setSenhawifi(rs.getString("senhawifi"));
                roteador.setLogin(rs.getString("login"));
                roteador.setSenha(rs.getString("senha"));
                roteador.setDepartamento(rs.getString("departamento"));
                roteador.setPrefeitura(rs.getBoolean("prefeitura"));
                
                roteadores.add(roteador);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao listar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return roteadores;

    }
    
    public void atualizarRoteador(Roteador roteador) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Roteador Alterado com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE roteador SET marca= ?, modelo= ?, andar =?, ip= ?, redewifi= ?,senhawifi= ?, login= ?, senha=?, departamento=?, prefeitura=? WHERE mac = ?");
            stmt.setString(1, roteador.getMarca());
            stmt.setString(2, roteador.getModelo());
            stmt.setString(3, roteador.getAndar());
            stmt.setString(4, roteador.getIp());
            stmt.setString(5, roteador.getRedewifi());
            stmt.setString(6, roteador.getSenhawifi());
            stmt.setString(7, roteador.getLogin());
            stmt.setString(8, roteador.getSenha());
            stmt.setString(9, roteador.getDepartamento());
            stmt.setBoolean(10, roteador.isPrefeitura());
            
            stmt.setString(11, roteador.getMac());
            
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
    
    public static Roteador listarPorMAC(String mac) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Roteador roteador = new Roteador();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM roteador WHERE mac = ?");
            stmt.setString(1, mac);
            
            rs = stmt.executeQuery();

            if (rs.next()) {

                
                roteador.setMarca(rs.getString("marca"));
                roteador.setModelo(rs.getString("modelo"));
                roteador.setMac(rs.getString("mac"));
                roteador.setAndar(rs.getString("andar"));
                roteador.setIp(rs.getString("ip"));
                roteador.setRedewifi(rs.getString("redewifi"));
                roteador.setSenhawifi(rs.getString("senhawifi"));
                roteador.setLogin(rs.getString("login"));
                roteador.setSenha(rs.getString("senha"));
                roteador.setDepartamento(rs.getString("departamento"));
                roteador.setPrefeitura(rs.getBoolean("prefeitura"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao listar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return roteador;

    }
    
    public static List<Roteador> listarPorDepartamento (String departamento, boolean prefeitura) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Roteador> routers = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM impressora WHERE departamento LIKE ? AND prefeitura = ?");
            stmt.setString(1, "%"+departamento+"%");
            stmt.setBoolean(2, prefeitura);
            
            rs = stmt.executeQuery();

             while (rs.next()) {

                Roteador roteador = new Roteador();

                roteador.setMarca(rs.getString("marca"));
                roteador.setModelo(rs.getString("modelo"));
                roteador.setMac(rs.getString("mac"));
                roteador.setAndar(rs.getString("andar"));
                roteador.setIp(rs.getString("ip"));
                roteador.setRedewifi(rs.getString("redewifi"));
                roteador.setSenhawifi(rs.getString("senhawifi"));
                roteador.setLogin(rs.getString("login"));
                roteador.setSenha(rs.getString("senha"));
                roteador.setDepartamento(rs.getString("departamento"));
                roteador.setPrefeitura(rs.getBoolean("prefeitura"));
                
                routers.add(roteador);
            
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return routers;

    }
    
    
}
