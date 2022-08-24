package concessionaria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Carro> concessionaria = new ArrayList<Carro>();
		HashMap mp=new HashMap();
		
		Carro car;
		
		int qtd_carro;
		System.out.println("Quantos carros deseja adicionar? ");
		qtd_carro = s.nextInt();
		
		for (int i=1;i<=qtd_carro;i++)
		{
			car = new Carro();
			System.out.println("Insira os dados do carro: " + i);
			System.out.println("Marca: ");
			car.setMarca(s.next());
			System.out.println("Modelo: ");
			car.setModelo(s.next());
			System.out.println("Placa: ");
			car.setPlaca(s.next());
			System.out.println("Preço: ");
			car.setPreco(s.nextFloat());
			concessionaria.add(car);
			mp.put(car.getPlaca(), car);
			
		}
		
		for (int i=0;i<concessionaria.size();i++) 
		{
			car=(Carro)concessionaria.get(i);
			System.out.println("Marca: " + car.getMarca() +
					", " +
			"Modelo: " + car.getModelo() + 
			", " +
			"Placa: " + car.getPlaca()); 
				
		}
		for (int i=0;i<concessionaria.size();i++) 
		{
			car=(Carro)concessionaria.get(i);
			System.out.println("Placa: " + car.getPlaca() + ": " + 
			car.getPreco()); 
				
		}
		
		System.out.println("Consulte os dados do carro pela placa: ");
		String plc = s.next();
		car=(Carro)mp.get(plc);
		System.out.println(car.getMarca() + ", "+ car.getModelo());
	
	}
	
