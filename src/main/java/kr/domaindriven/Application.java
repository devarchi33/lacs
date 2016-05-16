package kr.domaindriven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by jerry on 2016-05-15.
 */
@SpringBootApplication
public class Application {
    public static void main(String ... args){
        ApplicationContext applicationContext = SpringApplication.run(Application.class,args);
    }
}
