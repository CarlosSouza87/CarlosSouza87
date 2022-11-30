package nopatter;

public class TesteComposite {
	
	  public static void main(String args[]) {
	        Departamento lojaDepartamentoVenda = new DepartamentoVenda(
	          1, "Loja Departamento Venda");
	        
	        Departamento  lojaDepartamentoFinaceiro = new DepartamentoFinaceiro(
	          2, "Loja Departamento Finaceiro");

	        DepartamentoChefe departamentoChefe = new DepartamentoChefe(
	          3, "Loja Matriz");

	        departamentoChefe.addDepartamento(lojaDepartamentoVenda);
	        departamentoChefe.addDepartamento(lojaDepartamentoFinaceiro);

	        departamentoChefe.printDepartamentoNome();
	    }

}
