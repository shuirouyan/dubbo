package cn.test;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author WinterSun
 * @date 2020/8/22 - 11:21
 */
@EnableDubbo
@SpringBootApplication
public class StartProvider {
    public static void main(String[] args) {
        SpringApplication.run(StartProvider.class,args);
    }

    /*@Configuration
    @ImportResource("classpath:provider.xml")
    static class DemoConfig{

    }*/
}
