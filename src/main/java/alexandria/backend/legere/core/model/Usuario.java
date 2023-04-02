package alexandria.backend.legere.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER",schema = "public")
public class Usuario {

	@Id @GeneratedValue
	@Column(name="ID") private Long sequencial;
	
	@Column(name="NAME") private String nomeUsuario;
	
	@Column(name="EMAIL") private String email;
	
	@Column(name="HASH") private String hashPassword;

	public Long getSequencial() {
		return sequencial;
	}

	public void setSequencial(Long sequencial) {
		this.sequencial = sequencial;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHashPassword() {
		return hashPassword;
	}

	public void setHashPassword(String hashPassword) {
		this.hashPassword = hashPassword;
	}
	public Usuario() {}
	public Usuario(Long sequencial, String nomeUsuario, String email, String hashPassword) {
		this.sequencial = sequencial;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.hashPassword = hashPassword;
	}
}
	
	
