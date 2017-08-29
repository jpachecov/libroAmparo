import java.io.*;

/**
 * Clase para crear una coleccion persistente de obras escritas
 * @author Amparo Lopez Gaona
 * @version 2da. ed.
 */
public class ColeccionPersistente {
  private final String nombreArch;
  private final Obra[] coleccion;
  private int nObras;

  /**
   * Constructor que deja listo el archivo para trabajar.
   * @param nombre - nombre del archivo con el que se va a trabajar.
   * @throws RuntimeException en caso de falla con el archivo.
   */
  public ColeccionPersistente(String nombre) {
    nombreArch = nombre;
    File archObras = new File(nombreArch);

    coleccion = new Obra[100];  // No hay coleccion grabada
    nObras = 0;

    if(archObras.exists()){
      if(!archObras.canRead()){
        throw new RuntimeException("No es posible leer el archivo " +nombreArch);
      } 
      if(!archObras.canWrite()){
        throw new RuntimeException("Imposible escribir en el archivo "+nombreArch);
      }
      leerColeccion();   // Lee una coleccion grabada
    }
  }

  /**
   * Método para agregar una nueva obra al arreglo
   * @param Obra -- obra que será agregada
   */
  public void agregarObra(Obra o) {
    coleccion[nObras++] = o;
  }

  /**
   * Método para serializar los objetos almacenados en un arreglo de obras 
   */
  public void guardarColeccion(){
    ObjectOutputStream escritor = null;

    try{
      escritor = new ObjectOutputStream(new FileOutputStream(nombreArch));
      for (int i=0; i < nObras; i++)
	escritor.writeObject(coleccion[i]);
    } catch(NotSerializableException e){
      System.out.println("Error en la grabación: "+e+". Objeto no serializable.");
    } catch(IOException e){
      System.out.println("Error en la grabación: "+e);
    } finally {
      if (escritor != null) {
        System.out.println("Cerrando el archivo "+nombreArch);
        try { escritor.close(); } catch (IOException e) {}
      } else {
        System.out.println("No se abrió ningún archivo.");
      }
    }
  }

  /**
   * Metodo para leer una coleccion serializada
   */
  public void leerColeccion() {
    ObjectInputStream lector = null;

    try{
      lector = new ObjectInputStream(new FileInputStream(nombreArch));
      nObras = 0;
      Object objeto;
      do{
	objeto = lector.readObject();
	if (objeto != null)
	    coleccion [nObras++] = (Obra) objeto;
      } while (objeto != null);
    } catch(java.lang.ClassNotFoundException e) {}
    catch(java.io.EOFException e) {System.out.println("Encontro el fin de archivo");
    } catch(IOException e){
      System.out.println("Lectura fallida: "+e);
    } finally {
      if (lector != null) {
        System.out.println("Cerrando el archivo "+nombreArch);
        try { lector.close(); } catch (IOException e) {}
      } else {
        System.out.println("No se abrió ningún archivo.");
      }
    }
  }

  /**
   * Método que devuelve el arreglo de obras.
   * @return Obras[] - arreglo que contiene las obras de una coleccion.
   */
  public Obra[] obtenerColeccion(){
    return coleccion;
  }

  /**
   * Método que devuelve el nombre del archivo donde están las obras.
   * @return String - nombre del archivo que contiene una coleccion de obras.
   */
  public String obtenerNombreArch(){
    return nombreArch;
  }

  /**
   * Método para listar todas las obras de la coleccion
   */
  public void imprimirColeccion(){
    for(int i = 0; i < nObras; i++){
      System.out.println(coleccion[i]);
    }
  }
}
