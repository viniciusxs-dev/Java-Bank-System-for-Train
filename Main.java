import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aritmetica operacao = new Aritmetica();
        VerificaDigitacao verifica = new VerificaDigitacao();
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Bem vindo à calculadora no console");
        System.out.println("=====================================");
        System.out.println("Digite a operação a ser realizada: ");
        System.out.println("Operação: ");
        String escolha = input.nextLine();
        escolha.toLowerCase();
        if(verifica.funcoes(escolha) == false){
            System.out.println("Operação Indevida");
            return;
        }
        System.out.println("Operação selecionada: "+escolha.substring(0,1).toUpperCase()+escolha.substring(1));

        System.out.println("Digite o primeiro número");
        int num1 = input.nextInt();

        
        





    }
}
