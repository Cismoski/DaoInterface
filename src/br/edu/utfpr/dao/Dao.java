/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.util.ArrayList;


/**
 *
 * @author UTFPR
 */
public interface Dao {
    public void adicionar(Pessoa p);
    public void remover(Pessoa p);
    public ArrayList<Pessoa> listarTudo();
 
}
