package alexandria.backend.legere.core.service;

import java.util.List;

import alexandria.backend.legere.core.model.Avaliacao;

public interface AvaliacaoService {
	public  Avaliacao salvar(Avaliacao entity);
	public  void deletar(Long id);
	public  Avaliacao alterar(Avaliacao entity,Long id);
	public  List<Avaliacao> listar();
}
