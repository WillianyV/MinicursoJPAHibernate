/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.model.business;

import br.com.minicurso.jpa.model.bean.Usuario;
import br.com.minicurso.jpa.model.dao.UsuarioDAO;
import br.com.minicurso.jpa.view.Mensagem;

/**
 *
 * @author willi
 */
public class UsuarioBusiness {
    
    public static Usuario login(String login, String senha){
        Usuario usuario = UsuarioDAO.findByLogin(login);
        try {
            if(usuario.getSenha().equals(senha)){
                Mensagem.mostrarMsgm("Sucesso ao logar!");
                return usuario;
            }
                
        } catch (Exception e) {
            Mensagem.mostrarMsgm("Erro ao logar!");
        }
        return usuario;
    }
    
}
