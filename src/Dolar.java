public class Dolar extends Moneda {
    private double cantidad;

    public Dolar(double cantidad) {
        super();
        this.cantidad = cantidad;
    }
    @Override
    public double cantidadEuros() {
        return this.cantidad*0.8835;
    }
}
