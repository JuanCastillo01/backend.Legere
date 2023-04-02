package alexandria.backend.legere.api.controller;

import java.util.List;

import alexandria.backend.legere.core.model.RegistroLivro;

public interface RegistroLivroController {
	public List<RegistroLivro> listarRegistroLivro();
	public RegistroLivro salvarRegistroLivro(RegistroLivro dto);
	public void deletarRegistroLivro(Long id);
	public RegistroLivro alterarRegistroLivro(RegistroLivro dto, Long id);
	
}
