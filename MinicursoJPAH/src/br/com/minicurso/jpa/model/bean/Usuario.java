/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author willi
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Pessoa{
    @Column(length = 50)
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha, String nome, String email, String telefone, String matricula) {
        super(nome, email, telefone, matricula);
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha, String nome, String email, String telefone, String matricula, Endereco endereco) {
        super(nome, email, telefone, matricula, endereco);
        this.login = login;
        this.senha = senha;
    }
    
    
    

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + '}';
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
    
    
}
