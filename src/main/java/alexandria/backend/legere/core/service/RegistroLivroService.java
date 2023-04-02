package alexandria.backend.legere.core.service;

import java.util.List;

import alexandria.backend.legere.core.model.RegistroLivro;

public interface RegistroLivroService {
	public List<RegistroLivro> listarLivroAoBacklog();
	public RegistroLivro adicionarLivroAoBacklog(RegistroLivro entidade);
	public RegistroLivro alterarLivroAoBacklog(RegistroLivro entidade,Long id);
	public void excluirLivroAoBacklog(Long id);
}
