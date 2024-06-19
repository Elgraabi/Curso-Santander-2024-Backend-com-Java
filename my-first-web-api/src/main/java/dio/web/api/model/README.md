
# Bem-vindo à Classe Usuario

## Olá! Vamos aprender sobre uma parte importante do nosso projeto: a classe `Usuario`. Esta classe é como uma ficha de personagem em um jogo. Cada usuário tem suas informações próprias!

### O que é a classe Usuario?

A classe `Usuario` é onde guardamos informações sobre cada usuário. Pense nela como um cartão de identidade que diz quem é o usuário, seu login e sua senha.

### O que a classe Usuario tem?

1. **ID** (identidade única de cada usuário)
2. **Login** (nome que o usuário usa para entrar no sistema)
3. **Password** (senha secreta do usuário)

### Vamos ver como funciona!

---

## Atributos (ou o que a classe tem)

1. **ID**

   O ID é como um número de identidade único para cada usuário.

   ```java
   private Integer id;
   ```

2. **Login**

   O login é o nome que o usuário usa para entrar no sistema.

   ```java
   private String login;
   ```

3. **Password**

   A senha (password) é uma palavra secreta que o usuário usa para manter sua conta segura.

   ```java
   private String password;
   ```

---

## Construtores (ou como criar um usuário)

Os construtores são como formas diferentes de criar um novo usuário. Existem três maneiras:

1. **Construtor vazio**

   Este cria um usuário vazio. É como dizer "quero um novo usuário, mas ainda não sei as informações dele".

   ```java
   public Usuario() {
   }
   ```

2. **Construtor com login e senha**

   Este cria um usuário com um login e uma senha, mas sem ID.

   ```java
   public Usuario(String login, String password) {
       this.login = login;
       this.password = password;
   }
   ```

3. **Construtor com ID, login e senha**

   Este cria um usuário com todas as informações: ID, login e senha.

   ```java
   public Usuario(Integer id, String login, String password) {
       this.id = id;
       this.login = login;
       this.password = password;
   }
   ```

---

## Métodos (ou o que a classe pode fazer)

1. **toString**

   Este método transforma o usuário em uma frase. É útil para ver as informações do usuário.

   ```java
   @Override
   public String toString() {
       return "Usuario [id=" + id + ", login=" + login + ", password=" + password + "]";
   }
   ```

2. **getId e setId**

   Estes métodos são usados para pegar (get) e definir (set) o ID do usuário.

   ```java
   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }
   ```

3. **getLogin e setLogin**

   Estes métodos são usados para pegar (get) e definir (set) o login do usuário.

   ```java
   public String getLogin() {
       return login;
   }

   public void setLogin(String login) {
       this.login = login;
   }
   ```

4. **getPassword e setPassword**

   Estes métodos são usados para pegar (get) e definir (set) a senha do usuário.

   ```java
   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }
   ```

---

### Pronto! Agora você sabe tudo sobre a classe Usuario!

Se tiver alguma dúvida, é só perguntar! Divirta-se aprendendo!
```

Espero que isso torne a classe `Usuario` mais fácil de entender e divertida de aprender!