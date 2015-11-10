/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import java.util.ArrayList;
import br.edu.utfpr.modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoArrayList{

    private ArrayList<Pessoa> lista;
    
    public PessoaDaoArrayList(){
        lista = new ArrayList<>();
    }
    
   
    public void adicionar(Pessoa p) {
        lista.add(p);
        System.out.println("A pessoa \"" + p.getNome() + "\" foi adicionada");
    }

    
    public void remover(Pessoa p) {
        lista.remove(p);
        System.out.println("A pessoa \"" + p.getNome() + "\" foi removida");
    }   

 
    }



    
    

