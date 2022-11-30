package facade;

import java.time.LocalDate;

public abstract class Conta {

	private LocalDate validadeConta;
	private double saldo;
	private String titular;

	public Conta(LocalDate validadeConta, double saldo, String titular) {
		super();
		this.validadeConta = validadeConta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public LocalDate getValidadeConta() {
		return validadeConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setValidadeConta(LocalDate validadeConta) {
		this.validadeConta = validadeConta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	protected abstract boolean transfeir(int i, ContaBancaria contaCorrente2);

	protected abstract boolean validarConta(ContaBancaria contaCorrente);

}
