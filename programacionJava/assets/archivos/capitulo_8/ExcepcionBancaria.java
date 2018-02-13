/**
 * Excepcion para cuentas bancarias
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class ExcepcionBancaria extends Exception {

  /**
   * Constructor por omision
   */
  public ExcepcionBancaria() {
    super ();
  }

  /**
   * Constructor que recibe el mensaje que enviara en caso de ocurrir la excepcio
   * @param s -- Cadena con el mensaje
   */
  public ExcepcionBancaria(String s) {
    super (s);
  }
}


