package exercicio1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		ArrayList<Carros> concessionaria = new ArrayList<Carros>();
		HashMap<String ,Double> lst_carros=new HashMap<String, Double>();
		Carros car;
		
		int qtd_carro;
		System.out.println("Qtde carros para revenda ");
		qtd_carro = s.nextInt();
		
		for (int i=1;i<=qtd_carro;i++)
		{
			car = new Carros();
			System.out.println("Informa��es sobre os carros: " + i);
			System.out.println("Fabricante: ");
			car.setFabricante(s.next());
			System.out.println("Modelo: ");
			car.setModelo(s.next());
			System.out.println("Cor: ");
			car.setCor(s.next());
			System.out.println("Ano: ");
			car.setAno(s.nextInt());
			System.out.println("Placa: ");
			car.setPlaca(s.next());
			System.out.println("Pre�o: ");
			car.setPreco(s.nextFloat());
			concessionaria.add(car);
			lst_carros.put(car.getPlaca(), car.getPreco());
			
		}
		
		for (int i=0;i<concessionaria.size();i++) 
		{
			car=(Carros)concessionaria.get(i);
			System.out.println("Fabricante: " + car.getFabricante() +
					", " +
			"Modelo: " + car.getModelo() + 
			", " +
			"Cor" + car.getCor() +
			" , " +			
			 "Ano:"+ car.getAno()+
			 ",  "+
			 "Placa: " + car.getPlaca()+
			 ", "+ 
			 "Preco:"+ car.getPreco()); 
				
		}
		System.out.println("Consultar Carro...Digite a placa:: ");
		String plc = s.next();
		
		
		for (int i=0;i<concessionaria.size();i++) 
			{
			car=(Carros)concessionaria.get(i);
			if (car.getPlaca().equals(plc)) {
			
			System.out.println(car.getFabricante() + ", "+ car.getModelo()+" , "+
				car.getCor() +" , " + car.getAno()+ " , "+ "Placa: " + car.getPlaca()+
				", "+ car.getPreco());
						
		}
			}
	}
}
