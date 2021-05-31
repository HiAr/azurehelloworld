package be.ordina.azurehelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AzurehelloworldApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Azure World 2";
    }

    public static void main(String[] args) {
        SpringApplication.run(AzurehelloworldApplication.class, args);
    }

}
