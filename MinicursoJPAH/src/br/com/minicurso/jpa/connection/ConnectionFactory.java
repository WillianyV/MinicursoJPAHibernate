/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author willi
 */
public class ConnectionFactory {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("MinicursoJPAPU");
    
    public EntityManager getConnection(){
        return emf.createEntityManager();
    }
}
