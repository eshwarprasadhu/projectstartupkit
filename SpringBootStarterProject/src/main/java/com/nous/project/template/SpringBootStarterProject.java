package com.nous.project.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
/*
 * Note: The @EnableCaching annotation triggers a post-processor that inspects
 * every Spring bean for the presence of caching annotations on public methods.
 * If such an annotation is found, a proxy is automatically created to intercept
 * the method call and handle the caching behavior accordingly.
 */

public class SpringBootStarterProject {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarterProject.class, args);

    }
}
