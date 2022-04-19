public class Yen extends Moneda{
    private double cantidad;

    public Yen(double cantidad) {
        super();
        this.cantidad = cantidad;
    }
    @Override
    public double cantidadEuros() {
        return this.cantidad*0.007793;
    }
}
