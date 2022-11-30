package nopatter;

public class LojaDepartamentoVenda extends Loja {

	private int id;
	private String nome;

	public LojaDepartamentoVenda(int id, String name) {
		super();
		this.id = id;
		this.nome = name;
	}
   
	@Override
	public void printDepartamentoNome() {
		System.out.println(getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

}
