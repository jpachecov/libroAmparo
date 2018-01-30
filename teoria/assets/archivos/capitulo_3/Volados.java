import java.util.Scanner;
/**
 * Programa para que el usuario juegue volados con la computadora.
 * Objetivo Mostrar como se crean y usan objetos de distintas clases.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Volados {

  static public void main (String [] pps) {
                                            //Declaracion de variables
    Moneda centenario = new Moneda();
    Scanner in = new Scanner(System.in);           
    String nombre, pidio, cayo;                 

    System.out.print("Dame tu nombre ");      // Solicita nombre del jugador
    nombre = in.nextLine();                  

    System.out.print(nombre+ ", ?que pides (aguila/sol)? ");  // Solicita prediccion

    pidio = in.nextLine();                       
    pidio = pidio.toLowerCase().trim();

    if (pidio.equals("aguila") || pidio.equals("sol")) { 
      cayo = centenario.lanzar();           //Eleccion valida. Juega
      System.out.println("Cayo " + cayo);
      if (pidio.equals(cayo))
        System.out.println(nombre + ", ganaste :) ");
      else
        System.out.println(nombre + ", perdiste :(");
    } else                                 // Eleccion incorrecta.
        System.out.println("Solo puedes pedir aguila o sol. Asi no juego.");
  } 
}

