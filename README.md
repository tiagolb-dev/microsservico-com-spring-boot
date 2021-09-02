# Arquitetura baseada em microsserviços com Spring Boot

## Apresentação

Demonstrar como funciona uma arquitetura de software baseada em microsserviços. Projeto desenvolvido em Java com Spring Boot.


## Dependências

Projeto utilizando as seguintes dependências:

* Spring Boot Actuator;
* Spring Web;
* Spring Data Elasticsearch (Access+Driver);
* Config Server;
* Config Client;
* Eureka Server;
* Gateway;
* Spring Data Redis (Access+Driver);
* Eureka Discovery Client.

## Pré-requisitos

Para o projeto funcionar precisa instalar no computador o **Elasticsearch** e o **Redis**. Há possibilidade de fazer a configuração com o Docker.

**Obs:** Até o momento deste projeto, segundo o Redis é preciso ter uma capacidade acima de 10% de espaço livre em disco rígido para usar todas as suas funcionalidades, caso contrário é somente leitura. Para funcionar o projeto é recomendado uma memória RAM acima de 8GB.
