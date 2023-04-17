package alexandria.backend.legere.api.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alexandria.backend.legere.core.model.RegistroLivro;
import alexandria.backend.legere.core.service.RegistroLivroService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/register")
public class RegistroLivroControllerImpl{

	@Autowired
	private RegistroLivroService servico;
	
	@GetMapping("/todos")
	public List<RegistroLivro> listarRegistrosLivro() {
		return servico.listarLivroBacklog();
	}
	
	@PostMapping("/{idLivro}")
	public RegistroLivro salvarRegistroLivro(@PathVariable Long idLivro) {
		return servico.adicionarLivroBacklog(idLivro);
	}

	@DeleteMapping("/{id}")
	public void deletarRegistroLivro(@PathVariable Long id) {
		servico.excluirLivroBacklog(id);
		
	}

	@PutMapping("/{id}")
	public RegistroLivro marcarRegistro(@PathVariable Long id){
		return servico.executadoLivroBacklog(id);
		
	}
	
}
