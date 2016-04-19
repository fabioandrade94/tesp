package br.unibh.seguros.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;


@Entity
@Table(name="tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(30)
	@Column(length=30, nullable=false)
	private String tipo;
	
	@NotNull
	@Pattern(regexp="\\d{8}")
	@Size(min=8, max=8)
	@Column(columnDefinition="char(8)", nullable=false)
	private String cep;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(30)
	@Column(name="tipo_logradouro" , length=30, nullable=false)
	private String tipoLogradouro;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(150)
	@Column(length=150, nullable=false)
	private String logradouro;
	
	@NotBlank
	@Max(30)
	@Column(length=30, nullable=false)
	private String numero;
	
	@Max(100)
	@Column(length=100, nullable=false)
	private String complemento;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(100)
	@Column(length=100, nullable=false)
	private String cidade;
	
	@NotBlank
	@Pattern(regexp="[A-Z]*")
	@Size(min=2, max=2)
	@Column(columnDefinition="char(2)", nullable=false)
	private String estado;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Proponente proponente;
	
	
	public Proponente getProponente() {
		return proponente;
	}
	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
