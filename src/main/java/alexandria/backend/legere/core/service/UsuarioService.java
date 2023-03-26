package alexandria.backend.legere.core.service;

import java.util.List;

import alexandria.backend.legere.core.model.Usuario;

public interface UsuarioService {
	public List<Usuario> listarUsuarios();
	public Usuario salvarUsuario(Usuario entidade);
	public void deletarUsuarioPeloId(Long id);
	public Usuario alterarUsuario(Usuario entidade,Long id);
	public Boolean verificarUsuario(Usuario entidade);
}
