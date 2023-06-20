public class Puma extends Felinos{
    private String zonasCaza;
    private String coloracion;

    public Puma(){
        super();
    }

    public Puma(int subEspecie, String nombre, int edad, double tamanio, double peso, String zonasCaza, String coloracion) {
        super(subEspecie, nombre, edad, tamanio, peso);
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
        System.out.println("Este es el metodo para ir con sigilo");
    }
    private void nadar(){
        System.out.println("Este es el metodo para nadar");
    }
}
