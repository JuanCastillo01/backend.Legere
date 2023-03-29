package alexandria.backend.legere.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import alexandria.backend.legere.core.model.Usuario;

public interface UsuarioController {
	public Usuario salvarUsuario(@RequestBody Usuario user);
	public ResponseEntity<String> authenticarUsuario(@RequestBody Usuario user);
	public void deletarUsuario(@PathVariable Long id);
	public Usuario alterarUsuario(@PathVariable Long id, @RequestBody Usuario user);
	public List<Usuario> listarUsuario();
}
