package com.jopisoft.unleashed;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class UnleashedConfig {
    
    public UnleashedConfig(ApplicationContext applicationContext) {
        System.out.println("UnleashedConfig created");
        //Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

}
