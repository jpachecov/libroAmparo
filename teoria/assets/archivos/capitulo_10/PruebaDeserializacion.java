import java.io.*;

/**
 * Programa para probar la deserializacion de objetos de la clase Persona
 * @author Amparo Lopez Gaona
 * @version 2da. ed.
 */
public class PruebaDeserializacion {

  public static void main (String [] pps) {
    ObjectInputStream lector = null;
    String nombreDeArchivo = (pps.length != 0) ? pps[0] : "prueba.ser";

    try {

      lector  = new ObjectInputStream (new FileInputStream(nombreDeArchivo));
      Persona obj;
      do {
        obj = (Persona) lector.readObject();
        System.out.println(obj);
      } while (obj != null);

    } catch(EOFException e) {
      System.out.println("Fin de la lectura del archivo");
    }catch (ClassNotFoundException e) {
      System.out.println("El objeto recuperado no es de la clase Persona");
    } catch(IOException e) {
      System.out.println("Error "+ e);
    } finally {
      if (lector != null) {
        System.out.println("Cerrando el archivo "+nombreDeArchivo);
        try { lector.close(); } catch (IOException e) {}
      } else {
        System.out.println("No hay archivo abierto.");
      }
    }
  }
}
