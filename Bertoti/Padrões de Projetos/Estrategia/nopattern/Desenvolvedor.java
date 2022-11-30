package nopatter;

public class Desenvolvedor extends Premio {

	@Override
	public double calculoPremio(double salario) {
		
		return salario + (salario * 0.05);
	}

}
