/**
 * Excepcion para retiros negativos
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
class ExcepcionRetiroNegativo extends ExcepcionBancaria {

  /**
   * Constructor que recibe el mensaje que enviara en caso de ocurrir la excepcion
   * @param s -- Cadena con el mensaje
   */
  public ExcepcionRetiroNegativo(String s) {
    super (s);
  }

  /**
   * Constructor por omision
   */

  public ExcepcionRetiroNegativo() {
    super ();
  }
}
