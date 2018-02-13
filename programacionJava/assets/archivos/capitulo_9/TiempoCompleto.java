/**
 * Clase que implementa a la subclase de los empleados de tiempo completo
 * Objetivo: ilustrar el uso de clases abstractas
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class TiempoCompleto extends Permanente {
  private double pagoQuincenal;       
  private final double servicioMedico = 0.02;
  private final double jubilacion = 0.03;

  /**
   * Constructor de un empleado de tiempo completo. Este llama a permanente.
   * @param nombre - nombre del empleado
   * @param direccion - direccion del empleado
   * @param curp - curp del empleado
   * @param pagoQ - sueldo por quincena
   */
  public TiempoCompleto(String nombre, String direccion, String curp,
                        double pagoQ) {
    super(nombre, direccion, curp);
    pagoQuincenal=pagoQ;
  }
  /** Calcula las deducciones de un empleado de tiempo completo.
   * @return double - deducciones calculadas
   */
  public double calcularDeducciones() {
      return pagoQuincenal*servicioMedico + pagoQuincenal*jubilacion;
  }
  /** Calcula el sueldo de un empleado de tiempo completo, tomando en cuenta
   * las deducciones
   * @return double - sueldo calculado
   */
  public double calcularSueldo(){
    deducciones = calcularDeducciones();
    pago = pagoQuincenal - deducciones;
    return pago;
  }
}
