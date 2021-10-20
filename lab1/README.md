# lab1

## lab1_1

- Instalação do Maven 
- [Link sobre a iniciação do Maven](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

**Aspetos a ter em conta sobre o Maven**

- *archetype* - modelo genrénico de uma componente importante num sistema.

- *groupId* - identificador único de cada projeto, este deve seguir as "Java's package name rules", ex: com.ies

- *artifactId* - nome do jar sem versão, ex: my-weather-radar

- *maven goal* - Os projetos são compostos por "build phases", cada uma destas fases representando um passo no ciclo, as fases são denonimadas por **goals**.

**Principais Maven Goals:**
- **validate** - validate the project is correct and all necessary information is available
* **compile** - compile the source code of the project
* **test** - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
* **package** - take the compiled code and package it in its distributable format, such as a JAR.
* **verify** - run any checks on results of integration tests to ensure quality criteria are met
* **install** - install the package into the local repository, for use as a dependency in other projects locally
* **deploy** - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects


## lab1_2

- **my-first-project** - Primeiro projeto Maven, serviu para ter uma uma primeira impressão.

- **my-weather-radar** - Projeto Maven sobre a previsão do tempo
                       Em cada ficheiro java tive de por o package com.ies de modo a que o comando *mvn package* executa-se sem erros. De seguida executei o comando *mvn exec:java -Dexec.mainClass="com.ies.WeatherStarter"* para correr o programa. No entano depois de aparecer a temperatura máxima prevista para o dia em questão apareceram uns avisos relacionados com threads, pelo que percebi houve uma thread que não foi morta corretamente (?)
                        
    Alterei a classe WeatherStarter de modo a mostrar mais informação sobre a meteorologia, e de modo a que fosse possivel passar como argumento a localidade.
    Para passar o arguemento basta acrescentar *-Dexec.args="arg1 arg2 arg3 ..."*  

## lab1_3

- Não foi necessário fazer a introdução ao Git

- **git** - projeto onde foram experimentados os Loggers do Guião

## lab1_4

- Foram feitos os comandos do docker e os tutoriais

## lab1_5

 - Criação da Classe *Cities.java* com os códigos das cidades, e feitas as mudanças necessárias na Classe *WeatherStarter.java* (main)

## Review Questions

[A] - 

[B] - 

[C] -  

[D] - 

[E] - 