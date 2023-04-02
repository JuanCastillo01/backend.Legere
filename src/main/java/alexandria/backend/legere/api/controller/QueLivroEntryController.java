package alexandria.backend.legere.api.controller;

import java.util.List;

import alexandria.backend.legere.core.model.QueLivroEntry;

public interface QueLivroEntryController {
	public List<QueLivroEntry> filtrarPorNome(String nome);
	public QueLivroEntry filtrarPorId(Long id);
	public List<QueLivroEntry> listarEntradas();
	public QueLivroEntry salvarEntrada(QueLivroEntry entidade);
	public QueLivroEntry atualizarEntrada(QueLivroEntry entidade,Long id);
	public void deletarEntrada(Long id);
}
