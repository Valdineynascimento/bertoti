<html>
<body>
    
  <h1 align="center"> API 3º Semestre - 02/2021</h1>
    <a href="https://github.com/equipe-tetris/scrum-cloud-frontend"><img src="https://img.shields.io/badge/GitHub-Repositório Projeto-181717?style=for-the-badge&logo=github"></a>

  <h2> Parceiro Acadêmico: <a href="https://www.iacit.com.br/">Iacit</a></h2>
  
  <h2 style="font-family:roboto;"> Resumo do Projeto :clipboard:</h2>
  
  <p align="justify" style="font-family:roboto;"> A aplicação web desenvovida permite que equipes remotas de desenvolvimento realizarem as cerimônias de Planning e Retrospective aplicadas na metodologia SCRUM.

  A aplicação permiti o cadastro de membros de equipes, agendamento e realização (real-time) de reuniões com configuração de métricas customizáveis e exportação dos resumos para os integrantes das mesmas.</p>
  
  <h2 style="font-family:roboto;"> Tecnologias Adotadas :computer:</h2>
   
  <ul>
  <li><a href="https://www.java.com/pt_BR/">Java</a>:
    <p align="justify" style="font-family:roboto;"> Linguagem de programação utilizada para o desenvolvimento Back-End do sistema, apresenta como principais características: Portabilidade, Robustez, Segurança, Orientação a Objetos, Dinâmica e Alto Desempenho. Foi um requisito técnico solicitado pelo cliente.</p></li>

  <li><a href="https://spring.io/">Spring Boot</a>:
    <p align="justify" style="font-family:roboto;"> É um framework open source para Java, aplicado para facilitar a configuração e gerenciamento das dependências do projeto. Logo melhorando a produtividade e agilidade no processo de desenvolvimnto da aplicação.</p></li>
  

  <li><a href="https://www.mysql.com/">MySQL</a>:
    <p align="justify" style="font-family:roboto;"> Sistema de gerenciamento de banco de dados utilizado para criação e manipulação de bases de dados, onde eram armazenadas as informações do software.</p></li>

  <li><a href="https://trello.com">Trello</a>:
    <p align="justify" style="font-family:roboto;"> Foi utilizado como ferramenta do método Scrum para distribuição das atividades do grupo e priorização das demandas. Possibilitando realizar o planejamento das sprints, sendo capaz de registrar o progresso da equipe e do projeto, facilitando o desenvolvimento e acompanhamento da realização de tarefas. </p></li>

  </ul>
  
  <h2 style="font-family:roboto;"> Contribuições :dart:</h2>
  
  <h3> Atribuições como Desenvolvedor Back-end</h3>
  <p align="justify" style="font-family:roboto;"> Como Desenvolvedor Back-End, as atribuições foram relacionadas com o Modelo Entidade Relacionamento(MER), Modelo lógico e acompanhei a elaboração de toda a lógica do sistema web planejado, tendo em vista as regras de negócio propostas pelo cliente. Com a criação dos Endpoints utilizados na interação com o Front-End, foi obtida uma solução completa com todas as funcionalidades necessárias.</p>
  
  <p align="justify" style="font-family:roboto;"> O primeiro passo foi a configuração do ambiente Java, para a qual, foi utilizado o <a href="https://start.spring.io/">Sprint Initializr</a> para estruturar o projeto com Spring Boot 2.5.4, Java 11 e Maven. Logo, adicionamos todas as dependências necessárias no arquivo POM.xml, sendo as mais importantes: o driver de conexão com o Banco de Dados MySQL (mysql-connector-java), o JPA (spring-boot-starter-data-jpa), o Spring Boot Starter Web (spring-boot-starter-web) e o Spring Boot Starter Websocket (spring-boot-starter-websocket).</p>
  
  <p align="justify" style="font-family:roboto;"> Com isso finalizado e versionado no GitHub, focamos em decidir a Arquitetura e padrões de projetos que implementaríamos. Logo, optamos pela arquitetura Modelo-Visão-Controle (MVC), em que separamos o sistema em componentes interligados que são essenciais para uma melhora na conexão entre as camadas de dados, lógica de negócio e iteração com o usuário.</p>
  <details>
  <summary>Clique aqui para visualizar a Lógica Arquitetural MVC</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/Valdineynascimento/bertoti/tree/main/Metodologia/Imagens/DiagramaArq.png" width="500px;" alt=""/>
  </details>
  
  <ul>
  <li> Model: são representações das tabelas do Banco de Dados MySQL. Resultando em uma melhor validação dos dados e facilitação com consultas, inserções e atualizações na Database;
  </li>
    
  <li> Repositories: são interfaces que tem como função serem camadas de acesso a dados. Eles extendem o JpaRepository, portanto há um melhor e mais fácil acesso aos métodos de manipulação dos dados na Database. Além de permitirem realizar comandos SQL customizados de acordo com a necessidade da funcionalidade;
  </li>
    
  <li> Services: são classes que concentram os métodos do Repository, visto que tem essa interface injetada com a anotação @Autowired. Sendo adicionados neles a lógica essencial para regra de negócio imposta pelo cliente, além de contribuirem muito para organização dos métodos utilizados pela interface;
  </li>
    
  <li> Controllers: são as classes onde se encontram os Endpoints do Back-End que serão utilizados para interação com o Front-End, isso corre pela chamada de rotas presentes em seus métodos, pela anotação @RequestMapping("/rota-exemplo"). Ademais, contém os Services necessários injetados com a anotação @Autowired e utiliza das chamadas dos métodos dessas classes para realização da lógica desenvolvida.
  </li>
  </ul>
  
  <p align="justify" style="font-family:roboto;"> Foi implementado o padrão de projeto Proxy, uma vez que controlamos o acesso aos objetos nas requisições com as anotações do Spring Boot. Aplicado nos Repositories do sistema, no qual é uma interface que simplifica as funcionalidades das classes da Java Persistence API (JPA).</p>
  <details>
  <summary>Clique aqui para visualizar o Padrão de Projeto Proxy</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/Valdineynascimento/bertoti/tree/main/Metodologia/Imagens/PadraoProxy.png" width="800px;" alt=""/>
  </details>
  
  <p align="justify" style="font-family:roboto;"> A seguir, foram configuradas as Properties, para as quais foram aplicadas a conexão com a Base de Dados MySQL. Declaramos a versão da linguagem do Banco (org.hibernate.dialect.MySQL5InnoDBDialect).</p>
  <details>
  <summary>Clique aqui para visualizar as Properties</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/Valdineynascimento/bertoti/tree/main/Metodologia/Imagens/PropertiesAPI3.png" width="800px;" alt=""/>
  </details>
  
   
  
  <h2 style="font-family:roboto;"> Funcionamento :bulb:</h2>

   <div align="center">
     <video src="https://www.youtube.com/watch?v=kBIUHRlL-Q8&t=3s" controls="controls" style="max-rate: 730px;">
     </video>    
   </div>

  <h2 style="font-family:roboto;"> Aprendizados Efetivos :book:</h2>   
  <h3 align="center"> Hard Skills </h3>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Metodologia Scrum</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Java</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>Spring Boot</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>MySQL</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
     <tr>
      <td>GIT</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
  </table>
  
  <h3 align="center">Soft Skills</h3>
  <table align="center">
    <tr>
      <th width="300px">Habilidade</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Proatividade</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>Visão de Negócio</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>Organização</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>Planejamento</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
  </table>
    
---

 <h2 align="center"> Navegação Projetos :link:</h2>
 
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/Valdineynascimento/bertoti/blob/main/Metodologia/API_1.md"> 1º Semestre: Vai de Van - App que visa facilitar a comunicação e organização de viagens entre motoristas de vans escolares e seus usuários.</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/Valdineynascimento/bertoti/blob/main/Metodologia/API_2.md"> 2º Semestre: ConsultCAR - É uma aplicação criada com intuito de facilitar a descompactação, armazenamento e visualização de dados obtidos do Sistema Nacional de Cadastro ambiental Rural (SICAR).</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/Valdineynascimento/bertoti/blob/main/Metodologia/API_3.md"> 3° Semestre: ScrumCloud - É uma Aplicação Web que permite a realização das cerimônias de Planning e Retrospective, utilizadas na metodologia SCRUM, remotamente às equipes onde seus integrantes estão geograficamente distantes.</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/Valdineynascimento/bertoti/blob/main/Metodologia/API_4.md"> 4° Semestre: Hey Alexia - É uma ferramenta desenvolvida para importação de Dados através de arquivo CSV, e com intuito de auxiliar a Gestão na tomada de decisão.</a></li></p>
   <p align="justify" style="font-family:roboto;"><li><a href="https://github.com/Valdineynascimento/bertoti/blob/main/Metodologia/README.md"> Voltar para página inicial</a></li></p>

</body>
</html>
