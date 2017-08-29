/**
 * Programa que ilustra la diferencia entre referencia y objeto.
 *
 * @author  Amparo L&oacute;pez Gaona
 * @version Tercera edici&oacute;n
 * @since Noviembre 2010
 */
public class DiferenciaV2 {

  public static void main (String [] pps) {
    Punto p1 = new Punto(10,20);
    Punto p2 = new Punto(20,20);
    Punto p3 = new Punto(10,20);
    Punto p4 = p1;

    if (p1.equals(p1)) {
      System.out.println("p1 = p1"); 
    }
    if (p1.equals(p2)) {
      System.out.println("p1 = p2"); 
    }
    if (p1.equals(p3)) {
      System.out.println("p1 = p3"); 
    }
    if (p1.equals(p4)) {
      System.out.println("p1 = p4"); 
    }
  }
} 
