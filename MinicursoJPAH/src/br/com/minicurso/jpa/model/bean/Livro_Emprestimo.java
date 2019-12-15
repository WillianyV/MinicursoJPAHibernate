/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.bean;

import java.io.Serializable;
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
@SequenceGenerator(name = "livroEmp_sequncia",sequenceName = "livroEmp_seq",
        initialValue = 1, allocationSize = 1)
public class Livro_Emprestimo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "livroEmp_sequncia")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "livrro_id")
    private Livro livro;
    
    @ManyToOne
    @JoinColumn(name = "emprestimo_id")
    private Emprestimo emprestimo;

    public Livro_Emprestimo() {
    }

    public Livro_Emprestimo(Livro livro, Emprestimo emprestimo) {
        this.livro = livro;
        this.emprestimo = emprestimo;
    }
    
    

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public String toString() {
        return "Livro_Emprestimo{" + "id=" + id + ", livro=" + livro + ", emprestimo=" + emprestimo + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
