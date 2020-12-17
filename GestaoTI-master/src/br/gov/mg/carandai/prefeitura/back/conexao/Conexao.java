
package br.gov.mg.carandai.prefeitura.back.conexao;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    public static Connection conexao () throws ClassNotFoundException{
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://informatica02:5432/BANCO","USUARIO", "SENHA");
            
            return con;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao conectar",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static void desconectar(Connection con){
   
        try {
            if (!con.isClosed()){
                con.close();
                
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao desconectar",JOptionPane.ERROR_MESSAGE);
        }
     }
        
        public static void desconectar (Connection con, PreparedStatement pstmt){
        desconectar(con);
        try {
            if (pstmt != null){ 
                pstmt.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao desconectar",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void desconectar (Connection con, PreparedStatement pstmt, ResultSet rs){
        desconectar(con, pstmt);
        try {
            if (rs != null){ 
                rs.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(),"Erro ao desconectar",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}

    
 
    
   
