/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.bean;

import java.io.Serializable;
import java.sql.Date;
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
@SequenceGenerator(name = "sequencia_emprestimo", sequenceName = "emprestimo_seq",
        initialValue = 1, allocationSize = 1)
public class Emprestimo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia_emprestimo")
    private int codigo;
    private Date data_devolucao, data;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario; 

    public Emprestimo() {
    }

    public Emprestimo(Date data_devolucao, Date data, Usuario usuario) {
        this.data_devolucao = data_devolucao;
        this.data = data;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "codigo=" + codigo + ", data_devolucao=" + data_devolucao + ", data=" + data + ", usuario=" + usuario + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

    
    
}
