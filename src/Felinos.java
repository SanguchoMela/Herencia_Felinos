public class Felinos {
    private String nombreCientifico;
    private int edad;
    private double peso;
    private String estiloCaza;

    public Felinos(){}

    public Felinos(String nombreCientifico, int edad, double peso, String estiloCaza) {
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.peso = peso;
        this.estiloCaza = estiloCaza;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstiloCaza() {
        return estiloCaza;
    }

    public void setEstiloCaza(String estiloCaza) {
        this.estiloCaza = estiloCaza;
    }

    public void cazar(){
        System.out.println("Este es el método cazar");
    }
}

