package alexandria.backend.legere.core.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alexandria.backend.legere.core.model.QueLivroEntry;
import alexandria.backend.legere.core.model.RegistroLivro;
import alexandria.backend.legere.core.repository.QueLivroEntryRepository;
import alexandria.backend.legere.core.service.QueLivroEntryService;
import alexandria.backend.legere.core.service.RegistroLivroService;

@Service
public class QueLivroEntryServiceImpl implements QueLivroEntryService{
	@Autowired
	private QueLivroEntryRepository repositorio;
	@Autowired
	private RegistroLivroService serviceRegistro;
	
	public QueLivroEntry chamarEntradaAtual() {
		RegistroLivro dailyregistrer = serviceRegistro.extrairLivroBacklog();
		return encontrarPorSequencial(dailyregistrer.getEntradaLivro());
	}
	
	public List<QueLivroEntry> listarEntradasQueLivros() {
		return repositorio.findAll();
	}

	public QueLivroEntry encontrarPorSequencial(Long id) {
		return repositorio.findById(id).orElse(new QueLivroEntry());
	}

	public QueLivroEntry criarNovaEntrada(QueLivroEntry entidade) {
		return repositorio.save(entidade);
	}

	public QueLivroEntry alterarEntrada(QueLivroEntry entidade, Long id) {
		entidade.setSequencial(id);
		return repositorio.save(entidade);
	}

	public void deletarEntrada(Long id) {
		repositorio.deleteById(id);
	}

	public List<String> valoresEstagioA(QueLivroEntry entidade) {
		return  Arrays.asList(entidade.getDicaA(),entidade.getSumarioA(),entidade.getTrechoDificil());
	}

	public List<String> valoresEstagioB(QueLivroEntry entidade) {
		return  Arrays.asList(entidade.getDicaB(),entidade.getSumarioB(),entidade.getTrechoMedio());
	}

	public List<String> valoresEstagioC(QueLivroEntry entidade) {
		return  Arrays.asList(entidade.getDicaC(),entidade.getSumarioC(),entidade.getTrechoFacil());
	}

	public List<QueLivroEntry> listarEntradasPorNome(String nome) {
		return repositorio.findByNomeLivro(nome);
	}
}
