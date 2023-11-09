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
public class PessoaFisicaRepo extends PessoaFisica{
     ArrayList<PessoaFisica> persons;
    
    public void inserir(PessoaFisica pessoa){
        persons.add(pessoa);
    }
    public void alterar(){
        
    }
    public void excluir(PessoaFisica pessoa){
        id = pessoa.getId();
        
    }

    /**
     *
     * @param pessoa
     * @return
     */
    public PessoaFisica obter(PessoaFisica pessoa){
        id = pessoa.getId();
        int index;
         index = persons.indexOf(id);
         PessoaFisica get = persons.get(index);
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
    
            
    PessoaFisicaRepo(ArrayList<PessoaFisica> persons){
        this.persons = persons;
    }
}
