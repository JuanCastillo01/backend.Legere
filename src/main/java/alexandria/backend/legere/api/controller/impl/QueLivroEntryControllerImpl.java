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

import alexandria.backend.legere.core.model.QueLivroEntry;
import alexandria.backend.legere.core.service.QueLivroEntryService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/quelivro")
public class QueLivroEntryControllerImpl {

	@Autowired
	private QueLivroEntryService servico;
	
	@GetMapping("/nome/{nome}")
	public List<QueLivroEntry> filtrarPorNome(@PathVariable String nome) {
		return servico.listarEntradasPorNome(nome);
	}

	@GetMapping("{id}")
	public QueLivroEntry filtrarPorId(@PathVariable Long id) {
		return servico.encontrarPorSequencial(id);
	}
	
	@GetMapping
	public QueLivroEntry obterEntradaDiaria() {
		return servico.chamarEntradaAtual();
	}	
	

	@GetMapping("/todos")
	public List<QueLivroEntry> listarEntradas() {
		return servico.listarEntradasQueLivros();
	}

	@PostMapping
	public QueLivroEntry salvarEntrada(@RequestBody QueLivroEntry entidade) {
		return servico.criarNovaEntrada(entidade);
	}

	@PutMapping("{id}")
	public QueLivroEntry atualizarEntrada(@RequestBody QueLivroEntry entidade,@PathVariable Long id) {
		return servico.alterarEntrada(entidade, id);
	}

	@DeleteMapping("{id}")
	public void deletarEntrada(@PathVariable Long id) {
		servico.deletarEntrada(id);
	}

}
