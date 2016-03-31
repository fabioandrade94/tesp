package br.unibh.seguros.entidades;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity @PrimaryKeyJoinColumn
@Table(name="tb_proponente", uniqueConstraints=@UniqueConstraint(columnNames={"matricula"}))
public class Proponente extends PessoaFisica{


	@Column(columnDefinition="char(8)", nullable=false)
	private String matricula;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_cadastro", nullable=false)
	private Date dataCadastro;
	
	@Column(name="situacao_cadastro", nullable=false, length=30)
	private String situacaoCadastro;
	
	@Column(nullable=false, length=30)
	private String status;
	
	@OneToMany(mappedBy="proponente", fetch=FetchType.LAZY)
	private Collection<Endereco> enderecos;
	
	@OneToMany(mappedBy="proponente", fetch=FetchType.LAZY)
	private Collection<Dependente> dependentes;
	
	@OneToMany(mappedBy="proponente", fetch=FetchType.LAZY)
	private Collection<Vinculo> vinculos;
	
	@OneToMany(mappedBy="proponente", fetch=FetchType.LAZY)
	private Collection<Proposta> propostas;
	
	@OneToMany(mappedBy="proponente", fetch=FetchType.LAZY)
	private Collection<Seguro> seguros;
	
	public Collection<Seguro> getSeguros() {
		return seguros;
	}
	public void setSeguros(Collection<Seguro> seguros) {
		this.seguros = seguros;
	}
	public Collection<Proposta> getPropostas() {
		return propostas;
	}
	public void setPropostas(Collection<Proposta> propostas) {
		this.propostas = propostas;
	}
	public Collection<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Collection<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public Collection<Dependente> getDependentes() {
		return dependentes;
	}
	public void setDependentes(Collection<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	public Collection<Vinculo> getVinculos() {
		return vinculos;
	}
	public void setVinculos(Collection<Vinculo> vinculos) {
		this.vinculos = vinculos;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getSituacaoCadastro() {
		return situacaoCadastro;
	}
	public void setSituacaoCadastro(String situacaoCadastro) {
		this.situacaoCadastro = situacaoCadastro;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
