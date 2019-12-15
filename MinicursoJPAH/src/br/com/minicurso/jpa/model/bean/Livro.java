/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author willi
 */
@Entity
@SequenceGenerator(name = "sequencia_livro", sequenceName = "livro_seq",
        initialValue = 1, allocationSize = 1)
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_livro")
    private int codigo;
    @Column(length = 100)
    private String titulo;
    @Column(length = 75)
    private String autor;
    
    @ManyToOne
    @JoinColumn(name = "sessao_id")
    private Sessao sessao;

    public Livro() {
    }

    public Livro(String titulo, String autor, Sessao sessao) {
        this.titulo = titulo;
        this.autor = autor;
        this.sessao = sessao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "Livro{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", sessao=" + sessao + '}';
    }
    
    
    
}
