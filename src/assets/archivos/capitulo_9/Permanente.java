/**
 * Clase que implementa a la subclase de los empleados permanentes
 * Objetivo: ilustrar el uso de clases abstractas
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
abstract public class Permanente extends Empleado {
  private Contrato contrato;
  protected double deducciones;

  /**
   * Constructor de un empleado permanente. Éste llama al constructor
   * de la clase Empleado
   * @param nombre - nombre del empleado
   * @param direccion - direccion del empleado
   * @param curp - curp del empleado
   */
  public Permanente(String nombre, String direccion, String curp) {
    super(nombre, direccion, curp);
    contrato = new Contrato();
  }

  abstract double calcularDeducciones();
}

