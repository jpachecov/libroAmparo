/**
 * Clase para registrar los datos de un articulo
 * @author  Amparo López Gaona
 * @version Tercera edición
 * @see Obra
 */
public class Articulo extends Obra {
  private String revista;
  private int volumen;
  private int numero;

  /** Constructor de un articulo
   * @param autor- nombre del autor del articulo
   * @param titulo- titulo del articulo
   * @param tema - tema de clasificacion del articulo
   * @param anio - anio de publicacion del articulo
   * @param r - revista en donde aparece el articulo
   * @param v - volumen de la revista en donde aparece el articulo
   * @param n - numero de la revista en donde aparece el articulo
   */
  public Articulo(String autor, String titulo, String tema, int anio, String r,
                  int v, int n){
    super(autor, titulo, tema, anio);
    revista = r;
    volumen = v;
    numero = n;
  }

  /** 
   * Metodo para asignar revista al articulo
   * @param rev - revista del articulo
   */
  public void asignarRevista(String rev){
    revista = (rev != null) ? rev : "Desconocida";
  }

  /** 
   * Metodo para asignar volumen al articulo
   * @param v - volumen del articulo
   */
  public void asignarVolumen(int v){
      volumen = (v <= 0) ? v : 0;
  }

  /** 
   * Metodo para asignar numero al articulo
   * @param n - numero del articulo
   */
  public void asignarNumero(int n){
      numero = (n <= 0) ? n :0;
  }

  /**
   * Metodo para obtener la revista de publicacion del articulo
   * @return String - revista del articulo
   */
  public String obtenerRevista(){
    return revista;
  }
  /**
   * Metodo para obtener el volumen del articulo
   * @return int - volumen del articulo
   */
  public int obtenerVolumen(){
    return volumen;
  }
  /**
   * Metodo para obtener el numero del articulo
   * @return int - numero del articulo
   */
  public int obtenerNumero(){
    return numero;
  }

  /**
   * Metodo para obtener una cadena con los datos del articulo
   * @return String - cadena con los datos del articulo
   */
  public String toString() {
    return super.toString() + "\t" + revista + "\t" + volumen + "\t" + numero;
  }
}

