import java.io.*;

/**
 * Programa para probar la serializacion de objetos de la clase Persona
 * @author Amparo Lopez Gaona
 * @version 2da. ed.
 */
public class PruebaSerializacion{

  public static void main(String [] pps){

    ObjectOutputStream escritor = null;
    String nombreDeArchivo = (pps.length != 0)? pps[0]: "prueba.ser";
  
    try{

      escritor = new ObjectOutputStream(new FileOutputStream(nombreDeArchivo));
      escritor.writeObject(new Persona("Andrea", 50, 1.52));
      escritor.writeObject(new Persona("Maria", 52, 1.40));
      escritor.writeObject(new Persona("Daniela", 50, 1.40));
      escritor.writeObject(new Persona("Mariana", 45, 1.20));

    } catch(NotSerializableException e){
      System.out.println("Error en la grabacion. Objeto no serializable");
    }catch(IOException e){
      System.out.println("Error en la grabacion: " + e);
    } finally{
      if (escritor != null){
        System.out.println("Cerrando el archivo " + nombreDeArchivo);
        try{ escritor.close(); } catch(IOException e){}
      } else {
        System.out.println("No hay ningún archivo abierto");
      }
    }
  }
}
