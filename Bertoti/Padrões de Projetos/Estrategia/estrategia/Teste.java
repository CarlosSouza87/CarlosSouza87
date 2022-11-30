package estrategia;


public class Teste {

	public static void main(String[] args) {
		
		Colaborador Carlos = new Colaborador();
		
		Carlos.setNome("José Maria");
		Carlos.setSalario(10000.00);
		Carlos.setBonificacao(new Gerente());
		
	Funcionario joao = new Funcionario();
		
		joao.setNome("João Pedro");
		joao.setSalario(5000.00);
		joao.setBonificacao(new Programador());
			
		
		System.out.println(Carlos.getPremio().calculoPremio(Carlos.getSalario()));
		System.out.println(joao.getPremio().calculoPremio(joao.getSalario()));

	}

}
