
package br.gov.mg.carandai.prefeitura.back.model.beans;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class UsuLog {
    private static int id_user ;
    private static String nome ;
    private static String sobrenome;

    public static String getSobrenome() {
        return sobrenome;
    }

    public static void setSobrenome(String sobrenome) {
        UsuLog.sobrenome = sobrenome;
    }
    private static String login ;
    private static String dia;
    private static LocalTime hora;

    public static int getId_user() {
        return id_user;
    }

    public static void setId_user(int id_user) {
        UsuLog.id_user = id_user;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        UsuLog.nome = nome;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UsuLog.login = login;
    }

    public static String getDia() {
        return dia;
    }

    public static void setDia(String dia) {
        UsuLog.dia = dia;
    }

    public static LocalTime getHora() {
        return hora;
    }

    public static void setHora(LocalTime hora) {
        UsuLog.hora = hora;
    }
    
    public static void DataHora() {
        DateTimeFormatter formatador =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
        setDia(LocalDate.now().format(formatador));
        setHora(LocalTime.now());
    }
}
