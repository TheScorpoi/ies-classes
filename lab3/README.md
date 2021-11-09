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

Foram feitas alterações na pasta **templates** (nos ficheiros html) de modo a que o campo 'Phone' fosse adicioando, e depois na classe User, foi acrescentado o atributo 'phone'.

## lab3_2