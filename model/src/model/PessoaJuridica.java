/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author naote
 */
public class PessoaJuridica extends Pessoa {
    String cnpj;
    public final void setCnpj(String cnpj){
    this.cnpj=cnpj;
}
    public String getCnpj(){
        return this.cnpj;
    }
    @Override
    public String exibir(){
        return getCnpj() +  getNome() + getId();
    }

    
    PessoaJuridica(){
        
    }
    PessoaJuridica(String cnpj,String nome,int id){
        setId(id);
        setNome(nome);
        setCnpj(cnpj);
    }
}
