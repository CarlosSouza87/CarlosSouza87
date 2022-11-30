package facade;

import java.time.LocalDate;

public class ContaFacade extends Conta {

	private Valida validaConta = new ValidacaoConta();

	public ContaFacade(LocalDate validadeConta, double saldo, String titular) {
		super(validadeConta, saldo, titular);

	}

	public boolean verificaSaldo(int valor) {

		if (super.getSaldo() < 0 || super.getSaldo() < valor) {
			return false;
		}

		return true;

	}

	public boolean transfeir(int valor, Conta outra) {

		if(!validarConta(outra)) {
			System.err.println("Conta invalida" +"\nvalidade da conta vencida: " + outra.getValidadeConta());
			return false;
		}
		if (!verificaSaldo(valor)) {
			System.out.println("Saldo insuficiente para transferência");
			return false;
		} else {
			double novoValor = super.getSaldo();
			super.setSaldo(novoValor - valor);
			double novoValorOutraConta = outra.getSaldo() + valor;
			outra.setSaldo(novoValorOutraConta);
			return true;
		}
		

	}

	public boolean validarConta(Conta conta) {

		if (!validaConta.ValidarConta(conta)) {

			return false;
		}

		return true;

	}

}
