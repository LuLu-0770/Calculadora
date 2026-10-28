package calculadora;

/**
 * Testes unitários da classe {@link Calculadora}.
 * <p>
 * Não depende de bibliotecas externas: cada teste imprime as entradas utilizadas,
 * o resultado esperado, o resultado obtido e se passou ou falhou.
 * Se algum teste falhar, o programa termina com código de saída 1.
 * </p>
 *
 * @author Aluno
 * @version 1.0
 */
public class TesteCalculadora {

    /** Quantidade total de testes executados. */
    private static int total = 0;
    /** Quantidade de testes que passaram. */
    private static int aprovados = 0;

    /** Construtor padrão (a classe é usada apenas pelo método {@code main}). */
    public TesteCalculadora() {
    }

    /**
     * Executa um teste e exibe entradas, resultado esperado e resultado obtido.
     *
     * @param nome     descrição do cenário testado
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param op       operador
     * @param esperado resultado que a calculadora deve retornar
     */
    private static void testar(String nome, int a, int b, String op, String esperado) {
        String obtido = new Calculadora().calc(a, b, op);
        boolean ok = esperado.equals(obtido);
        total++;
        if (ok) {
            aprovados++;
        }
        System.out.println("Teste: " + nome);
        System.out.println("  Entradas : a=" + a + ", b=" + b + ", op=" + op);
        System.out.println("  Esperado : " + esperado);
        System.out.println("  Obtido   : " + obtido);
        System.out.println("  Resultado: " + (ok ? "PASSOU" : "FALHOU"));
        System.out.println();
    }

    /**
     * Executa todos os testes: soma, subtração, multiplicação, divisão,
     * divisão por zero e operações inválidas.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        System.out.println("=== TESTES DA CALCULADORA ===\n");

        testar("Soma", 10, 5, "+", "15");
        testar("Soma com negativo", -3, 8, "+", "5");
        testar("Subtracao", 10, 4, "-", "6");
        testar("Multiplicacao", 6, 7, "*", "42");
        testar("Divisao exata", 20, 4, "/", "5.0");
        testar("Divisao decimal", 5, 2, "/", "2.5");
        testar("Divisao por zero", 10, 0, "/", "Erro: divisao por zero nao e permitida.");
        testar("Operacao invalida", 10, 5, "%", "Erro: operacao invalida.");
        testar("Operacao nula", 10, 5, null, "Erro: operacao invalida.");
        testar("Overflow na soma", Integer.MAX_VALUE, 1, "+", "2147483648");

        System.out.println("=== RESUMO: " + aprovados + "/" + total + " testes aprovados ===");
        if (aprovados != total) {
            System.exit(1);
        }
    }
}
