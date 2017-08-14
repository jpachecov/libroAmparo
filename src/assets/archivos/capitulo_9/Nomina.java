/** 
 * Programa que prueba el funcionamiento de la
 * jerarqu�a de herencia. En �l se crea un arreglo de empleados y se llena
 * con empleados de diferente clase.
 * @author  Amparo L�pez Gaona
 * @version Tercera edici�n
 */
public class Nomina {

  public static void main(String [] pps) {
    Empleado p[] = new Empleado[3];

    p[0] = new Temporal("Juan P�rez","calle 1-1", "pejua345622",40);
    p[1] = new PorHoras("Carmelo G�mez","calle 2-2", "carmelo345622",30,85);
    p[2] = new TiempoCompleto("Andrea L�pez","calle 444", "andi345622",500);
 
    System.out.println("N�mina para la empresa ABSTRACTA S.A.");

    for (int i = 0; i <3; i++) {
      System.out.println(p[i].obtenerNombre()+"\t\t"+p[i].calcularSueldo());
      p[i].imprimirOrdenDePago();
    } 
  }
}

