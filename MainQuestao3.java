
package questao3;

import questao2.Departamento;
import questao1.Empregado;

public class MainQuestao3 {
    public static void main(String[] args){
        
        //criando empresa
        Empresa abtoys = new Empresa("Abtoys",1223225221);
        
        
        //Criando 10 departamentos:
        Departamento depart1 = new Departamento();
        Departamento depart2 = new Departamento();
        Departamento depart3 = new Departamento();
        Departamento depart4 = new Departamento();
        Departamento depart5 = new Departamento();
        Departamento depart6 = new Departamento();
        Departamento depart7= new Departamento();
        Departamento depart8= new Departamento();
        Departamento depart9= new Departamento();
        Departamento depart10=new Departamento();
        
        //utilizando metodo de inserir departamento
        abtoys.inserirDepartamento(depart1);
        abtoys.inserirDepartamento(depart2);
        abtoys.inserirDepartamento(depart3);
        abtoys.inserirDepartamento(depart4);
        abtoys.inserirDepartamento(depart5);
        abtoys.inserirDepartamento(depart6);
        abtoys.inserirDepartamento(depart7);
        abtoys.inserirDepartamento(depart8);
        abtoys.inserirDepartamento(depart9);
        abtoys.inserirDepartamento(depart10);
        
        //se tentarmos inserir mais um departamento na empresa ocorrerá um erro, pois foi definido um limite de 10:
        Departamento depart11 = new Departamento();
        abtoys.inserirDepartamento(depart11);
        
        //criando funcionarios e inserindo em departamentos:
        
        Empregado n1 = new Empregado("Lucia",8856998,"lucia@gmail.com",3000,"assistente","Rua Y");
        Empregado n2 = new Empregado("Luciana",8874998,"luciana@gmail.com",3050,"serviços gerais","Rua w");
        Empregado n3 = new Empregado("Paulo",88545238,"paulo@gmail.com",2500,"secretario","Rua Q");
        Empregado n4 = new Empregado("Pablo",4536998,"pablo@gmail.com",3450,"Limpeza","Rua P");
        Empregado n5 = new Empregado("Clesio",452998,"clesio@gmail.com",3000,"assistente","Rua H");
        
        abtoys.inserirFuncionario(depart1, n1);
        abtoys.inserirFuncionario(depart5, n2);
        abtoys.inserirFuncionario(depart3, n3);
        abtoys.inserirFuncionario(depart4, n4);
        abtoys.inserirFuncionario(depart5, n5);
        
        
        
    }
}
