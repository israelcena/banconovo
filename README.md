# 💰 Bank Restful API 🏢
![Version](https://img.shields.io/badge/Version-0.0.1-red?style=for-the-badge "Version-SNAPSHOT")

__This project is only for show examples for use all springboot sources!__ 

### ⚙ This project uses (at least so far)
- [Java](https://en.wikipedia.org/wiki/Java_version_history) ![Version](https://img.shields.io/badge/Version-11-red?style=flat-square)
- [Spring Framework](https://spring.io/) ![Version](https://img.shields.io/badge/Version-2.6.4-green?style=flat-square)
- [JUnit](https://junit.org/junit5/) ![Version](https://img.shields.io/badge/Version-5-9cf?style=flat-square)
- [H2 DB with Hibernate ORM](https://junit.org/junit5/)

### 🗺️ API Documentation
1. (POST) `/clientes` - Include new client
2. (GET) `/clientes` - List all clients 
3. (GET) `/clientes/{id}` - List a client by ID
4. (DELETE) `/clientes/{id}` - Delete a client by ID

### Json Request model
#### (POST) - Create new Client
```Json 
    {
        "name": "Israel",
        "email": "israelsjm@gmail.com"
    }