public class Llamada {
    private int duracion;

    public Llamada(){

    }
    public Llamada(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "duracion=" + duracion +
                '}';
    }
}

