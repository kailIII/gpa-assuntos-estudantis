package br.ufc.quixada.npi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
public class Servidor {

	
	public Servidor() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String siape;
	
	@ManyToMany
	private List<SelecaoBolsa> servidoresBanca;
	
	@OneToMany(mappedBy="servidor")
	private List<SelecaoBolsa> editais;
	
	@ManyToOne
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public List<SelecaoBolsa> getServidoresBanca() {
		return servidoresBanca;
	}

	public void setServidoresBanca(List<SelecaoBolsa> servidoresBanca) {
		this.servidoresBanca = servidoresBanca;
	}

	public List<SelecaoBolsa> getEditais() {
		return editais;
	}

	public void setEditais(List<SelecaoBolsa> editais) {
		this.editais = editais;
	}

	@Override
	public String toString() {
		return "Servidor [id=" + id + ", siape=" + siape + ", servidoresBanca="
				+ servidoresBanca + ", editais=" + editais + ", usuario="
				+ usuario + "]";
	}
		
}