package nopatter;

import java.util.ArrayList;
import java.util.List;

public class LojaMatriz extends Loja {
	
	 private int id;
	    private String nome;

	    private List<Loja> departamentos;

	    public LojaMatriz(int id, String name) {
	        this.id = id;
	        this.nome = name;
	        this.departamentos = new ArrayList<>();
	    }
        @Override
	    public void printDepartamentoNome() {
	        departamentos.forEach(d -> d.printDepartamentoNome());
	    }

	    public void addDepartamento(Departamento departamento) {
	        departamentos.add(departamento);
	    }

	    public void removeDepartamento(Departamento departamento) {
	        departamentos.remove(departamento);
	    }

}
