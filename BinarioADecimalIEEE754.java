/**
 * Clase que proporciona la funcionalidad para convertir una representación binaria en formato IEEE 754
 * a su valor decimal correspondiente. El estándar IEEE 754 es ampliamente utilizado para la representación
 * de números de punto flotante en sistemas informáticos, garantizando la uniformidad y precisión en
 * diferentes plataformas y lenguajes de programación.
 */
public class BinarioADecimalIEEE754 {

    /**
     * Convierte una cadena de texto que representa un número binario en formato IEEE 754
     * a su valor decimal correspondiente. Esta representación binaria debe estar en formato de
     * precisión simple, es decir, debe contener 32 bits, incluyendo el bit de signo, los bits del exponente
     * y los bits de la mantisa. Este método permite interpretar correctamente dicha representación,
     * facilitando la conversión a un número flotante.
     *
     * @param binario La representación binaria en formato IEEE 754 como cadena de texto.
     *                Debe tener exactamente 32 bits de longitud para ser válida.
     * @return El valor decimal correspondiente al binario en formato IEEE 754, representado como un tipo primitivo float.
     * @throws IllegalArgumentException Si la cadena proporcionada no tiene exactamente 32 bits de longitud,
     *                                  se lanza esta excepción indicando que la entrada es inválida.
     */
    public static float convertir(String binario) {
        // Asegúrate de que el binario tiene 32 bits, que es el estándar para la precisión simple
        if (binario.length() != 32) {
            throw new IllegalArgumentException("La cadena debe tener exactamente 32 bits.");
        }
        
        // Convertir la cadena binaria en un entero con signo según los bits del IEEE 754
        int bits = (int) Long.parseLong(binario, 2);
        // Construir y devolver el número flotante desde la representación de bits entera
        return Float.intBitsToFloat(bits);
    }
}


