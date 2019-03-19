package upgrad_package;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import java.util.Collections;

import static java.util.Collections.singletonMap;
import static org.springframework.boot.SpringApplication.*;


@SpringBootApplication
public class TechnicalBlogApplication {
    public static void main(String[] args)
    {

        SpringApplication app = new SpringApplication(TechnicalBlogApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);

    }
}
