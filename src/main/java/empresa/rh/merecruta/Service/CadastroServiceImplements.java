package empresa.rh.merecruta.Service;

import empresa.rh.merecruta.Model.Cadastro;
import empresa.rh.merecruta.Repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroServiceImplements implements CadastroService {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public Cadastro saveCadastro(Cadastro cadastro) {
        return cadastroRepository.save(cadastro);
    }

}
