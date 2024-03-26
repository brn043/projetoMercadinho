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
    private String nome;
    private String cpf;
    private static String login;
    private String senha;

    public Usuarios() {
    }

    public Usuarios(int idUsuario, String nome, String cpf, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
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
