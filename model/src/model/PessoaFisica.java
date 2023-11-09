/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author naote
 */
public class PessoaFisica extends Pessoa {
    private String cpf;
    private int idade;
    
    public final void setIdade(int idade){
        this.idade=idade;
    }
    
    public final void setCpf(String cpf){
        this.cpf=cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    public int getIdade(){
        return this.idade;
    }
    @Override
    public String exibir(){
        return getCpf() + getIdade() +  getNome() + getId();
    }
    
    PessoaFisica(){
        
    }
    PessoaFisica(String cpf,int idade, String nome, int id){
        setCpf(cpf);
        setIdade(idade);
        setNome(nome);
        setId(id);
    }

}
