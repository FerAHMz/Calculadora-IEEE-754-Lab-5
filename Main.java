import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

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

    private static void convertirDecimalABinario() {
        System.out.print("Ingrese el número decimal: ");
        float decimal = scanner.nextFloat();
        String resultadoBinario = DecimalABinarioIEEE754.convertir(decimal);
        System.out.println("El número en formato binario IEEE 754 es: " + resultadoBinario);
    }
}

