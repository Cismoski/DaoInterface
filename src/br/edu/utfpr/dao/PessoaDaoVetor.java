/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import br.edu.utfpr.dao.Dao;
import br.edu.utfpr.modelo.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author UTFPR
 */
public class PessoaDaoVetor{

    private Pessoa lista[];
    private int i;
    

    public PessoaDaoVetor(int i) {
       lista = new Pessoa[5];
       this.i = i;
    }
    
    
    public void adicionar(Pessoa p) {
          if(i <= 5){
             lista[i] = p; 
             i++;
              System.out.println("Adicionando " + p.getNome());
        }
    }

    
    public void remover(Pessoa p) {
      // arrumar o remover
        
        if(i > 0){
            for(int cont=0;cont<i;cont++){
                if(lista[cont] == p){
                    System.out.println("Removendo " + p.getNome());
                    i--;
                }else if(lista[cont] == null){
                    
                }
            }            
        }
        
      
    }
    
}