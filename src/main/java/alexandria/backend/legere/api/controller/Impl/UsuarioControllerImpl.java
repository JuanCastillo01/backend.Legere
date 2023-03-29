package alexandria.backend.legere.api.controller.Impl;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alexandria.backend.legere.api.controller.UsuarioController;
import alexandria.backend.legere.core.model.Usuario;
import alexandria.backend.legere.core.service.UsuarioService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/Usuario/")
public class UsuarioControllerImpl implements UsuarioController {

	private UsuarioService servico;
	
	public UsuarioControllerImpl(UsuarioService servico) {
		this.servico = servico;
	}
	
	@PostMapping
	public Usuario salvarUsuario(@RequestBody Usuario user){
		return servico.salvarUsuario(user);
		}
	
	@GetMapping("/auth")
	public ResponseEntity<String> authenticarUsuario(@RequestBody Usuario user) {
		return  Boolean.TRUE.equals((servico.verificarUsuario(user))) 
				? ResponseEntity.status(HttpStatus.OK).body("Authorizado")
						: ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Não autorizado");}
	
	@DeleteMapping("{id}")
	public void deletarUsuario(@PathVariable Long id) {
		servico.deletarUsuarioPeloId(id);
		}
	
	@PutMapping("{id}")
	public Usuario alterarUsuario(@PathVariable Long id, @RequestBody Usuario user) {
		return (servico.alterarUsuario(user, id));
		}
	
	@GetMapping
	public List<Usuario> listarUsuario(){
		return servico.listarUsuarios();
	}
	
	
}
