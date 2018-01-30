/**
 * Clase que implementa a la subclase de los empleados por horas.
 * Objetivo: ilustrar el uso de clases abstractas
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class PorHoras extends Permanente {
  private double horasTrabajadas;
  private double sueldoHora;
  private final double porcentaje = 0.02;

  /**
   * Constructor de un empleado por horas. Éste llama a permanente.
   * @param nombre - nombre del empleado
   * @param direccion - direccion del empleado
   * @param curp - curp del empleado
   * @param horasT - cantidad de horas trabajadas
   * @param pagoH - sueldo por hora trabajada
   */
  public PorHoras(String nombre, String direccion, String curp,
                  double horasT, double pagoH) {
    super(nombre, direccion, curp);
    horasTrabajadas=horasT;
    sueldoHora=pagoH;
  }
  /** Calcula las deducciones de un empleado por horas
   * @return double - deducciones calculadas
   */
  public double calcularDeducciones() {
    return (horasTrabajadas*sueldoHora)*porcentaje;
  }
  /** Calcula el sueldo de un empleado por horas, tomando en cuenta
   * las deducciones
   * @return double - sueldo calculado
   */
  public double calcularSueldo() {
    deducciones = calcularDeducciones();
    pago=(horasTrabajadas*sueldoHora) - deducciones;
    return pago;
  }
}
