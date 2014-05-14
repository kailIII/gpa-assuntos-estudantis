package br.quixada.ufc.npi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bolsa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String requisitos;
	
	@OneToMany(mappedBy ="bolsa")
	private List<Edital> edital;
	
	@OneToMany(mappedBy ="bolsa")
	private List<QuestionarioAuxilioMoradia> questionarioAuxilioMoradia;
	
	@OneToMany(mappedBy ="bolsa")
	private List<QuestionarioIniciacaoAcademica> questionarioIniciacaoAcademica;
	
	public enum tipoBolsa{
		bolsaIniciacaoCientifica("Bolsa - Iniciação Científica"), bolsaAuxilioMoradia("Bolsa - Auxílio Moradia");
	tipoBolsa(String nome){}
	}
	
	private tipoBolsa tipo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public tipoBolsa getTipo() {
		return tipo;
	}

	public void setTipo(tipoBolsa tipo) {
		this.tipo = tipo;
	}

	public List<QuestionarioAuxilioMoradia> getQuestionarioAuxilioMoradia() {
		return questionarioAuxilioMoradia;
	}

	public void setQuestionarioAuxilioMoradia(
			List<QuestionarioAuxilioMoradia> questionarioAuxilioMoradia) {
		this.questionarioAuxilioMoradia = questionarioAuxilioMoradia;
	}

	public List<QuestionarioIniciacaoAcademica> getQuestionarioIniciacaoAcademica() {
		return questionarioIniciacaoAcademica;
	}

	public void setQuestionarioIniciacaoAcademica(
			List<QuestionarioIniciacaoAcademica> questionarioIniciacaoAcademica) {
		this.questionarioIniciacaoAcademica = questionarioIniciacaoAcademica;
	}
	
	
	
}
