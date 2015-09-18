/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//-----------------------------------------Imports
package mealsystem;
import java.util.Scanner;
import mealsystem.Empresa;
import mealsystem.Funcionario;
//-----------------------------------------Começo da classe
public class MealSystem {
      public static void main(String[] args) {
        Empresa veneza=new Empresa();
   
       Menu(veneza);
      }
    //--------------------------------------Metodo Menu
public static void Menu(Empresa t){
    int i=10000;
   Scanner en=new Scanner(System.in);
   
       while(i!=0){
       
       System.out.println("Ola mundo!!!!!"); 
       System.out.println("o que vc deseja fazer");
       System.out.println("Para cadastrar um funcionario digite 1");
       System.out.println("Cadastrar uma empresa digite 2");
       System.out.println("Para procurar um funcionario digite 3");
       System.out.println("Para exibir todos os funcionarios cadastrados digite 4");
       System.out.println("Para sair digite 0");
         i=en.nextInt(); 
         if (i==1){//Criando e cadastrando funcionario
             Funcionario func= new Funcionario();
             System.out.println("informe o nome do funcionario");
             func.nome=en.nextLine();
             System.out.println("Informe o CPF do funcionario");
             func.cpf=en.nextLine();
         t.CadFunc(func);
         }
         if (i==4){
             System.out.println("existem esses funcionarios na empresa");
         t.List_Func();
         }
         if (i==0){
             System.out.println("Volte sempre");
         }
       }
//------------------------------------------------------

}

      

    public MealSystem() {
        
        //não faço nada
    }
   

   
       }

    
    
