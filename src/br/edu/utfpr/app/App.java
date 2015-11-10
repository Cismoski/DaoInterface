/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;


import br.edu.utfpr.dao.PessoaDaoDerby;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa("Joao", "Silva","12",1);
        Pessoa pedro = new Pessoa("Pedro","Silva","2",2);
        PessoaDaoDerby dao = new PessoaDaoDerby();
        
      
       dao.adicionar(pedro);  
       dao.listarTudo();
    }
    
}
