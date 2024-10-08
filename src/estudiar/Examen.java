package estudiar;
import java.util.Scanner;

public class Examen {
    static String[] plazas = new String[24];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {
            plazas[i] = "VACIO";
        }

        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Aparcar vehículo");
            System.out.println("2. Sacar vehículo");
            System.out.println("3. Mostrar aparcamiento");
            System.out.println("4. Salir del programa");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                aparcarVehiculo();
            } else if (opcion == 2) {
                sacarVehiculo();
            } else if (opcion == 3) {
                mostrarAparcamiento();
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }

    static void aparcarVehiculo() {
        System.out.print("Indica el tamaño del vehículo (PEQUEÑO o GRANDE): ");
        String tamano = scanner.next().toUpperCase();

        if (tamano.equals("PEQUEÑO")) {
            for (int i = 0; i < 24; i++) {
                if (plazas[i].equals("VACIO")) {
                    plazas[i] = "PEQUEÑO";
                    System.out.println("Vehículo aparcado en la plaza " + (i + 1));
                    return;
                }
            }
            System.out.println("No hay plazas disponibles para vehículos pequeños.");
        } else if (tamano.equals("GRANDE")) {
            for (int i = 0; i < 24; i++) {
                if (i >= 14 && plazas[i].equals("VACIO")) {
                    plazas[i] = "GRANDE";
                    System.out.println("Vehículo aparcado en la plaza " + (i + 1));
                    return;
                }
            }
            System.out.println("No hay plazas disponibles para vehículos grandes.");
        } else {
            System.out.println("Tamaño de vehículo no válido.");
        }
    }

    static void sacarVehiculo() {
        System.out.print("Indica el número de la plaza que quieres dejar libre: ");
        int plaza = scanner.nextInt();
        if (plaza < 1 || plaza > 24) {
            System.out.println("Plaza no válida. Inténtalo de nuevo.");
        } else {
            if (plazas[plaza - 1].equals("VACIO")) {
                System.out.println("La plaza ya está libre.");
            } else {
                plazas[plaza - 1] = "VACIO";
                System.out.println("Plaza " + plaza + " liberada.");
            }
        }
    }

    static void mostrarAparcamiento() {
        System.out.println("Estado del aparcamiento:");
        for (int i = 0; i < 24; i++) {
            if (plazas[i].equals("VACIO")) {
                System.out.println("Plaza " + (i + 1) + ": Libre");
            } else if (plazas[i].equals("PEQUEÑO")) {
                System.out.println("Plaza " + (i + 1) + ": Ocupada por vehículo pequeño");
            } else if (plazas[i].equals("GRANDE")) {
                System.out.println("Plaza " + (i + 1) + ": Ocupada por vehículo grande");
            }
        }
    }
}