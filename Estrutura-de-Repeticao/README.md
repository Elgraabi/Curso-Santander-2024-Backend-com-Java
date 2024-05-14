# Tutorial: Estruturas de Repetição em Java

As estruturas de repetição são fundamentais na programação, permitindo que um bloco de código seja executado repetidamente enquanto uma condição específica for verdadeira. Neste tutorial, vamos aprender sobre os diferentes tipos de estruturas de repetição em Java, como utilizá-las e exemplos práticos.

## 1. Estrutura de Repetição `while`

A estrutura de repetição `while` em Java executa um bloco de código enquanto uma condição específica for verdadeira.

```java
while (condição) {
    // bloco de código
}
```

**Exemplo em Java:**

```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contagem: " + contador);
    contador++;
}
```

## 2. Estrutura de Repetição `do-while`

A estrutura de repetição `do-while` em Java é semelhante à estrutura `while`, mas garante que o bloco de código seja executado pelo menos uma vez antes de verificar a condição.

```java
do {
    // bloco de código
} while (condição);
```

**Exemplo em Java:**

```java
int contador = 0;
do {
    System.out.println("Contagem: " + contador);
    contador++;
} while (contador < 5);
```

## 3. Estrutura de Repetição `for`

A estrutura de repetição `for` em Java é utilizada quando o número de iterações é conhecido antecipadamente.

```java
for (inicialização; condição; atualização) {
    // bloco de código
}
```

**Exemplo em Java:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Contagem: " + i);
}
```

## 4. Palavras-chave `break` e `continue`

- A palavra-chave `break` é utilizada para interromper a execução da estrutura de repetição.
- A palavra-chave `continue` é utilizada para interromper a iteração atual e continuar com a próxima iteração.

**Exemplo em Java:**

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // interrompe o loop quando i == 5
    }
    if (i % 2 == 0) {
        continue; // pula para a próxima iteração se i for par
    }
    System.out.println("Número ímpar: " + i);
}
```

## Conclusão

As estruturas de repetição são poderosas ferramentas que permitem que nossos programas executem blocos de código repetidamente com base em condições específicas. Dominar esses conceitos é essencial para escrever código eficiente e funcional em Java. Pratique esses conceitos com exemplos variados para fortalecer sua compreensão e habilidades de programação.