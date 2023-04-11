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

import alexandria.backend.legere.core.model.Avaliacao;
import alexandria.backend.legere.core.service.AvaliacaoService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/aval")
public class AvaliacaoControllerImpl{

	@Autowired
	private AvaliacaoService servico;
	
	@PostMapping
	public Avaliacao savarAvaliacao(@RequestBody Avaliacao entity) {
		return servico.salvar(entity);
	}

	@DeleteMapping("/{id}")
	public void  deletarAvaliacao(@PathVariable Long id) {
		servico.deletar(id);
	}

	@PutMapping("/{id}")
	public Avaliacao alterarAvaliacao(@PathVariable Long id,@RequestBody Avaliacao entity) {
		return servico.alterar(entity,id);
	}

	@GetMapping
	public List<Avaliacao> listarAvaliacoes() {
		return servico.listar();
	}

	@GetMapping("/{id}")
	public List<Avaliacao>listarAvaliacoesDeRegistro(@PathVariable Long id) {
		return servico.filtrarPorRegistro(id);
	}

}
