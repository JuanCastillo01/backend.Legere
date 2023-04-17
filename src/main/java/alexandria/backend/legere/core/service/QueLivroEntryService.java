package alexandria.backend.legere.core.service;

import java.util.List;

import alexandria.backend.legere.core.model.QueLivroEntry;

public interface QueLivroEntryService {
	public QueLivroEntry chamarEntradaAtual();
	
	public List<QueLivroEntry> listarEntradasQueLivros();
	public QueLivroEntry encontrarPorSequencial(Long id);
	public QueLivroEntry  criarNovaEntrada(QueLivroEntry entidade);
	public QueLivroEntry  alterarEntrada(QueLivroEntry entidade,Long id);
	public void deletarEntrada(Long id);
	public List<String>  valoresEstagioA(QueLivroEntry entidade);
	public List<String>  valoresEstagioB(QueLivroEntry entidade);
	public List<String>  valoresEstagioC(QueLivroEntry entidade);
	public List<QueLivroEntry> listarEntradasPorNome(String nome);
}
