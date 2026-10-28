package calculadora;

/**
 * Calculadora com as quatro operações matemáticas básicas.
 * <p>
 * Módulo criado para a startup fictícia FinançApp, podendo ser usado em
 * cálculos de orçamento mensal, divisão de despesas e projeções de economia.
 * </p>
 * <p>
 * Os erros (divisão por zero e operação inválida) nunca interrompem a execução:
 * são devolvidos como mensagem de texto no retorno do método {@link #calc(int, int, String)}.
 * </p>
 *
 * @author Aluno
 * @version 1.0
 */
public class Calculadora {

    /** Mensagem devolvida quando se tenta dividir por zero. */
    private static final String MSG_DIVISAO_POR_ZERO = "Erro: divisao por zero nao e permitida.";

    /** Mensagem devolvida quando o operador informado não é suportado (ou é nulo). */
    private static final String MSG_OPERACAO_INVALIDA = "Erro: operacao invalida.";

    /** Cria uma nova calculadora (não possui estado interno). */
    public Calculadora() {
    }

    /**
     * Executa uma operação matemática entre dois números inteiros.
     * <p>
     * Operadores aceitos: {@code +}, {@code -}, {@code *} e {@code /}.
     * Soma, subtração e multiplicação são calculadas com {@code long} para evitar
     * estouro (overflow) de {@code int}. A divisão retorna um valor decimal (ex.: "2.5").
     * </p>
     * <p>
     * Este método não lança exceções: a divisão por zero (que causaria
     * {@link ArithmeticException} em divisões inteiras) e operadores inválidos
     * são tratados e retornados como mensagem de erro.
     * </p>
     *
     * @param primeiroNumero primeiro operando
     * @param segundoNumero  segundo operando
     * @param operador       símbolo da operação: "+", "-", "*" ou "/"
     * @return o resultado da operação em texto, ou uma mensagem iniciada por
     *         "Erro:" em caso de divisão por zero ou operador inválido/nulo
     */
    public String calc(int primeiroNumero, int segundoNumero, String operador) {
        // Operador nulo seria causa de NullPointerException no switch; trata antes.
        if (operador == null) {
            return MSG_OPERACAO_INVALIDA;
        }

        // Escolhe a operação conforme o operador recebido
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

    /**
     * Soma dois números.
     *
     * @param a primeira parcela
     * @param b segunda parcela
     * @return a soma em texto
     */
    private String somar(int a, int b) {
        // O cast para long evita overflow quando a soma excede Integer.MAX_VALUE
        return String.valueOf((long) a + b);
    }

    /**
     * Subtrai dois números.
     *
     * @param a minuendo
     * @param b subtraendo
     * @return a diferença em texto
     */
    private String subtrair(int a, int b) {
        return String.valueOf((long) a - b);
    }

    /**
     * Multiplica dois números.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o produto em texto
     */
    private String multiplicar(int a, int b) {
        return String.valueOf((long) a * b);
    }

    /**
     * Divide dois números, impedindo a divisão por zero.
     *
     * @param dividendo número a ser dividido
     * @param divisor   número que divide (se for 0, retorna mensagem de erro)
     * @return o quociente decimal em texto, ou a mensagem de divisão por zero
     */
    private String dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            return MSG_DIVISAO_POR_ZERO;
        }
        // O cast para double garante divisão decimal (5/2 = 2.5, e não 2)
        return String.valueOf((double) dividendo / divisor);
    }
}
