package br.com.ufc.quixada.npi.gpa.enums;

import java.util.HashMap;
import java.util.Map;

public enum GrauParentescoImovelRural {
	SEMPROPRUR("Sem propriedade rural"), PAI("Pai"), AVO("Avô"), TIO("Tio"), IRMAO(
			"Irmão"), CONJUGUE("Cônjuge ou Companheiro(a)"), OUTROS("Outros");

	private String nome;
	private static Map<GrauParentescoImovelRural, String> map;

	GrauParentescoImovelRural(String nome) {
		this.nome = nome;
	}

	public static Map<GrauParentescoImovelRural, String> toMap() {
		if (map == null) {
			map = new HashMap<GrauParentescoImovelRural, String>();
			for (GrauParentescoImovelRural gpir : GrauParentescoImovelRural
					.values()) {
				map.put(gpir, gpir.nome);
			}
		}

		return map;
	}

}
