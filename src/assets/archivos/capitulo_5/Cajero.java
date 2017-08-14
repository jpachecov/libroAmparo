import java.util.Scanner;

/**
 *  Clase para simular el funcionamiento de una cajero de dinero de un 
 *  establecimiento.
 *  @see Caja
 *  @author  Amparo López Gaona
 *  @version Tercera edición
 */ 
public class Cajero {
  private Caja miCaja;
  private double dineroRecibido; // Dinero depositado por el cliente.
 
    /**
     * Constructor del cajero.
     * @param caja -- caja con la que trabaja el cajero.
     */
  public Cajero(Caja caja) {
    miCaja = caja;
    dineroRecibido = 0;
  }

 /**
 * Reporta lo que ha recibido de un cliente.
 * @return double - la cantidad que ha recibido.
 */
  public double obtenerRecibido() {
    return dineroRecibido;
  }
/**
 * Maneja la recepcion de una cantidad de dinero 
 * @param cantidad - dinero recibido.
 */
  public void aceptarDinero(double cantidad) {
      if (cantidad > 0) {
	  dineroRecibido += cantidad;
      }
  }

/**
 * Devuelve cambio siempre que sea posible.
 * @param valor - cantidad que devolvera.
 */
  public void darCambio(double valor) {
      miCaja.retirarDinero(valor);
      System.out.println("\n*** Cambio regresado: $" + valor);
  }

    /**
     * Metodo para cobrar el importe requerido
     * @param importe -- importe que debe cobrarse
     */
  public void cobrar(double importe) {
    dineroRecibido = 0;  // Listo para empezar a cobrar

    recibirDinero(importe);
    miCaja.guardarDinero(dineroRecibido);  //Guarda el dinero en la caja
    double cambio = dineroRecibido - importe;   //Calcula el cambio necesario
    if (miCaja.obtenerTotalAcumulado() >= cambio) {
      darCambio(cambio);
    } else {
      System.out.println("\n*** De momento no hay cambio ***");
      miCaja.retirarDinero(dineroRecibido);
    }
  }

    /* Metodo para recibir dinero de una compra poco a poco. Deja el dinero en
     * la variable dineroRecibido
     * @param importe -- cantidad que espera recibir
     */
  private void recibirDinero(double importe) {
    Scanner in = new Scanner(System.in);
    dineroRecibido = 0;  

    do {
      System.out.print("Deposita tu dinero ");
      double dinero = in.nextDouble();
      System.out.println("Depositaste "+dinero);
      aceptarDinero(dinero);
      double saldo = importe - dineroRecibido;
      if (saldo > 0)
	System.out.println("El importe a pagar es $" + importe + " falta $"+ saldo);
    } while (dineroRecibido < importe) ;
  }

/**
 * Metodo para que el cajero conozca la cantidad total de dinero que hay
 * en la caja
 * @return double -- cantidad de dinero en la caja.
 */
  public double corteDeCaja() {
    return miCaja.corteDeCaja();
  }
}
