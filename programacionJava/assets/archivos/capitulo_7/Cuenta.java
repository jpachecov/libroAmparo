/**
 * Clase para manejar cuentas bancarias.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Cuenta {
  protected double disponible;
  private static int num = 2010;
  private final long numCta;

/**
* COnstructor por omision. Crea una cuenta con $2500.00
*/
public Cuenta(){
    this(2500.0);
}

  /**
   * Crea una cuenta con disponible minimo de $2500
   * @param disponibleInicial monto con el que se creara la cuenta.
   */
  public Cuenta(double disponibleInicial) {
      disponible = (disponibleInicial < 2500) ? 2500 : disponibleInicial;
      numCta = num++;
  }

  /** 
   * Retira una cantidad de dinero en la cuenta 
   * @param monto cantidad que se desea retirar
   * mayor que el disponible
   */
  public void retirar(double monto) {
    if (monto <= 0 || monto > disponible) {
	System.out.print("Los retiros deben ser positivos y menores a " + disponible);
    } else {
      disponible -= monto;
    }
  }

  /** 
   * Deposita una cantidad de dinero en la cuenta 
   * @param monto cantidad que se desea depositar
   */
  public void depositar(double monto) {
    if (monto <= 0) {
      System.out.println("El monto del deposito debe ser positivo");
    } else
      disponible += monto;
  }

  /**
   * Devuelve el disponible de la cuenta
   * @return double - disponible disponible 
   */
  public double obtenerDisponible() {
    return disponible;
  }

  /**
   * Devuelve el numero de la cuenta
   * @return int - numero de cuenta
   */
  public double obtenerNumCuenta() {
      return numCta;
  }
}

