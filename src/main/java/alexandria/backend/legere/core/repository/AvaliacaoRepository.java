package alexandria.backend.legere.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alexandria.backend.legere.core.model.Avaliacao;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
	public List<Avaliacao> findByFkIdRegistro(Long fk);
}
