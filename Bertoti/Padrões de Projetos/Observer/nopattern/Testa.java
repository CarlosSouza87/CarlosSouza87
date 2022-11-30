package nopatter;

public class Testa {

	public static void main(String[] args) {
 
 
				ItemEstoque itemEstoque = new ItemEstoque(0123, "Carlos", "10/10/2021");
				
				GeraItem geraItem = new GeraItem();
				
				SalvaBancoDados salvaBanco = new SalvaBancoDados(itemEstoque.getNumeroPedido(), itemEstoque.getNomeCliente(), itemEstoque.getDataPedido());
				
				EnviaEmail  enviaEmail = new EnviaEmail(itemEstoque.getNumeroItem(), itemEstoque.getNomeCliente(), itemEstoque.getDataItem());

				 geraItem.execute(salvaBanco);
				 
				 geraItem.execute(enviaEmail);
			}


	}


