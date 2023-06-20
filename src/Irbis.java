public class Irbis extends Felinos{
    private String pelaje;
    private String presas;

    public Irbis(){
        super();
    }

    public Irbis(int subEspecie, String nombre, int edad, double tamanio, double peso, String pelaje, String presas) {
        super(subEspecie, nombre, edad, tamanio, peso);
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
        System.out.println("Este es el metodo para caminar sobre la nieve");
    }
    private void escalarRocas(){
        System.out.println("Este es el metodo para escalar rocas");
    }
    private void adaptarFrio(){
        System.out.println("Este es el metodo para adaptarse al frio");
    }
}
