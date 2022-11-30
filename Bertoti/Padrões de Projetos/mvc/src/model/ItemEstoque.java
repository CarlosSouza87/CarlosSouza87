package model;

import java.util.ArrayList;
import java.util.List;

public class ItemEstoque {

	private int numeroItem;

	private String nomeCliente;
    
	private int tipo;
	
	private String dataItem;

	private Email emailusuario;

	private List<ItemEstoque> itens = new ArrayList<Pedido>();

	public ItemEstoque() {

	}

	public ItemEstoque(int numero, String nomeCliente, String data, Email emailusuario,int tipo) {
		this.numeroItem = numero;
		this.nomeCliente = nomeCliente;
		this.dataItem = data;
		this.emailusuario = emailusuario;
		this.tipo = tipo;

	}

	public int getNumeroItem() {
		return numeroPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getDataItem() {
		return dataItem;
	}

	public List<ItemEstoque> getItens() {
		return itens;
	}

	public Email getEmailusuario() {
		return emailusuario;
	}

	public int getTipo() {
		return tipo;
	}

	
}
