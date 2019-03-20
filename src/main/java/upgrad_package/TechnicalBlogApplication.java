package upgrad_package;

import controller.HomeController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import upgrad_package.service.PostService;


import java.util.Collections;


@SpringBootApplication
//@ComponentScan
@ComponentScan(basePackageClasses = HomeController.class)
@ComponentScan(basePackageClasses = PostService.class)

public class TechnicalBlogApplication {
    public static void main(String[] args)
    {
        System.out.println("Inside Main.....");
        SpringApplication app = new SpringApplication(TechnicalBlogApplication.class);
        app.setDefaultProperties(Collections
                .singletonMap("server.port", "8083"));
        app.run(args);
        System.out.println("Running Application.....");

    }
}
