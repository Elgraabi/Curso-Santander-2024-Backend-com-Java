## Desafio de Controle de Fluxo

### O que vamos fazer?

Vamos fazer um programa que pede dois números e imprime uma lista de números contando de 1 até a diferença entre esses dois números. Mas, se o primeiro número for maior que o segundo, o programa deve mostrar uma mensagem de erro.

### Como vamos fazer isso?

1. **Pedir dois números**: Primeiro, o programa vai pedir dois números para a pessoa que está usando.
2. **Calcular a diferença**: O programa vai calcular quantos números ele precisa imprimir, que é a diferença entre o segundo número e o primeiro número.
3. **Imprimir os números**: O programa vai imprimir os números de 1 até a diferença calculada.
4. **Mostrar um erro se necessário**: Se o primeiro número for maior que o segundo, o programa vai mostrar uma mensagem de erro dizendo que o segundo número deve ser maior que o primeiro.

### Como o programa vai ser feito?

Vamos criar duas partes importantes no nosso programa:

1. **Classe Contador**: Onde faremos a maior parte do trabalho.
2. **Classe ParametrosInvalidosException**: Para mostrar a mensagem de erro.

### Passo a passo do código

Vamos ver como fica o código. Primeiro, veja como fica a classe `Contador`:

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
```

Agora, vamos criar a classe `ParametrosInvalidosException`:

```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
```

### Explicando o Código

1. **Pedir os números**: Usamos `Scanner` para pedir dois números ao usuário.
2. **Chamar o método contar**: Chamamos o método `contar` passando os dois números.
3. **Verificar os parâmetros**: Dentro do método `contar`, verificamos se o primeiro número é maior que o segundo. Se for, lançamos uma exceção (`ParametrosInvalidosException`).
4. **Imprimir os números**: Se os números estiverem corretos, calculamos a diferença entre eles e usamos um laço (`for`) para imprimir cada número, começando de 1 até a diferença calculada.

### Conclusão

Pronto! Agora temos um programa que pede dois números, imprime uma série de números incrementados e mostra uma mensagem de erro se o primeiro número for maior que o segundo. Este é um ótimo jeito de aprender sobre controle de fluxo e exceções em programação!