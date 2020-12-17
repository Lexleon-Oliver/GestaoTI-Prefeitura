
package br.gov.mg.carandai.prefeitura.back.model.DAO;


import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import br.gov.mg.carandai.prefeitura.back.model.beans.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsuarioDAO {

    public boolean checkLogin(String login, char[] senha) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String Action = "Login Realizado com Sucesso!";

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, String.valueOf(senha));

            rs = stmt.executeQuery();

            if (rs.next()) { 
                UsuLog.setId_user(rs.getInt("id"));
                UsuLog.setNome(rs.getString("nome"));
                UsuLog.setSobrenome(rs.getString("sobrenome"));
                UsuLog.setLogin(rs.getString("login"));
                UsuLog.DataHora();
                Logdao.gravarLog(Action);
                check = true;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao logar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }
        return check;
    }
    
    public void adicionar(Usuario u) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action = "Usuário Cadastrado Com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO usuario(nome,sobrenome,login, senha)VALUES(?,?,?,?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSobrenome());
            stmt.setString(3, u.getLogin());
            stmt.setString(4, String.valueOf(u.getSenha()));
            

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
    
   
    public void excluir(Usuario u) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Usuário Excluído com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE id = ?");
            stmt.setInt(1, u.getId());

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
    
    public List<Usuario> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha").toCharArray());
                
                usuarios.add(usuario);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao salvar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return usuarios;

    }
    public List<Usuario> listarPorNome(String nome) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Usuario usuario = new Usuario();

                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha").toCharArray());
                
                usuarios.add(usuario);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao salvar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return usuarios;

    }
    
    public void atualizarUsuario(Usuario usuario) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Usuário Alterado com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET nome = ? ,sobrenome = ?, login = ? WHERE id = ?");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getLogin());
            
            stmt.setInt(4, usuario.getId());
            
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
    
    public static Usuario listarPorID(int id) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Usuario usuario = new Usuario();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE id = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();

            if (rs.next()) {

                
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSobrenome(rs.getString("sobrenome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha").toCharArray());
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao salvar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return usuario;

    }
    
     public void atualizarSenha(Usuario usuario) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action = "Senha Alterada com Sucesso";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET senha = ? WHERE id = ?");
            stmt.setString(1, String.valueOf(usuario.getSenha()));
            stmt.setInt(2, usuario.getId());
            
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
