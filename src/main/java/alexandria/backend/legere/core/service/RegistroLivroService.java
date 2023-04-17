package alexandria.backend.legere.core.service;

import java.util.List;

import alexandria.backend.legere.core.model.RegistroLivro;

public interface RegistroLivroService {
	public List<RegistroLivro> listarLivroBacklog();
	public RegistroLivro adicionarLivroBacklog(Long id_livro);
	public void excluirLivroBacklog(Long id);
	
	public RegistroLivro extrairLivroBacklog();
	public RegistroLivro executadoLivroBacklog(Long id);
}
