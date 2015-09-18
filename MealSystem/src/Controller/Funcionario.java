/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealsystem;

/**
 *
 * @author Pacifyc
 */
public class Funcionario {
    
    //------------------------Atributos
    String nome,cpf;
    
    //-------------------------------------Classe principal
     public void Funcionario(String nome,String cpf){
    
      this.cpf=cpf;
      this.nome=nome;
        System.out.println("Funcionario criado");
    }
    
    //---------------------------Geters e Seters
    public String getcpf(){
    return cpf;
    }
    //----------------------------------------------
    public String getnome(){
        
        System.out.println("funcionando");
        return nome;
    }
    //----------------------------------
    

   
    
}
