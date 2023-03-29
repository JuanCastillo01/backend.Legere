package alexandria.backend.legere.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alexandria.backend.legere.core.model.Avaliacao;
import alexandria.backend.legere.core.repository.AvaliacaoRepository;
import alexandria.backend.legere.core.service.AvaliacaoService;

@Service
public class AvaliacaoServiceImpl implements AvaliacaoService{
	@Autowired
	private AvaliacaoRepository repositorio;

	
	@Override
	public Avaliacao salvar(Avaliacao entity) { 
		return repositorio.save(entity);
	}

	@Override
	public void deletar(Long id) {
		repositorio.deleteById(id);
	}

	@Override
	public Avaliacao alterar(Avaliacao entity, Long id) {
		entity.setId(id);
		return repositorio.save(entity);
	}

	@Override
	public List<Avaliacao> listar() {
		return repositorio.findAll();
	}

	@Override
	public List<Avaliacao> filtrarPorRegistro(Long id) {
		return repositorio.findByFkIdRegistro(id);
	}

	@Override
	public List<Avaliacao> filtrarPorNomeDoLivro(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
