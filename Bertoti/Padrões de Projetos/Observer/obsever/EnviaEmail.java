package obsever;

public class EnviaEmail implements AcaoItemEstoque {

	@Override
	public void executarAcao(String acao) {
		
		System.out.println("Email envidado " + acao);
		
	}

}
