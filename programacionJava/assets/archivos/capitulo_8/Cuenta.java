/**
 * Clase para manejar cuentas bancarias. Utilizando excepciones
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Cuenta {
  protected double disponible;
  private static int num = 2010;
  private final long numCta;

  /**
   * Crea una cuenta con disponible minimo de $2500
   * @param disponibleInicial monto con el que se creara la cuenta.
   * @throws IllegalArgumentException si el disponible es menor a 2500
   */
  Cuenta(double disponibleInicial) {
    if (disponibleInicial < 2500)
      throw new IllegalArgumentException("El monto inicial es menor a"+
                             "$2,500.00");
    disponible = disponibleInicial;
    numCta = num++;
  }

  /** 
   * Retira una cantidad de dinero en la cuenta 
   * @param monto cantidad que se desea retirar
   * @throws ExcepcionBancaria en caso de que el retiro sea negativo, o
   * mayor que el disponible
   */
  public void retirar(double monto) throws ExcepcionRetiroNegativo, 
					   ExcepcionFaltaDeFondos {
    if (monto <= 0)
      throw new ExcepcionRetiroNegativo();
    if (monto > disponible)
      throw new ExcepcionFaltaDeFondos("Los fondos son insuficientes para el retiro");
    disponible -= monto;
  }

  /** 
   * Deposita una cantidad de dinero en la cuenta 
   * @param monto cantidad que se desea depositar
   * @throws ExcepcionBancaria en caso de que el deposito sea negativo.
   */
  public void depositar(double monto) throws ExcepcionDepositoNegativo {
    if (monto <= 0)
      throw new ExcepcionDepositoNegativo("Los depositos deben ser positivos");
    disponible += monto;
  }

  /**
   * Devuelve el disponible de la 
   * @return double - disponible disponible 
   */
  public double obtenerDisponible() {
    return disponible;
  }

  /**
   * Devuelve el numero de identificacion de la cuenta bancaria
   * @return -- numero de la cuenta
   */
  public long obtenerNumCuenta() {
    return numCta;
  } 
}

