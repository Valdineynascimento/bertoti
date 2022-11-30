<html>
<body>
  
  <h1 align="center"> API 4º Semestre - 02/2021</h1>
<a href="https://github.com/GabrielSG20/API4Sem2021"><img src="https://img.shields.io/badge/GitHub-Repositório Projeto-181717?style=for-the-badge&logo=github"></a>

  <h2> Parceiro Acadêmico: <a href="https://www.oracle.com/br/index.html">Oracle</a></h2>
  
  <h2 style="font-family:roboto;"> Resumo do Projeto :clipboard:</h2>
  
  <p align="justify" style="font-family:roboto;"> :calendar: <b>Hey Alexia</b> é uma parceria entre a <a href="https://www.oracle.com/br/index.html">Oracle</a> e a FATEC São José dos Campos com a finalidade de desenvolvimento de um sistema para auxiliar a Gestao na tomada de decisão através de análise de Dados da empresa de Calçados denominada Hey Alexia, com a importação de arquivos para segmentação e verificação das informações e permitir visualizar gráficos e dados referentes à estas segmentações..</p>
  <p align="justify" style="font-family:roboto;"> O Admin é quem tem o controle sobre a aprovação ou recusa de eventos no calendário, podendo priorizar os que estiverem marcados na mesma data, hora e local, além de ter acesso à relatórios sobre os eventos realizados e conseguindo cadastrar novos fornecedores (empresas terceirizadas) para apoio aos organizadores. O Usuário Organizador poderá agendar eventos nos espaços diponíveis preenchendo as informações necessárias, podendo criar uma lista de convidados adicionando os e-mails dos remententes no cadastro, além de ser capaz de visualizar os contatos dos fornecedores disponíveis. O Interno conseguirá se inscrever para eventos abertos ao público em geral ou os quais foi convidado, também tem acesso a solicitar permissão para se tornar Oraganizador, visto que é obrigatório esse usuário ter um e-mail Oracle. Já o Externo se destinará ao público em geral que deseja participar dos eventos abertos, sendo capaz de apenas visualizar o calendário e se inscrever nas palestras de seu interesse.</p>
  
  <h2 style="font-family:roboto;"> Tecnologias Adotadas :computer:</h2>
   
  <ul>
  <li><a href="https://www.java.com/pt_BR/">Java</a>:
    <p align="justify" style="font-family:roboto;"> Linguagem de programação utilizada para o desenvolvimento Back-End do sistema, apresenta como principais características: Portabilidade, Robustez, Segurança, Orientação a Objetos, Dinâmica e Alto Desempenho. Foi um requisito técnico solicitado pelo cliente.</p></li>
    
  <li><a href="https://spring.io/">Spring Boot</a>:
    <p align="justify" style="font-family:roboto;"> É um framework open source para Java, aplicado para facilitar a configuração e gerenciamento das dependências do projeto. Logo melhorando a produtividade e agilidade no processo de desenvolvimnto da aplicação.</p></li>  
  
  
  <li><a href="https://www.oracle.com/tools/downloads/sqldev-downloads.html">Oracle SQL Developer</a>:
  <p align="justify" style="font-family:roboto;"> Na parte de armazenamento de dados, foi utilizado o Oracle Database, um SGBD relacional, escolhido por atender todas as necessidades do projeto e ser uma ferramenta da empresa parceira. Para trabalhar com scripts SQL nessa Base de Dados selecionada, usamos o Oracle SQL Developer, um ambiente de desenvolvimento integrado com o Bancos de Dados Oracle.</p></li>
        
  <li><a href="https://www.figma.com/">Figma</a>:
  <p align="justify" style="font-family:roboto;"> É uma ferramenta para projetos UI com excelentes recursos de Design, Prototipagem, Colaboração, Plug-in de Sistema de Projeto, entre outros. Foi empregado pela nossa equipe para realização da metodologia Product Backlog Building (PBB) e criação das Wireframes.</p></li>          
  
  <li><a href="https://www.oracle.com/br/cloud/">Oracle Cloud</a>:
   <p align="justify" style="font-family:roboto;"> É um serviço de computação em nuvem oferecido pela Oracle Corporation. Foi usado para o deploy do Back-End e Banco de Dados Oracle do projeto.</p></li>
       
  
  
  <h2 style="font-family:roboto;"> Contribuições Individuais :dart:</h2>
  
  <h3> Atribuições como Desenvolvedor Back-end</h3>
  <p align="justify" style="font-family:roboto;"> Como Desenvolvedor Back-End, as atribuições foram relacionadas com a elaboração do Modelo Entidade Relacionamento(MER), Modelo lógico e acompanhei a construção de toda a lógica do sistema web planejado, tendo em vista as regras de negócio propostas pelo cliente. Com a criação dos Endpoints utilizados na interação com o Front-End, foi obtida uma solução completa com todas as funcionalidades necessárias.</p>
  
  <p align="justify" style="font-family:roboto;"> O primeiro passo foi a configuração do ambiente Java, para qual, foi utilizado o <a href="https://start.spring.io/">Sprint Initializr</a> para estruturar o projeto com Spring Boot 2.6.6, Java e Gradle. Logo, adicionamos todas as dependências necessárias no arquivo build.gradle, sendo as mais importantes: o driver de conexão com o Banco de Dados Oracle (ojdbc8), o JPA (spring-boot-starter-data-jpa) e o Spring Boot Starter Web (spring-boot-starter-web).</p>
  
  <p align="justify" style="font-family:roboto;"> Com isso finalizado e versionado no GitHub, focamos em decidir a Arquitetura e padrões de projetos que implementaríamos. Optamos pela arquitetura Modelo-Visão-Controle (MVC), em que separamos o sistema em componentes interligados que são essenciais para uma melhora na conexão entre as camadas de dados, lógica de negócio e iteração com o usuário.</p>
  <details>
  <summary>Clique aqui para visualizar a Lógica Arquitetural MVC</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/Valdineynascimento/bertoti/tree/main/Metodologia/Imagens/DiagramaArq.png" width="500px;" alt=""/>
  </details>
  
  <ul>
  <li> <p align="justify" style="font-family:roboto;">Model: são representações das tabelas do Banco de Dados Oracle, tendo seus campos e relações mapeadas pelo Hibernate. Resultando em uma melhor validação dos dados e facilitação com consultas, inserções e atualizações na Database;</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">Repositories: são interfaces que tem como função serem camadas de acesso a dados. Eles extendem o JpaRepository, portanto há um melhor e mais fácil acesso aos métodos de manipulação dos dados na Database, sendo inserção (save), consulta (listAll), atualização (save) e deleção (deleteById) os que utilizamos no desenvolvimento. Além de permitirem realizar comandos SQL customizados de acordo com a necessidade da funcionalidade;</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">Services: são classes que concentram os métodos do Repository, visto que tem essa interface injetada com a anotação @Autowired. Sendo adicionados neles a lógica essencial para regra de negócio imposta pelo cliente, como por exemplo o envio de e-mails, além de contribuirem muito para organização dos métodos utilizados pela interface;</p>
  </li>
    
  <li> <p align="justify" style="font-family:roboto;">Controllers: são as classes onde se encontram os Endpoints do Back-End que serão utilizados para interação com o Front-End, isso corre pela chamada de rotas presentes em seus métodos, pela anotação @RequestMapping("/rota-exemplo"). Contém os Services necessários injetados com a anotação @Autowired e utiliza das chamadas dos métodos dessas classes para realização da lógica desenvolvida.</p>
  </li>
  </ul>
  
  <p align="justify" style="font-family:roboto;"> Ademais, utilizarmos a arquitetura REST, visto que a comunicação entre as aplicações ocorre com requisições HTTP, podendo ser perceptível pelas rotas nos controllers. Nesse ponto, também foi implementado o padrão de projeto Proxy, uma vez que controlamos o acesso aos objetos nas requisições com as anotações do Spring Boot. Além do uso do padrão Facade, aplicado nos repositórios do sistema, sendo uma interface que simplifica as funcionalidades das classes da Java Persistence API (JPA).</p>
  <details>
  <summary>Clique aqui para visualizar o Padrão de Projeto Proxy</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/Valdineynascimento/bertoti/tree/main/Metodologia/Imagens/PadraoProxy.png" width="800px;" alt=""/>
  </details>  
     
  <p align="justify" style="font-family:roboto;"> A seguir foram configuradas as Properties, para as quais foram aplicadas a conexão com a Base de Dados Oracle que está em
  nuvem no Oracle Cloud. Além de declarar: o driver utilizado (oracle.jdbc.OracleDriver), a versão da linguagem do Banco (Oracle10Dialect), a maneira que o hibernate vai ler os Models (validate) e a porta que será rodado o serviço (PORT:8081).</p>
  <details>
  <summary>Clique aqui para visualizar as Properties</summary>
  <br>
   <img style="border-radius: 50%;" src="https://github.com/Valdineynascimento/bertoti/tree/main/Metodologia/Imagens/Properties-VPC.png" width="800px;" alt=""/>
  </details>   
   
   
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
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Spring Boot</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Oracle</td>
      <td>★★★★★☆☆☆☆☆</td>
    </tr>
    <tr>
      <td>Cloud</td>
      <td>★★★★☆☆☆☆☆☆</td>
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
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Organização</td>
      <td>★★★★★★☆☆☆☆</td>
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
