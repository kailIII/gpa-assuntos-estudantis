package br.com.ufc.quixada.npi.gpa.service.impl;

import javax.inject.Named;

import br.com.ufc.quixada.npi.gpa.model.Servidor;
import br.com.ufc.quixada.npi.gpa.service.ServidorService;
import br.ufc.quixada.npi.service.impl.GenericServiceImpl;
import br.ufc.quixada.npi.util.SimpleMap;

@Named
public class ServidorServiceImpl extends GenericServiceImpl<Servidor> implements ServidorService{

	
	@Override
	public Servidor getServidorBySiape(String siape) {
		return (Servidor) findFirst("Servidor.findServidorBySiape", new SimpleMap<String, Object>("siape", siape));
		
	}
}
