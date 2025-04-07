package org.example.ymgspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class YmgSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmgSpringApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Spring Boot Başarıyla Çalışıyor 🚀";
    }

}
