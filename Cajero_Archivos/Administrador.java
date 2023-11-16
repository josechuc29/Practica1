import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Administrador {
    private static final String LOG_FILE = "logs.txt";
    private static final String BILLETES_FILE = "billetes.dat";

    public void iniciarAdministrador() {
        while (true) {
            System.out.println("\nAcciones de administrador:\n1. Mostrar acciones guardadas\n2. Mostrar cantidad de billetes \n3. Salir");

            switch (obtenerEntradaUsuario("Seleccione una opción: ")) {
                case 1 -> mostrarArchivo(LOG_FILE);
                case 2 -> mostrarArchivo(BILLETES_FILE);
                case 3 -> {
                    System.out.println("saliste del modo admin");
                    return;
                }
                default -> System.out.println("Opción no válida. Por favor, elija una opción correcta.");
            }
        }
    }

    private void mostrarArchivo(String archivo) {
        System.out.printf("\nContenido de %s:\n", archivo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            br.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int obtenerEntradaUsuario(String mensaje) {
        System.out.print(mensaje);
        try {
            return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return 0;
        }
    }
}