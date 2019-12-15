/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.app;

import br.com.minicurso.jpa.connection.ConnectionFactory;
import br.com.minicurso.jpa.model.bean.Emprestimo;
import br.com.minicurso.jpa.model.bean.Endereco;
import br.com.minicurso.jpa.model.bean.Livro;
import br.com.minicurso.jpa.model.bean.Sessao;
import br.com.minicurso.jpa.model.bean.Usuario;
import br.com.minicurso.jpa.model.business.EmprestimoBusiness;
import br.com.minicurso.jpa.model.business.UsuarioBusiness;
import br.com.minicurso.jpa.model.dao.EnderecoDAO;
import br.com.minicurso.jpa.model.dao.LivroDAO;
import br.com.minicurso.jpa.model.dao.SessaoDAO;
import br.com.minicurso.jpa.model.dao.UsuarioDAO;
import br.com.minicurso.jpa.view.Mensagem;
import java.sql.Date;
import java.util.ArrayList;
import javax.persistence.EntityManager;

/**
 *
 * @author willi
 */
public class App {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Floresta", "PE", "Centro", "Av. Gov. P. P. Guerra", 68);
        Endereco endereco2 = new Endereco("Floresta", "PE", "Cohab", "Av. Gov. P. P. Guerra", 68);
        
        Sessao sessao = new Sessao("Ficção");
        Sessao sessao1 = new Sessao("Fantasia");
        
        
        
        SessaoDAO.persist(sessao);
        SessaoDAO.persist(sessao1);
        
        sessao = SessaoDAO.findById(1);
        sessao1 = SessaoDAO.findById(2);
        
        Usuario usuario = new Usuario("elvis150", "1234", "Elvis", "123@123", "1234", "123", endereco);
        UsuarioDAO.persist(usuario);
        
        Usuario usuario1 = UsuarioBusiness.login("elvis150", "1234");
        
        
        
        if(usuario != null)
            System.out.println(usuario1.toString());
        else
            Mensagem.mostrarMsgm("Erro ao fazer login!");
        
        Livro livro = new Livro("HP", "JK", sessao1);
        Livro livro1 = new Livro("LOTR", "Tolkien", sessao);
        
        LivroDAO.persist(livro);
        LivroDAO.persist(livro1);
        
        Emprestimo emprestimo = new Emprestimo(new Date(5, 12, 2019), new Date(4, 12, 2019),
                usuario1);
        
        EmprestimoBusiness.persist(emprestimo, LivroDAO.findAll());
        
        //EnderecoDAO.persist(endereco);
        //EnderecoDAO.persist(endereco2);
        
        //ArrayList <Endereco> enderecos = EnderecoDAO.findAll();
        
        /*for(Endereco e : enderecos){
            System.out.println("Bairro: "+e.getBairro());
        }*/
        /*System.out.println(endereco.toString());
        endereco.setBairro("Cohab");
        EnderecoDAO.merge(endereco);
        
        System.out.println(endereco.toString());
        */
    }
    
}
