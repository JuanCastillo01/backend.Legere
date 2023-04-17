package alexandria.backend.legere.core.service.impl;

import java.util.Collections;
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
	
	public List<RegistroLivro> listarLivroBacklog() {
		return repositorio.findAll();
	}
	
	public RegistroLivro adicionarLivroBacklog(Long idLivro){
		RegistroLivro entidade = new RegistroLivro(); 
		entidade.setEntradaLivro(idLivro);
		entidade.setExecutado("I");
		return repositorio.save(entidade);
	}

	public void excluirLivroBacklog(Long id) {
		repositorio.deleteById(id);
	}

	public RegistroLivro extrairLivroBacklog() {
		List<RegistroLivro> listaIdle = repositorio.findAllByExecutado("I").orElse(Collections.emptyList());
		Long min = listaIdle.stream().map(RegistroLivro::getSequencial).min(Long::compareTo).orElse(null);
		return repositorio.findById(min).orElse(new RegistroLivro());
	}

	public RegistroLivro executadoLivroBacklog(Long id){
		RegistroLivro registroUsado = repositorio.findById(id).orElse(new RegistroLivro());
		registroUsado.setExecutado("R");
		return repositorio.save(registroUsado);
	}
}
