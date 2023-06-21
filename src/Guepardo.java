public class Guepardo extends Felinos{
    private String manchas;
    private int velocidadMax;

    public Guepardo(){
        super();
    }

    public Guepardo(String nombre, int edad, double tamanio, double peso, String manchas, int velocidadMax) {
        super(nombre, edad, tamanio, peso);
        this.manchas = manchas;
        this.velocidadMax = velocidadMax;
    }

    public String getManchas() {
        return manchas;
    }

    public void setManchas(String manchas) {
        this.manchas = manchas;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }


    public void acelerar(){
        System.out.println("\t"+getNombre()+" esta acelerando");
    }
    public void saltar(){
        System.out.println("\t"+getNombre()+" esta saltando");
    }

    public void mostrarInfo(){
        System.out.println("\nInformación registrada");
        System.out.println("\tNombre: "+getNombre());
        System.out.println("\tEdad: "+getEdad()+" años");
        System.out.println("\tTamaño: "+getTamanio()+"m");
        System.out.println("\tPeso: "+getPeso()+"kg");
        System.out.println("\tManchas: "+getManchas());
        System.out.println("\tVelocidad máxima: "+getVelocidadMax()+"km/h");
        acelerar();
        saltar();
    }
}
