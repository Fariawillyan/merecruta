package empresa.rh.merecruta.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Usuario {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nomeUsuario;
        private String urlLinkedin;
        private String email;
        private String recrutimetro;
        private String imagemLinkedin;
        private String cargo;
        private String descricao;
        private String password;
        private String role;
}
