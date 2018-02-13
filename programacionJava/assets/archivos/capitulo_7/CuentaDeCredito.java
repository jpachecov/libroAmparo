/**
 * Clase para trabajar cuentas de credito. Este tipo de cuentas tienen ademas
 * de un saldo o cantidad disponible, un limite de credito y la cantidad que 
 * se adeuda
 * @author  Amparo López Gaona
 * @version Tercera edición
 * @see Cuenta
 */
public class CuentaDeCredito extends Cuenta {
  private double deuda; //Importe de la deuda

  /**
   * Constructor de una cuenta de credito a partir del limite de credito especificado
   * @param credito - limite de credito otorgado
   */
  public CuentaDeCredito (double credito) {
    super (credito);   //  disponible = limite;
    deuda = 0;
  }

  /**
   * Metodo que registra una compra mediante la cuenta de credito siempre que
   * el monto de la misma sea positivo y menor que el disponible.
   * @param monto - importe de la compra
   */
  public void comprar(double monto) {
    if (monto > 0.0 && monto < disponible ) {
      deuda += monto;
      disponible -= monto;
    } else { 
      System.out.println("No se autoriza la compra por este monto");
    }
  }

  /**
   * Metodo para retirar dinero de una cuenta de credito
   * @param monto - importe del retiro
   */
  public void retirar (double monto) {
    if (monto > 0.0 && monto <= disponible ) {
      double comision = monto *0.02;
      super.retirar(monto+comision);
      deuda += (monto + comision);
    }
  }

  /**
   * Metodo para conocer el importe de la deuda de la tarjeta de credito
   * @return double - importe de la deuda.
   */
  public double obtenerValorDeuda() {
    return deuda;
  }

  /**
   * Deposita cantidad de dinero en la cuenta
   * @param monto - cantidad que se desea depositar
   */
  public void depositar(double monto){
    if(monto > 0){
      deuda -= monto;
      if(deuda < 0){
	super.depositar((-1)*deuda);
	deuda = 0;
      } else {
	super.depositar(monto);
      }
    }
  }

  /**
   * Metodo para conocer el limte de credito de la tarjeta
   * @return double - limite de credito
   */
  public double obtenerLimiteCredito(){
    return super.obtenerDisponible();
  }
}

