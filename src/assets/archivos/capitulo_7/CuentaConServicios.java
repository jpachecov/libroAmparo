/**
 * Clase para manejar cuentas bancarias con la posibilidad de pagar
 * el telefono.
 * @author  Amparo López Gaona
 * @version Tercera edición
 * @see     Cuenta
 */
public class CuentaConServicios extends Cuenta {
    /**
   * Constructor de CuentaConServicios, simplemente llama al constructor
   * de la clase Cuenta.
   */
  public CuentaConServicios(double montoInicial) {
    super(montoInicial);
  }

  /**
   * Metodo para pagar el telefono tomando dinero de la cuenta
   * con la que se llama a este metodo.
   * @param monto - Cantidad que debe pagarse
   */
    public void pagarTelefono(double monto) { 
    retirar(monto);
                // Codigo para pagar el telefono
    disponible += 100.00;
  }
}

