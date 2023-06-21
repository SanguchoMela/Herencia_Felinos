public class Ocelote extends Felinos {
    private String manchaPelo;
    private String territorio;

    public Ocelote(){
        super();
    }

    public Ocelote(String nombre, int edad, double tamanio, double peso, String manchaPelo, String territorio) {
        super(nombre, edad, tamanio, peso);
        this.manchaPelo = manchaPelo;
        this.territorio = territorio;
    }

    public String getManchaPelo() {

        return manchaPelo;
    }

    public void setManchaPelo(String manchaPelo) {
        this.manchaPelo = manchaPelo;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    private void caminarSinRuido(){
        System.out.println("\t"+getNombre()+" esta caminando sin hacer ruido");
    }
    private void treparArboles(){
        System.out.println("\t"+getNombre()+" esta trepando árboles");
    }

    public void mostrarInfo(){
        System.out.println("\nInformación registrada");
        System.out.println("\tNombre: "+getNombre());
        System.out.println("\tEdad: "+getEdad()+" años");
        System.out.println("\tTamaño: "+getTamanio()+"m");
        System.out.println("\tPeso: "+getPeso()+"kg");
        System.out.println("\tManchas en el pelo: "+getManchaPelo());
        System.out.println("\tTerritorio: "+getTerritorio());
        caminarSinRuido();
        treparArboles();
    }
}
