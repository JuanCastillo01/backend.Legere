package alexandria.backend.legere.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ARCHIVED_BOOKS")
public class RegistroLivro {

	@Id
	@GeneratedValue
	@Column(name="ID") private Long sequencial;
	
	@Column(name="FK_ENTRY") private Long entradaLivro;
	
	@Column(name="RAN", length=1) private String executado;
	
	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
	}

	public Long getEntradaLivro() {
		return entradaLivro;
	}

	public void setEntradaLivro(Long fkEntradaLivro) {
		this.entradaLivro = fkEntradaLivro;
	}

	public String getExecutado() {
		return executado;
	}

	public void setExecutado(String executado) {
		this.executado = executado;
	}

	
	public RegistroLivro() {
	}

	public RegistroLivro(Long sequencial, Long fkEntradaLivro, String executado) {
		this.sequencial = sequencial;
		this.entradaLivro = fkEntradaLivro;
		this.executado = executado;
	}
}