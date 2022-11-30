package br.jose.santos.estrategia;

import br.jose.santos.estrategia.Bonificacao;

public class Diretor implements Premio {
	
	
	
	

	@Override
	public double calculoPremio(double salario) {
		
		return salario +(salario*0.1);
	}

}
