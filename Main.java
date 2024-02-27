import java.util.Scanner;

/**
 * Programa principal que proporciona un menú de usuario para convertir números
 * entre formatos decimal y binario utilizando el estándar IEEE 754 de precisión simple.
 * El usuario puede convertir un número binario en formato IEEE 754 a decimal,
 * o un número decimal a su representación binaria en formato IEEE 754.
 * El programa continúa ejecutándose hasta que el usuario elija salir.
 */
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Punto de entrada del programa. Muestra un menú de opciones y ejecuta la conversión
     * seleccionada por el usuario hasta que elija salir.
     *
     * @param args Los argumentos de línea de comando (no utilizados).
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenú de Conversión:");
            System.out.println("1. Binario en formato IEEE 754 de precisión simple a decimal");
            System.out.println("2. Decimal a binario en formato IEEE 754 de precisión simple");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirBinarioADecimal();
                    break;
                case 2:
                    convertirDecimalABinario();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close(); // It's important to close the scanner before exiting
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    /**
     * Solicita al usuario un número binario en formato IEEE 754 y muestra su conversión a decimal.
     * Captura y maneja errores de entrada inválida o formatos incorrectos.
     */
    private static void convertirBinarioADecimal() {
        System.out.print("Ingrese el número binario (formato IEEE 754): ");
        scanner.nextLine(); // Consume the newline left-over
        String binario = scanner.nextLine();
        try {
            float resultadoDecimal = BinarioADecimalIEEE754.convertir(binario);
            System.out.println("El número decimal es: " + resultadoDecimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no es un número binario válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Solicita al usuario un número decimal y muestra su conversión a binario en formato IEEE 754.
     * Utiliza el método convertir de la clase DecimalABinarioIEEE754 para realizar la conversión.
     */
    private static void convertirDecimalABinario() {
        System.out.print("Ingrese el número decimal: ");
        float decimal = scanner.nextFloat();
        String resultadoBinario = DecimalABinarioIEEE754.convertir(decimal);
        System.out.println("El número en formato binario IEEE 754 es: " + resultadoBinario);
    }
}


