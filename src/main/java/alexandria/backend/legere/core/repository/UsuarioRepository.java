package alexandria.backend.legere.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alexandria.backend.legere.core.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
}