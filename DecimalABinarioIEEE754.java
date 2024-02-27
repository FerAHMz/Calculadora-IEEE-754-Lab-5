/**
 * Clase que proporciona una funcionalidad para convertir números decimales
 * a su representación en binario siguiendo el estándar IEEE 754 de precisión simple.
 * El estándar IEEE 754 es un estándar de la industria para representar números de punto flotante
 * en computadoras, que describe el formato de almacenamiento y los métodos de cálculo.
 */
public class DecimalABinarioIEEE754 {

    /**
     * Convierte un número decimal a su representación en binario siguiendo el estándar IEEE 754 de precisión simple.
     * Este método toma un número flotante como entrada y devuelve una cadena de texto que representa
     * su equivalente binario según el formato de punto flotante de precisión simple definido por IEEE 754.
     *
     * @param numero El número decimal a convertir.
     * @return La representación en binario del número siguiendo el estándar IEEE 754. La cadena resultante
     * es de 32 bits de longitud, donde el primer bit es el bit de signo, los siguientes 8 bits son el exponente,
     * y los últimos 23 bits son la fracción.
     */
    public static String convertir(float numero) {
        // Utiliza la función de Java para convertir el float a su representación de bits IEEE 754
        int bits = Float.floatToIntBits(numero);
        // Convierte esos bits a una cadena binaria
        return leftPad(Integer.toBinaryString(bits), 32, '0');
    }

    /**
     * Rellena la cadena con el carácter dado hasta que alcance la longitud especificada.
     * Esta función es útil para asegurar que la representación binaria tenga la longitud necesaria,
     * especialmente para valores que ocupan menos bits de los requeridos por el estándar IEEE 754.
     *
     * @param original La cadena original que necesitamos rellenar.
     * @param length   La longitud deseada de la cadena rellenada.
     * @param padChar  El carácter de relleno utilizado para extender la cadena hasta la longitud especificada.
     * @return La cadena rellenada a la izquierda hasta alcanzar la longitud especificada.
     */
    private static String leftPad(String original, int length, char padChar) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() + original.length() < length) {
            sb.append(padChar);
        }
        sb.append(original);
        return sb.toString();
    }
}
