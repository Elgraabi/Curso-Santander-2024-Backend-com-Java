# Pacote `service`

Bem-vindo ao pacote `service`! Aqui é onde colocamos a lógica do nosso programa, ou seja, como ele funciona por dentro. Vamos conhecer as classes e interfaces desse pacote!

## 1. `UserService`

O `UserService` é uma interface que diz o que podemos fazer com os usuários. É como uma lista de coisas que o nosso programa sabe fazer com os usuários.

- **Encontrar Usuário por ID**: Encontrar um usuário usando seu número especial (ID).
- **Criar Novo Usuário**: Adicionar um novo usuário ao nosso sistema.

## 2. `UserServiceImpl`

O `UserServiceImpl` é uma implementação do `UserService`. Isso significa que ele realmente faz as coisas que o `UserService` diz que podemos fazer. É como um ajudante que sabe como realizar as tarefas.

- **Encontrar Usuário por ID**:
  - Procura o usuário no banco de dados usando o ID.
  - Se não encontrar, avisa que o usuário não foi encontrado.

- **Criar Novo Usuário**:
  - Verifica se já existe um usuário com o mesmo número de conta.
  - Se já existir, avisa que essa conta já existe.
  - Caso contrário, adiciona o novo usuário ao banco de dados.

---

## Exemplo Simples

Vamos ver um exemplo simples de como essas classes funcionam juntas:

1. **Adicionar um Novo Usuário**
   - O `UserServiceImpl` verifica se já existe um usuário com o mesmo número de conta.
   - Se não existir, ele adiciona o novo usuário ao banco de dados.

2. **Encontrar um Usuário por ID**
   - O `UserServiceImpl` procura o usuário no banco de dados usando o ID fornecido.
   - Se encontrar, ele retorna as informações do usuário.
   - Se não encontrar, ele avisa que o usuário não foi encontrado.

Pronto! Agora você sabe como nosso programa organiza e realiza as tarefas relacionadas aos usuários usando o pacote `service`.
