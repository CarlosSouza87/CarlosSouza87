package obsever;

public class SalvaBancoDados implements AcaoItemEstoque{

	@Override
		public void executarAcao(String acao) {

		System.out.println("Informação salva com sucesso " + acao);

	}
}
