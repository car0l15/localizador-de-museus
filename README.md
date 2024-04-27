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

   1 - GET/museums
   
   Esta rota retornará todos os museus já cadastrados. Para acessá-la, você pode usar um navegador ou uma ferramenta como o curl ou Postman.
   Exemplo: http://localhost:8080/museums

   2 - GET/museums/{id}
   
   Nesta rota você deve especificar um id e assim a rota retornará este museu especifico, caso o id não exista você receberá uma mensagem de `Museu não encontrado!`<br>Para acessá-la, você pode usar um navegador ou uma ferramenta como o curl ou Postman.<br>Exemplo: http://localhost:8080/museums/1

   3 - GET/museums/closest

   Esta rota tem o objetivo de trazer os museus mais próximos conforme geolocalização. Nesta rota você deve passar os parâmetros lat, que representa a latitude; lng, que representa a longitude e max_dist_km que representa a distância máxima que um museu pode estar da localização passada. Caso nenhum museu próximo a localização passada seja encontrado, você receberá a mensagem `Museu não encontrado!` ou se a coordenada passada não estiver correta, você receberá a mensagem `Coordenada inválida!`<br>Para acessá-la, você pode usar um navegador ou uma ferramenta como o curl ou Postman. <br>Exemplo: localhost:8080/museums/closest?lat=-19.916954564336&max_dist_km=115&lng=-43.93222222222

   4 - POST/museums

   Esta é uma rota POST, seu objetivo é cadastrar novos museus. Para isso você precisa passar as informações do museus conforme exemplo abaixo.<br>exemplo rota: localhost:8080/museums
   <br>
   <br>
   Exemplo do body da requisição: 
   {<br>
    "name": "Museu de Arte Moderna Brasileira",<br>
    "description": "museu que exibe obras modernas brasileiras",<br>
    "address": "Avenida Brasil, número 189",<br>
    "collectionType": "Não informada",<br>
    "subject": "Arte moderna brasileira",<br>
    "url": "www.museudearte.com.br",<br>
    "coordinate": {<br>
        "latitude": -19.9169517003212,<br>
        "longitude": -43.9334705471934<br>
    }
}

   5 - DELETE/museums/{id}

   Esta é uma rota que tem como objetivo deletar museus da lista de museus desta aplicação. Para isso é necessário que passe o id do museu que você gostaria de deletar.
   Para acessá-la, você pode usar um navegador ou uma ferramenta como o curl ou Postman. <br> Exemplo:Exemplo: http://localhost:8080/museums/3770
   
  
</details>
