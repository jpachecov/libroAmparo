/**
 * Programa para probar referencias a interfaces
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class PruebaCirculosInflables{

  public static void main(String[] pps){
  
      Inflable bola = new Circulo(new Punto(4,4), 3);
      System.out.println(bola);
      bola.inflar(20);
      System.out.println(bola);
      bola.desinflar(3);
      System.out.println(bola);
  }
}
