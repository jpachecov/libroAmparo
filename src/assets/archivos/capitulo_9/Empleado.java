/**
 * Clase que implementa a los empleados como subclase de personas.
 * Objetivo: ilustrar el uso de clases abstractas
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
abstract public class Empleado extends Persona {
  protected double pago;

  public abstract double calcularSueldo();           // metodo abstracto

  /**
   * Constructor de un empleado. Este llama al de la clase Persona
   * @see Persona
   * @param nombre - nombre del empleado
   * @param direccion - direccion del empleado
   * @param  curp - curp del empleado
   */
  public Empleado(String nombre, String direccion, String curp) {
    super(nombre, direccion, curp);
    pago = 0;
  }
  /**
   * Metodo para imprimir la orden de pago del empleado. 
   */
public void imprimirOrdenDePago() {
  System.out.print("\n\n_________________________________________");
  System.out.println("\n\n\t\t\t\tORDEN DE PAGO DE:");
  System.out.println("\tNombre\t\t" + nombre);
  System.out.println("\tDomicilio\t" + direccion); 
  System.out.println("\tCURP\t\t" + curp);
  System.out.println("\n\nLa cantidad de $" +calcularSueldo());
  System.out.println("\n\n_______________________________________\n\n");
}
}
