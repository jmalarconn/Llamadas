public class Celular extends Llamada{
    private double precioC = 150;

    public Celular(double precioC) {
        this.precioC = precioC;
    }

    public Celular(int duracion, double precioC) {
        super(duracion);
        this.precioC = precioC;
    }

    public double getPrecioC() {
        return precioC;
    }

    public void setPrecioC(double precioC) {
        this.precioC = precioC;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Celular{" +
                "precioC=" + precioC +
                '}';
    }
}
