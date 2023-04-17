package alexandria.backend.legere.core.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import alexandria.backend.legere.core.model.RegistroLivro;

public interface RegistroLivroRepository extends JpaRepository<RegistroLivro, Long>{
	Optional<List<RegistroLivro>> findAllByExecutado(String state);
}
