/**
 * Clase para registrar los datos de un libro
 * @author  Amparo López Gaona
 * @version Tercera edición
 * @see Obra
 */
public class Libro extends Obra {
  private String editorial;

  /** Constructor de un libro
   * @param autor- nombre del autor del libro
   * @param titulo- titulo del libro
   * @param tema - tema de clasificacion del libro
   * @param anio - anio de publicacion del libro
   * @param ed - editorial del libro
   */
  public Libro(String autor, String titulo, String tema, int anio, String ed){
    super(autor, titulo, tema, anio);
    editorial = ed;
  }

  /**
   * Metodo para obtener la editorial del libro
   * @return String - editorial del libro
   */
  public String obtenerEditorial(){
    return editorial;
  }


  /** 
   * Metodo para asignar editorial al libro
   * @param ed - editorial del libro
   */
  public void asignarEditorial(String ed){
    editorial = (ed != null) ? ed : "Desconocida";
  }

  /**
   * Metodo para obtener una cadena con los datos del libro
   * @return String - cadena con los datos del libro
   */
  public String toString() {
    return super.toString() + "\t" + editorial;
  }
}

