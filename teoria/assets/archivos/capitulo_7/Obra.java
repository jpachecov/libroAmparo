/**
 * Clase para registrar los datos de una obra literaria.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class Obra implements java.io.Serializable{
  private String autor;
  private String titulo;
  private String tema;
  private int anio;

  /** Constructor de una obra
   * @param a- nombre del autor de la obra
   * @param t- titulo de la obra
   * @param tem - tema de clasificacion de la obra
   * @param an - anio de publicacion de la obra
   */
  public Obra(String a, String t, String tem, int an){
    autor = a;
    titulo = t;
    tema = tem;
    anio = an;
  }

  /** Metodo para asignar valor al autor de la obra
   * @param nombre - nombre del autor de la obra
   */
  public void asignarAutor (String nombre) {
    autor = nombre;
  }

  /** Metodo para asignar titulo a la obra
   * @param t- titulo de la obra
   */
  public void asignarTitulo (String t) {
    titulo = t;
  }

  /** Metodo para asignar tema a la obra
   * @param t - tema de la obra
   */
  public void asignarTema (String t) {
    tema = t;
  }

  /** Metodo para asignar anio a la obra
   * @param a - anio de publicacion de la obra
   */
  public void asignarAnio (int a) {
    anio = a;
  }

  /**
   * Metodo para obtener el autor de la obra
   * @return String - nombre del autor de la obra
   */
  public String obtenerAutor () {
    return autor;
  }

  /**
   * Metodo para obtener el tema de la obra
   * @return String - tema de la obra
   */
  public String obtenerTema () {
    return tema;
  }

  /**
   * Metodo para obtener el titulo de la obra
   * @return String - titulo de la obra
   */
  public String obtenerTitulo () {
    return titulo;
  }

  /**
   * Metodo para obtener el anio de la obra
   * @return int - anio de publicacion de la obra
   */
  public int obtenerAnio () {
    return anio;
  }

  /**
   * Metodo para obtener una cadena con los datos de la obra
   * @return String - cadena con los datos de la obra
   */
  public String toString() {
    return autor + "\t"+ titulo + "\t"+ tema + "\t" + anio;
  }
}


