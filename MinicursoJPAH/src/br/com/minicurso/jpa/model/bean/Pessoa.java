/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.bean;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_Pessoa", sequenceName = "pessoa_seq",
        initialValue = 1, allocationSize = 1)
public class Pessoa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_Pessoa")
    private int id;
    private String nome;
    @Column(length = 100)
    private String email;
    @Column(length = 16)
    private String telefone;
    private String matricula;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String telefone, String matricula) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public Pessoa(String nome, String email, String telefone, String matricula, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
        this.endereco = endereco;
    }
    
    

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", matricula=" + matricula + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getMatricula() {
        return matricula;
    }
    
    
}
