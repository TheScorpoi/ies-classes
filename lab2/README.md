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

#### alinea (j)

- Ver depois...

## lab2_2

#### alinea (a)

- Não entendi muito bem se oq fiz era o correto.

