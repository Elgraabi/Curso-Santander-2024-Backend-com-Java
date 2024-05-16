## Pacotes em Java

### 1. Pacote `controller`

O pacote `controller` geralmente contém classes que atuam como controladores em um aplicativo Java. Esses controladores são responsáveis por receber solicitações do cliente, coordenar o fluxo de dados e interagir com os serviços apropriados. Eles normalmente lidam com as operações de entrada e saída e fornecem uma interface para interagir com o sistema. Exemplo de classe em um pacote `controller`:

```java
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // Outros métodos de manipulação de usuários...
}
```

### 2. Pacote `service`

O pacote `service` contém classes que fornecem serviços ou lógica de negócios para o aplicativo. Essas classes encapsulam a lógica de processamento e manipulação de dados e são geralmente chamadas pelos controladores para realizar operações específicas. Elas podem interagir com os modelos de dados, acessar o banco de dados e executar outras tarefas relacionadas à lógica de negócios. Exemplo de classe em um pacote `service`:

```java
package com.example.service;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Outros métodos de serviço...
}
```

### 3. Pacote `model`

O pacote `model` contém classes que representam modelos de dados ou entidades no aplicativo. Essas classes geralmente correspondem a tabelas em um banco de dados relacional e contêm os atributos e métodos relacionados a essas entidades. Elas são usadas para armazenar e manipular dados em todo o aplicativo. Exemplo de classe em um pacote `model`:

```java
package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;

    // Getters e Setters...
}
```

### 4. Pacote `util`

O pacote `util` é comumente usado para armazenar classes utilitárias que fornecem métodos auxiliares ou funcionalidades genéricas que podem ser reutilizadas em todo o aplicativo. Essas classes geralmente não têm estado e consistem em métodos estáticos que realizam operações comuns. Exemplo de classe em um pacote `util`:

```java
package com.example.util;

public class StringUtil {

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Outros métodos utilitários...
}
```

### 5. Pacote `repository`

O pacote `repository` contém interfaces ou classes que são responsáveis por acessar e manipular dados persistentes, geralmente em um banco de dados. Essas classes encapsulam consultas de banco de dados e operações CRUD (Create, Read, Update, Delete) relacionadas a uma entidade específica. Elas fornecem uma camada de abstração sobre o acesso aos dados. Exemplo de interface em um pacote `repository`:

```java
package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos de consulta personalizados podem ser adicionados aqui...
}
```

Esses são exemplos comuns de como os pacotes podem ser organizados em um aplicativo Java, seguindo boas práticas de design e arquitetura de software. Cada pacote tem uma responsabilidade clara e contribui para a modularidade e manutenibilidade do código.