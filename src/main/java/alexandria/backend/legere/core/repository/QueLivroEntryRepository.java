package alexandria.backend.legere.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import alexandria.backend.legere.core.model.QueLivroEntry;
@Repository
public interface QueLivroEntryRepository extends JpaRepository<QueLivroEntry,Long>{
	public List<QueLivroEntry> findByNomeLivro(String nome);
}
