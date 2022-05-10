package empresa.rh.merecruta.Controller.dto;

import empresa.rh.merecruta.Model.Cadastro;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class RequisicaoNovoCadastro {

    @NotBlank
    private String nomeUsuario;

    @NotBlank
    private String urlLinkedin;

    @NotBlank
    private String email;

    @NotBlank
    private String profissao;

    private String descricao;

    private String estado;

    private String data;

    public Cadastro toCasdastro() {
        Cadastro cadastro = new Cadastro();
        cadastro.setDescricao(descricao);
        cadastro.setNomeUsuario(nomeUsuario);
        cadastro.setEmail(email);
        cadastro.setUrlLinkedin(urlLinkedin);
        cadastro.setProfissao(profissao);
        return cadastro;
    }
}
