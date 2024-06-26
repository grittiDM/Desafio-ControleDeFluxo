import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException exception){

            //imprimir a mensagem : O Segundo parâmetro deve ser maior que o primeiro.
            
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");

        }
        }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        //validar se parametroUm é MAIOR que parametroDois e lancçar a exceção
        if(parametroUm >= parametroDois){
                throw new ParametrosInvalidosException();
            }
        
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(contagem = parametroUm; contagem <= parametroDois; contagem++){
            
            System.out.println("Imprimindo o número - " + contagem);
        } 
    }
}
