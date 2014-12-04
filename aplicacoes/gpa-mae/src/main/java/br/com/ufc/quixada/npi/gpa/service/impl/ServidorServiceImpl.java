package br.com.ufc.quixada.npi.gpa.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;

import br.com.ufc.quixada.npi.gpa.model.Servidor;
import br.com.ufc.quixada.npi.gpa.service.ServidorService;
import br.ufc.quixada.npi.enumeration.QueryType;
import br.ufc.quixada.npi.service.impl.GenericServiceImpl;

@Named
public class ServidorServiceImpl extends GenericServiceImpl<Servidor> implements ServidorService{

	
	@Override
	public Servidor getServidorBySiape(Integer siape) {
		Map<String, Object> params = new HashMap<>();
		params.put("siape", siape);
		return find(QueryType.JPQL, "select a from Servidor a where a.siape = :siape", params).get(0);
	}
}
