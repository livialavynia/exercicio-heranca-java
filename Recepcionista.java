
package questao2;
import questao1.Empregado;

public class Recepcionista extends Empregado{
    float abono = 300;
    
    //Através do construtor, independente do valor que for inserido como salario e cargo, sempre serão
    //os valores fixados como this.salario e this.cargo
    public Recepcionista(String nome, int telefone,String email,float salario, String cargo, String endereco){
        super(nome,telefone,email,salario,cargo,endereco);
        this.salario = 2000 + abono;
        this.cargo = "Recepcionista";
    }
}