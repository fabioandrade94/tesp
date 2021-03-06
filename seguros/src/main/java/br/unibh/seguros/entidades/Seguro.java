package br.unibh.seguros.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="tb_seguro", uniqueConstraints=@UniqueConstraint(columnNames={"codigo_susep"}))
public class Seguro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Max(15)
	@Column(name="codigo_susep", columnDefinition="char(15)", nullable=false)
	private String codigoSusep;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(30)
	@Column(name="tipo_segurado", length=30, nullable=false)
    private String tipoSegurado;
	
	@NotNull
	@DecimalMin("1000.00")
	@DecimalMax("10000000.00")
	@Column(name="valor_segurado", columnDefinition="DECIMAL(14,2)", nullable=false)
    private Double valorSegurado;
	
	@NotBlank
	@Max(1)
	@Column(columnDefinition="char(1)", nullable=false)
    private String classe;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="data_inicio_vigencia", nullable=false)
    private Date dataInicioVigencia;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@Column(name="data_termino_vigencia", nullable=false)
    private Date dataTerminoVigencia;
	
	@NotNull
	@Range(min=0, max=24)
	@Column(name="carencia_em_meses", columnDefinition="int", nullable=false)
    private Integer carenciaEmMeses;
	
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(30)
	@Column(name="situacao_atual", length=30, nullable=false)
    private String situacaoAtual;
	
	@NotNull
	@DecimalMin("100.00")
	@DecimalMax("100000.00")
	@Column(name="valor_premio", columnDefinition="DECIMAL(14,2)", nullable=false)
    private Double valorPremio;
	
	@NotNull
	@Range(min=1, max=31)
	@Column(name="dia_pagamento", columnDefinition="int", nullable=false)
    private Integer diaPagamento;
	
	@NotBlank
	@Max(50)
	@Column(name="banco_pagamento", length=80, nullable=false)
    private String bancoPagamento;
	
	@NotBlank
	@Max(15)
	@Column(length=15, nullable=false)
    private String agencia;
	
	@NotBlank
	@Max(15)
	@Column(length=15, nullable=false)
    private String conta;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Proponente proponente;
	
	@OneToOne(optional=false)
	@JoinColumn(name="proposta_id")
	private Proposta proposta;
    
	public Proposta getProposta() {
		return proposta;
	}
	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}
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
	public String getCodigoSusep() {
		return codigoSusep;
	}
	public void setCodigoSusep(String codigoSusep) {
		this.codigoSusep = codigoSusep;
	}
	public String getTipoSegurado() {
		return tipoSegurado;
	}
	public void setTipoSegurado(String tipoSegurado) {
		this.tipoSegurado = tipoSegurado;
	}
	public Double getValorSegurado() {
		return valorSegurado;
	}
	public void setValorSegurado(Double valorSegurado) {
		this.valorSegurado = valorSegurado;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}
	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}
	public Date getDataTerminoVigencia() {
		return dataTerminoVigencia;
	}
	public void setDataTerminoVigencia(Date dataTerminoVigencia) {
		this.dataTerminoVigencia = dataTerminoVigencia;
	}
	public Integer getCarenciaEmMeses() {
		return carenciaEmMeses;
	}
	public void setCarenciaEmMeses(Integer carenciaEmMeses) {
		this.carenciaEmMeses = carenciaEmMeses;
	}
	public String getSituacaoAtual() {
		return situacaoAtual;
	}
	public void setSituacaoAtual(String situacaoAtual) {
		this.situacaoAtual = situacaoAtual;
	}
	public Double getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}
	public Integer getDiaPagamento() {
		return diaPagamento;
	}
	public void setDiaPagamento(Integer diaPagamento) {
		this.diaPagamento = diaPagamento;
	}
	public String getBancoPagamento() {
		return bancoPagamento;
	}
	public void setBancoPagamento(String bancoPagamento) {
		this.bancoPagamento = bancoPagamento;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
    
    
}