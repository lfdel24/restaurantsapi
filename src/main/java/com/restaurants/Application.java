package com.restaurants;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories
@SpringBootApplication(scanBasePackages = {"com.restaurants.*"})
public class Application {

    @RequestMapping("/")
    String home() {
        return "Restaurants API | lfdel24@gmail.com";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
