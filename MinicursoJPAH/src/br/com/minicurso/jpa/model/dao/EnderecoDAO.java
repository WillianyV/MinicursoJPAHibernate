/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.dao;

import br.com.minicurso.jpa.connection.ConnectionFactory;
import br.com.minicurso.jpa.model.bean.Endereco;
import br.com.minicurso.jpa.view.Mensagem;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author willi
 */
public class EnderecoDAO {
    
    public static void persist(Endereco endereco){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
            Mensagem.mostrarMsgm("Sucesso ao inserir endereço!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            Mensagem.mostrarMsgm("Erro ao inserir endereço!");
        }       
        
        em.close();
    }
    
    public static Endereco findById(int id){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        return em.find(Endereco.class, id);
    }
    
    public static ArrayList<Endereco> findAll(){
        EntityManager em =  new ConnectionFactory().getConnection();
        String jpaQuery = "from "+Endereco.class.getName()+" e";
        
        return (ArrayList<Endereco>) em.createQuery(jpaQuery).getResultList();
        
    }
    
    public static void merge(Endereco endereco){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        
        try {
            em.getTransaction().begin();
            em.merge(endereco);
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
        Endereco endereco = em.find(Endereco.class, id);
        
        try {
            em.getTransaction().begin();
            em.remove(endereco);
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
