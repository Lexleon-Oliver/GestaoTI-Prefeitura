
package br.gov.mg.carandai.prefeitura.back.model.beans;


public class Roteador {
    String marca = null;
    String modelo = null;
    String andar = null;
    String mac = null;
    String ip = null;
    String redewifi = null;
    String senhawifi = null;
    String login = null;
    String senha = null;
    boolean prefeitura = false;
    String departamento =null;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRedewifi() {
        return redewifi;
    }

    public void setRedewifi(String redewifi) {
        this.redewifi = redewifi;
    }

    public String getSenhawifi() {
        return senhawifi;
    }

    public void setSenhawifi(String senhawifi) {
        this.senhawifi = senhawifi;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isPrefeitura() {
        return prefeitura;
    }

    public void setPrefeitura(boolean prefeitura) {
        this.prefeitura = prefeitura;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
