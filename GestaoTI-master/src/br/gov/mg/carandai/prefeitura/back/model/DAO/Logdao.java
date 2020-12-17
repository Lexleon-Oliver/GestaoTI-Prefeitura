
package br.gov.mg.carandai.prefeitura.back.model.DAO;

import br.gov.mg.carandai.prefeitura.back.model.beans.UsuLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Logdao {
     public static void gravarLog(String Action){
        
        String sessao = Action+" ID do Usuário: "+UsuLog.getId_user()+", Nome do Usuário: "+UsuLog.getNome()+" "+UsuLog.getSobrenome()+
                ", Login do Usuário: "+ UsuLog.getLogin()+
                ", Dia: "+ UsuLog.getDia()+ " Hora: "+UsuLog.getHora()+ " \n";
         File sessaoTXT = new File("//informatica02/E/LogPrefeitura.txt");

            // Se o arquivo nao existir, ele gera
            if (!sessaoTXT.exists()) {
            try {
                sessaoTXT.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Erro ao criar sessao",JOptionPane.ERROR_MESSAGE);
            }
            }

            // Prepara para escrever no arquivo
            
        try {
           FileWriter fw = new FileWriter(sessaoTXT.getAbsoluteFile(),true);
           BufferedWriter bw = new BufferedWriter(fw);
            // Escreve e fecha arquivo
            bw.append(sessao);
            bw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro No Registro do Log!",JOptionPane.ERROR_MESSAGE);
        }
     }

   
}
