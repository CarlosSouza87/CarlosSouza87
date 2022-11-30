package nopatter;

public class SalvaPedidoBancoDados extends ItemEstoque{

	
	public SalvaBancoDados(int numeroItem, String nomeCliente, String data) {
		super(numeroItem, nomeCliente, data);
		
	}

	@Override
	public void executarAcao(ItemEstoque item) {

       System.out.println("Item salvo no banco com sucesso");
		
	}

}
