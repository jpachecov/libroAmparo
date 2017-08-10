/**
 * Excepcion para el caso de falta de fondos
 * @author Amparo Lopez Gaona
 * @version 2da. ed.
 */
class ExcepcionFaltaDeFondos extends ExcepcionBancaria {

  /**
   * Constructor que recibe el mensaje que enviara en caso de ocurrir la excepcion
   * @param s -- Cadena con el mensaje
   */
    public ExcepcionFaltaDeFondos(String s) {
	super (s);
    }

  /**
   * Constructor por omision
   */
    public ExcepcionFaltaDeFondos() {
	super ();
    }
}

