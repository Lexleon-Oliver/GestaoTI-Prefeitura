
package br.gov.mg.carandai.prefeitura.back.model.DAO;

import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Oficio;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class OficioDAO {
    public void adicionar(Oficio ofic) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action= "Ofício Cadastrado com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO oficio(num,ano,data,assunto,de,para)VALUES(?,?,?,?,?,?)");
            stmt.setString(1, ofic.getNumOfic());
            stmt.setString(2, ofic.getAnoOfic());
            stmt.setString(3, ofic.getData());
            stmt.setString(4, ofic.getAssunto());
            stmt.setString(5, ofic.getDe());
            stmt.setString(6, ofic.getPara());
           
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
    
     public List<Oficio> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Oficio> oficios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM oficio");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Oficio of = new Oficio();

                of.setNumOfic(rs.getString("num"));
                of.setAnoOfic(rs.getString("ano"));
                of.setData(rs.getString("data"));
                of.setDe(rs.getString("de"));
                of.setPara(rs.getString("para"));
                of.setAssunto(rs.getString("assunto"));
                of.setId(rs.getInt("id"));
               
                oficios.add(of);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return oficios;

    }
     
      public void excluir(Oficio of) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "Ofício Excluído com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM oficio WHERE id = ?");
            stmt.setInt(1, of.getId());

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
