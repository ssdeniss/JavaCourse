package com.denis.course.Config.ConfigWithJava;

import com.denis.course.Config.*;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
