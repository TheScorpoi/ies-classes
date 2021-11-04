# lab2

## lab2_1

#### alinea (a)
- Segui os passos do guião no que toca a instalação do *Apache Tomcat*.
- Foi necessário dar permissões aos ficheiros: *startup.sh*, *catalina.sh*, e *shutdown.sh*.  
- Depois basta correr o *script* **./startup.sh** e à partida o servidor estará ligado.  
- A alternativa usada foi a segunda (http://localhost:8080), mas também usei o *curl -I 127.0.0.1:8080*

#### alinea (b)

- Foi adicionado o código presente no guião no ficheiro *tomcat-userx.xml* na pasta **conf**, e analisado o código referente ao **Request Parameters**.

#### alinea (c)

- Criei o projecto Maven atraves da ferramenta do vsCode, e escolhi a opção *org.codehaus.mojo.archetypes*
- O comando para correr pelo terminal é: 
```bash
mvn archetype:generate -DgroupId=com.tomcat_21.app -DartifactId=tomcat_webapp -DarchetypeArtifactId=webapp-javaee7 -DarchetypeGroupId=org.codehaus.mojo.archetypes -DarchetypeVersion=1.1 -DinteractiveMode=false
```

#### alinea (d)

- Através do seguinte link *http://localhost:8080/manager* carreguei o ficheiro *.war* que está na pasta target.

#### alinea (e)

- Através do seguinte link *http://localhost:8080/my-web-app-1.0-SNAPSHOT* apareceu **Hello World!**, ou seja o deploy foi dado corretamente.

#### alinea (f)

- EStava tudo a funcionar no seguinte url *http://localhost:8080/my-web-app-1.0-SNAPSHOT*

#### alinea (g)

- NAO ESTAVA A CONSEGUIR USAR PELO CODE, VER DEPOIS

#### alinea (h)

- Criei o ficheiro *MyFirstServlet.java* (https://howtodoinjava.com/java/servlets/complete-java-servlets-tutorial/#webservlet_annotation)
- Tive de ir ao *http://localhost:8080/manager* para o projecto e voltar a correr, e depois já pude ver as novas alterações na pagina *http://localhost:8080/my-web-app-1.0-SNAPSHOT/MyFirstServlet*

#### alinea (i)

- A excepção é quando não há nenhum *username* no dicionário, nesse caso o **NullPointerException** ocorre e aparece a mensagem que não há nenhum utilizador, sendo assim impossivel de mostrar a página em questão (*http://localhost:8080/my-web-app-1.0-SNAPSHOT/MyFirstServlet*)

## lab2_2

#### alinea (a)

- Foi seguido o turorial do site *https://examples.javacodegeeks.com/enterprise-java/jetty/embedded-jetty-server-example/* .

## lab2_3

#### alinea (a)

 - Através do site *https://start.spring.io/* criei o novo projeto, sendo que adicionei a dependencia **Spring Web**, fiz download e unzip da pasta. Executei o comando *./mvnw spring-boot:run* e na em *http://localhost:8080* apareceu o while laber error.

#### alinea (b)

- Foram seguidos os passos do tutorial *https://spring.io/guides/gs/serving-web-content/*, para correr e ver o projeto em execução usei o comando *./mvnw spring-boot:run*, e no endereco *http://localhost:8080/greeting* aparecia a mensagem **Hello World**, sendo que se o endereço for mudado para, por exemplo, *http://localhost:8080/greeting?name=Pedro*, aparece **Hello Pedro**. Adicionei ainda uma home page, que tem um redirecioanmento para a pagina *http://localhost:8080/greeting*.

#### alinea (c)

- Foi seguido o turorial *https://spring.io/guides/gs/rest-service/*, para correr o projeto usei o comando *./mvnw spring-boot:run*, e no endereco *http://localhost:8080/greeting* aparece o fichiero JSON, com a mensagem **Hello World**, sendo que se na barra de pesquisa estiver *http://localhost:8080/greeting?name=Pedro* aparecerá **Hello Pedro**.
- Importante denotar que cada vez que damos refresh na página o valor do id do ficheiro JSON é incrementado unitariamente.

## lab2_4

- Foi seguido o tutorial *https://spring.io/guides/gs/rest-service/*, e criado os seguintes ficheiros: *Show.java, Quote.java*. A unica dependencia adicional usada do Spring foi a Spring Web


## Review Questions

[A] - O servlet container fornece ao servlet acesso fácil às propriedades da solicitação HTTP, como seus cabeçalhos e parâmetros.
O servlet container executa as seguintes tarefas:
1) Ele cria uma instância do servlet e chama seu método init () para inicializá-lo
2) Ele constrói um objeto de solicitação para passar para o servlet.
3) Ele constrói um objeto de resposta para o servlet.
4) Ele invoca o método servlet service ().
5) Ele chama o método destroy () do servlet para descartá-lo.

[B] - O Spring Boot usa o padrão * Model-View-Controller * no qual o aplicativo é dividido em 3 partes:
1) Quando uma solicitação HTTP é feita, o **Controlador** a recebe e processa.
2) O **Model** funciona como um middleware entre o Controller e a View. Isso está sendo controlado pelo Controlador para atualizar a Visualização. O usuário pode ver a solicitação processada por meio da **Visualização**
3) A função '@Controller' trata as solicitações.

[C] - Os "starters" permitem que se adicione ficheiros .jar, o que faz com que o deployment seja mais rapido e fácil.

[D] - As Anotacções que estao incluidas são: @Configuration , @EnableAutoConfiguration and @ComponentScan.

[E] - Das melhores praticas destaco: Aceitar e responder recorrendo ao JSON, usar nomes em vez de verbos para o fim dos caminhos (paths), ter tratamento de execuções e de erros, permitir filtros, ordenação e paginacao, e manter boas praticas de segurança minimizando as vulneabilades.