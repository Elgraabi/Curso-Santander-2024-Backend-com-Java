# Escopo em Java

Em Java, o escopo se refere à visibilidade e acessibilidade de variáveis e métodos em diferentes partes do código. Compreender o escopo é fundamental para escrever código claro e evitar erros de acesso não autorizado ou conflito de nomes. Vamos explorar os diferentes tipos de escopo em Java.

## Escopo de Variáveis

As variáveis em Java podem ter diferentes escopos, dependendo de onde são declaradas. Os principais tipos de escopo de variáveis são:

1. **Escopo de Bloco:**
   - As variáveis declaradas dentro de um bloco de código delimitado por chaves (`{}`) têm escopo dentro desse bloco e não são acessíveis fora dele.
   
   Exemplo:
   ```java
   public void exemploEscopo() {
       int x = 10; // Escopo dentro do método exemploEscopo
       if (x > 5) {
           int y = 20; // Escopo dentro do bloco if
           System.out.println(x + y); // Variáveis x e y são acessíveis aqui
       }
       // System.out.println(y); // Erro: y não é acessível aqui
   }
   ```

2. **Escopo de Método:**
   - Variáveis declaradas como parâmetros de um método têm escopo dentro desse método e não são acessíveis fora dele.

   Exemplo:
   ```java
   public void exemploEscopo(int x) {
       System.out.println(x); // Variável x é acessível aqui
   }
   // System.out.println(x); // Erro: x não é acessível fora do método
   ```

3. **Escopo de Classe:**
   - Variáveis de instância (não estáticas) e métodos de uma classe têm escopo em toda a classe. Elas podem ser acessadas por todos os métodos da classe.

   Exemplo:
   ```java
   public class Exemplo {
       int x = 10; // Variável de instância
       public void mostrarX() {
           System.out.println(x); // Variável x é acessível aqui
       }
       // Outros métodos da classe podem acessar a variável x
   }
   ```

4. **Escopo de Variável Local:**
   - Variáveis declaradas dentro de um método têm escopo dentro desse método e não são acessíveis fora dele.

   Exemplo:
   ```java
   public void exemploEscopo() {
       int x = 10; // Variável local ao método exemploEscopo
       System.out.println(x); // Variável x é acessível aqui
   }
   // System.out.println(x); // Erro: x não é acessível fora do método
   ```

## Escopo de Métodos

Em Java, métodos também têm escopos. Os modificadores de acesso (`public`, `private`, `protected`, ou o padrão) determinam o escopo de um método e quem pode acessá-lo.

- **public:** O método pode ser acessado por qualquer outra classe.
- **private:** O método só pode ser acessado dentro da classe onde foi definido.
- **protected:** O método pode ser acessado dentro da classe onde foi definido e em subclasses.
- **padrão (default):** O método só pode ser acessado por classes no mesmo pacote.

Exemplo:
```java
public class Exemplo {
    public void metodoPublico() {
        // Método acessível em qualquer lugar
    }

    private void metodoPrivado() {
        // Método acessível apenas dentro da classe Exemplo
    }

    protected void metodoProtegido() {
        // Método acessível dentro da classe Exemplo e em subclasses
    }

    void metodoPadrao() {
        // Método acessível apenas no mesmo pacote
    }
}
```

## Conclusão

Compreender os diferentes escopos em Java é essencial para escrever código limpo, modular e seguro. Certifique-se de declarar variáveis e métodos com o escopo apropriado para evitar problemas de acesso e garantir a coesão e encapsulamento do seu código.