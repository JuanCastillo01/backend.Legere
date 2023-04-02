package alexandria.backend.legere.core.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alexandria.backend.legere.core.model.QueLivroEntry;
import alexandria.backend.legere.core.repository.QueLivroEntryRepository;
import alexandria.backend.legere.core.service.QueLivroEntryService;

@Service
public class QueLivroEntryServiceImpl implements QueLivroEntryService{
	@Autowired
	private QueLivroEntryRepository repositorio;
	
	@Override
	public List<QueLivroEntry> listarEntradasQueLivros() {
		return repositorio.findAll();
	}

	@Override
	public QueLivroEntry encontrarPorSequencial(Long id) {
		return repositorio.findById(id).orElse(new QueLivroEntry());
	}

	@Override
	public QueLivroEntry criarNovaEntrada(QueLivroEntry entidade) {
		return repositorio.save(entidade);
	}

	@Override
	public QueLivroEntry alterarEntrada(QueLivroEntry entidade, Long id) {
		entidade.setSequencial(id);
		return repositorio.save(entidade);
	}

	@Override
	public void deletarEntrada(Long id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<String> valoresEstagioA(QueLivroEntry entidade) {
		return  Arrays.asList(entidade.getDicaA(),entidade.getSumarioA(),entidade.getTrechoDificil());
	}

	@Override
	public List<String> valoresEstagioB(QueLivroEntry entidade) {
		return  Arrays.asList(entidade.getDicaB(),entidade.getSumarioB(),entidade.getTrechoMedio());
	}

	@Override
	public List<String> valoresEstagioC(QueLivroEntry entidade) {
		return  Arrays.asList(entidade.getDicaC(),entidade.getSumarioC(),entidade.getTrechoFacil());
	}

	@Override
	public List<QueLivroEntry> listarEntradasPorNome(String nome) {
		return repositorio.findByNomeLivro(nome);
	}

}
