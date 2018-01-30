import java.util.Scanner;

/**
 * Programa para enviar una felicitacio personalizada.
 * Objetivo Mostrar como se crean y usan objetos de distintas clases.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class FelicitacionPersonalizada {                                    
  public static void main (String [] pps) {
    Scanner in = new Scanner(System.in);
    String nombre;         

    System.out.println("Dame tu nombre ");
    nombre = in.nextLine();             
    System.out.print("!Felicidades "+ nombre+ "! ");
    System.out.println("Has escrito tu primer programa en Java");
  }
}
