# Projeto PromoAll : 1º semestre de 2022 - 3º semestre Banco de Dados
 
 
 ## Parceiro Acadêmico
MidAll</br>

![image](https://static.wixstatic.com/media/456d95_d8bfdcb4942b46c69950e9616742df4e~mv2.png/v1/fill/w_312,h_248,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/Logo%20MidAll.png)
##### *Figura 01. Fonte(www.midall.com.br)*

A MidAll é uma empresa de serviços e consultoria em TI, com sede no Parque Tecnológico em São José dos Campos. Desenvolve soluções de data driven, transformação digital, agilidade e eficiência e governança e segurança.


### Descrição do Projeto

O Projeto teve como principal atividade, a criação de um processo de promoções em um E-commerce, onde o usuario poderia criar, editar e excluir diversos tipos de promoções de forma ágil e intuitiva. 
Requisitos funcionais:
* Interface de cadastro de produtos e promoções;
* Edição de produtos;
* Carrinho de compras;
* Criação de promoções;
* Categoria de promoções;
* Listagem de produtos e promoções.


Dessa forma, foi desenvolvido a aplicação PromoAll

<img src ="https://github.com/Doc-Docker/APIMidAll/blob/main/Images/logo2promoall.png" width="300" height="300"/>

##### *Figura 02. Fonte(www.github.com/Doc-Docker/APIMidAll)*

### Tecnologias utilizadas:

<div style="display: inline_block"><br> 
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/microsoftsqlserver/microsoftsqlserver-plain-wordmark.svg"  width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/angularjs/angularjs-original-wordmark.svg" width="100" height="100"  />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original-wordmark.svg" width="100" height="100" />
 <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original-wordmark.svg" width="100" height="100" />
</div>

</br>

Para o front-end foi utilizado o Angular que é uma plataforma baseada em Typescript, para criação das telas de interação com o cliente, e para realizar as requisições para a API que foi desenvolvida. O Java com o framework Spring foi utilizado para criação da API de backend, com a criação das rotas HTTP, conexão com o banco de dados, tratamento de erros e aplicação das regras de negócio. Como banco de dados, foi utilizado o H2 que é um sistema de gerenciamento de banco de dados relacional em memória
         
         
### Contribuições pessoais:

#### Scrum Master  da Equipe:
*   Trabalhei conjuntamente com o Product Owner na produção da Product Backlog para que ficasse de acordo com os requisitos do cliente,obtendo o maior valor possível do produto.</br>
 *  Facilitador, através de pesquisas de soluções e busca de recursos para os diversos tipos de dificuldades encontradas pela equipe durante todo o projeto.</br>
 *  Acompanhamento no desempenho da equipe, trabalhando para encontrar os pontos que atrapalhavam o andamento do projeto e resolvê-los.</br>
   Reunião semanal com o professor M2 prestando esclarecimentos e reportando o andamento das ativdades da equipe,possiveis conflitos, além de buscar 
   junto ao professor as melhores soluções para osproblemas que se apresentavam</br>
   
   #### Criação e Administração do Banco de Dados:   
   * Fui o responsavel pela modelagem, criação e admistração do banco de dados durante todo o projeto</br>
   
 ### Modelo Conceitual:
   * A modelagem conceitual foi construida sob a analise dos requisitos iniciais passados pela Fatec/Midall e posteriormente pelas necessidades levantadas pelo P.O. em reuniões junto ao cliente.
   
   ### Modelo Conceitual:
   
   <h1 align="center"> <img src = "https://github.com/CarlosSouza87/CarlosSouza87/blob/main/Bertoti/Metodologia/imagens/Modelo_Conceitual.png" /></h1>
   
* Após a confecção,o modelo conceitual foi conferido e aprovado pelo professor da materia de Banco de dados.

### Modelo Logico:
 
 *O modelo lógico do banco de dados fois gerado pelo software Brmodelo após o termino do da construção do modelo lógico e validado posterioprmente pelo professor e plo cliente.
 
  ### Mapa Modelo Logico:
 <h1 align="center"> <img src = "https://github.com/CarlosSouza87/CarlosSouza87/blob/main/Bertoti/Metodologia/imagens/Modelo_Logico.png" /></h1>

### Criaçao das tabelas,campos Modelo Físico:

### Criação da tabela de Cliente e suas colunas :

create table Cliente

(cod_cliente numeric(6) primary key,

nome_cliente varchar(50),

data_nascimento date,

cpf_cliente numeric(11) unique,

cidade_cliente varchar(120))

### Criação da tabela de Categoria, suas colunas e relacionamento :

create table Categoria

(cod_categoria numeric(6) primary key,

nome_categoria varchar(30),

descricao_categoria varchar(120))

### Criação da tabela de Promoção, suas colunas e relacionamentos :

create table Promocao

(cod_promo numeric(6) primary key,

desconto_promo numeric(2),

novo_valor numeric(6,2),

periodo_inicio date not null,

periodo_final date)

### Criação da tabela de Produto,suas colunas e relacionamentos :

create table Produto

(codigo_produto numeric(6) primary key,

 categoria_produto numeric(6) foreign key references Categoria(cod_categoria),
 
 nome_produto varchar(50),
 
 descricao_produto varchar(120),
 
 preco_produto numeric(6,2),
 
 estoque_produto numeric(4),
 
 marca_produto varchar(30))
 
### Criação da tabela de Pedido,suas colunas e relacionamentos:

create table Pedido

(codigo_pedido numeric(6)  primary key,

cliente_pedido numeric(6) foreign key references Cliente(cod_cliente),

 total_pedido numeric(6,2),
 
 data_pedido date)
 
### Criação da tabela de Item_Pedido,suas colunas e relacionamentos :

create table Item_Pedido 

 ( numero_pedido numeric(6) foreign key references Pedido(codigo_pedido),
 
 codigo_produto numeric(6) foreign key references Produto(codigo_produto),
 
 quantidade_item numeric(5),
 
 valor_item  numeric(6,2))
 
### Criação da tabela de Promocao_Item,suas colunas e relacionamentos:

create table Promocao_Item

 (produto_item numeric(6) foreign key references Produto(codigo_produto),
 
 promo_item numeric(6) foreign key references Promocao(cod_promo))
 

*****************************************************************************************************
#### Aprendizados efetivos Banco de Dados:

  Dentro do desenvolvimento do sistema de E-commerce para a MidAll tinhamos varias frentes de tarefa,eu trabalhei efeteivamente:
  
* Na Administração do grupo em si com as tarefas de Scrum Master, </br>
   
* Criação e modelagem do  Banco de dados no Microsoft Sql; </br>
*  Administração do Banco  com ajustes,exclusões e criações de tabelas e colunas bem como criação de relacionamentos,  </br>
*  Integridade referencial garantindo a total estabilidade do Banco </br>

Os conhecimentos adquiridos em aula foram essencias para desenvolvimento desse projeto, aplicamos os conhecimentos aprendidos para seguir os padrões de arquitetura,regras de negocios junto ao cliente torná-lo componentizável e seguindo modos de construção comuns aos utilizados no mercado e comunidade. Criação do banco de dados utilizado na aplicação, seguindo o padrão de chaves primaria e estrangeiras nas tabelas, criação do modelo e entidades do banco.
   
