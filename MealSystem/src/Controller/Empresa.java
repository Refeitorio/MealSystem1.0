//--------------------------------------Imports
package mealsystem;
import mealsystem.Funcionario;
   import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//----------------------------------------------------Comeco da classe
public class Empresa {
   
//----------------------------------------Atributos
    ArrayList <Funcionario> Cfunc =new ArrayList<Funcionario>();    
    String nome,cnpj;
    Funcionario Func;
    //---------------------------------Classe principal
    public void Empresa(String nome,String cnpj){
this.Cfunc=null;
this.Func=null;
this.cnpj=cnpj;
this.nome=nome;
    }
 //-------------------------------------Geters e Seters
    public String getNome(){
    return nome;
    }
    //------------------------------------------
    public void setNome(String n){
    this.nome=n;
        System.out.println("Nome alterado");
    }
   //---------------------------------------------
    public String getCnpj(){
    return cnpj;
    }
    //----------------------------------------------
    public void setCnpj(String c){
        this.cnpj= c;
        System.out.println("CNPJ alterado!");
    }
   //------------------------------------------------//Metodos

       public void CadFunc(Funcionario func){
           System.out.println("");
    Cfunc.add(func);
       System.out.println("Funcionario cadastrado");
    }
   //----------------------------------------------------
    public void List_Func(){
        System.out.println(Arrays.toString(Cfunc.toArray()));
    
    }
    //-----------------------------------------------------
    public void Rem_Func(Funcionario func){//falta coletar os dados
    Cfunc.remove(func);
        System.out.println("Funcionario removido");
    }
    //---------------------------------Pesquisa por nome
    public void Pesq_nome(String n){
    Funcionario a=null;
    int i=0;
    while (i<Cfunc.size()){
    a=Cfunc.get(i);
    if(a.getnome().equals(n)){
        System.out.println(Arrays.toString(Cfunc.toArray()));
    
    
    }
    else{
            System.out.println("Funcionario não encontrado para os dados informados");
            
    }
    i++;
    }
       
}
    //-------------------------------------------------------Pesquisa por CPF
public void Pesq_CPF(int cpf){
   Funcionario a=null;
    int i=0;
    while (i<Cfunc.size()){
    a=Cfunc.get(i);
    if(a.getcpf().equals(cpf)){
        System.out.println(Arrays.toString(Cfunc.toArray()));
    
    
    }
    else{
            System.out.println("Funcionario não encontrado para os dados informados");
            
    }
    i++;
    
    }
    
    
}
//---------------------------------------------------Criar empresa
public void CadEmpresa(){
    Scanner en= new Scanner(System.in);
   String nome,cnpj;
    System.out.println("Digite o nome da empresa");
  nome=en.nextLine();
    System.out.println("Digite o CNPJ para a empresa");
    cnpj=en.nextLine();
    Empresa(nome,cnpj);
}

}