package br.com.ufc.quixada.npi.gpa.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Aluno {
	
	public Aluno() {}
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Size(min = 7, message = "Matricula deve possuir 7 dígitos")
	private String matricula;
	
	@ManyToMany
	private List<SelecaoBolsa> editais;
	
	@ManyToMany(mappedBy="alunosSelecao")
	private List<SelecaoBolsa> editaisAluno;
	
	@OneToOne
	private QuestionarioAuxilioMoradia auxilioMoradia;
	
	@OneToOne
	private QuestionarioIniciacaoAcademica iniciacaoAcademica;
	

	@NotEmpty
	private String curso;
	
	private String nome;
	
	@NotEmpty		
	private String anoIngresso;
	
	@NotNull
	@Min(value= 1, message="IRA deve ser maior que 0")
	@Max(value= 10, message="IRA deve ter valor máximo à 10")
	private double ira;
	
	@NotEmpty
	private String banco;
	
	@NotEmpty
	@Size(max= 10, message="Agencia de possuir no máximo 10 dígitos")
	private String agencia;
	
	@NotEmpty
	@Size(max= 20, message="Conta deve possuir no máximo 20 dígitos")
	private String conta;
    
	@ManyToOne
	private Pessoa pessoa;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Pessoa getUsuario() {
		return pessoa;
	}

	public void setUsuario(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	public QuestionarioAuxilioMoradia getAuxilioMoradia() {
		return auxilioMoradia;
	}

	public void setAuxilioMoradia(QuestionarioAuxilioMoradia auxilioMoradia) {
		this.auxilioMoradia = auxilioMoradia;
	}

	public QuestionarioIniciacaoAcademica getIniciacaoAcademica() {
		return iniciacaoAcademica;
	}

	public void setIniciacaoAcademica(
			QuestionarioIniciacaoAcademica iniciacaoAcademica) {
		this.iniciacaoAcademica = iniciacaoAcademica;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(String anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public double getIra() {
		return ira;
	}

	public void setIra(Double ira) {
		this.ira = ira;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
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

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", matricula=" + matricula + ", editais="
				+ editais + ", editaisAluno=" + editaisAluno
				+ ", auxilioMoradia=" + auxilioMoradia
				+ ", iniciacaoAcademica=" + iniciacaoAcademica + ", nome="
				+ nome + ", anoIngresso=" + anoIngresso + ", ira=" + ira
				+ ", curso=" + curso + ", banco=" + banco + ", agencia="
				+ agencia + ", conta=" + conta + ", pessoa=" + pessoa + "]";
	}
	
	

}