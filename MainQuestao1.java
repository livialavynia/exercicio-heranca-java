
package questao1;

public class MainQuestao1 {
    public static void main(String[] args){
        
        //instanciando com o 1º construtor
        Empregado p1 = new Empregado("Livia",6655214,"livia@gmail.com",2200,"Analise de Sistemas","rua x");
        
        //instanciando com o 2º construtor
        Empregado p2 = new Empregado("Lucas",7456321,"lucas@gmail.com",1500);
        
        //instanciando com o 3º construtor
        Empregado p3 = new Empregado("Luisa",451339,"luisa@gmail.com",2000,"serviços gerais");
        
        //printando os empregados antes de alterar os dados
        p1.printEmpregado();
        p2.printEmpregado();
        p3.printEmpregado();
        
        //Alterando os dados
        System.out.println("_________ALTERANDO OS DADOS DE P1,P2 E P3_________\n");
        
        p1.alterar("Livia Lavynia",112255,"livia2@gmail.com",4000);
        p2.alterar("Lucas Santos",667788,"lucas2@gmail.com",5000);
        p3.alterar("Luisa Paiva",991010,"luisa2@gmail.com",6000);
        
        //printando os empregados depois de alterar os dados de todos
        p1.printEmpregado();
        p2.printEmpregado();
        p3.printEmpregado();
        
        //testando se a condição de salário negativo está funcionando
        System.out.println("\n_____ALTERANDO O SALÁRIO PARA VALOR NEGATIVO_____");
        p1.alterar("Livia2",112255,"livia2@gmail.com",-4000);
    }
}
