package calculadora;

public class Calculadora {

    private static final String MSG_DIVISAO_POR_ZERO = "Erro: divisao por zero nao e permitida.";
    private static final String MSG_OPERACAO_INVALIDA = "Erro: operacao invalida.";

    public String calc(int primeiroNumero, int segundoNumero, String operador) {
        if (operador == null) {
            return MSG_OPERACAO_INVALIDA;
        }

        switch (operador) {
            case "+":
                return somar(primeiroNumero, segundoNumero);
            case "-":
                return subtrair(primeiroNumero, segundoNumero);
            case "*":
                return multiplicar(primeiroNumero, segundoNumero);
            case "/":
                return dividir(primeiroNumero, segundoNumero);
            default:
                return MSG_OPERACAO_INVALIDA;
        }
    }

    private String somar(int a, int b) {
        return String.valueOf((long) a + b);
    }

    private String subtrair(int a, int b) {
        return String.valueOf((long) a - b);
    }

    private String multiplicar(int a, int b) {
        return String.valueOf((long) a * b);
    }

    private String dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            return MSG_DIVISAO_POR_ZERO;
        }
        return String.valueOf((double) dividendo / divisor);
    }
}
