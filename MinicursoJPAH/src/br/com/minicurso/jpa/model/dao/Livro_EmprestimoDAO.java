/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.dao;

import br.com.minicurso.jpa.connection.ConnectionFactory;
import br.com.minicurso.jpa.model.bean.Emprestimo;
import br.com.minicurso.jpa.model.bean.Endereco;
import br.com.minicurso.jpa.model.bean.Livro_Emprestimo;
import br.com.minicurso.jpa.view.Mensagem;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author willi
 */
public class Livro_EmprestimoDAO {
    
    public static void persist(Livro_Emprestimo livro_Emprestimo){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(livro_Emprestimo);
            em.getTransaction().commit();
            Mensagem.mostrarMsgm("Sucesso ao inserir livro emprestimo!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            Mensagem.mostrarMsgm("Erro ao inserir livro emprestimo!");
        }       
        
        em.close();
    }
    
    public static Livro_Emprestimo findById(int id){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        return em.find(Livro_Emprestimo.class, id);
    }
    
    public static ArrayList<Livro_Emprestimo> findAll(){
        EntityManager em =  new ConnectionFactory().getConnection();
        String jpaQuery = "from "+Livro_Emprestimo.class.getName()+" e";
        
        return (ArrayList<Livro_Emprestimo>) em.createQuery(jpaQuery).getResultList();
        
    }
    
    public static void merge(Livro_Emprestimo livro_Emprestimo){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        
        try {
            em.getTransaction().begin();
            em.merge(livro_Emprestimo);
            em.getTransaction().commit();
            Mensagem.mostrarMsgm("Edição realizada com sucesso!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            Mensagem.mostrarMsgm("Erro na edição!");
        }
        
        em.close();
    }
    
    public static void remove(Integer id){
        EntityManager em =  new ConnectionFactory().getConnection();
        Livro_Emprestimo livro_Emprestimo = em.find(Livro_Emprestimo.class, id);
        
        try {
            em.getTransaction().begin();
            em.remove(livro_Emprestimo);
            em.getTransaction().commit();
            Mensagem.mostrarMsgm("Remoção realizada com sucesso!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            Mensagem.mostrarMsgm("Erro na remoção!");
        }
    }
    
    
    
     /* public static void remove(Integer id){
        EntityManager em = new ConnectionFactory().getConnection();
        Endereco endereco = null;
        
        try {
            endereco = em.find(Endereco.class, id);
            
            em.getTransaction().begin();
            em.remove(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            Mensagem.mostrarMsgm("Erro ao remover endereço!");
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
    }*/
    
}
