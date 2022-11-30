package nopatter;

public class ItemEstoque {
	private int numeroItem;
	
	private String nomeCliente;
	
	private String dataItem;


	public int getNumeroItem() {
		return numeroItem;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataItem() {
		return dataItem;
	}

	public Pedido(int numeroItem, String nomeCliente, String data) {
		this.numeroItem = numeroItem;
		this.nomeCliente = nomeCliente;
		this.dataItem = data;
		
	}

	public void executarAcao(ItemEstoque item) {
		// TODO Auto-generated method stub
		
	}

}
