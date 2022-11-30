package obsever;

import java.util.Arrays;

public class TestaPedido {

	public static void main(String[] args) {

		ItemEstoque item = new ItemEstoque(0256, "Carlos", "24/11/2021");
		ItemEstoque itemNovo = new ItemEstoque(0123, "João ", "10/02/2021");

		GeraItem geraItem = new GeraItem(Arrays.asList(new EnviaEmail(), new SalvaBancoDados()));

		geraItem.subscribe(item);
		geraItem.notify(itemNovo, 0);
		geraItem.unsubscribe(item);
		
	
	}

}
