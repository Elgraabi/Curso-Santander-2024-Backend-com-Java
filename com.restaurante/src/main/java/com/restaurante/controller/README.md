### Explicando o `PedidoController`

Imagine que o `PedidoController` é como o diretor do nosso restaurante de brincadeira. Ele é responsável por receber as ordens das pessoas que querem pedir comida e organizar tudo direitinho para que o sistema entenda o que fazer.

#### Funções Importantes do `PedidoController`:

1. **Criar um Pedido Novo**

   Quando alguém chega no nosso restaurante e quer fazer um pedido, o `PedidoController` cria um novo número para esse pedido. É como se ele dissesse "Esse é o número do seu pedido, para a gente não se perder!".

   ```java
   public Pedido criarPedido(int numero) {
       Pedido novoPedido = new Pedido(numero); // Cria um novo pedido com o número fornecido
       // Aqui poderíamos fazer mais coisas, como salvar o pedido em um lugar especial
       return novoPedido; // Retorna o pedido que acabamos de criar
   }
   ```

2. **Adicionar Comida ao Pedido**

   Quando alguém decide o que quer comer, como um hambúrguer ou um suco, o `PedidoController` adiciona essa comida ao pedido da pessoa. É como se ele escrevesse numa lista tudo o que a pessoa quer comer.

   ```java
   public void adicionarItem(Pedido pedido, ItemPedido item) {
       pedido.adicionarItem(item); // Adiciona o item (comida) ao pedido que já existe
       // Aqui poderíamos fazer mais coisas, como calcular o valor total do pedido
   }
   ```

3. **Remover Comida do Pedido**

   Às vezes, as pessoas mudam de ideia e não querem mais uma comida que pediram. Então, o `PedidoController` remove essa comida do pedido. É como se ele apagasse da lista o que a pessoa não quer mais.

   ```java
   public void removerItem(Pedido pedido, String nomeItem) {
       pedido.removerItem(nomeItem); // Remove o item (comida) do pedido
       // Aqui poderíamos fazer mais coisas, como ajustar o valor total do pedido
   }
   ```

4. **Consultar o Pedido**

   Depois que o pedido está pronto, o `PedidoController` mostra para a gente o que está no pedido. É como se ele mostrasse a lista completa de tudo o que a pessoa vai comer.

   ```java
   public List<ItemPedido> consultarPedido(Pedido pedido) {
       return pedido.getItens(); // Retorna a lista de itens (comidas) que estão no pedido
   }
   ```

#### Conclusão

Então, o `PedidoController` é como o chefe do nosso restaurante imaginário. Ele escuta o que as pessoas querem comer, anota tudo direitinho, adiciona ou remove comidas do pedido conforme necessário e mostra para a gente o que vai ser servido. Assim, todos no restaurante sabem o que fazer e ninguém fica confuso!

Espero que essa explicação tenha sido útil e fácil de entender! Assim você pode imaginar como funciona esse projeto de Sistema de Gerenciamento de Pedidos de uma maneira divertida!