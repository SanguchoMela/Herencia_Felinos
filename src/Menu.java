public class Menu {
    public static void main(String[] args) {
        Felinos gato = new Felinos();

        System.out.println(gato.getPeso());
        System.out.println(gato.getEstiloCaza());

        gato.cazar();
    }
}
