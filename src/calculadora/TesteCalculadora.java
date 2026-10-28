package calculadora;

public class TesteCalculadora {

    private static int total = 0;
    private static int aprovados = 0;

    // Executa um teste, mostra entradas, esperado e obtido
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
