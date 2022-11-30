public class TelaRestaurante implements Observer{
    public void update(double credito){

        display(credito)
    }
    public void display (double cr){
        System.out.println("Cardapio");
        System.out.println("Seu credito é: "+cr);
        
    }
}