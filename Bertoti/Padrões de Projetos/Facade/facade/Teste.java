package facade;

import java.time.LocalDate;
import java.time.Month;

public class Teste {

	public static void main(String[] args) {


		Conta conta = new ContaFacade(LocalDate.of(2026, Month.OCTOBER, 20), 5000,"José Maria");
		
		Conta conta2 = new ContaFacade(LocalDate.of(2026, Month.OCTOBER, 20), 5000,"João");
		
		contaCorrente.transfeir(200, conta2);
		
	
	}

}
