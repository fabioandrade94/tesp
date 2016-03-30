package br.unibh.seguros.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn
public class Dependente extends PessoaFisica {

	@Column(name = "grau_paretensco", length = 30, nullable = false)
	private String grauParentesco;
	
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
