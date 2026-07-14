import java.lang.reflect.Method;

public class Teste {
    public boolean funcoes(String metodo) {
        Class<?> classe = Aritmetica.class;

        Method[] metodos = classe.getDeclaredMethods();

        for (Method m : metodos) {
            if (m.getName().toString().equals(metodo)) {
                return true;
            }
        }
        return false;

    }
}
