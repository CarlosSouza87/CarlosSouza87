package Estrategia;

public class Teste {
    public static void main(String[] args) {

        Cliente Renata = new Cliente();
        Renata.setCompra(new CompraSimples());
        Renata.realizarCompra();
        System.out.println("--------------------------------");
    }
}