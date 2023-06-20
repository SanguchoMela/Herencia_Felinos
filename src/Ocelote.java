public class Ocelote extends Felinos {
    private String manchasDistintivas;
    private String territorio;

    public Ocelote(){
        super();
    }

    public Ocelote(int subEspecie, String nombre, int edad, double tamanio, double peso, String manchasDistintivas, String territorio) {
        super(subEspecie, nombre, edad, tamanio, peso);
        this.manchasDistintivas = manchasDistintivas;
        this.territorio = territorio;
    }

    public String getManchasDistintivas() {
        return manchasDistintivas;
    }

    public void setManchasDistintivas(String manchasDistintivas) {
        this.manchasDistintivas = manchasDistintivas;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    private void caminarSinRuido(){
        System.out.println("Este es el metodo para caminar sin hacer ruido");
    }
    private void treparArboles(){
        System.out.println("Este es el metodo para trepar arboles");
    }
}
