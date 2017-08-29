import java.io.*;
import java.util.Scanner;

/**
 * Programa que ilustra la forma de trabajar con archivos de objetos
 * pertenecientes a una jerarquia de clases.
 *
 * @author Amparo Lopez Gaona
 * @version 2da. ed.
 */
public class PruebaColeccion {

  private static ColeccionPersistente misObras;
  private static Scanner io;

  public static void menu(){

    System.out.println("Qué clase de obra vas a dar de alta?");
    System.out.println("1. Libro");
    System.out.println("2. Articulo");
    System.out.println("3. Tesis");
    System.out.println("0. Fin");

}

  /** 
   * Metodo para dar de alta una obra e incluirla en la coleccion. 
   * @param opcion -- tipo de obra que se dara de alta
   */
  public static void realizarAccion(int opcion){

    switch(opcion) {
      case 0 :
              break;

      case 1 : // Articulo
        System.out.println("Da el titulo del articulo");
        String titulo = io.nextLine();
        System.out.println("Da el nombre del autor");
        String autor =  io.nextLine();
        System.out.println("Da el tema del articulo");
        String tema =  io.nextLine();
        System.out.println("Da el nombre año de publicacion del articulo");
        int anio =  io.nextInt();
        System.out.println("Da el nombre del articulo");
        String nomRev =  io.nextLine();
        System.out.println("Da el volumen  del articulo");
        int volRev =  io.nextInt();
        System.out.println("Da el número de revista del articulo");
        int numRev =  io.nextInt();
        misObras.agregarObra(new Articulo( autor, titulo,tema, anio, nomRev, volRev, numRev));
        break;

      case 2: // Libro
        System.out.println("Da el titulo del libro");
        titulo = io.nextLine();
        System.out.println("Da el nombre del autor");
        autor =  io.nextLine();
        System.out.println("Da el tema del libro");
        tema =  io.nextLine();
        System.out.println("Da el nombre año de publicacion del libro");
        anio =  io.nextInt();
	System.out.println("Da el nombre de la editorial");
        String editorial =  io.nextLine();
	misObras.agregarObra(new Libro( autor, tema, titulo, anio, editorial));
        break;

    case 3: //tesis
        System.out.println("Da el titulo del libro");
        titulo = io.nextLine();
        System.out.println("Da el nombre del autor");
        autor =  io.nextLine();
        System.out.println("Da el tema del libro");
        tema =  io.nextLine();
        System.out.println("Da el nombre año de publicacion de la tesis");
        anio =  io.nextInt();
	System.out.println("Da el tema del libro");
        String director =  io.nextLine();
        System.out.println("Da el nombre año de publicacion de la tesis");
        String grado =  io.nextLine();
        misObras.agregarObra(new Tesis( autor, titulo, tema, anio, director, grado));
        break;
  
    default  :
        System.out.println("Opcion incorrecta");               
    }
}

/** Grabacion de objetos */

  public static void main (String [] pps) {
    int opcion;
    String nombreDeArchivo = (pps.length != 0)? pps[0]: "MiColeccion.ser";
    io = new Scanner(System.in);
    misObras = new ColeccionPersistente(nombreDeArchivo);

    do{
      menu();
      opcion = io.nextInt();
      realizarAccion(opcion);
    } while(opcion != 0);

    misObras.guardarColeccion();
    misObras.leerColeccion();
    misObras.imprimirColeccion();
  }
}
