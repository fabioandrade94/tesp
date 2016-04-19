package br.unibh.seguros.entidades;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="tb_usuario", uniqueConstraints=@UniqueConstraint(columnNames={"login"}))
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Size(min=5, max=100)
	@Column(length=100, nullable=false)
	private String nome;
	
	@NotBlank
	@Pattern(regexp="[A-Za-z]*")
	@Size(min=8, max=15)
	@Column(length=15, nullable=false)
	private String login;
	
	@NotBlank
	@Size(min=8, max=15)
	@Column(length=100, nullable=false)
	private String senha;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Size(min=5, max=100)
	@Column(length=30, nullable=false)
	private String perfil;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Size(min=5, max=100)
	@Column(length=100, nullable=false)
	private String cargo;
	
	@NotBlank
	@Email
	@Max(100)
	@Column(length=100, nullable=false)
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_cadastro")
	private Date dataCadastro;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Setor setor;
	
	@OneToMany(mappedBy="usuarioDecisao", fetch=FetchType.LAZY)
	private Collection<Tramitacao> tramitacoes;
	
	
	public Collection<Tramitacao> getTramitacoes() {
		return tramitacoes;
	}
	public void setTramitacoes(Collection<Tramitacao> tramitacoes) {
		this.tramitacoes = tramitacoes;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	

}
