# Padrão Strategy: O Super Herói com Poderes

Oi! Hoje vamos aprender sobre o padrão de projeto Strategy usando Java. Vamos fazer isso de uma forma bem divertida e fácil de entender!

## O que é Strategy?

O padrão Strategy permite que um objeto possa mudar seu comportamento em tempo de execução. É como se você fosse um super herói que pode trocar de poder quando quiser!

## Por que usar Strategy?

Usamos o padrão Strategy quando queremos que um objeto tenha comportamentos diferentes que podem ser alterados dinamicamente. Isso é útil para coisas como personagens de jogo com habilidades diferentes ou, no nosso caso, um super herói com poderes que podem ser trocados.

## Vamos praticar?

Vamos criar um super herói que pode usar diferentes poderes. Isso significa que podemos trocar o poder do herói a qualquer momento.

### Passo 1: Crie a Interface de Poder

Primeiro, vamos criar uma interface `Poder` que define o método `usarPoder`.

```java
public interface Poder {
    void usarPoder();
}
```

### Passo 2: Crie Implementações de Poder

Agora, vamos criar classes que implementam a interface `Poder` com diferentes habilidades.

```java
public class Voar implements Poder {
    public void usarPoder() {
        System.out.println("Voando pelos céus!");
    }
}

public class SuperForca implements Poder {
    public void usarPoder() {
        System.out.println("Usando super força!");
    }
}
```

### Passo 3: Crie a Classe do Super Herói

Vamos criar a classe `SuperHeroi` que pode usar diferentes poderes.

```java
public class SuperHeroi {
    private Poder poderAtual;

    // Define o poder atual do herói
    public void setPoder(Poder poder) {
        this.poderAtual = poder;
    }

    // Usa o poder atual do herói
    public void usarPoder() {
        if (poderAtual != null) {
            poderAtual.usarPoder();
        } else {
            System.out.println("Nenhum poder definido!");
        }
    }
}
```

### Passo 4: Teste a Classe do Super Herói

Agora, vamos criar uma classe de teste para usar o super herói com diferentes poderes.

```java
public class TesteStrategy {
    public static void main(String[] args) {
        SuperHeroi heroi = new SuperHeroi();

        // Define o poder de voar e usa o poder
        heroi.setPoder(new Voar());
        heroi.usarPoder();

        // Define o poder de super força e usa o poder
        heroi.setPoder(new SuperForca());
        heroi.usarPoder();
    }
}
```

### O que esperamos ver?

Quando você executar a classe `TesteStrategy`, você verá que o herói usa o poder de voar primeiro e depois o poder de super força. Isso mostra que podemos trocar os poderes do herói dinamicamente.

## Conclusão

Viu como é fácil entender o padrão Strategy? Ele nos ajuda a criar objetos que podem mudar seu comportamento em tempo de execução, assim como um super herói que pode trocar de poder. Agora você já sabe como usar Strategy em seus projetos Java!

Feliz programação! 😊