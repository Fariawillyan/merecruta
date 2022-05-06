package empresa.rh.merecruta.Controller.dto;

import empresa.rh.merecruta.Model.Cadastro;
import lombok.Data;

@Data
public class RequisicaoNovoCadastro {

    private String nomeUsuario;
    private String urlLinkedin;
    private String email;
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
