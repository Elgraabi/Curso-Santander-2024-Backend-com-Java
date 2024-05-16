# Fundamentos da Programação Orientada a Objetos com Java

Neste guia, vamos abordar os fundamentos da Programação Orientada a Objetos (POO) com Java. Vamos cobrir os conceitos básicos de POO, pacotes e visibilidade de recursos, classes e construtores, Java Beans, UML (Unified Modeling Language), princípios de POO, enumerações e interfaces.

## 1. Conceitos de POO

A POO é um paradigma de programação que se baseia no conceito de "objetos". Um objeto é uma instância de uma classe que possui atributos (variáveis) e métodos (funções). Os conceitos fundamentais de POO incluem:

- **Encapsulamento**: Esconder os detalhes de implementação de um objeto e expor apenas a interface.
- **Herança**: Permitir que uma classe herde atributos e métodos de outra classe.
- **Polimorfismo**: A capacidade de um objeto de se comportar de várias maneiras, dependendo do contexto.

## 2. Pacotes e Visibilidade de Recursos

Em Java, os pacotes são usados para organizar classes relacionadas. A visibilidade de recursos determina quem pode acessar esses recursos (métodos e variáveis). Existem quatro níveis de visibilidade em Java:

- **public**: Acesso irrestrito.
- **protected**: Acesso dentro do pacote e por subclasses.
- **default (ou package-private)**: Acesso apenas dentro do mesmo pacote.
- **private**: Acesso apenas dentro da própria classe.

## 3. Classes e Construtores

Uma classe em Java é um modelo para criar objetos. Ela define os atributos e métodos que os objetos desse tipo terão. Um construtor é um método especial usado para inicializar objetos. Exemplo de uma classe simples em Java:

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
```

## 4. Java Beans e UML

Java Beans são classes Java que seguem certas convenções, como ter um construtor sem argumentos e fornecer métodos de acesso (getters e setters) para seus atributos. UML é uma linguagem de modelagem usada para visualizar e documentar sistemas de software. Diagramas de classes UML representam a estrutura de uma classe.

## 5. Pilares do POO

Os pilares do POO são os princípios fundamentais que orientam o design de software orientado a objetos. Eles incluem:

- **Abstração**: O processo de esconder detalhes de implementação e mostrar apenas a funcionalidade relevante.
- **Encapsulamento**: Como mencionado anteriormente, esconder os detalhes de implementação de um objeto.
- **Herança**: Permitir que uma classe herde atributos e métodos de outra classe.
- **Polimorfismo**: A capacidade de um objeto de se comportar de várias maneiras, dependendo do contexto.

## 6. Enum e Interfaces

- **Enum**: Uma enumeração é um tipo de dados que consiste em um conjunto de constantes nomeadas. Em Java, é declarado usando a palavra-chave `enum`.
- **Interfaces**: Uma interface em Java é como um contrato que uma classe pode optar por implementar. Ela define métodos que a classe deve fornecer, mas não fornece a implementação desses métodos.

Espero que este guia forneça uma base sólida para entender os fundamentos da Programação Orientada a Objetos com Java. Se tiver alguma dúvida específica ou precisar de mais exemplos, não hesite em perguntar!