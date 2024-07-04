# Pacote `domain`

Bem-vindo ao pacote `domain`! Aqui é onde guardamos todas as informações importantes sobre os nossos usuários e suas coisas. Vamos conhecer as classes desse pacote!

## 1. `User`

O `User` é como o cartão de biblioteca de uma pessoa. Ele guarda todas as informações sobre essa pessoa.

- **ID**: O número especial do usuário.
- **Nome**: O nome da pessoa.
- **Conta**: A conta bancária da pessoa.
- **Cartão**: O cartão de crédito da pessoa.
- **Recursos**: Lista de coisas legais que a pessoa tem.
- **Notícias**: Lista de notícias que a pessoa recebe.

## 2. `Account`

A `Account` é como a conta bancária da pessoa.

- **ID**: O número especial da conta.
- **Número**: O número da conta.
- **Agência**: A agência bancária da conta.
- **Saldo**: Quanto dinheiro a pessoa tem na conta.
- **Limite Adicional**: Um valor extra que a pessoa pode gastar.

## 3. `Card`

O `Card` é como o cartão de crédito da pessoa.

- **ID**: O número especial do cartão.
- **Número**: O número do cartão.
- **Limite Disponível**: Quanto a pessoa ainda pode gastar com o cartão.

## 4. `Feature`

Uma `Feature` é como uma coisa legal que a pessoa tem.

- **ID**: O número especial da coisa.
- **Ícone**: Uma imagem que representa a coisa.
- **Descrição**: O que é essa coisa.

## 5. `News`

A `News` é como uma notícia que a pessoa recebe.

- **ID**: O número especial da notícia.
- **Ícone**: Uma imagem que representa a notícia.
- **Descrição**: O que é essa notícia.

## 6. `BaseItem`

O `BaseItem` é como um modelo que `Feature` e `News` seguem. Ele tem coisas em comum que são usadas por ambas as classes.

- **ID**: O número especial do item.
- **Ícone**: Uma imagem que representa o item.
- **Descrição**: O que é esse item.

---

## Exemplo Simples

Vamos ver um exemplo simples de como essas classes funcionam juntas:

1. **Criar um Usuário**
   - Criamos um `User` com um `Account` e um `Card`.
   - Adicionamos algumas `Feature`s e `News` ao `User`.

2. **Consultar Saldo**
   - Olhamos o `Account` do `User` para ver quanto dinheiro ele tem.

3. **Consultar Limite do Cartão**
   - Olhamos o `Card` do `User` para ver quanto ele ainda pode gastar.

Agora você sabe como guardamos e organizamos todas as informações importantes sobre os nossos usuários e suas coisas.
