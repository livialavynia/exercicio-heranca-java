
package questao1;

public class Endereco {
    String endereco;
    
    public Endereco(){
        
    }
    Endereco(String endereco){
        this.endereco = endereco;
    }
    
    //função para retornar o endereço
    public void getEndereco(){
        System.out.println(endereco + "\n");
    }
}
