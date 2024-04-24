# `🏯 Localizador de Museus`

O propósito primordial deste projeto é desenvolver e disponibilizar uma API Rest. Esta API permitirá que os usuários registrem e acessem informações sobre museus em todo o mundo, 
baseando-se em sua localização geográfica. Dessa forma, independentemente de onde estiverem, os usuários terão a capacidade de verificar a existência de algum museu nas 
proximidades e obter detalhes sobre seu funcionamento.

<details>
   <summary><strong>📝 Habilidades trabalhadas</strong></summary>
  
- Criar classes de controle e suas rotas usando Spring
- Criar classes de serviço usando Spring
- Utilizar injeção de dependências
- Trabalhar com exceções customizadas
- Tratar exceções da API através de gerenciadores de erros
- Criar uma configuração Docker para a aplicação
</details>

<details>
   <summary><strong>🤔 Como executar o projeto? </strong></summary>
  1. Faça o clone do projeto
  
   - Use o comando: `git@github.com:car0l15/localizador-de-museus.git`
   - Entre na pasta do repositório que você acabou de clonar:
2. Instale as dependencias

    - `mvn install -DskipTests`

  3.  Starte a aplicação digitando o comando no terminal:
     - `mvn spring-boot:run`
  
</details>
<details>
   
<summary><strong>🎛 Checkstyle</strong></summary>

Para assegurar a qualidade do código, foi utilizado o Checkstyle neste projeto. Isso garante que o código esteja alinhado com as boas práticas de desenvolvimento, tornando-o mais legível e fácil de manter! Para executar o Checkstyle:

```bash
mvn checkstyle:check
```

</details>

<details>
<summary><strong>🛠 Testes</strong></summary>

Para executar todos os testes basta rodar o comando:
```bash
mvn test
```

Para executar apenas uma classe de testes:
```bash
mvn test -Dtest="TestClassName"
```

</details>

<details>
   <summary><strong> 🛣️ Rotas da API </strong></summary>
  
</details>
