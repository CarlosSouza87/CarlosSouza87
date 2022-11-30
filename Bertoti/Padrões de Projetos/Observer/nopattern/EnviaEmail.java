package nopatter;

public class EnviaEmail extends ItemEstoque {

	
	public EnviaEmai(int numeroItem, String nomeCliente, String data) {
		super(numeroItem, nomeCliente, data);
	
	}

	@Override
	public void executarAcao(ItemEstoque item) {
		
		System.out.println("Email envidado");
		
	}

}
