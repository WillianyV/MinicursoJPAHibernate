/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.dao;

import br.com.minicurso.jpa.connection.ConnectionFactory;
import br.com.minicurso.jpa.model.bean.Endereco;
import br.com.minicurso.jpa.model.bean.Usuario;
import br.com.minicurso.jpa.view.Mensagem;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author willi
 */
public class UsuarioDAO {
    
    public static void persist(Usuario usuario){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            Mensagem.mostrarMsgm("Sucesso ao inserir usuario!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            Mensagem.mostrarMsgm("Erro ao inserir usuario!");
        }       
        
        em.close();
    }
    
    public static Usuario findById(int id){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        return em.find(Usuario.class, id);
    }
    
    public static ArrayList<Usuario> findAll(){
        EntityManager em =  new ConnectionFactory().getConnection();
        String jpaQuery = "from "+Usuario.class.getName()+" e";
        
        return (ArrayList<Usuario>) em.createQuery(jpaQuery).getResultList();
        
    }
    
    public static Usuario findByLogin(String login){
        EntityManager em =  new ConnectionFactory().getConnection();
        String jpaQuery = "from Usuario u where u.login = '"+login+"'";
        
        return (Usuario) em.createQuery(jpaQuery).getSingleResult();
    }
    
    public static void merge(Usuario usuario){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        
        try {
            em.getTransaction().begin();
            em.merge(usuario);
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
        Usuario usuario = em.find(Usuario.class, id);
        
        try {
            em.getTransaction().begin();
            em.remove(usuario);
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
