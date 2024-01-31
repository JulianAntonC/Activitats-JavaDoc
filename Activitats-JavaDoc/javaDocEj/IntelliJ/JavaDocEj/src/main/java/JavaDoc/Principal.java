package JavaDoc;

/**
 * Programa para comprobar si un numero es capicua
 * Muestra si el numero es capicua mediante un Verdadero y Falso, V = Capicua, F = No Capicua
 */

public class Principal {
    public static void main(String[] args) {
        try {
            System.out.println("12345 és capicua: " + SocUtil.esCapikua(12345));
            System.out.println("1221 és capicua: " + SocUtil.esCapicua(1221));
            System.out.println("1234321 és capicua: " + SocUtil.esCapikua(1234321));
        } catch (EsNegatiuEX ex) {
        }
    }
}
