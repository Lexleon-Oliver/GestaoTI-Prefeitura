
package br.gov.mg.carandai.prefeitura.back.model.DAO;

import br.gov.mg.carandai.prefeitura.back.conexao.Conexao;
import br.gov.mg.carandai.prefeitura.back.model.beans.Rims;
import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class RIMSDAO {
     public void adicionar(Rims rims) throws ClassNotFoundException {
        
        Connection con = Conexao.conexao();
        String Action= "RIMS Cadastrada com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO rims(num, ano, proc_num, proc_ano, ficha, fonte, solicitante, fornecedor, produtos, data_pedido, entrega)VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, rims.getNumRims());
            stmt.setString(2, rims.getAnoRims());
            stmt.setString(3, rims.getNumProc());
            stmt.setString(4, rims.getAnoProc());
            stmt.setString(5, rims.getFicha());
            stmt.setString(6, rims.getFonte());
            stmt.setString(7, rims.getSolicit());
            stmt.setString(8, rims.getFornec());
            stmt.setString(9, rims.getProd());
            stmt.setString(10, rims.getDataPed());
            stmt.setBoolean(11, rims.isEntregue());
           
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
     
     public List<Rims> listar() throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        

        List<Rims> rimss = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM rims");
            rs = stmt.executeQuery();

            while (rs.next()) {
                
                Rims rims = new Rims();

                rims.setNumRims(rs.getString("num"));
                rims.setAnoRims(rs.getString("ano"));
                rims.setAnoProc(rs.getString("proc_ano"));
                rims.setNumProc(rs.getString("proc_num"));
                rims.setFicha(rs.getString("ficha"));
                rims.setFonte(rs.getString("fonte"));
                rims.setFornec(rs.getString("fornecedor"));
                rims.setProd(rs.getString("produtos"));
                rims.setDataPed(rs.getString("data_pedido"));
                rims.setSolicit(rs.getString("solicitante"));
                rims.setEntregue(rs.getBoolean("entrega"));
                rims.setId(rs.getInt("id"));
                
               
                rimss.add(rims);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return rimss;

    }
     
      public void excluir(Rims rim) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "RIMS Excluída com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM rims WHERE id = ?");
            stmt.setInt(1, rim.getId());

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
      
      public Rims listarPorID(int id) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        Rims rim = new Rims();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("SELECT * FROM rims WHERE id = ?");
            stmt.setInt(1, id);
            
            
            rs = stmt.executeQuery();

            if (rs.next()) {

               

                rim.setNumRims(rs.getString("num"));
                rim.setAnoRims(rs.getString("ano"));
                rim.setAnoProc(rs.getString("proc_ano"));
                rim.setNumProc(rs.getString("proc_num"));
                rim.setFicha(rs.getString("ficha"));
                rim.setFonte(rs.getString("fonte"));
                rim.setFornec(rs.getString("fornecedor"));
                rim.setProd(rs.getString("produtos"));
                rim.setDataPed(rs.getString("data_pedido"));
                rim.setSolicit(rs.getString("solicitante"));
                rim.setEntregue(rs.getBoolean("entrega"));
                rim.setId(rs.getInt("id"));
               
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao consultar",JOptionPane.ERROR_MESSAGE);
        } finally {
            Conexao.desconectar(con, stmt, rs);
        }

        return rim;

    }
      
       public void atualizar(Rims rims) throws ClassNotFoundException {

        Connection con = Conexao.conexao();
        String Action= "Rims Alterada com Sucesso!";
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE rims SET num =?, ano=?, proc_num=?, proc_ano=?, ficha=?, fonte=?, solicitante=?, fornecedor=?, " +
                    "produtos=?, data_pedido=?, entrega=? WHERE id = ?");
            stmt.setString(1, rims.getNumRims());
            stmt.setString(2, rims.getAnoRims());
            stmt.setString(3, rims.getNumProc());
            stmt.setString(4, rims.getAnoProc());
            stmt.setString(5, rims.getFicha());
            stmt.setString(6, rims.getFonte());
            stmt.setString(7, rims.getSolicit());
            stmt.setString(8, rims.getFornec());
            stmt.setString(9, rims.getProd());
            stmt.setString(10, rims.getDataPed());
            stmt.setBoolean(11, rims.isEntregue());
           
            stmt.setInt(12, rims.getId());
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
