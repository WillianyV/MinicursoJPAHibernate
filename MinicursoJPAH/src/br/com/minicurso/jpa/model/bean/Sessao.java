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
@SequenceGenerator(name = "sequencia_sessao", sequenceName = "sessao_seq", 
        initialValue = 1, allocationSize = 1)
public class Sessao implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_sessao")
    private int codigo;
    @Column(length = 100)
    private String descricao;

    public Sessao() {
    }

    public Sessao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Sessao{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
