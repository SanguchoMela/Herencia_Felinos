public class Puma extends Felinos{
    private String zonasCaza;
    private String coloracion;

    public Puma(){
        super();
    }

    public Puma(String nombre, int edad, double tamanio, double peso, String zonasCaza, String coloracion) {
        super(nombre, edad, tamanio, peso);
        this.zonasCaza = zonasCaza;
        this.coloracion = coloracion;
    }

    public String getZonasCaza() {
        return zonasCaza;
    }

    public void setZonasCaza(String zonasCaza) {
        this.zonasCaza = zonasCaza;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
    }

    private void sigilar(){
        System.out.println("\t"+getNombre()+" esta sigilando");
    }
    private void nadar(){
        System.out.println("\t"+getNombre()+" esta nadando");
    }

    public void mostrarInfo(){
        System.out.println("\nInformación registrada");
        System.out.println("\tNombre: "+getNombre());
        System.out.println("\tEdad: "+getEdad()+" años");
        System.out.println("\tTamaño: "+getTamanio()+"m");
        System.out.println("\tPeso: "+getPeso()+"kg");
        System.out.println("\tZonas de caza: "+getZonasCaza());
        System.out.println("\tColoración: "+getColoracion());
        sigilar();
        nadar();
    }
}
