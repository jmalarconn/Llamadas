public class Cabina {
    protected String nombreC;

    public Cabina(){
    }
    public Cabina(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public String toString() {
        return "Cabina{" +
                "nombreC='" + nombreC + '\'' +
                '}';
    }
}
