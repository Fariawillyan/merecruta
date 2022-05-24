package empresa.rh.merecruta.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Cadastro {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nomeUsuario;
        private String urlLinkedin;
        private String email;
        private String recrutimetro;
        private String imagemLinkedin;
        private String profissao;
        private String descricao;
        private String urlLinkedinImagem;
}
