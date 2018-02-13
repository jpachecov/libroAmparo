/**
 * Clase que implementa a la subclase de los empleados temporales
 * Objetivo: ilustrar el uso de clases abstractas
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Temporal extends Empleado {

  /**
   * Constructor de un empleado temporal. Este llama al de Empleado
   * @param nombre - nombre del empleado
   * @param direccion - direccion del empleado
   * @param curp - curp del empleado
   * @param p - pago acordado
   */
  public Temporal(String nombre, String direccion, String curp, double p){
    super(nombre, direccion, curp);
    pago = p;
  }
  /**
   * Calcula el sueldo de un empleado temporal.
   * @return double - sueldo del empleado
   */
  public double calcularSueldo() {
    return pago;
  }
}
