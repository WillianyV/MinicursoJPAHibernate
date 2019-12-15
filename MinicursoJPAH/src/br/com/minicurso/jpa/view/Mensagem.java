/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.minicurso.jpa.view;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Mensagem {
    public static void mostrarMsgm(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
}
