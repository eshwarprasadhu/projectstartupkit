## *Overview*
Create Sample Shopping Cart Application for home work assignment to the Zaizi Asia.

## *Prerequisites*
* Java 1.8
* Maven 3
* MySQL
* Spring Boot
* Hibernate
* HTML , CSS & Javascript (AngularJS/Bootstrap)

## *Build Project*
1. Create Database ```CREATE DATABASE zaizidb;```
2. Set Username and Password in the ```application.properties``` file
3. Clone the project
4. Navigate to root path (ShoppingCart)
5. Invoke ```bower install```
6. Invoke ```mvn clean install -DskipTests```
7. Navigate to target folder

## *Run Project*
* Invoke following command
```java -jar ShoppingCart-0.0.1-SNAPSHOT.jar```
navigate to ```http://localhost:8080/shoppingcart/```


## Cache implementation
The caching feature can be declaratively enabled by simply adding the @EnableCaching annotation to any of the configuration classes. In our case, we have declared it in SpringBootStarterProject Class.
The @EnableCaching annotation triggers a post-processor that inspects every Spring bean for the presence of caching annotations on public methods. If such an annotation is found, a proxy is automatically created to intercept the method call and handle the caching behavior accordingly.
The simplest way to enable caching behavior for a method is to demarcate it with @Cacheable and parameterize it with the name of the cache where the results would be stored. In our case, we have enabled it in ProductService.findProduct(Long id) method.

The findProduct(Long id) call will first check the cache addresses before actually invoking the method and then caching the result.
While in most cases, one cache is enough, the Spring framework also supports multiple caches to be passed as parameters.
