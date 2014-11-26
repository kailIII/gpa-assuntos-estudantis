package br.com.ufc.quixada.npi.gpa.service.impl;


import java.util.HashMap;
import java.util.Map;

import javax.inject.Named;

import br.com.ufc.quixada.npi.gpa.model.Aluno;
import br.com.ufc.quixada.npi.gpa.service.AlunoService;
import br.ufc.quixada.npi.enumeration.QueryType;
import br.ufc.quixada.npi.service.impl.GenericServiceImpl;

@Named
public class AlunoServiceImpl extends GenericServiceImpl<Aluno> implements AlunoService{

	@Override
	public Aluno getAlunoByMatricula(String matricula) {
		Map<String, Object> params = new HashMap<>();
		params.put("matricula", matricula);
		return find(QueryType.JPQL, "select a from Aluno a where a.matricula = :matricula", params).get(0);
	}
}
