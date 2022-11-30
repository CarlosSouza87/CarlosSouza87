package Estrategia;

public class Cliente {
    private Compra compra;

    public void setCompra(Compra compra){
        this.compra = compra;
    }

    public void realizarCompra() {
        this.compra.compra();
    }

}

