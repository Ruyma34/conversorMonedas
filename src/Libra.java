public class Libra extends Moneda{
    private double cantidad;

    public Libra(double cantidad) {
        super();
        this.cantidad = cantidad;
    }
    @Override
    public double cantidadEuros() {
        return this.cantidad*1.1029;
    }
}
