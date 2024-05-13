# Métodos em Java

Em Java, os métodos são blocos de código que realizam uma tarefa específica e podem ser chamados/executados a partir de outras partes do programa. Eles são essenciais para a modularização e organização do código. Vamos aprender sobre a sintaxe de declaração de métodos em Java e como chamá-los.

## Declaração de Métodos

A declaração de um método em Java segue a seguinte estrutura:

```java
[modificadores] tipoRetorno nomeDoMetodo(parâmetros) {
    // Corpo do método
    // Código para realizar uma tarefa
    return valor; // (opcional) Retorna um valor, se o método tiver um tipo de retorno
}
```

- **Modificadores:** São opcionais e especificam a visibilidade e outras propriedades do método (por exemplo: `public`, `private`, `static`, etc.).
- **tipoRetorno:** Especifica o tipo de dado que o método retorna. Se o método não retornar nenhum valor, use `void`.
- **nomeDoMetodo:** O nome do método, que o identifica.
- **parâmetros:** São os dados que o método recebe para realizar sua tarefa. Pode ser vazio se o método não requerer nenhum parâmetro.
- **Corpo do Método:** Contém as instruções que definem a funcionalidade do método.
- **return:** Retorna um valor do tipo especificado em `tipoRetorno`. Este é opcional e pode ser omitido se o método não retornar nenhum valor.

## Exemplo de Declaração de Método

Aqui está um exemplo de declaração de método que calcula a soma de dois números:

```java
public class MinhaClasse {
    public static int somar(int a, int b) {
        return a + b;
    }
}
```

Neste exemplo:
- O método `somar` é declarado como público (`public`) e estático (`static`).
- Ele recebe dois parâmetros do tipo `int`.
- O tipo de retorno é `int`, indicando que o método retorna um valor inteiro.
- No corpo do método, a soma dos dois parâmetros é calculada e retornada.

## Chamando Métodos

Os métodos podem ser chamados a partir de outras partes do programa, fornecendo os argumentos necessários, se houver. Aqui está como você pode chamar o método `somar` definido acima:

```java
public class Teste {
    public static void main(String[] args) {
        int resultado = MinhaClasse.somar(5, 3);
        System.out.println("O resultado da soma é: " + resultado);
    }
}
```

Neste exemplo:
- Chamamos o método `somar` da classe `MinhaClasse`, passando os números 5 e 3 como argumentos.
- O resultado retornado pelo método é armazenado na variável `resultado`.
- Finalmente, exibimos o resultado na tela usando `System.out.println`.

Agora que você entende a sintaxe básica de declaração e chamada de métodos em Java, você pode começar a criar métodos para realizar várias tarefas em seus programas Java. Experimente e pratique para se familiarizar com o conceito de métodos.