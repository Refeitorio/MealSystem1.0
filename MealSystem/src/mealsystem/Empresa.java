//--------------------------------------Imports
package mealsystem;
import mealsystem.Funcionario;
   import java.util.ArrayList;
import java.util.Arrays;
//----------------------------------------------------Comeco da classe
public class Empresa {
   
//----------------------------------------Atributos
    ArrayList <Funcionario> Cfunc =new ArrayList<Funcionario>();
    String nome,cnpj;
    Funcionario Func;
    //---------------------------------Classe principal
    public void Empresa(ArrayList <Funcionario> Cfunc,String nome,String cnpj, Funcionario Func){
this.Cfunc=Cfunc;
this.Func=Func;
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
    
                            //Metodos

    /**
     *
     * @param func
     */
       public void CadFunc(Funcionario func){
    Cfunc.add(func);
       System.out.println("Funcionario cadastrado");
    }
   //----------------------------------------------------
    public void List_Func(){
        System.out.println(Arrays.toString(Cfunc.toArray()));
    
    }
    //-----------------------------------------------------
    public void Rem_Func(Funcionario f){
    Cfunc.remove(f);
        System.out.println("Funcionario removido");
    }
    //---------------------------------Pesquisa
    public void Pes_nome(String n){
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
    }
       
}

    
} 
