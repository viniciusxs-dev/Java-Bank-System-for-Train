public class Aritmetica {
    public int somar(int num1, int num2) {
        return (num1 + num2);
    }

    public int subtrair(int num1, int num2) {
        return (num1 - num2);
    }

    public int dividir(int num1, int num2) {
        return (num1 / num2);
    }

    public int multiplicar(int num1, int num2) {
        return (num1 * num2);
    }

    public int resto(int num1, int num2) {
        return (num1 % num2);
    }

    // Agora retorna true se num1 for maior que num2, caso contrário false
    public boolean maior(int num1, int num2) {
        return num1 > num2;
    }

    // Agora retorna true se num1 for menor que num2, caso contrário false
    public boolean menor(int num1, int num2) {
        return num1 < num2;
    }

    // Agora retorna true se o número for par, caso contrário false
    public boolean par(int num1) {
        return num1 % 2 == 0;
    }
}