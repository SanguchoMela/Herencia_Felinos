import java.util.Scanner;

public class MenuRegistroFelinos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //variables
        int opcion;
        boolean salir = false;

        //menu recursivo
        while (!salir){

            System.out.println("\n-------------- F E L I N O S --------------");
            System.out.println("MENÚ PRINCIPAL  ");
            System.out.println("Seleccione la especie de la que desea registrar datos");
            System.out.println("1. Guepardo");
            System.out.println("2. Ocelote");
            System.out.println("3. Puma");
            System.out.println("4. Irbis");
            System.out.println("5. León");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de la opción escogida: ");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n-------------- GUEPARDO --------------\n");

                    System.out.println("Registro de información");
                    entrada.nextLine();
                    System.out.print("\tNombre: ");
                    String nomG = entrada.nextLine();
                    System.out.print("\tEdad (años): ");
                    int edadG = entrada.nextInt();
                    System.out.print("\tTamaño (m): ");
                    double tamG = entrada.nextDouble();
                    System.out.print("\tPeso (kg): ");
                    double pesoG = entrada.nextDouble();
                    System.out.print("\tManchas: ");
                    entrada.nextLine();
                    String manchasG = entrada.nextLine();
                    System.out.print("\tVelocidad máxima (km/h): ");
                    int velMaxG = entrada.nextInt();

                    Guepardo miGuepardo = new Guepardo(nomG,edadG,tamG,pesoG,manchasG,velMaxG);

                    miGuepardo.mostrarInfo();
                    miGuepardo.cazar();

                    break;
                case 2:
                    System.out.println("\n-------------- OCELOTE --------------\n");

                    System.out.println("Registro de información");
                    entrada.nextLine();
                    System.out.print("\tNombre: ");
                    String nomO = entrada.nextLine();
                    System.out.print("\tEdad (años): ");
                    int edadO = entrada.nextInt();
                    System.out.print("\tTamaño (m): ");
                    double tamO = entrada.nextDouble();
                    System.out.print("\tPeso (kg): ");
                    double pesoO = entrada.nextDouble();
                    System.out.print("\tManchas en el pelo: ");
                    entrada.nextLine();
                    String manchaPO = entrada.nextLine();
                    System.out.print("\tTerritorio: ");
                    String terrO = entrada.nextLine();

                    Ocelote miOcelote = new Ocelote(nomO,edadO,tamO,pesoO,manchaPO,terrO);

                    miOcelote.mostrarInfo();
                    miOcelote.comer();

                    break;
                case 3:
                    System.out.println("\n---------------- PUMA ----------------\n");

                    System.out.println("Registro de información");
                    entrada.nextLine();
                    System.out.print("\tNombre: ");
                    String nomP = entrada.nextLine();
                    System.out.print("\tEdad (años): ");
                    int edadP = entrada.nextInt();
                    System.out.print("\tTamaño (m): ");
                    double tamP = entrada.nextDouble();
                    System.out.print("\tPeso (kg): ");
                    double pesoP = entrada.nextDouble();
                    System.out.print("\tZonas de caza: ");
                    entrada.nextLine();
                    String zonasCP = entrada.nextLine();
                    System.out.print("\tColoración: ");
                    String colorP = entrada.nextLine();

                    Puma miPuma = new Puma(nomP,edadP,tamP,pesoP,zonasCP,colorP);

                    miPuma.mostrarInfo();
                    miPuma.dormir();

                    break;
                case 4:
                    System.out.println("\n--------------- IRBIS ---------------\n");

                    System.out.println("Registro de información");
                    entrada.nextLine();
                    System.out.print("\tNombre: ");
                    String nomI = entrada.nextLine();
                    System.out.print("\tEdad (años): ");
                    int edadI = entrada.nextInt();
                    System.out.print("\tTamaño (m): ");
                    double tamI = entrada.nextDouble();
                    System.out.print("\tPeso (kg): ");
                    double pesoI = entrada.nextDouble();
                    System.out.print("\tPelaje: ");
                    entrada.nextLine();
                    String pelajeI = entrada.nextLine();
                    System.out.print("\tPresas: ");
                    String presasI = entrada.nextLine();

                    Irbis miIrbis = new Irbis(nomI,edadI,tamI,pesoI,pelajeI,presasI);

                    miIrbis.mostrarInfo();
                    miIrbis.comer();

                    break;
                case 5:
                    System.out.println("\n---------------- LEÓN ----------------\n");

                    System.out.println("Registro de información");
                    entrada.nextLine();
                    System.out.print("\tNombre: ");
                    String nomL = entrada.nextLine();
                    System.out.print("\tEdad (años): ");
                    int edadL = entrada.nextInt();
                    System.out.print("\tTamaño (m): ");
                    double tamL = entrada.nextDouble();
                    System.out.print("\tPeso (kg): ");
                    double pesoL = entrada.nextDouble();
                    System.out.print("\tMelena: ");
                    entrada.nextLine();
                    String melenaL = entrada.nextLine();
                    System.out.print("\tManada (n° miembros): ");
                    int manadaL = entrada.nextInt();

                    Leon miLeon = new Leon(nomL,edadL,tamL,pesoL,melenaL,manadaL);

                    miLeon.mostrarInfo();
                    miLeon.dormir();

                    break;
                case 6:
                    salir = true;
                    System.out.println("\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("\nOpción no válida!\n");
                    break;
            }
        }
    }
}
