package empresa.rh.merecruta.Controller;

import empresa.rh.merecruta.Controller.dto.RequisicaoNovoCadastro;
import empresa.rh.merecruta.Model.Cadastro;
import empresa.rh.merecruta.Repository.CadastroRepository;
import empresa.rh.merecruta.Service.CadastroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {

    private final Logger LOGGER = LoggerFactory.getLogger(CadastroController.class);


    @GetMapping("/formulario")
    public String formulario() {

        LOGGER.info("acha formulario");

        return "formulario";

    }

    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/novo")
    public String novoCadastro(RequisicaoNovoCadastro requisicao) {

        LOGGER.info("ACHA SALVAR CADASTRO");

        Cadastro cadastro = requisicao.toCasdastro();
        cadastroService.saveCadastro(cadastro);

        return "formulario";


    }

}