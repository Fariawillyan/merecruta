package empresa.rh.merecruta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class MerecrutaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerecrutaApplication.class, args);
    }

}
