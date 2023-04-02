package alexandria.backend.legere.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alexandria.backend.legere.core.model.RegistroLivro;
import alexandria.backend.legere.core.repository.RegistroLivroRepository;
import alexandria.backend.legere.core.service.RegistroLivroService;
@Service
public class RegistroLivroServiceImpl implements RegistroLivroService{
	@Autowired
	private RegistroLivroRepository repositorio;
	
	@Override
	public List<RegistroLivro> listarLivroAoBacklog() {
		return repositorio.findAll();
	}

	@Override
	public RegistroLivro adicionarLivroAoBacklog(RegistroLivro entidade) {
		return repositorio.save(entidade);
	}

	@Override
	public RegistroLivro alterarLivroAoBacklog(RegistroLivro entidade, Long id) {
		entidade.setSequencial(id);
		return repositorio.save(entidade);
	}

	@Override
	public void excluirLivroAoBacklog(Long id) {
		repositorio.deleteById(id);
	}

}
