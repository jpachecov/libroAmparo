/**
 *  Clase para simular el funcionamiento de una caja de dinero de un
 *  establecimiento.
 *  @author  Amparo López Gaona
 *  @version Tercera edición
 */
public class Caja {
  private double totalAcumulado;      // Dinero totalAcumulado en el dia.
  private double cantidadInicial;

/**
 * Constructor. Inicializa una Caja poniendo cero en cantidadInicial y 
 * dando un totalAcumulado inicial.
 * @param inicial - cantidad de dinero con que se abre la caja.
 */
  public Caja(double inicial) {
    if (inicial > 0) {
      totalAcumulado = inicial;
      cantidadInicial = inicial;
    } else {
      totalAcumulado = 0;
      cantidadInicial = 0;
    }
  }

/**
 * Constructor por omision. 
 * Inicializa una Caja poniendo cero en dineroRecibido y 
 * dando un totalAcumulado inicial de $100.00.
 */
  public Caja() {
      this (100);
  }

/**
 * Guarda todo el dinero dado por un cliente
 * @param importe -- cantidad a guardar en la caja.
 */
  public void guardarDinero(double importe) {
    totalAcumulado += importe;
  }

/**
 * Retira  la cantidad de dinero solicitada
 * @param importe -- cantidad a retirar de la caja.
 */
    public void retirarDinero(double importe) {
	totalAcumulado -= importe;
    }

/**
 * Devuelve la cantidad de dinero que hay en la caja.
 * @return double -- cantidad almacenada en la caja.
 */
    public double obtenerTotalAcumulado() {
	return totalAcumulado;
    }

/**
 *  Devuelve la cantidad de dinero acumulada en el dia.
 * @return double - cantidad acumulada.
 */
  public double corteDeCaja() {
    return totalAcumulado - cantidadInicial;
  }
}

