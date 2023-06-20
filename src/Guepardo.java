public class Guepardo extends Felinos{
    private String manchas;
    private int velocidadMax;

    public Guepardo(){
        super();
    }

    public Guepardo(int subEspecie, String nombre, int edad, double tamanio, double peso, String manchas, int velocidadMax) {
        super(subEspecie, nombre, edad, tamanio, peso);
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


    private void acelerar(){
        System.out.println("Este es el metodo acelerar");
    }
    private void saltar(){
        System.out.println("Este es el metodo saltar");
    }
}
