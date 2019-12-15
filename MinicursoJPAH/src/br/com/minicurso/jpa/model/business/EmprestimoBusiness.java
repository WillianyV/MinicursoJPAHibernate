/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.business;

import br.com.minicurso.jpa.model.bean.Emprestimo;
import br.com.minicurso.jpa.model.bean.Livro;
import br.com.minicurso.jpa.model.bean.Livro_Emprestimo;
import br.com.minicurso.jpa.model.dao.EmprestimoDAO;
import br.com.minicurso.jpa.model.dao.Livro_EmprestimoDAO;
import java.util.ArrayList;

/**
 *
 * @author willi
 */
public class EmprestimoBusiness {
    
    public static void persist(Emprestimo emprestimo, ArrayList<Livro> livros){
        EmprestimoDAO.persist(emprestimo);
        
        System.out.println("\n\n"+EmprestimoDAO.lastId());
        
        Emprestimo e = EmprestimoDAO.findById(EmprestimoDAO.lastId());
        Livro_Emprestimo le;
        for(Livro l : livros){
            le = new Livro_Emprestimo(l, e);
            Livro_EmprestimoDAO.persist(le);
        }
    }
    
}
