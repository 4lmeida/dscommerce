<h1 align="center">DSCommerce</h1> 

<p align="center">
  <img src="https://img.shields.io/static/v1?label=spring&message=framework&color=blue&style=for-the-badge&logo=SPRING"/>
  <img src="https://img.shields.io/static/v1?label=Apache&message=Dependency manager&color=blue&style=for-the-badge&logo=apache"/>
   <img src="https://img.shields.io/static/v1?label=Postman&message=API management&color=blue&style=for-the-badge&logo=postman"/>
  <img src="https://img.shields.io/static/v1?label=Railway&message=deploy&color=blue&style=for-the-badge&logo=railway"/>
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
   <img src="http://img.shields.io/static/v1?label=FASE&message=BACKEND&color=GREEN&style=for-the-badge"/>
</p>

> Status do Projeto: ✔️ (Concluído)

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto-open_file_folder)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Deploy da Aplicação](#layout-e-deploy-da-aplicação-dash)

:small_blue_diamond: [Modelo Conceitual](#Modelo-conceitual-page_with_curl)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)

## Descrição do projeto :open_file_folder:


DSCommerce é uma sistema web de front-end e back-end construida ao longo da formação do curso "Formação Desenvolvedor Moderno" na [DevSuperior](https://devsuperior.com.br/cursos) que tem como objetivo aplicar os fundamentos da programação teóricos e páticos em uma aplicação de mercado, com as frameworks mais sólidas do mercado.

<p align="justify">
  A aplicação é baseada em um comércio eletrônico que você navega autenticado(logado) ou não logado, atráves dos produtos podendo adiciona-lo no carrinho, caso esteja logado o seu pedido pode ser finalizado. Aplicação disponibiliza dois tipo de acesso que é usuário logado ou admin. O admin pode realizando  cadastro, edição e exclusão de produtos na aplicação, enquanto o usuário logado pode incluir e remover itens do carrinho de compra, bem como alterar as quantidades de cada item.
</p>

## Funcionalidades

:heavy_check_mark: No CRUD de cada entidade(categorias, produtos e usuários) filtra itens pelo nome.  

:heavy_check_mark: Incluir e remover itens do carrinho de compras, bem como alterar as quantidades do produto em cada item

:heavy_check_mark: Listar produtos disponíveis, podendo filtrar produtos pelo nome  

:heavy_check_mark: Efetuar login no sistema

:heavy_check_mark: Salvar no sistema um pedido a partir dos dados do carrinho de compras informado


## Layout e Deploy da Aplicação :dash:

> Link do deploy da aplicação. Railway: https://dscommerce.up.railway.app

- Tour no site

![Tour](/src/main/java/assets/dscommerce-tour-site.gif)

- Login

![Login](/src/main/java/assets/dscommerce-login.png)

- Catalago

![catalago](/src/main/java/assets/dscommerce-catalogo.png)

- Detalhes do produto

![Detais](/src/main/java/assets/dscommerce-detais.png)

- Carrinho

![Cart](/src/main/java/assets/dscommerce-cart.png)

- Confirmação do pedido 

![Confimation](/src/main/java/assets/dscommerce-confirmation.png)

# Modelo conceitual  :page_with_curl:

- Modelo conceitual

![Modelo conceitual](/src/main/java/assets/modelo-conceitual-dscommerce.png)

- Padrão camadas

![Camadas](/src/main/java/assets/padrao-camadas.png)



## Pré-requisitos

:warning: [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)

:warning: [Maven](https://maven.apache.org/)


## Como rodar a aplicação :arrow_forward:

No terminal, clone o projeto: 

```
git clone https://github.com/4lmeida/dscommerce-backend/
```
```
# entrar na pasta do projeto dscommerce-backend
cd dscommerce-backend
```
```
# executar comando de rodar o projeto
./mvnw spring-boot:run
```

## Casos de Uso

### Consultar catálogo (Cenário principal de sucesso)
1. [OUT] O sistema informa uma listagem paginada de nome, imagem e preço dos
produtos, ordenada por nome.
2. [IN] O usuário informa, opcionalmente, parte do nome de um produto
3. [OUT] O sistema informa a listagem atualizada

### Manter produtos (Cenário principal de sucesso)
1. Executar caso de uso: Consultar catálogo.
2. O admin seleciona uma das opções
 2.1. Variante Inserir
 2.2. Variante Atualizar
 2.3. Variante Deletar

### Login (Cenário principal de sucesso)
1. [IN] O usuário anônimo informa suas credenciais (nome e senha).
2. [OUT] O sistema informa um token válido.

### Gerenciar carrinho (Cenário principal de sucesso)
1. Executar caso de uso: Consultar catálogo.
2. [IN] O Usuário anônimo seleciona um produto.
3. [OUT] O sistema informa nome, preço, descrição, imagem, e nomes das categorias
do produto selecionado.
4. [IN] O Usuário anônimo informa que deseja adicionar o produto ao carrinho.
5. [OUT] O sistema informa os dados do carrinho de compras [1].
6. [IN] O Usuário anônimo informa, opcionalmente, que deseja incrementar ou
decrementar a quantidade de um item no carrinho de compras.
7. [ OUT] O sistema informa os dados atualizados do carrinho de compras [1].

### Registrar pedido (Cenário principal de sucesso)
1. [IN] O cliente informa os dados do carrinho de compras [1].
2. [OUT] O sistema informa os dados do carrinho de compras[1] e o id do pedido.

## Linguagens, dependencias e libs utilizadas :books:

- [JAVA](https://www.java.com/pt-BR/)
- [JPA](https://spring.io/projects/spring-data-jpa) / [Hibernate](https://hibernate.org/)
- [Maven](https://maven.apache.org/)
- [H2](https://www.h2database.com/html/main.html)
- [Jakarta Bean validation](https://beanvalidation.org)
- [JWT](https://jwt.io)
- [OAuth 2.0](https://oauth.net/2/)
- [Spring Security](https://docs.spring.io/spring-security/reference/index.html)
- [Spring Cloud](https://docs.spring.io/spring-cloud/docs/current/reference/html)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html)

## BD :floppy_disk:

###Algumas tabelas do banco de dados

### Usuários:

| first_name | last_name |  email   | password |
|------|-----------------|----------|----------|
| Alex  | Brown | alex@gmail.com | $2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG
| Maria  | Green | maria@gmail.com |$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG

### Categoria:

| name    | 
|---------|
| Livros |
| Eletrônicos|
| Computadores|

### Papel:

| authority |
|-----------|
| OPERATOR  |
| ADMIN     |


## Desenvolvedores/Contribuintes

| [<img src="https://avatars.githubusercontent.com/u/93017964?v=4" width=115><br><sub>Luís Almeida</sub>](https://github.com/4lmeida) |
| :---: |


## Licença 

The [MIT License](/dscommerce-backend/LICENSE)(MIT)

Copyright :copyright: 2022 - DSCommerce

:top: [Voltar ao top](#Tópicos)
