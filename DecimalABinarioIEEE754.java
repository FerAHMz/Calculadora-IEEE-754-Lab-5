public class DecimalABinarioIEEE754 {

    /**
     * Convierte un número decimal a su representación en binario siguiendo el estándar IEEE 754 de precisión simple.
     *
     * @param numero El número decimal a convertir.
     * @return La representación en binario del número siguiendo el estándar IEEE 754.
     */
    public static String convertir(float numero) {
        // Utiliza la función de Java para convertir el float a su representación de bits IEEE 754
        int bits = Float.floatToIntBits(numero);
        // Convierte esos bits a una cadena binaria
        return leftPad(Integer.toBinaryString(bits), 32, '0');
    }

    /**
     * Rellena la cadena con el carácter dado hasta que alcance la longitud especificada.
     *
     * @param original La cadena original que necesitamos rellenar.
     * @param length   La longitud deseada de la cadena rellenada.
     * @param padChar  El carácter de relleno.
     * @return La cadena rellenada a la izquierda.
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

