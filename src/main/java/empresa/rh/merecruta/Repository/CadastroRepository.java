package empresa.rh.merecruta.Repository;

import empresa.rh.merecruta.Model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

}
