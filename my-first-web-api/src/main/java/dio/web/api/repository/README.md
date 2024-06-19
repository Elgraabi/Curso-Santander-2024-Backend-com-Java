# Bem-vindo ao Repositório de Usuários

## Olá! Vamos aprender sobre outra parte importante do nosso projeto: a classe `UsuarioRepository`. Esta classe é como o lugar onde guardamos todas as fichas dos personagens (usuários) do nosso jogo!

### O que é a classe UsuarioRepository?

A classe `UsuarioRepository` é onde armazenamos, buscamos, atualizamos e deletamos as informações dos nossos usuários. Pense nela como uma caixa mágica onde você pode guardar e procurar qualquer ficha de usuário.

### O que a classe UsuarioRepository faz?

1. **Salvar um usuário**
2. **Ver todos os usuários**
3. **Ver um usuário pelo ID**
4. **Ver um usuário pelo nome**
5. **Atualizar um usuário**
6. **Deletar um usuário pelo ID**

### Vamos ver como funciona!

---

## Atributos (ou o que a classe tem)

1. **Lista de Usuários**

   Uma lista que guarda todos os usuários.

   ```java
   private List<Usuario> usuarios = new ArrayList<>();
   ```

2. **ID Atual**

   Um número que usamos para dar um ID único para cada novo usuário.

   ```java
   private int currentId = 1;
   ```

---

## Métodos (ou o que a classe pode fazer)

1. **Salvar um usuário**

   Este método adiciona um novo usuário à lista. Se o usuário não tiver um ID, ele cria um novo ID para ele.

   ```java
   public Usuario save(Usuario usuario) {
       if (usuario.getId() == null) {
           usuario.setId(currentId++);
       }
       usuarios.add(usuario);
       return usuario;
   }
   ```

2. **Ver todos os usuários**

   Este método retorna todos os usuários da lista. Imagine que ele te mostra todas as fichas de personagens que temos.

   ```java
   public List<Usuario> findAll() {
       usuarios.add(new Usuario(1, "gabriel", "password"));
       usuarios.add(new Usuario(2, "teste1", "masterpass"));
       return new ArrayList<>(usuarios);
   }
   ```

3. **Ver um usuário pelo ID**

   Este método busca um usuário pelo seu ID. É como procurar uma ficha pelo número de identidade.

   ```java
   public Optional<Usuario> findById(int id) {
       return usuarios.stream().filter(usuario -> usuario.getId() == id).findFirst();
   }
   ```

4. **Ver um usuário pelo nome**

   Este método busca um usuário pelo nome de login.

   ```java
   public Usuario findByIdUsuarioNome(String username) {
       System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
       return new Usuario("gabriel", "password");
   }
   ```

5. **Atualizar um usuário**

   Este método atualiza as informações de um usuário existente.

   ```java
   public Optional<Usuario> update(int id, Usuario updatedUsuario) {
       Optional<Usuario> optionalUsuario = findById(id);

       if (optionalUsuario.isPresent()) {
           Usuario usuario = optionalUsuario.get();
           usuario.setLogin(updatedUsuario.getLogin());
           usuario.setPassword(updatedUsuario.getPassword());
           return Optional.of(usuario);
       }

       return Optional.empty();
   }
   ```

6. **Deletar um usuário pelo ID**

   Este método remove um usuário da lista pelo seu ID. É como tirar uma ficha da caixa.

   ```java
   public boolean deleteById(int id) {
       return usuarios.removeIf(usuario -> usuario.getId() == id);
   }
   ```

---

### Pronto! Agora você sabe tudo sobre a classe UsuarioRepository!

Se tiver alguma dúvida, é só perguntar! Divirta-se aprendendo!
```

### Explicação

- **Introdução amigável**: A linguagem é simples e direta, adequada para crianças.
- **Estrutura clara**: O conteúdo é dividido em seções claras, cada uma explicando uma parte da classe `UsuarioRepository`.
- **Explicações curtas e diretas**: Cada método é explicado de forma breve e com exemplos práticos.
- **Formato Markdown**: Utilizei cabeçalhos, listas e blocos de código para organizar o conteúdo de maneira que fique visualmente agradável no GitHub.

Espero que isso torne a classe `UsuarioRepository` mais fácil de entender e divertida de aprender!