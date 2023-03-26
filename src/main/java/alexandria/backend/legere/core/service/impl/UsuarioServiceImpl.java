package alexandria.backend.legere.core.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import alexandria.backend.legere.core.model.Usuario;
import alexandria.backend.legere.core.repository.UsuarioRepository;
import alexandria.backend.legere.core.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	

	@Override
	public Usuario salvarUsuario(Usuario entidade) {
		return repositorio.save(entidade);
	}

	@Override
	public void deletarUsuarioPeloId(Long id) {
		repositorio.deleteById(id);
	}

	@Override
	public Usuario alterarUsuario(Usuario entidade, Long id) {
		entidade.setSequencial(id);
		return repositorio.save(entidade);
	}

	@Override
	public Boolean verificarUsuario(Usuario entidade) {
		Long idEntrada = entidade.getSequencial();
		Optional<Usuario> foundUsuario = repositorio.findById(idEntrada);
		return (foundUsuario.isPresent()) && entidade.getHashPassword().equals(foundUsuario.get().getHashPassword());
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return repositorio.findAll();
	} 
	
	

	
}
