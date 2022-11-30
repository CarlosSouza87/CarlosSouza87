package model;

import java.util.ArrayList;
import java.util.List;

public class CadastrandoItem {

	private ItemEstoque item = new ItemEstoque();

	private List<NotificaItem> notificacoes = new ArrayList<>();

	public CadastrandoItem() {
	}

	public CadastrandoItem(List<NotificaItem> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public void notify(String acao) {

		this.notificacoes.forEach(a -> a.notificar(acao));

	}

	public void subscribe(ItemEstoque item) {

		this.pedido.getPedidos().add(pedido);
		this.notify("pedido adicionado");
	}

	public void unsubscribe(int id) {

		ItemEstoque itemRemove = new ItemEstoque();
		ItemEstoque itensList = new ItemEstoque();

		List<ItemEstoque> itens = itensList.geItens();

		for (int i = 0; i < itens.size(); i++) {
			
			if (i == id) {
				itemRemove = itens.get(i);

			}

		}
		this.itens.getItens().remove(item);
		this.notify("Item removido");

	}

}
