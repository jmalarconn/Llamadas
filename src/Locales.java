public class Locales extends Llamada{
    private double precioL = 50;

    public Locales(double precioL) {
        this.precioL = precioL;
    }

    public Locales(int duracion, double precioL) {
        super(duracion);
        this.precioL = precioL;
    }

    public double getPrecioL() {
        return precioL;
    }

    public void setPrecioL(double precioL) {
        this.precioL = precioL;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Locales{" +
                "precioL=" + precioL +
                '}';
    }
}
