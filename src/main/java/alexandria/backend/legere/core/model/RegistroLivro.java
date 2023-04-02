package alexandria.backend.legere.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ARCHIVED_BOOKS", schema="QUE_LIVRO")
public class RegistroLivro {

	@Id
	@GeneratedValue
	@Column(name="ID") private Long sequencial;
	
	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
	}

	public Long getFkEntradaLivro() {
		return fkEntradaLivro;
	}

	public void setFkEntradaLivro(Long fkEntradaLivro) {
		this.fkEntradaLivro = fkEntradaLivro;
	}

	public String getExecutado() {
		return executado;
	}

	public void setExecutado(String executado) {
		this.executado = executado;
	}

	@Column(name="FK_ENTRY") private Long fkEntradaLivro;
	
	@Column(name="RAN", length=1) private String executado;

	
	public RegistroLivro() {
	}

	public RegistroLivro(Long sequencial, Long fkEntradaLivro, String executado) {
		this.sequencial = sequencial;
		this.fkEntradaLivro = fkEntradaLivro;
		this.executado = executado;
	}
}