package composite;

public class TesteComposite {
	
	  public static void main(String args[]) {
	        Loja lojaDepartamentoVenda = new LojaDepartamentoVenda(
	          1, "Loja Departamento Venda");

	        Loja  lojaDepartamentoFinaceiro = new LojaDepartamentoFinaceiro(
	          2, "Loja Departamento Finaceiro");

	        LojaMatriz lojaMatriz = new LojaMatriz(
	          3, "Loja Matriz");

	        lojaMatriz.addDepartamento(lojaDepartamentoVenda);
	        lojaMatriz.addDepartamento(lojaDepartamentoFinaceiro);

	        departamentoChefe.printDepartamentoNome();
	    }

}
