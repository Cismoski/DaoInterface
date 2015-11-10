/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.modelo.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author UTFPR
 */
public class PessoaDaoDerby implements Dao{

    Statement stmt;

    //Quando contruir  a classe, conectar em um banco
    public PessoaDaoDerby() {
        String username = "utf";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MeuBanco";

        // depois mandar conectar
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();

        } catch (SQLException se) {
            System.out.println("Mensagem: " + se.getMessage());
        }
        System.out.println("Conexão estabelecida.");
    }

    @Override
    public void adicionar(Pessoa p) {
       String instrucao = "INSERT INTO PESSOA (NOME,SOBRENOME,IDADE,ID) VALUES(" + "\'" + p.getNome() + "\'" + "," + "\'" + p.getSobrenome() + "\'" + ","+ "\'" + p.getIdade() +"\'" + "," + p.getCodigo() + ")";
       
        System.out.println(instrucao);
       try{
           stmt.executeUpdate(instrucao);
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        System.out.println("Dado adicionado.");
    }

    @Override
    public void remover(Pessoa p) {
        //DELETE FROM CISMOSKI.PESSOA WHERE NOME = 'Joao' AND SOBRENOME = 'Silva' AND IDADE = 20;
        
        String instrucao = "DELETE FROM PESSOA WHERE NOME = " + "\'" + p.getNome() +"\'";
        
        System.out.println(instrucao);
        try{
           stmt.executeUpdate(instrucao);
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
        System.out.println("Dado removido.");
    }

   @Override
    public ArrayList<Pessoa> listarTudo() {
        
        String instrucao = "SELECT * FROM PESSOA";
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        // Fazer array pra nome, idade e sobrenome.
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while(rs.next()){
                String nome = rs.getString("NOME"); 
                String sobrenome = rs.getString("SOBRENOME");
                String idade =  rs.getString("IDADE");
                int id = rs.getInt("ID");   
                Pessoa pessoa = new Pessoa(nome, sobrenome, idade, id);
                pessoas.add(pessoa);
        }  
       }catch(SQLException se){
           System.out.println("Mensagem: " + se.getMessage());
       }
       return pessoas;
    }
    
}
 


