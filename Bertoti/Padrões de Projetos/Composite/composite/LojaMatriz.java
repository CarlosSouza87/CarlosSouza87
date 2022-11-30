package composite;

import java.util.ArrayList;
import java.util.List;

public class LojaMatriz {
	
	 private int id;
	    private String nome;


	    public LojaMatriz(int id, String name) {
	        this.id = id;
	        this.nome = name;
	        this.departamentos = new ArrayList<>();
	    }

	    public void printDepartamentoNome() {
	        departamentos.forEach(Loja::printDepartmentName);
	    }

	    public void addDepartamento(Loja departamento) {
	        departamentos.add(departamento);
	    }

	    public void removeDepartamento(Loja departamento) {
	        departamentos.remove(departamento);
	    }

}
