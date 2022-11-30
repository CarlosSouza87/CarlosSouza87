package nopatter;

public class Diretor extends Premio {
	
	
	
	

	@Override
	public double calculoPremio(double salario) {
		
		return salario +(salario*0.1);
	}

}
