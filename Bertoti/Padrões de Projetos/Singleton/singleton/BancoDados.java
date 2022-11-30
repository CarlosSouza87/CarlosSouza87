package singleton;

public class BancoDados {
	
	private String data;
	private String connectionString;
	private String obs;
	private  int tipo;
	
	
	
	public BancoDados(String data, String connectionString, String obs, int tipo) {
		super();
		this.data = data;
		this.connectionString = connectionString;
		this.obs = obs;
		this.tipo = tipo;
	}



	public void conectarBanco(String connectionString ) {
		
		if(this.connectionString != connectionString) {
		  LogSistema var=	LogSistema.getInstance(this.data, this.obs, this.tipo);
			System.out.println(var);
		}
		
	}

}
