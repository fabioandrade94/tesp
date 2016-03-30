package br.unibh.seguros.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_questionario")
public class Questionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="portador_necessidades_especiais", columnDefinition="char(1)", nullable=false)
	private String portadorNecessidadesEspeciais;
	
	@Column(name="portador_molestia_grave", columnDefinition="char(1)", nullable=false)
	private String portadorMolestiaGrave;
	
	@Column(name="utiliza_remedio_controlado", columnDefinition="char(1)", nullable=false)
	private String utilizaRemedioControlado;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_ultima_internacao", nullable=true)
	private Date dataUltimaInternacao;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_ultima_consulta_medica", nullable=true)
	private Date dataUltimaConsultaMedica;
	
	@Column(name="possui_plano_saude_particular", columnDefinition="char(1)", nullable=false)
	private String possuiPlanoSaudeParticular;
	
	@Column(name="pratica_esportes", columnDefinition="char(1)", nullable=false)
	private String praticaEsportes;
	
	@Column(name="executa_atividade_de_risco", columnDefinition="char(1)", nullable=false)
	private String executaAtividadeDeRisco;
	
	@Column(name="se_envolveu_em_acidente_ultimo_ano", columnDefinition="char(1)", nullable=false)
	private String seEnvolveuEmAcidenteUltimoAno;
	
	@Column(name="historico_cancer_familiar", columnDefinition="char(1)", nullable=false)
	private Boolean historicoCancerFamilia;
	
	@Column(name="possui_doenca_contagiosa", columnDefinition="char(1)", nullable=false)
	private String possuiDoencaContagiosa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPortadorNecessidadesEspeciais() {
		return portadorNecessidadesEspeciais;
	}
	public void setPortadorNecessidadesEspeciais(String portadorNecessidadesEspeciais) {
		this.portadorNecessidadesEspeciais = portadorNecessidadesEspeciais;
	}
	public String getPortadorMolestiaGrave() {
		return portadorMolestiaGrave;
	}
	public void setPortadorMolestiaGrave(String portadorMolestiaGrave) {
		this.portadorMolestiaGrave = portadorMolestiaGrave;
	}
	public String getUtilizaRemedioControlado() {
		return utilizaRemedioControlado;
	}
	public void setUtilizaRemedioControlado(String utilizaRemedioControlado) {
		this.utilizaRemedioControlado = utilizaRemedioControlado;
	}
	public Date getDataUltimaInternacao() {
		return dataUltimaInternacao;
	}
	public void setDataUltimaInternacao(Date dataUltimaInternacao) {
		this.dataUltimaInternacao = dataUltimaInternacao;
	}
	public Date getDataUltimaConsultaMedica() {
		return dataUltimaConsultaMedica;
	}
	public void setDataUltimaConsultaMedica(Date dataUltimaConsultaMedica) {
		this.dataUltimaConsultaMedica = dataUltimaConsultaMedica;
	}
	public String getPossuiPlanoSaudeParticular() {
		return possuiPlanoSaudeParticular;
	}
	public void setPossuiPlanoSaudeParticular(String possuiPlanoSaudeParticular) {
		this.possuiPlanoSaudeParticular = possuiPlanoSaudeParticular;
	}
	public String getPraticaEsportes() {
		return praticaEsportes;
	}
	public void setPraticaEsportes(String praticaEsportes) {
		this.praticaEsportes = praticaEsportes;
	}
	public String getExecutaAtividadeDeRisco() {
		return executaAtividadeDeRisco;
	}
	public void setExecutaAtividadeDeRisco(String executaAtividadeDeRisco) {
		this.executaAtividadeDeRisco = executaAtividadeDeRisco;
	}
	public String getSeEnvolveuEmAcidenteUltimoAno() {
		return seEnvolveuEmAcidenteUltimoAno;
	}
	public void setSeEnvolveuEmAcidenteUltimoAno(String seEnvolveuEmAcidenteUltimoAno) {
		this.seEnvolveuEmAcidenteUltimoAno = seEnvolveuEmAcidenteUltimoAno;
	}
	public Boolean getHistoricoCancerFamilia() {
		return historicoCancerFamilia;
	}
	public void setHistoricoCancerFamilia(Boolean historicoCancerFamilia) {
		this.historicoCancerFamilia = historicoCancerFamilia;
	}
	public String getPossuiDoencaContagiosa() {
		return possuiDoencaContagiosa;
	}
	public void setPossuiDoencaContagiosa(String possuiDoencaContagiosa) {
		this.possuiDoencaContagiosa = possuiDoencaContagiosa;
	}
	
	

	

}


















/*
private Boolean getBoolean(Character character){
return character == null ? null: character.equals('S)?
Boolean.TRUE : Boolean.FALSE

private Character getCharacter(Boolean bool){

return bool = null ? null: bool? 'S' : 'N';

*/