package br.unibh.seguros.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@PrimaryKeyJoinColumn
@Table(name="tb_dependente")
public class Dependente extends PessoaFisica {
    
	@NotBlank
	@Pattern(regexp="[A-ZÃ€-Ãº ]*")
	@Max(30)
	@Column(name = "grau_paretensco", length = 30, nullable = false)
	private String grauParentesco;
	
	@NotNull
	@DecimalMin("0.0")
	@DecimalMax("100.0")
	@Column(name = "percentual_beneficio", length = 30, nullable = false)
	private String percentualBeneficio;
	
	@Column(name = "dependente_ir", columnDefinition = "char(1)", nullable = false)
	private String dependenteIR;

	@ManyToOne(fetch = FetchType.EAGER)
	private Proponente proponente;

	public Proponente getProponente() {
		return proponente;
	}

	public void setProponente(Proponente proponente) {
		this.proponente = proponente;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public String getPercentualBeneficio() {
		return percentualBeneficio;
	}

	public void setPercentualBeneficio(String percentualBeneficio) {
		this.percentualBeneficio = percentualBeneficio;
	}

	public String getDependenteIR() {
		return dependenteIR;
	}

	public void setDependenteIR(String dependenteIR) {
		this.dependenteIR = dependenteIR;
	}

}
