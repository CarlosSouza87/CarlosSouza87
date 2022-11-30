package obsever;

public class ItemEstoque {
	
	private int numeroItem;

	private String nomeCliente;

	private String dataItem;

	public ItemEstoque(int numeroItem, String nomeCliente, String data) {
		this.numeroItem = numeroItem;
		this.nomeCliente = nomeCliente;
		this.dataItem = data;

	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataItem() {
		return dataItem;
	}

}
