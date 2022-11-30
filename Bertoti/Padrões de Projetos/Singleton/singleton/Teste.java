package singleton;

public class Teste {

	public static void main(String[] args) {

		BancoDados configuraBanco = new BancoDados("02/01/2021", "//.bd/com",
				"Tentativa de conexão com banco de dados", 2);

		configuraBanco.conectarBanco("1213212ghgh");
		
		AcessoUsuario usuario = new AcessoUsuario(1,"Carlos" , 5, "15/11/2012");
		
		usuario.acessarFuncionalidades(1);

	}

}
