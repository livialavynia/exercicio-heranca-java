
package questao1;

public class Empregado extends Pessoa {
    protected float salario;
    protected String cargo;
    protected Endereco endereco = new Endereco("Sem endereco");
    
    public Empregado(){
        
    }
    //1º construtor
    
    public Empregado(String nome, int telefone,String email,float salario, String cargo, String endereco){
        super(nome,telefone,email);
        this.salario = salario;
        this.cargo = cargo;
        this.endereco = new Endereco(endereco);
        
    }
    
    //2º construtor
    public Empregado(String nome, int telefone,String email, float salario){
        super(nome,telefone,email);
        this.salario = salario;
    }
    
    //3º construtor
    public Empregado(String nome, int telefone,String email,float salario,String cargo){
        super(nome,telefone,email);
        this.salario = salario;
        this.cargo = cargo;
    }
    
    //Método para obter os valores dos atributos
    public void printEmpregado(){
        System.out.println("_______ DADOS DE " + this.nome + "_______ " +"\n"+ "Nome: "+ this.nome +"\n" + 
                "Telefone: " +this.telefone + '\n' + "E-mail: " + this.email +'\n'+ "Salário: " +this.salario + 
                '\n' + "Cargo:" +this.cargo);
        this.endereco.getEndereco();
      
        
    }
    
    //Método para atualizar os valores dos atributos
    public void alterar(String nome, int telefone, String email,float salario){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        if (salario>0){
            this.salario=salario;
        }
        else{
            System.out.println("\nValor inválido, não foi possível fazer alterações");
        }
    
    }
    
   
    
}
