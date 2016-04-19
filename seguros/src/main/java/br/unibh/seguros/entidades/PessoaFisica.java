package br.unibh.seguros.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity @Inheritance(strategy=InheritanceType.JOINED)
@Table(name="tb_pessoa_fisica", uniqueConstraints=@UniqueConstraint(columnNames={"cpf"}))
public class PessoaFisica {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Size(min=5, max=100)
	@Column(length=100, nullable=false)
	private String nome;
	
	@NotBlank
	@Pattern(regexp="\\d{14}", message="ATENÃ‡ÃƒO: Deve ser informado 11 dÃ­gitos!")
	@Column(columnDefinition="char(7)", nullable=false)
	private String cpf;
	
	@Pattern(regexp="\\(\\d{2}\\)\\d{4}-\\d{4}")
	@Column(name="telefone_comercial", columnDefinition="char(14)", nullable=true)
	private String telefoneComercial;
	
	@NotBlank
	@Pattern(regexp="\\(\\d{2}\\)\\d{4}-\\d{4}")
	@Column(name="telefone_residencial", columnDefinition="char(14)", nullable=false)
	private String telefoneResidencial;
	
	@Pattern(regexp="\\(\\d{2}\\)\\d{4}-\\d{4}")
	@Column(name="telefone_celular", columnDefinition="char(14)", nullable=true)
	private String telefoneCelular;
	
	@Email
	@Max(100)
	@Column(length=100, nullable=true)
	private String email;
	
	@Range(min=18, max=99)
	@Column(nullable=false)
	private Integer idade;
	
	@NotNull
	@Past
	@Temporal(TemporalType.DATE)
	@Column(name="data_nascimento", nullable=false)
	private Date dataNascimento;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
