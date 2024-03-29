package empresa.rh.merecruta.Controller.dto;

import empresa.rh.merecruta.Model.Cadastro;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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

    private String urlLinkedinImagem;

    @NotNull
    private int pretencaoSalarial;

    private String local;

    public Cadastro toCadastro() {
        Cadastro cadastro = new Cadastro();
        cadastro.setDescricao(descricao);
        cadastro.setNomeUsuario(nomeUsuario);
        cadastro.setEmail(email);
        cadastro.setUrlLinkedin(urlLinkedin);
        cadastro.setProfissao(profissao);
        cadastro.setUrlLinkedinImagem(urlLinkedinImagem);
        cadastro.setPretencaoSalarial(pretencaoSalarial);
        cadastro.setLocal(local);
        return cadastro;
    }
}
