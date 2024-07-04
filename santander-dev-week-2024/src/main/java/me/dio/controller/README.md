# Pacote `controller`

Bem-vindo ao pacote `controller`! Aqui é onde controlamos como as pessoas interagem com nosso programa. Vamos conhecer as classes desse pacote!

## 1. `UserController`

Imagine que você tem uma biblioteca e o `UserController` é como o bibliotecário. Ele ajuda a encontrar usuários e adicionar novos usuários à biblioteca.

- **Encontrar Usuário por ID**: Se você sabe o número especial (ID) de um usuário, você pode pedir ao bibliotecário para encontrar esse usuário.
- **Criar Novo Usuário**: Se você quiser adicionar um novo usuário, você diz ao bibliotecário quem é o novo usuário, e ele adiciona para você.

## 2. `GlobalExceptionHandler`

Às vezes, coisas inesperadas acontecem e precisamos de alguém para lidar com esses problemas. O `GlobalExceptionHandler` é como o super-herói que ajuda quando algo dá errado.

- **Problemas com Dados**: Se você der informações erradas, o super-herói avisa que há um problema com os dados.
- **Usuário Não Encontrado**: Se você pedir um usuário que não existe, o super-herói diz que não conseguiu encontrar.
- **Erros Inesperados**: Se acontecer algo realmente inesperado, o super-herói anota o que deu errado e avisa que houve um erro no servidor.

---

## Exemplo Simples

Vamos ver um exemplo simples de como esses bibliotecários e super-heróis funcionam:

1. **Adicionar um Usuário**
   - Você diz ao `UserController` quem é o novo usuário.
   - Ele adiciona o usuário e dá um número especial (ID) para ele.

2. **Encontrar um Usuário**
   - Você pede ao `UserController` para encontrar um usuário usando o ID.
   - Ele encontra e mostra as informações do usuário.

3. **Problema com o ID**
   - Se você pedir um ID que não existe, o `GlobalExceptionHandler` avisa que o usuário não foi encontrado.

Pronto! Agora você sabe como o nosso programa controla as interações com os usuários e lida com problemas.
```