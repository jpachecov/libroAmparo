/**
 * Excepcion para depositos negativos
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class ExcepcionDepositoNegativo extends ExcepcionBancaria {

  /**
   * Constructor por omision
   */
  public ExcepcionDepositoNegativo(String s) {
    super (s);
  }

  /**
   * Constructor que recibe el mensaje que enviara en caso de ocurrir la excepcion
   * @param s -- Cadena con el mensaje
   */
  public ExcepcionDepositoNegativo() {
    super ();
  }
}
