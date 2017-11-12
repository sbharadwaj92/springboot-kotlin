# springboot-kotlin
Spring boot using Kotlin - Rest API using JPA/HIbernate with h2 as database 

1. Kotlin as language
2. Restful API
3. JPA / Hibernate
4. h2 database 

## How to run this application
1. Open Run/Debug Configurations
2. Add the complete class ``` com.example.springbootkotlin.SpringbootKotlinApplicationKt ``` in the main class.
3. Check Single instance only checkbox top right corner. 
4. Now you should see this application as Kotlin.

## Database 
1. Open http://localhost:8080/console
2. JDBC URL ```jdbc:h2:mem:springboot-kotlin```
3. Username ```sa``` with no password
4. Now you can check the entries in the tables 

## REST APIS
1. Open http://localhost:8080
``` [
{
firstName: "sagar",
lastName: "rout",
id: 1
},
{
firstName: "mohit",
lastName: "singh",
id: 2
},
{
firstName: "rahul",
lastName: "singh",
id: 3
},
{
firstName: "rajat",
lastName: "sharma",
id: 4
}
] 
