
package questao3;

import questao2.Departamento;
import questao1.Empregado;
import questao1.Endereco;
import java.util.ArrayList;
public class Empresa extends Departamento{
    String nome;
    int cnpj;
    
    public ArrayList<Departamento>departamentos_empresa = new ArrayList();
    
    public Empresa(String nome, int cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        
    }
    
    public void inserirDepartamento(Departamento depart){
        if(departamentos_empresa.size()<10){
            departamentos_empresa.add(depart);}
        else{
            System.out.println("\n___ERRO___");
            System.out.println("Quantidade de departamentos atingiu o limite");
        }
    }
    
    public void inserirFuncionario(Departamento depart, Empregado empregado){
        for (int i=0;i<departamentos_empresa.size();i++){
            if(departamentos_empresa.contains(depart) ==true){
                depart.registrarFuncionario(empregado);
            }
            else{
    
                System.out.println("Departamento não existe");}
        }
  
    }
    
    public void transferir(Departamento depart, Empregado x) {
        for (int i=0; i<departamentos_empresa.size(); i++){
            if (departamentos_empresa.contains(x) == true){
                departamentos_empresa.remove(x);
                departamentos_empresa.inserirFuncionario(depart,x);
                }
            
        }
    }
   
   
    
    
}
