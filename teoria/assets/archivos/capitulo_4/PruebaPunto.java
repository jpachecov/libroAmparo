/**
 *  Clase para probar la clase Punto
 * @author  Amparo L&oacute;pez Gaona
 * @version Tercera edici&oacute;n
 */

public class PruebaPunto {
  public static void main(String [] pps) {
	
    Punto inicio = new Punto (4, -30);
    Punto fin = new Punto(10, 10);  
    Punto otro = new Punto();

    System.out.println("La distancia es: " + inicio.distancia(fin));
    System.out.print("Los puntos ");
    boolean estan = inicio.estanAlineados(fin, otro);

    if(estan){
      System.out.print("si ");
    } else {
      System.out.print("No ");
    }

    System.out.println("estan alineados");
  }
}
