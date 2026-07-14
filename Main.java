import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aritmetica operacao = new Aritmetica();
        Teste verifica = new Teste();
        Scanner input = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("Bem vindo à calculadora no console");
        System.out.println("=====================================");
        System.out.println("Digite a operação a ser realizada: ");
        String escolha = input.nextLine();
        escolha.toLowerCase();
        System.out.println(verifica.funcoes(escolha)); 
    }
}
