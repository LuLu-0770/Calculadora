# projeto_calculadora

## 📌 Descrição do Projeto
Módulo de cálculos matemáticos básicos em **Java**, desenvolvido para a startup fictícia **FinançApp** (aplicativo mobile de controle de finanças pessoais). A classe `Calculadora` pode ser usada em funcionalidades como orçamento mensal, divisão de despesas e projeção de economia.

## 🎯 Objetivo da Atividade
Praticar construção, validação, manutenção e documentação de software, aplicando:
testes funcionais e unitários, tratamento de erros, refatoração de código, documentação técnica (JavaDoc) e versionamento com Git/GitHub.

## 🛠️ Tecnologias Utilizadas
- Java (JDK 21; compatível com JDK 11+)
- JavaDoc (geração da documentação HTML)
- Git e GitHub (versionamento)

## 📁 Estrutura do Projeto
```
projeto_calculadora/
├── src/calculadora/
│   ├── Calculadora.java
│   └── TesteCalculadora.java
├── docs/              # JavaDoc gerado (abrir docs/index.html)
├── evidencias/        # saída dos testes e prints
└── README.md
```

## ➕ Explicação das Operações
Método principal: `String calc(int a, int b, String op)`

| Operador | Operação        | Exemplo            | Retorno |
|----------|-----------------|--------------------|---------|
| `+`      | Soma            | `calc(10, 5, "+")` | `15`    |
| `-`      | Subtração       | `calc(10, 4, "-")` | `6`     |
| `*`      | Multiplicação   | `calc(6, 7, "*")`  | `42`    |
| `/`      | Divisão         | `calc(5, 2, "/")`  | `2.5`   |

**Tratamento de erros** (o programa nunca é interrompido):
- Divisão por zero → `Erro: divisao por zero nao e permitida.`
- Operador inválido ou nulo → `Erro: operacao invalida.`
- Soma, subtração e multiplicação usam `long` internamente para evitar overflow de `int`.

## ▶️ Como Compilar e Executar os Testes
```bash
javac -encoding UTF-8 -d out src/calculadora/*.java
java -cp out calculadora.TesteCalculadora
```

## 🧪 Prints da Execução dos Testes
> 📷 **INSERIR PRINT AQUI:** `evidencias/print_testes.png`
>
> `![Execução dos testes](evidencias/print_testes.png)`

Saída obtida (texto) — 10/10 testes aprovados; arquivo completo em `evidencias/saida_testes.txt`:
```
Teste: Divisao por zero
  Entradas : a=10, b=0, op=/
  Esperado : Erro: divisao por zero nao e permitida.
  Obtido   : Erro: divisao por zero nao e permitida.
  Resultado: PASSOU

=== RESUMO: 10/10 testes aprovados ===
```

## 📚 Prints da Documentação JavaDoc
Gerada com:
```bash
javadoc -private -encoding UTF-8 -charset UTF-8 -docencoding UTF-8 -author -version -d docs -sourcepath src calculadora
```
Abrir `docs/index.html` no navegador.

> 📷 **INSERIR PRINT AQUI:** `evidencias/print_javadoc.png`
>
> `![JavaDoc](evidencias/print_javadoc.png)`

## 🔀 Branches e Refatoração
- `main`: branch principal.
- `Refatoracao`: extração de métodos (`somar`, `subtrair`, `multiplicar`, `dividir`), uso de `switch`, constantes para mensagens, nomes de variáveis mais claros e JavaDoc. Todos os testes foram executados novamente e continuam passando.

## 🔗 Link do Repositório
https://github.com/SEU_USUARIO/projeto_calculadora

## 👤 Autor
SEU NOME — Atividade individual
