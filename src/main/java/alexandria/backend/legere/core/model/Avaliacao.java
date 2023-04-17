package alexandria.backend.legere.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="AVAL",schema = "public")
public class Avaliacao {
	
	@Id @GeneratedValue
	@Column(name="ID") private Long sequencial;
	
	@Column(name="Comment") private String cometario;
	
	@Column(name="Rating", length=2) private Integer satisfacao;

	@Column(name="Recomendation") private String recomendacao;



	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long id) {
		this.sequencial = id;
	}

	public String getCometario() {
		return cometario;
	}

	public void setCometario(String cometario) {
		this.cometario = cometario;
	}

	public Integer getSatisfacao() {
		return satisfacao;
	}

	public void setSatisfacao(Integer satisfacao) {
		this.satisfacao = satisfacao;
	}

	public String getRecomendacao() {
		return recomendacao;
	}

	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}

	public Avaliacao() {}
	public Avaliacao(Long id, String cometario, Integer satisfacao, String recomendacao, Long fkIdRegistro) {
		this.sequencial = id;
		this.cometario = cometario;
		this.satisfacao = satisfacao;
		this.recomendacao = recomendacao;
	}
}
