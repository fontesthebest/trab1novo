/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.Serializable;

/**
 *
 * @author naote
 */
public class Pessoa implements Serializable {
        //atributos
        int id;
        private String nome;
        
        public void setId(int id){
            this.id=id;
        }
        public void setNome(String nome){
            this.nome=nome;
        }
        
        public int getId(){
            return this.id;
        }
        public String getNome(){
            return this.nome;
        }
        
        public String exibir(){
            return getNome() + getId();
    }
        Pessoa(){
            
        }
        Pessoa(String nome,int id){
            this.nome=nome;
            this.id=id;
        }
       
}

