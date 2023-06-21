public class Irbis extends Felinos{
    private String pelaje;
    private String presas;

    public Irbis(){
        super();
    }

    public Irbis(String nombre, int edad, double tamanio, double peso, String pelaje, String presas) {
        super(nombre, edad, tamanio, peso);
        this.pelaje = pelaje;
        this.presas = presas;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getPresas() {
        return presas;
    }

    public void setPresas(String presas) {
        this.presas = presas;
    }

    private void caminarNieve(){
        System.out.println("\t"+getNombre()+" esta caminando sobre la nieve");
    }
    private void escalarRocas(){
        System.out.println("\t"+getNombre()+" esta escalando rocas");
    }

    public void mostrarInfo(){
        System.out.println("\nInformación registrada");
        System.out.println("\tNombre: "+getNombre());
        System.out.println("\tEdad: "+getEdad()+" años");
        System.out.println("\tTamaño: "+getTamanio()+"m");
        System.out.println("\tPeso: "+getPeso()+"kg");
        System.out.println("\tPelaje: "+getPelaje());
        System.out.println("\tPresas: "+getPresas());
        caminarNieve();
        escalarRocas();
    }
}
