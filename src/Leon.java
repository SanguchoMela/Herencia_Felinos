public class Leon extends Felinos{
    private String melena;
    private String rugido;
    private String manada;

    public Leon (){
        super();
    }

    public Leon(int subEspecie, String nombre, int edad, double tamanio, double peso, String melena, String rugido, String manada) {
        super(subEspecie, nombre, edad, tamanio, peso);
        this.melena = melena;
        this.rugido = rugido;
        this.manada = manada;
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public String getRugido() {
        return rugido;
    }

    public void setRugido(String rugido) {
        this.rugido = rugido;
    }

    public String getManada() {
        return manada;
    }

    public void setManada(String manada) {
        this.manada = manada;
    }

    private void cazarGrupal(){
        System.out.println("Este es el metodo para cazar en grupo");
    }
    private void liderarManada(){
        System.out.println("Este es el metodo para liderar la manada");
    }
}
