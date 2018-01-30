/**
 * Programa que ilustra la diferencia entre referencia y objeto.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Diferencia {
  public static void main (String [] pps) {
    Punto p1 = new Punto(10,20);
    Punto p2 = new Punto(20,20);
    Punto p3 = new Punto(10,20);
    Punto p4 = p1;

    if (p1 == p1) {
      System.out.println("p1 = p1"); 
    }
    if (p1 == p2) {
      System.out.println("p1 = p2"); 
    }
    if (p1 == p3) {
      System.out.println("p1 = p3"); 
    }
    if (p1 == p4) {
      System.out.println("p1 = p4"); 
    }
  }
} 
