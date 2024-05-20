package ru.gb.Java_Spring_HW8.config;

import ru.gb.Java_Spring_HW8.aspect.LoggingAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy

public class ProjectConfig {
    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }
}
