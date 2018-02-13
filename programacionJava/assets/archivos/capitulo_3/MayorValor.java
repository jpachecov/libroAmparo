/**
 *  Programa que determina el mayor de tres valores de un dado, al ser lanzado
 *  cada vez por un jugador distinto.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
import java.util.Scanner;

class MayorValor {
  public static void main (String [] pps) {
    Dado miDado = new Dado();
    Scanner in = new Scanner(System.in);
    int mayor;
    int valor1, valor2, valor3;        //Valor del dado en cada tirada.
    String nombre1, nombre2, nombre3;  //Nombre de los jugadores

                                   //Pedir el nombre de cada jugador.
    System.out.println("Dame el nombre del primer jugador");
    nombre1 = in.nextLine();
    System.out.println("Dame el nombre del segundo jugador");
    nombre2 = in.nextLine();
    System.out.println("Dame el nombre del tercer jugador");
    nombre3 = in.nextLine();
                                  //Cada jugador lanza el dado.
    valor1 = miDado.lanzar();
    valor2 = miDado.lanzar();
    valor3 = miDado.lanzar();

                                 // Avisa el valor que le cayo a cada jugador.
    System.out.println(nombre1 + " tienes un "+valor1);
    System.out.println(nombre2 + " tienes un "+valor2);
    System.out.println(nombre3 + " tienes un "+valor3);

                                 // Determina el valor mayor
    if ( valor1 > valor2 && valor1 > valor3) 
      mayor = valor1;
    else
      if (valor2 > valor1 && valor2 > valor3) 
        mayor = valor2;
      else
        mayor = valor3;

    System.out.print("Los valores son "+valor1+", "+valor2+", "+valor3);
    System.out.println("\n el mayor valor es "+ mayor);
  }
}
