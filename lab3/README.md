# lab 3

## lab3_1
#### alinea (a)

- Através do **Sprint Initializr** criei o projecto com as dependencias que o exercicio sugere. After that, seguindo o tutorial *https://www.baeldung.com/spring-boot-crud-thymeleaf* fui completando o exercicio. Com o comando **./mvnw spring-boot:run** e abrindo a o browser no *localhost:8080* é possivel ver a aplicação a correr.

#### alinea (b)

- O UserRepository é inicializado por causa do UserRepository que tem a anotação @Autowired, que cria uma instancia de UserRepository no objeto do UserController.

- Os metodos que são chamados são: *findAll(), save(), findById(), delete()*. Estes métodos estão definidos na classe CrudRepository que por sua vez o nosso Repositório faz *extends*. 

- A informação é salva usando a base de dados **h2**, base de dados que está adicionado ao projeto no **pom.xml**.

- A regra do 'not empty' está definida na classe User, com a anotação *@NotBlank* enquanto é declarado o atributo.

#### alinea (c)

- Foram feitas alterações na pasta **templates** (nos ficheiros html) de modo a que o campo 'Phone' fosse adicioando, e depois na classe User, foi acrescentado o atributo 'phone'.

## lab3_2

#### alinea (a)
- Para iniciar a base de dados com o docker foi preciso fazer o seguinte comando:
```
sudo docker run --name mysql5 -e MYSQL_ROOT_PASSWORD=secret1 -e MYSQL_DATABASE=demo -e MYSQL_USER=demo -e MYSQL_PASSWORD=secret2 -p 33060:3306 -d mysql/mysql-server:5.7
```
#### alinea (b) -> (e)

- Foram seguidos os passos do tutorial *https://www.javaguides.net/2018/09/spring-boot-2-jpa-mysql-crud-example.html*.

#### alinea (f)
- No ficheiro /src/main/resources/aplication.properties foi acrescentado o seguinte código:
```
spring.datasource.url=jdbc:mysql://127.0.0.1:33060/demo
spring.datasource.username=demo
spring.datasource.password=secret2
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto = update
```
- Para testar usei o **Thunder Client** que é uma extensão que existe no *vsCode*, 
o caminho usado foi *http://localhost:8080/api/v1/employees*, e a mensagem JSON foi:
*{"firstName": "Ze", "lastName": "Silva", "emailId": "ola@ua.pt"}*
Depois foram testados os outros metodos.

#### alinea (g)
No ficheiro *EmployeeRepository* foi acrescentada a função *findByEmailId*, e no ficheiro *EmployeeController*, foi criada a função getEmployeeByEmail, com *@GetMapping("/employees?email={email}")*.
Depois foi testado com o **Thunder Client** com GET e *http://localhost:8080/api/v1/employees?email=ola@ua.pt* e obtive os resultados esperados.

## lab3_3

#### alinea (a)




## Review Questions

[A] - Explain the differences between the RestController and Controller components used in different parts of this lab.
>- A diferença entre @RestController e @Controller é apenas que o primeiro trata-se de uma combinação de @Controller e @ResponseBody, tornando o desenvolvimento ligeiramente mais fácil

[B] - Create a visualization of the Spring Boot layers (UML diagramor similar), displaying the key abstractions in the solutionof 3.3, in particular: entities, repositories, servicesand REST controllers.
Describe the role of the elements modeled in the diagram    
>- No diretorio [./lab3](lab3) encontra-se o diagrama.

[C] - Explain the annotations @Table, @Colum, @Id foundin the Employee entity.
>-@Table: Especifica a tabela na base de dados que vai guardar a entidade, neste caso está a definir-se que as entidades Employee vão ser guardadas na tabela "employees" na BD MySQL.
>-@Column: Serve para mapear um atributo como uma coluna na tabela da base de dados.
>-@Id: Identifica um atributo como Primary Key da tabela da base de dados

[D] - Explain the use of the annotation @AutoWired (in the Rest Controller class).Create UML diagrams from code in IntelliJ.
>-No nosso caso usamos o @Autowired na property employeeRepository isto serve para evitar fazer metodos setter.
>- "You can use @Autowired annotation on properties to get rid of the setter methods. When you will pass values of autowired properties using  Spring will automatically assign those properties with the passed values or references."
