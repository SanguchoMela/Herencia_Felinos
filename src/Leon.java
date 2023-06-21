public class Leon extends Felinos{
    private String melena;
    private String manada;

    public Leon (){
        super();
    }

    public Leon(String nombre, int edad, double tamanio, double peso, String melena, String manada) {
        super(nombre, edad, tamanio, peso);
        this.melena = melena;
        this.manada = manada;
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public String getManada() {
        return manada;
    }

    public void setManada(String manada) {
        this.manada = manada;
    }

    private void cazarGrupal(){
        System.out.println("\t"+getNombre()+" esta cazando en grupo");
    }
    private void liderarManada(){
        System.out.println("\t"+getNombre()+" esta liderando la manada");
    }

    public void mostrarInfo(){
        System.out.println("\nInformación registrada");
        System.out.println("\tNombre: "+getNombre());
        System.out.println("\tEdad: "+getEdad()+" años");
        System.out.println("\tTamaño: "+getTamanio()+"m");
        System.out.println("\tPeso: "+getPeso()+"kg");
        System.out.println("\tMelena: "+getMelena());
        System.out.println("\tManada: "+getManada());
        cazarGrupal();
        liderarManada();
    }
}
