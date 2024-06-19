# Bem-vindo à Minha API Web Spring Boot

## Olá! Este é um projeto simples que usamos para aprender como criar uma API (uma espécie de aplicativo que conversa com outros aplicativos) usando uma ferramenta chamada Spring Boot. Vou te mostrar como tudo funciona!

### O que temos aqui?

1. **Usuários (UsuarioController)**
2. **Boas-vindas (WelcomeController)**

### Vamos ver cada parte!

---

## 1. Usuários (UsuarioController)

Esta parte cuida dos nossos usuários. Usuários são como os personagens do nosso aplicativo. Eles têm nomes, logins e senhas.

### O que podemos fazer com os usuários?

- **Ver todos os usuários**
- **Ver um usuário pelo nome**
- **Deletar um usuário pelo ID**

### Como fazemos isso?

1. **Ver todos os usuários**

   Imagine que temos uma lista de todos os usuários. Quando você chama `/users`, você vê todos eles!

   ```java
   @GetMapping("/users")
   public List<Usuario> getUsers() {
       return repository.findAll();
   }


2. **Ver um usuário pelo nome**

   Se você quiser ver apenas um usuário pelo nome, é só chamar `/users/{username}`. Por exemplo, se o nome do usuário for "João", você chama `/users/João`.

   ```java
   @GetMapping("/users/{username}")
   public Usuario getOne(@PathVariable("username") String username) {
       return repository.findByIdUsuarioNome(username);
   }
   ```

3. **Deletar um usuário pelo ID**

   Se precisar deletar (remover) um usuário, você usa o ID dele. É só chamar `/user/{id}`. Por exemplo, se o ID for 1, você chama `/user/1`.

   ```java
   @DeleteMapping("/user/{id}")
   public void delete(@PathVariable("id") Integer id) {
       repository.deleteById(id);
   }
   ```

---

## 2. Boas-vindas (WelcomeController)

Esta parte é bem simples. Quando você visita a página principal, ela diz "Welcome to My Springboot Web API". Isso é uma mensagem de boas-vindas!

### Como fazemos isso?

1. **Mostrar mensagem de boas-vindas**

   ```java
   @GetMapping
   private String welcome() {
       return "Welcome to My Springboot Web API";
   }
   ```

---

### Pronto! Agora você sabe como funciona a nossa API!

Se tiver alguma dúvida, é só perguntar! Divirta-se aprendendo!
```

### Explicação

- **Introdução amigável**: Usei uma linguagem simples e amigável para crianças.
- **Estrutura clara**: Dividi o conteúdo em seções claras e distintas.
- **Explicações curtas e diretas**: Cada função é explicada de forma breve e com exemplos práticos.
- **Formato Markdown**: Usei cabeçalhos, listas e blocos de código para organizar o conteúdo de maneira que fique visualmente agradável no GitHub.

Espero que isso ajude a tornar o projeto mais acessível e divertido!