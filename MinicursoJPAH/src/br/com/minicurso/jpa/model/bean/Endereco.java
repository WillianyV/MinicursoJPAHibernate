/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_endereco", sequenceName = "endereco_seq", initialValue = 1, allocationSize = 1)
public class Endereco implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_endereco")
    private Integer id;
    @Column(length = 50)
    private String cidade;
    @Column(length = 2)
    private String uf;
    @Column(length = 50)
    private String bairro;
    private String rua;
    private int numero;

    public Endereco() {
    }

    public Endereco(String cidade, String uf, String bairro, String rua, int numero) {
        this.cidade = cidade;
        this.uf = uf;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cidade=" + cidade + ", uf=" + uf + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }  
    
}
