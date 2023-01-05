package hu.pte.pteprogmoditalbolt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PteProgmodItalboltApplication {



    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PteProgmodItalboltApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PteProgmodItalboltApplication.class, args);
    }

}
