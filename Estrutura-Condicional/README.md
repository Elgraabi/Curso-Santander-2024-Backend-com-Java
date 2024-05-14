# Tutorial: Estruturas Condicionais em Java

As estruturas condicionais são fundamentais na programação em Java, permitindo que blocos de código sejam executados com base em condições específicas. Neste tutorial, vamos aprender sobre os diferentes tipos de estruturas condicionais em Java, como utilizá-las e exemplos práticos.

## 1. Estrutura Condicional Simples

A estrutura condicional simples em Java utiliza a palavra-chave `if` para verificar uma condição e executar um bloco de código se essa condição for verdadeira.

```java
if (condição) {
    // bloco de código
}
```

**Exemplo em Java:**

```java
int idade = 18;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```

## 2. Estrutura Condicional Composta

A estrutura condicional composta em Java utiliza as palavras-chave `if` e `else` para executar diferentes blocos de código com base na verificação de uma condição.

```java
if (condição) {
    // bloco de código 1
} else {
    // bloco de código 2
}
```

**Exemplo em Java:**

```java
int idade = 16;
if (idade >= 18) {
    System.out.println("Você é maior de idade.");
} else {
    System.out.println("Você é menor de idade.");
}
```

## 3. Estrutura Condicional Encadeada

A estrutura condicional encadeada em Java utiliza as palavras-chave `if`, `else if` e `else` para testar múltiplas condições em sequência.

```java
if (condição1) {
    // bloco de código 1
} else if (condição2) {
    // bloco de código 2
} else {
    // bloco de código 3
}
```

**Exemplo em Java:**

```java
int nota = 7;
if (nota >= 7) {
    System.out.println("Aprovado.");
} else if (nota >= 5) {
    System.out.println("Recuperação.");
} else {
    System.out.println("Reprovado.");
}
```

## 4. Operadores Lógicos

Os operadores lógicos em Java (`&&`, `||`, `!`) podem ser utilizados para combinar múltiplas condições em uma estrutura condicional.

- `&&`: Retorna `true` se ambas as condições forem verdadeiras.
- `||`: Retorna `true` se pelo menos uma das condições for verdadeira.
- `!`: Inverte o resultado da condição.

**Exemplo em Java:**

```java
int idade = 22;
if (idade >= 18 && idade <= 65) {
    System.out.println("Você é um adulto.");
}
```

## Conclusão

As estruturas condicionais são componentes essenciais na construção de programas em Java, permitindo que o código tome decisões com base em diferentes situações. Dominar esses conceitos é crucial para desenvolver aplicações eficientes e funcionais. Pratique esses conceitos com exemplos variados para solidificar sua compreensão.