public class Felinos {
    //atributos
    private String tipoFelino; //felino verdadero o panterino
    private String genero;
    private String nombreCientifico;
    private int vidaMax; //en años
    private double peso;
    private int velocidadMax; //en km/h
    private String estiloCaza;

    //Constructores
    public Felinos(){} //vacio

    public Felinos(String tipoFelino, String genero,String nombreCientifico, int vidaMax, double peso, int velocidadMax,String estiloCaza) {
        this.tipoFelino = tipoFelino;
        this.genero = genero;
        this.nombreCientifico = nombreCientifico;
        this.vidaMax = vidaMax;
        this.peso = peso;
        this.estiloCaza = estiloCaza;
    }

    //Setters y Getters
    public String getTipoFelino() {
        return tipoFelino;
    }

    public void setTipoFelino(String tipoFelino) {
        this.tipoFelino = tipoFelino;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getEstiloCaza() {
        return estiloCaza;
    }

    public void setEstiloCaza(String estiloCaza) {
        this.estiloCaza = estiloCaza;
    }

    //Metodos
    public void cazar(){
        System.out.println("Este es el método cazar");
    }
}

