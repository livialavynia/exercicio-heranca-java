
package questao2;

import questao1.Empregado;
import java.util.ArrayList;

public class Departamento extends Empregado{
    public ArrayList<Empregado>funcionarios = new ArrayList<>();
    
    public void registrarFuncionario(Empregado p){
        funcionarios.add(p);
    }
    
    public void removerFuncionario(Empregado p){
        funcionarios.remove(p);
    }
    
    public void printLista(){
       for(int i=0;i<funcionarios.size();i++){
           funcionarios.get(i).printEmpregado();
       }    
       
   }
    
   
}
