import java.util.Scanner;
/**
 * Programa sencillo para que convierta nombres de un formato a otro.
 * Objetivo Trabajar con objetos de la clase String.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class ConvertidorNombres {                                    

  public static void main (String [] pps) {       
    Scanner in = new Scanner(System.in); 
    String nombreCompleto = new String();         
    String nombre, aPaterno, aMaterno;

    System.out.println("Dame el nombre de completo de una persona, ");
    System.out.println("separando el nombre de los apellidos con una coma");
    nombreCompleto = in.nextLine();              

    nombreCompleto = nombreCompleto.trim();   //Elimina blancos al final de la linea
                            
    System.out.print("El nombre completo "+ nombreCompleto);
    System.out.println(" es igual a ");

    int posicion = nombreCompleto.indexOf(",");  //Busca la coma 
    nombre = nombreCompleto.substring(0, posicion);
    nombreCompleto = nombreCompleto.substring(posicion+2, nombreCompleto.length());

    posicion = nombreCompleto.indexOf(" ");  // Busca el primer blanco de la linea
    aPaterno = nombreCompleto.substring(0, posicion);

    nombreCompleto = nombreCompleto.substring(posicion+1);    
    aMaterno = nombreCompleto;

    String nombreNuevo = aMaterno + " " + aPaterno + " " + nombre;

    System.out.println("("+nombreNuevo+ ") en el formato solicitado.");
  }
}
