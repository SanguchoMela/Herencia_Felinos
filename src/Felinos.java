//clase padre
public class Felinos {
    //atributos
    private String nombre;
    private int edad;
    private double tamanio; //longitud en m
    private double peso; //en kg

    //Constructores
    public Felinos(){} //vacio

    public Felinos(String nombre, int edad, double tamanio, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Metodos
    public void cazar(){
        System.out.println("\t"+getNombre()+ " esta cazando");
    }
    public void comer(){
        System.out.println("\t"+getNombre()+" esta comiendo");
    }
    public void dormir(){
        System.out.println("\t"+getNombre()+" esta durmiendo");
    }

}

