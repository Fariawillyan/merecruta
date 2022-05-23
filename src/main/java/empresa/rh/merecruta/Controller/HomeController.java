package empresa.rh.merecruta.Controller;
import empresa.rh.merecruta.Model.Cadastro;
import empresa.rh.merecruta.Repository.CadastroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class HomeController {

    private final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private CadastroRepository cadastroRepository;

    @GetMapping("/home")
    public String home(Model model) {
        List<Cadastro> cadastros = cadastroRepository.findAll();
        model.addAttribute("cadastro", cadastros);
        return "home";
    }

    @GetMapping("/sobre")
    public String sobre() {

        LOGGER.info("ACHA SOBRE");
        return "sobre";
    }
}
