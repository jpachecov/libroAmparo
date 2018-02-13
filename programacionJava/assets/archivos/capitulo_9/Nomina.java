/** 
 * Programa que prueba el funcionamiento de la
 * jerarquía de herencia. En él se crea un arreglo de empleados y se llena
 * con empleados de diferente clase.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Nomina {

  public static void main(String [] pps) {
    Empleado p[] = new Empleado[3];

    p[0] = new Temporal("Juan Pérez","calle 1-1", "pejua345622",40);
    p[1] = new PorHoras("Carmelo Gómez","calle 2-2", "carmelo345622",30,85);
    p[2] = new TiempoCompleto("Andrea López","calle 444", "andi345622",500);
 
    System.out.println("Nómina para la empresa ABSTRACTA S.A.");

    for (int i = 0; i <3; i++) {
      System.out.println(p[i].obtenerNombre()+"\t\t"+p[i].calcularSueldo());
      p[i].imprimirOrdenDePago();
    } 
  }
}

