package com.nous.project.template.controller;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(ShoppingCartController.class);

    public void logerMethod() {
       log.info("Hello world");
    }
}
