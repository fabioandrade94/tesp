package br.unibh.seguros.entidades;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tb_setor", uniqueConstraints = @UniqueConstraint(columnNames = { "nome" }))
public class Setor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 150, nullable = false)
	private String nome;
	
	@OneToMany(mappedBy="setor", fetch=FetchType.LAZY)
	private Collection<Usuario> membros;
	
	@OneToOne(optional=true) // faz inner-join
	@JoinColumn(name="setor_superior_id")
	private Setor setorSuperior;
	
	@OneToMany(mappedBy="setor", fetch=FetchType.LAZY)
	private Collection<Tramitacao> tramitacoes;
	
	public Collection<Tramitacao> getTramitacoes() {
		return tramitacoes;
	}

	public void setTramitacoes(Collection<Tramitacao> tramitacoes) {
		this.tramitacoes = tramitacoes;
	}

	public Setor getSetorSuperior() {
		return setorSuperior;
	}

	public void setSetorSuperior(Setor setorSuperior) {
		this.setorSuperior = setorSuperior;
	}

	public Collection<Usuario> getMembros() {
		return membros;
	}

	public void setMembros(Collection<Usuario> membros) {
		this.membros = membros;
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

}
