package empresa.rh.merecruta.Controller;

import empresa.rh.merecruta.Controller.dto.RequisicaoNovoCadastro;
import empresa.rh.merecruta.Model.Cadastro;
import empresa.rh.merecruta.Service.CadastroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
    public String novoCadastro(@Valid RequisicaoNovoCadastro requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "formulario";
        }

        LOGGER.info("ACHA SALVAR CADASTRO");

        Cadastro cadastro = requisicao.toCadastro();
        cadastroService.saveCadastro(cadastro);

        return "home";

    }

    @GetMapping("/cadastrocomsucesso")
    public String sucessoCadastroformulario(){

        LOGGER.info("cadastrado formulario");

        return "cadastradoComSucessoMsg";
    }



}