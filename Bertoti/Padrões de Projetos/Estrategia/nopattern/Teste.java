package nopatter;

public class Teste {

	public static void main(String[] args) {
		
		Colaborador carlos = new Diretor();
		
		carlos.setNome("José Maria");
		carlos.setSalario(10000.00);
		System.out.println(carlos.calculoPremio(carlos.getSalario()));	
		
	Colaborador joao = new Desenvolvedor();
		
		joao.setNome("João Pedro");
		joao.setSalario(5000.00);
		
		System.out.println(joao.calculoPremio(joao.getSalario()));	
	}

}
