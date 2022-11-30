package model;

public class Emailtem implements NotificaItem {

	private Email email = new Email();
	
	@Override
	public void notificar(String acao) {
		String enviaEmail = "Email envidado " + acao;
		
	}


	public void cadastrarItem(ItemEstoque item) {
		
		email.setDestinatario(item.getNomeCliente());
		email.setConteudo("Seu Item foi realizado com sucesso ");
		
	}

}
