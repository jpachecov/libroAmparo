/**
 *	Clase para manejo de excepciones en caso de montos negatiovs
 * 	@author  Amparo López Gaona
 * 	@version Tercera edición
 */
public class ExcepcionMontoNegativo  extends ExcepcionBancaria {
    public ExcepcionMontoNegativo(String s) {
	super (s);
    }

    public ExcepcionMontoNegativo() {
	super ();
    }
}
