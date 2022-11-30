package nopatter;

import java.time.LocalDate;
import java.time.Month;

public class Teste {

	public static void main(String[] args) {

		double valorTranferencia = 200.00;
		Conta conta = new TipoConta(LocalDate.of(2026, Month.OCTOBER, 20), 5000, "José Maria");

		Conta conta2 = new TipoConta(LocalDate.of(2026, Month.OCTOBER, 20), 5000, "João");

		Valida validaConta = new Valida();

		if (validaConta.ValidarConta(conta2)
				|| validaConta.transfeir(valorTranferencia, conta, conta2)) {
			contaCorrente.transfeir(valorTranferencia, conta2);
		}
		
		System.out.println(conta.getTitular() + " seu novo saldo é de: " + conta.getSaldo());
		System.out.println("Novo saldo da conta do " + conta2.getTitular() + " é de:" + conta2.getSaldo());

	}

}
