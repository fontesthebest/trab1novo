/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author naote
 */
public class PessoaJuridicaRepo extends PessoaJuridica{
     ArrayList<PessoaJuridica> persons;
    
    public void inserir(PessoaJuridica pessoa){
        persons.add(pessoa);
    }
    public void alterar(PessoaJuridica pessoa){
        
    }
    public void excluir(PessoaJuridica pessoa){
        id = pessoa.getId();   
    }

    /**
     *
     * @param pessoa
     * @return
     */
    public PessoaJuridica obter(PessoaJuridica pessoa){
        id = pessoa.getId();
        int index;
         index = persons.indexOf(id);
         PessoaJuridica get = persons.get(index);
         return get;
        
    }
    public void obterTodos(){
        persons.forEach(e -> {
            System.out.println(e.exibir());
        });  
    }
    
    public void persistir(){
        throw new IllegalArgumentException("persistindo");
    }
    public void recuperar(){
        throw new IllegalArgumentException("Recuperando");
    }
    PessoaJuridicaRepo(){
        
    }
    
    PessoaJuridicaRepo(ArrayList<PessoaJuridica> persons){
        this.persons = persons;
    }
}
