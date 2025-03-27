public class Distancia extends Llamada{
    private double precioD = 350;

    public Distancia(double precioD) {
        this.precioD = precioD;
    }

    public Distancia(int duracion, double precioD) {
        super(duracion);
        this.precioD = precioD;
    }

    public double getPrecioD() {
        return precioD;
    }

    public void setPrecioD(double precioD) {
        this.precioD = precioD;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Distancia{" +
                "precioD=" + precioD +
                '}';
    }
}
