import java.util.ArrayList;

public class Restaurante implements subject{

    private ArrayList observers;
    private Cliente c;

    public Restaurante(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObserver(double novoPedido){
        for (int i= 0; i < observers.size(); i++ ){
            observer observer =(Observer) observers.get(i);
        }

    }

    public double pedido (Cleinte c, double valor){
        c.preco = c.preco - valor;

        notifyObservers(c.preco);
        return c.preco;
    }

