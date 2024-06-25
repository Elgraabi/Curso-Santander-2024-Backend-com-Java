### Explicando a Classe `ItemPedido`

O `ItemPedido` é como cada comida ou bebida que alguém pede no nosso restaurante de brincadeira. Vamos ver como isso funciona!

#### O que o `ItemPedido` tem?

1. **Nome da Comida**:
   - É aqui que escrevemos o nome da comida ou bebida que alguém quer. Por exemplo, "hambúrguer", "suco de laranja", etc.

2. **Preço**:
   - É quanto custa cada comida ou bebida. Assim sabemos quanto vamos pagar por cada coisa gostosa que a gente pede.

3. **Quantidade**:
   - Quantos desses itens a pessoa pediu. Por exemplo, se queremos dois hambúrgueres, é aqui que escrevemos "2".

```java
public class ItemPedido {
    private String nome;
    private double preco;
    private int quantidade;
    
    // Aqui poderiamos ter métodos para acessar e modificar essas informações, como getters e setters.
}
```

### Explicando a Classe `Pedido`

Agora vamos falar sobre a classe `Pedido`, que é como a lista de tudo que a gente pediu no restaurante!

#### O que o `Pedido` tem?

1. **Número do Pedido**:
   - É como um código especial que identifica cada pedido que a gente faz. Cada pedido tem um número só dele.

2. **Itens do Pedido**:
   - É uma lista de `ItemPedido`. Aqui a gente guarda todas as comidas e bebidas que a pessoa pediu. Por exemplo, se no pedido tem um hambúrguer e um suco, a lista vai ter esses dois itens.

```java
public class Pedido {
    private int numero;
    private List<ItemPedido> itens;
    
    // Aqui poderiamos ter métodos para adicionar itens ao pedido, remover itens, consultar o pedido, etc.
}
```

#### Conclusão

Então, o `ItemPedido` é cada comida ou bebida que a gente pede separadamente, com nome, preço e quantidade. E o `Pedido` é como a lista que guarda todos os itens que a gente pediu, com um número único para cada pedido.
