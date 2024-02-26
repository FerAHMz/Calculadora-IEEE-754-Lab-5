public class BinarioADecimalIEEE754 {

    /**
     * Convierte una cadena de texto que representa un número binario en formato IEEE 754
     * a su valor decimal correspondiente.
     *
     * @param binario La representación binaria en formato IEEE 754 como cadena de texto.
     * @return El valor decimal como un tipo primitivo float.
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

