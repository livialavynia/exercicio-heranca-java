
package questao2;
import questao1.Empregado;

public class MainQuestao2 extends Empregado{
    public static void main(String[] args){
        
        //instanciando departamento
        Departamento depart = new Departamento();
        
        //inserindo os empregados p1, p2 e p3 no departamento através da função registrarFuncionario()
        Empregado p1 = new Empregado("Livia",99995588,"livia@gmail.com",2200,"Analise de Sistemas","rua x");
        Empregado p2 = new Empregado("Lucas",99856321,"lucas@gmail.com",1500);
        Empregado p3 = new Empregado("Luisa",77452130,"luisa@gmail.com",2000,"serviços gerais");
        
        depart.registrarFuncionario(p1);
        depart.registrarFuncionario(p2);
        depart.registrarFuncionario(p3);
       
        //Inserindo o funcionario motorista no departamento
        Motorista motor = new Motorista("MOTORISTA Cleiton",55668874,"motorista@gmail.com",0,"","rua rosa leite");
        depart.registrarFuncionario(motor);
        
        //Inserindo o funcionario porteiro no deparatamento
        Porteiro port = new Porteiro("PORTEIRO Valdeci",44563258,"porteiro@gmail.com",0,"","rua sem fim");
        depart.registrarFuncionario(port);
        
        //inserindo o funcionario recepcionista no departamento
        Recepcionista recp = new Recepcionista("RECEPCIONISTA Valquiria",44452136,"recepcionista@gmail.com",0,"","rua nossa sra das dores");
        depart.registrarFuncionario(recp);
       
        depart.printLista();
        
    }
}
