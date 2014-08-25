package br.ufc.quixada.npi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import br.ufc.quixada.npi.enumerator.StatusSelecaoBolsa;

@Entity
public class SelecaoBolsa {

	public SelecaoBolsa(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String tipoDeBolsa;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataInicio;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataTérmino;
	private int quantidadeVagas;
	private String comentários;
	
	@Enumerated(EnumType.STRING)
	private StatusSelecaoBolsa statusSelecao;
	
	
	private int ano;
	private int sequencial;
	private String duraçãoBolsa;
	
	private String identificador;
	
	
	
	@ManyToMany(mappedBy="servidoresBanca")
	private List<Servidor> servidores;
	
	@ManyToOne
	private Servidor servidor;

	@ManyToMany(mappedBy="editais")
	private List<Aluno> alunosBanca;

	@ManyToMany
	private List<Aluno> alunosSelecao;
	
	@ManyToOne
	private Bolsa bolsa;
	
	
	
	public String getTipoDeBolsa() {
		return tipoDeBolsa;
	}



	public void setTipoDeBolsa(String tipoDeBolsa) {
		this.tipoDeBolsa = tipoDeBolsa;
	}



	public Date getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}



	public Date getDataTérmino() {
		return dataTérmino;
	}



	public void setDataTérmino(Date dataTérmino) {
		this.dataTérmino = dataTérmino;
	}



	public int getQuantidadeVagas() {
		return quantidadeVagas;
	}



	public void setQuantidadeVagas(int quantidadeVagas) {
		this.quantidadeVagas = quantidadeVagas;
	}



	public String getComentários() {
		return comentários;
	}



	public void setComentários(String comentários) {
		this.comentários = comentários;
	}



	public StatusSelecaoBolsa getStatusSelecao() {
		return statusSelecao;
	}



	public void setStatusSelecao(StatusSelecaoBolsa statusSelecao) {
		this.statusSelecao = statusSelecao;
	}



	public int getAno() {
		return ano;
	}



	public void setAno(int ano) {
		this.ano = ano;
	}



	public int getSequencial() {
		return sequencial;
	}



	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}



	public String getDuraçãoBolsa() {
		return duraçãoBolsa;
	}



	public void setDuraçãoBolsa(String duraçãoBolsa) {
		this.duraçãoBolsa = duraçãoBolsa;
	}



	public String getIdentificador() {
		return identificador;
	}



	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}



	public List<Servidor> getServidores() {
		return servidores;
	}



	public void setServidores(List<Servidor> servidores) {
		this.servidores = servidores;
	}



	public Servidor getServidor() {
		return servidor;
	}



	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}



	public List<Aluno> getAlunosBanca() {
		return alunosBanca;
	}



	public void setAlunosBanca(List<Aluno> alunosBanca) {
		this.alunosBanca = alunosBanca;
	}



	public List<Aluno> getAlunosSelecao() {
		return alunosSelecao;
	}



	public void setAlunosSelecao(List<Aluno> alunosSelecao) {
		this.alunosSelecao = alunosSelecao;
	}



	public Bolsa getBolsa() {
		return bolsa;
	}



	public void setBolsa(Bolsa bolsa) {
		this.bolsa = bolsa;
	}



	@Override
	public String toString() {
		return "SelecaoBolsa [tipoDeBolsa=" + tipoDeBolsa + ", dataInicio="
				+ dataInicio + ", dataTérmino=" + dataTérmino
				+ ", quantidadeVagas=" + quantidadeVagas + ", comentários="
				+ comentários + ", statusSelecao=" + statusSelecao + ", ano="
				+ ano + ", sequencial=" + sequencial + ", duraçãoBolsa="
				+ duraçãoBolsa + ", identificador=" + identificador
				+ ", servidores=" + servidores + ", servidor=" + servidor
				+ ", alunosBanca=" + alunosBanca + ", alunosSelecao="
				+ alunosSelecao + ", bolsa=" + bolsa + "]";
	}
	
	
	
	
	
	
	
	
}