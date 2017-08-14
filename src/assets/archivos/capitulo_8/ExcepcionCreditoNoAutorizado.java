/**
 * Excepcion para creditos no autorizados
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
class ExcepcionCreditoNoAutorizado extends ExcepcionBancaria {

  /**
   * Constructor que recibe el mensaje que enviara en caso de ocurrir la excepcion
   * @param s -- Cadena con el mensaje
   */
  public ExcepcionCreditoNoAutorizado(String s) {
    super (s);
  }

  /**
   * Constructor por omision
   */
  public ExcepcionCreditoNoAutorizado() {
    super ();
  }
}

