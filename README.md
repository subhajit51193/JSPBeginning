
# Simple Project With JSP

This is a basic project implemented with JSP. In this project user can perform all crud operations.


## Features

- Add Product and Category
- Update Product and Category
- Delete Product


## API Reference

- POST/Product: Create a new Product with Category
- GET/Product: Edit Product Details
- DELETE/Product : Delete any Product
## Optimizations

In progress..


## Installation

Download project file and run with following properties locally

```bash
#db specific properties
spring.datasource.url=jdbc:mysql://${DB_HOST:localhost}:${DB_PORT:3306}/${DB_NAME:jsp}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=${DB_USERNAME:root}
spring.datasource.password=${DB_PASSWORD:sql@subhajit51193}

#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

#JSP related
spring.mvc.view.prefix=/WEB-INF/jsps/
spring.mvc.view.suffix=.jsp
```
After running the application use following url - http://localhost:8080/ 
## Deployment

Not yet deployed


## Tech Stack

**Client:** Java,SpringBoot,JSP

**Server:** MySQL


## Authors

- [@Subhajit Saha](https://github.com/subhajit51193)

## Feedback

If you have any feedback, please reach out to us at nnorth87@gmail.com





## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://subhajit51193.github.io/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/subhajit-saha-103110185/)

