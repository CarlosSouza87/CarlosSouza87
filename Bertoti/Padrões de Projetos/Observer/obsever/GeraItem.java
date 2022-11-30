package obsever;

import java.util.List;

public class GeraItem {

	private List<AcaoItemEstoque> acoes = new ArrayList<>();
	private List<ItemEstoque> itens = new ArrayList<Pedido>();

	public GeraItem (List<AcaoItemEstoque> acoes) {
		this.acoes = acoes;
	}

	public void notify(String acao) {

		this.acoes.forEach(a -> a.executarAcao(acao));

	}

	public void subscribe(ItemEstoque item) {

		itens.add(item);

		this.notify("item adicionado");
	}

	public void unsubscribe(ItemEstoque item) {
		itens.remove(item);
		this.notify("item removido");
	}



	public List<Pedido> getItem() {
		return itens;
	}

}
