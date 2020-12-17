
package br.gov.mg.carandai.prefeitura.back.model.DAO;

import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Memorando;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MemoDAO {
    public void adicionar(Memorando memo) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action= "Memorando Cadastrado com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO memorando(num,ano,data,assunto,de,para)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, memo.getNumMemo());
            stmt.setString(2, memo.getAnoMemo());
            stmt.setString(3, memo.getData());
            stmt.setString(4, memo.getAssunto());
            stmt.setString(5, memo.getDe());
            stmt.setString(6, memo.getPara());
           
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!","Operação bem sucedida",JOptionPane.INFORMATION_MESSAGE);
            UsuLog.DataHora();
            Logdao.gravarLog(Action);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao gravar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt);
        }
    }
    
    public List<Memorando> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Memorando> memos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM memorando");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Memorando memo = new Memorando();

                memo.setNumMemo(rs.getString("num"));
                memo.setAnoMemo(rs.getString("ano"));
                memo.setData(rs.getString("data"));
                memo.setDe(rs.getString("de"));
                memo.setPara(rs.getString("para"));
                memo.setAssunto(rs.getString("assunto"));
                memo.setId(rs.getInt("id"));
                
               
                memos.add(memo);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return memos;

    }
    
     public void excluir(Memorando memo) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "Memorando Excluído com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM memorando WHERE id = ?");
            stmt.setInt(1, memo.getId());

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
}
