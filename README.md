<h1 align="center">
    <a href="#" alt="Minicurso de JPA com Hibernate"> # Minicurso de JPA com Hibernate </a>
</h1>

<!-- <h3 align="center">
    APP RH 
</h3> -->
<!-- 
<p align="center">
 <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/tgmarinho/README-ecoleta?color=%2304D361">

 <img alt="Repository size" src="https://img.shields.io/github/repo-size/tgmarinho/README-ecoleta">

 <a href="https://github.com/tgmarinho/README-ecoleta/commits/master">
   <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/tgmarinho/README-ecoleta">
 </a>
</p> -->

<h4 align="center">
     🚀 Projeto realizado no minicurso de Banco de Dados com JPA e Hibernate no IF Sertão Pe - Campus Floresta 🚀 
</h4>

Tabela de conteúdos
=================
<!--ts-->
  * [Sobre o projeto](#-sobre-o-projeto)
  * [Funcionalidades](#-funcionalidades)
  * [Como executar o projeto](#-como-executar-o-projeto)
    * [Pré-requisitos](#pré-requisitos)
  * [Tecnologias](#-tecnologias)
    * [WebSite](#user-content-website)
  * [Contribuidores](#-contribuidores)
  * [Como contribuir no projeto](#-como-contribuir-no-projeto)
  * [Autores](#-autores)
  * [Licença](#user-content--licença)
<!--te-->


## 💻 Sobre o projeto

O APP RH - O sistema oferece uma solução para impedir a recontratação de empregados demitidos com histórico negativo ou por motivos superiores, sinalizados como não aptos para as empresas do grupo compare.
A ideia central é construir um sistema que consulta a base de dados, com intuito de analisar se o candidato (ex-funcionário) tem histórico negativo “score” com as empresas do grupo compare. O sistema também deve permitir que funcionários do RH e/ou Gerentes sejam capazes  de realizar cadastros de ex-empregados e funcionários a serem demitidos, e os motivos da demissão.
A partir dessas informações será possível facilitar a tomada de decisão por parte dos gestores das empresas do grupo quanto à contratação do candidato. Pois os mesmos terão todas as informações disponíveis sobre os ex-funcionários.


---

## ⚙️ Funcionalidades

Os usuários que têm acesso ao site podem:
 - [x] visualizar empresas, usuários e log's de acesso
 - [x] gerir novos funcionário demitidos
 - [x] gerar relatórios de funcionário demitidos, empresas, usuários e log's de acesso

---

## 🚀 Como executar o projeto

1. Criar um banco de dados com o nome db_apprh (User: apprh | Password: ***************)
2. Rodar as migrations
3. Rodar os Seed's de motivos e Usuario Admin
4. Rodar o servidor do laravel (php artisan serve --port=9000) 
    - O servidor inciará na porta:9000 
    - acesse http://localhost:9000
5. Rodar o backup automático (php artisan schedule:work)
6. Enviar o documento de ajuda para o  Storage->App ->Public

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
Postgresql, PHP, LARAVEL.

---

## 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

#### **Website**  ([LARAVEL](https://laravel.com/)  +  [Bootstrap](https://getbootstrap.com/))

-   **[Bootstrap Icons](https://icons.getbootstrap.com/)**
-   **[NodeJS](https://nodejs.org/en/)**
-   **[jQuery](https://jquery.com/)**
-   **[db-dumper](https://github.com/spatie/db-dumper)**
-   **[input-mask](https://github.com/RobinHerbots/Inputmask)**
-   **[validator-docs](https://github.com/geekcom/validator-docs)**
-   **[laravel-dompdf](https://github.com/barryvdh/laravel-dompdf)**
-   **[laravel-ui](https://github.com/laravel/ui)**
-   **[Larapex Charts](https://github.com/ArielMejiaDev/larapex-charts)**

---
## 🦸‍♂️🦸 Autores

<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/85914689?v=4" width="100px;" alt=""/>
<a href="https://github.com/herculanosilva" title="Herculano">Herculano Silva🚀</a>
<br /> <br />
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/41123970?v=4" width="100px;" alt=""/>
<a href="https://github.com/WillianyV" title="Williany">Williany Veras🚀</a>
<br />

## 📝 Licença

Todos os direitos resevados ao Grupo Compare

