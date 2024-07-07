# Projeto Tabela Fipe

Projeto desenvolvido utilizando Spring Boot, com o objetivo de consumir uma API
para consulta de informações sobre marcas, modelos, ano, valores de carros na tabela FIPE.

## APIs disponíveis para utilização

**GET** /marcas: Retorna as marcas de veículos.

![marcas](https://github.com/Al-Felipe/tabela-fipe/assets/105646899/7a77079a-8359-4dfe-9260-8d9f7fae603d)

**GET** /marcas/{iDmodelo}: Retorna os modelos de determinada marca.

![modelos](https://github.com/Al-Felipe/tabela-fipe/assets/105646899/f9ab5898-b63d-4571-b263-ba7806d9cf79)

**GET** /anos/{modelo}/{marca}: Retorna o ano do modelo.

![anos](https://github.com/Al-Felipe/tabela-fipe/assets/105646899/0a9decec-faa2-40be-b141-c4d74d6869e9)

**GET** /valor/{modelo}/{marca}/{ano}: Retorna o valor do veículo.

![valor](https://github.com/Al-Felipe/tabela-fipe/assets/105646899/015067c6-1e25-4c18-bf8f-f77afb061d75)

## Tecnologias Utilizadas 
**Linguagem de Programação:** Java

**Framework**: Spring Boot

**Ferramentas de Desenvolvimento**: IntelliJ IDEA e Insomnia
