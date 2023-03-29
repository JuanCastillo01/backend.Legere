package alexandria.backend.legere.api.controller;

import java.util.List;

import alexandria.backend.legere.core.model.Avaliacao;

public interface AvaliacaoController {
	public Avaliacao savarAvaliacao(Avaliacao entity);
	public void deletarAvaliacao(Long id );
	public Avaliacao alterarAvaliacao(Long id, Avaliacao entity);
	public List<Avaliacao> listarAvaliacoes();
	public List<Avaliacao> listarAvaliacoesDeRegistro(Long id);
}
