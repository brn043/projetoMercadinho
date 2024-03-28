/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Usuarios {
    private static int idUsuario;

    public static void setAccess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String nome;
    private String cpf;
    private static String login;
    private String senha;
    private static boolean access;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, String nome, String cpf, String senha, boolean access) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        Usuarios.access = access;
    }
    
    public static boolean getAccess(){
        return access;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public static String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setAccess(boolean access){
        Usuarios.access = access;
    }

    public void setIdUsuario(int idUsuario) {
        Usuarios.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   public static void setLogin(String login) {
        Usuarios.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
