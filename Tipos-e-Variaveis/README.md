# Tipos e Variáveis em Java

Em Java, os tipos de dados representam os diferentes tipos de valores que uma variável pode armazenar. As variáveis são nomes que você atribui a locais de armazenamento na memória. Vamos aprender sobre os tipos de dados básicos em Java e como declarar variáveis.

## Tipos de Dados Básicos

Java possui oito tipos de dados primitivos, divididos em quatro categorias:

1. **Tipos Numéricos Integrais:**
   - **byte:** 8 bits, armazena valores de -128 a 127.
   - **short:** 16 bits, armazena valores de -32,768 a 32,767.
   - **int:** 32 bits, armazena valores de -2,147,483,648 a 2,147,483,647.
   - **long:** 64 bits, armazena valores de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

2. **Tipos Numéricos de Ponto Flutuante:**
   - **float:** 32 bits, armazena valores decimais de precisão simples.
   - **double:** 64 bits, armazena valores decimais de precisão dupla.

3. **Tipo Caractere:**
   - **char:** 16 bits, armazena caracteres Unicode.

4. **Tipo Booleano:**
   - **boolean:** armazena valores verdadeiro (true) ou falso (false).

## Declaração de Variáveis

Em Java, você declara uma variável especificando o tipo de dado que ela irá armazenar, seguido pelo nome da variável. Veja como declarar variáveis:

```java
// Declaração e inicialização de variáveis
int idade = 25;
double altura = 1.75;
char genero = 'M';
boolean estudante = true;

// Declaração de variáveis sem inicialização
int numero;
double peso;
```

## Regras para Nomes de Variáveis

- Os nomes de variáveis em Java devem começar com uma letra (a-z, A-Z), sublinhado (_) ou cifrão ($).
- Após o primeiro caractere, os nomes de variáveis podem conter letras, dígitos (0-9), sublinhados (_) ou cifrões ($).
- Palavras-chave reservadas não podem ser usadas como nomes de variáveis.
- Os nomes de variáveis são sensíveis a maiúsculas e minúsculas.

Exemplo de Nomes de Variáveis Válidos:
```java
int idade;
double alturaDoUsuario;
String nomeCompleto;
```

Exemplo de Nomes de Variáveis Inválidos:
```java
int 2numero; // Começa com um dígito
double altura do usuario; // Contém espaços
String class; // Usa palavra-chave reservada
```

Agora que você entende os tipos de dados básicos em Java e como declarar variáveis, está pronto para começar a programar! Pratique e experimente diferentes tipos de variáveis para familiarizar-se com eles.