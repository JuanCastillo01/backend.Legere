package alexandria.backend.legere.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BOOKGAME", schema="public")
public class QueLivroEntry {
	@Id @GeneratedValue
	@Column(name="ID") private Long sequencial;
	
	@Column(name="NOME") private String nomeLivro;
	
	@Column(name="Autor") private String autoria;
	
	@Column(name="CURIOSIDADE_A", length=512) private String dicaA;
	
	@Column(name="CURIOSIDADE_B", length=512) private String dicaB;
	
	@Column(name="CURIOSIDADE_C", length=512) private String dicaC;
	
	@Column(name="SUMARIO_A", length=512) private String sumarioA;
	
	@Column(name="SUMARIO_B", length=512) private String sumarioB;
	
	@Column(name="SUMARIO_C", length=512) private String sumarioC;
	
	@Column(name="TRECHO_FACIL", length=512) private String trechoFacil;
	
	@Column(name="TRECHO_MEDIO", length=512) private String trechoMedio;
	
	@Column(name="TRECHO_DIFICIL", length=512) private String trechoDificil;

	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getAutoria() {
		return autoria;
	}

	public void setAutoria(String autoria) {
		this.autoria = autoria;
	}

	public String getDicaA() {
		return dicaA;
	}

	public void setDicaA(String dicaA) {
		this.dicaA = dicaA;
	}

	public String getDicaB() {
		return dicaB;
	}

	public void setDicaB(String dicaB) {
		this.dicaB = dicaB;
	}

	public String getDicaC() {
		return dicaC;
	}

	public void setDicaC(String dicaC) {
		this.dicaC = dicaC;
	}

	public String getSumarioA() {
		return sumarioA;
	}

	public void setSumarioA(String sumarioA) {
		this.sumarioA = sumarioA;
	}

	public String getSumarioB() {
		return sumarioB;
	}

	public void setSumarioB(String sumarioB) {
		this.sumarioB = sumarioB;
	}

	public String getSumarioC() {
		return sumarioC;
	}

	public void setSumarioC(String sumarioC) {
		this.sumarioC = sumarioC;
	}

	public String getTrechoFacil() {
		return trechoFacil;
	}

	public void setTrechoFacil(String trechoFacil) {
		this.trechoFacil = trechoFacil;
	}

	public String getTrechoMedio() {
		return trechoMedio;
	}

	public void setTrechoMedio(String trechoMedio) {
		this.trechoMedio = trechoMedio;
	}

	public String getTrechoDificil() {
		return trechoDificil;
	}

	public void setTrechoDificil(String trechoDificil) {
		this.trechoDificil = trechoDificil;
	}

	
	public QueLivroEntry() {}
	public QueLivroEntry(Long sequencial, String nomeLivro, String autoria, String dicaA, String dicaB, String dicaC,
			String sumarioA, String sumarioB, String sumarioC, String trechoFacil, String trechoMedio,
			String trechoDificil) {
		this.sequencial = sequencial;
		this.nomeLivro = nomeLivro;
		this.autoria = autoria;
		this.dicaA = dicaA;
		this.dicaB = dicaB;
		this.dicaC = dicaC;
		this.sumarioA = sumarioA;
		this.sumarioB = sumarioB;
		this.sumarioC = sumarioC;
		this.trechoFacil = trechoFacil;
		this.trechoMedio = trechoMedio;
		this.trechoDificil = trechoDificil;
	}
	
}
