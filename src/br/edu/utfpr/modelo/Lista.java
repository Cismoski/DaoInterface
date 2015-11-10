/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.modelo;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author UTFPR
 */
public class Lista extends AbstractListModel{
    ArrayList<Pessoa> lista = new ArrayList<>();

    public Lista(ArrayList<Pessoa> pessoa) {
        this.lista = pessoa;
    }

    public Lista() {
    }
    
    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    public ArrayList<Pessoa> getLista() {
        return lista;
    }
    
    public int getSize(){
        return lista.size();        
    }

    @Override
    public Object getElementAt(int i) {
        return lista.get(i);
    }
    
}
