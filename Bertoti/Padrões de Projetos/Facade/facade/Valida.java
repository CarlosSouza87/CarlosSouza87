package facade;

import java.time.LocalDate;

public class Valida implements ValidaTipoConta {

	private LocalDate data = LocalDate.now ();

	@Override
	public boolean ValidarConta(Conta conta) {
		if (conta.getValidadeConta().isAfter(data)) {
			return true;
		}
		return false;
	}

}
