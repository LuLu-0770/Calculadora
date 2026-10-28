package calculadora;

public class Calculadora {

    // Versao inicial: realiza as 4 operacoes basicas
    public String calc(int a, int b, String op) {
        String resultado;

        if (op == null) {
            resultado = "Erro: operacao invalida.";
        } else if (op.equals("+")) {
            resultado = "" + ((long) a + b);
        } else if (op.equals("-")) {
            resultado = "" + ((long) a - b);
        } else if (op.equals("*")) {
            resultado = "" + ((long) a * b);
        } else if (op.equals("/")) {
            if (b == 0) {
                resultado = "Erro: divisao por zero nao e permitida.";
            } else {
                resultado = "" + ((double) a / b);
            }
        } else {
            resultado = "Erro: operacao invalida.";
        }

        return resultado;
    }
}
