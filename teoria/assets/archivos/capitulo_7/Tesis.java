/**
 * Clase para registrar los datos de una tesis
 * @author  Amparo López Gaona
 * @version Tercera edición
 * @see Obra
 */
public class Tesis extends Obra {
  private String director;
  private String grado;

  /** Constructor de una tesis
   * @param autor- nombre del autor de la tesis
   * @param titulo- titulo de la tesis
   * @param tema - tema de clasificacion de la tesis
   * @param anio - anio de publicacion de la tesis
   * @param d - director de la tesis
   * @param g - grado 
   */
  public Tesis(String autor, String titulo, String tema, int anio, String d,
               String g){
    super(autor, titulo, tema, anio);
    director = d;
    grado = g;
  }

  /**
   * Metodo para obtener la director de la tesis
   * @return String - director de la tesis
   */
  public String obtenerDirector(){
    return director;
  }

  /** 
   * Metodo para asignar director a la tesis
   * @param ed - director de la tesis
   */
  public void asignarDirector(String d){
    director = (d != null) ? d : "Amparo Lopez Gaona";
  }

  /**
   * Metodo para obtener la grado de la tesis
   * @return String - grado de la tesis
   */
  public String obtenerGrado(){
    return grado;
  }

  /** 
   * Metodo para asignar grado a la tesis
   * @param ed - grado de la tesis
   */
  public void asignarGrado(String g){
    grado = (g != null) ? g : "Licenciatura";
  }

  /**
   * Metodo para obtener una cadena con los datos de la tesis
   * @return String - cadena con los datos de la tesis
   */
  public String toString() {
    return super.toString() + "\t" + director +"\t" + grado;
  }
}
