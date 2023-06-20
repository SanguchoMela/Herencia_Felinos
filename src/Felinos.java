//clase padre
public class Felinos {
    //atributos
    private int subEspecie;
    private String nombre;
    private int edad;
    private double tamanio; //longitud en m
    private double peso; //en kg

    //Constructores
    public Felinos(){} //vacio

    public Felinos(int subEspecie, String nombre, int edad, double tamanio, double peso) {
        this.subEspecie = subEspecie;
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    //Setters y Getters

    public int getSubEspecie() {
        return subEspecie;
    }

    public void setSubEspecie(int subEspecie) {
        this.subEspecie = subEspecie;
    }

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
    private void cazar(){
        System.out.println("Este es el metodo cazar");
    }
    private void comer(){
        System.out.println("Este es el metodo comerr");
    }
    private void dormir(){
        System.out.println("Este es el metodo dormir");
    }
    private void envejecer(){
        System.out.println("Este es el metodo envejecer");
    }
}

