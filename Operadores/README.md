# Operadores em Java

Os operadores em Java são símbolos especiais que realizam operações em operandos, como variáveis, valores ou expressões. Eles podem ser utilizados para realizar operações aritméticas, lógicas, de comparação, entre outras. Neste guia, vamos abordar os principais operadores em Java.

## Operadores Aritméticos

Os operadores aritméticos são utilizados para realizar operações matemáticas básicas. São eles:

- **Adição (+):** Soma dois operandos.
- **Subtração (-):** Subtrai o segundo operando do primeiro.
- **Multiplicação (*):** Multiplica dois operandos.
- **Divisão (/):** Divide o primeiro operando pelo segundo.
- **Módulo (%):** Retorna o resto da divisão do primeiro operando pelo segundo.

Exemplo:
```java
int a = 10;
int b = 3;
int soma = a + b; // soma = 13
int subtracao = a - b; // subtracao = 7
int multiplicacao = a * b; // multiplicacao = 30
int divisao = a / b; // divisao = 3
int modulo = a % b; // modulo = 1
```

## Operadores de Atribuição

Os operadores de atribuição são utilizados para atribuir valores a variáveis. São eles:

- **Atribuição simples (=):** Atribui o valor do lado direito ao operando do lado esquerdo.
- **Atribuição composta (+=, -=, *=, /=, %=):** Realiza uma operação aritmética e atribui o resultado à variável do lado esquerdo.

Exemplo:
```java
int x = 5;
x += 3; // x = x + 3 => x = 8
```

## Operadores de Incremento e Decremento

Os operadores de incremento e decremento são utilizados para aumentar ou diminuir o valor de uma variável em uma unidade. São eles:

- **Incremento (++):** Aumenta o valor da variável em 1.
- **Decremento (--):** Diminui o valor da variável em 1.

Exemplo:
```java
int x = 5;
x++; // x = x + 1 => x = 6
```

## Operadores de Comparação

Os operadores de comparação são utilizados para comparar valores. Eles retornam verdadeiro (true) ou falso (false). São eles:

- **Igual (==):** Verifica se dois valores são iguais.
- **Diferente (!=):** Verifica se dois valores são diferentes.
- **Maior que (>):** Verifica se o primeiro valor é maior que o segundo.
- **Menor que (<):** Verifica se o primeiro valor é menor que o segundo.
- **Maior ou igual (>=):** Verifica se o primeiro valor é maior ou igual ao segundo.
- **Menor ou igual (<=):** Verifica se o primeiro valor é menor ou igual ao segundo.

Exemplo:
```java
int a = 5;
int b = 3;
boolean igual = (a == b); // igual = false
boolean diferente = (a != b); // diferente = true
boolean maior = (a > b); // maior = true
boolean menor = (a < b); // menor = false
boolean maiorOuIgual = (a >= b); // maiorOuIgual = true
boolean menorOuIgual = (a <= b); // menorOuIgual = false
```

## Operadores Lógicos

Os operadores lógicos são utilizados para combinar expressões condicionais. São eles:

- **E lógico (&&):** Retorna verdadeiro se as duas expressões condicionais forem verdadeiras.
- **OU lógico (||):** Retorna verdadeiro se pelo menos uma das expressões condicionais for verdadeira.
- **NÃO lógico (!):** Inverte o valor de uma expressão condicional.

Exemplo:
```java
boolean x = true;
boolean y = false;
boolean resultado1 = (x && y); // resultado1 = false
boolean resultado2 = (x || y); // resultado2 = true
boolean resultado3 = !x; // resultado3 = false
```

Estes são os operadores básicos em Java que você precisará dominar para desenvolver programas eficientes e robustos. Pratique-os em diferentes situações para entender seu funcionamento e aplicação.