package empresa.rh.merecruta.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    private final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @GetMapping
    @RequestMapping("/login")
    public String login() {

        LOGGER.info("ACHA LOGIN");

        return "login";
    }

}