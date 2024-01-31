package JavaDoc;

/**
 * Mensaje de error en caso de numero negativo
 */
public class EsNegatiuEX extends Exception {
    public EsNegatiuEX () {
        super("el valor no pot ser negatiu");
    }
    public EsNegatiuEX (String msg) {
        super(msg);
    }
}
