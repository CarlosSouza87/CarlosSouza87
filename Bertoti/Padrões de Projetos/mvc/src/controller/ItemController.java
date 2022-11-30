package controller;

import java.util.ArrayList;
import java.util.List;
import model.CadastrandoPedido;
import model.Pedido;

public class PedidoController {

	private CadastrandoPedido item = new CadastrandoPedido();

	private List<TipoItemController> notificacoes = new ArrayList<>();

	
	public ItemController() {
		
	}
	
	public ItemController(List<TipoItemController> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public void notify(String desconto) {

		this.notificacoes.forEach(a -> a.verificarTipo(desconto));

	}

	public void adicionarItem(ItemEstoque  item) {

		this.item.subscribe(item);
		this.notify("");

	}

	public String removerPedido(int id) {

		this.item.unsubscribe(id);
		return "Pedido removido";

	}

}
