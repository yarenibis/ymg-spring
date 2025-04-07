// HomeController.java
package org.example.ymgspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot Başarıyla Çalışıyor!!!!! 🚀";
    }
}
