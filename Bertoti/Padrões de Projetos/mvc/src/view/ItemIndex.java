package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import controller.PedidoController;
import controller.PedidoDescontoMaisController;
import controller.PedidoDescontoMenosController;
import model.Email;
import model.Pedido;


public class ItemIndex {
	private Scanner ler = new Scanner(System.in);
	private ItemController itemController = new ItemController();
	private List<ItemView> notificacoes = new ArrayList<>();

	public ItemIndex(List<ItemView> notificacoes) {
		this.notificacoes = notificacoes;
	}

	public void cadatrarItem() {
		String menssagemUsuario;
		int numeroItem;
		String nomeCliente;
		int tipo;
		String dataItem;
		String emailusuario;
		String nomeCliente0;

		System.out.printf("Informe o número do Item:\n");
		numeroPedido = ler.nextInt();

		nomeCliente0 = ler.nextLine();

		System.out.printf("Informe o nome do cliente:\n");
		nomeCliente = ler.nextLine();

		System.out.printf("Informe data do Item:\n");
		dataPedido = ler.nextLine();

		System.out.printf("Informe o conteudo do e-mail:\n");
		emailusuario = ler.nextLine();

		System.out.printf("Informe o tipo do Item:\n");
		tipo = ler.nextInt();

		Email email = new Email(nomeCliente, emailusuario);

		Pedido pedido = new Pedido(numeroPedido, nomeCliente, dataPedido, email, tipo);
		
		if(tipo == 1) {
			ItemDescontoMaisController item = new ItemDescontoMaisController();
			item.verificarTipo("Desconto maior");
		}else {
			ItemDescontoMenosController item = new ItemDescontoMenosController();
			item.verificarTipo("Desconto menor ");
		}

		pedidoController.adicionarPedido(pedido);

		menssagemUsuario = "Adicionado na";

		

	}

	public void removerPedido() {
		String menssagemUsuario;
		int numero;
		System.out.printf("Informe o numero do pedido:\n");
		numero = ler.nextInt();
		pedidoController.removerPedido(numero);

		menssagemUsuario = "Removido da";

	}

}
