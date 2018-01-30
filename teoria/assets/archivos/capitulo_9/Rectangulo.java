/**
*
* Clase de rectangulos que pueden escalarse
*
* @author  Amparo López Gaona
* @version Tercera edición
*/
class Rectangulo implements Inflable{
  private Punto centro;
  private int largo, ancho;
  
  /**
  *
  * Constructor por omision. Crea un Rectangulo con centro en el origen, 
  * largo 2 y ancho 1	
  *
  */
  public Rectangulo(){
    this(new Punto(0,0), 2,1);
  }

  /**
  *
  * Constructor que recibe un punto, el largo y ancho del rectangulo	
  *
  * @param punto -centro del rectangulo
  * @param largo - el largo del rectangulo
  * @param ancho - el ancho del rectangulo
  */
  public Rectangulo(Punto punto, int largo, int ancho){
    centro = punto;
    this.largo = largo;
    this.ancho = ancho;
  }

  /** 
   * Metodo para calcular el area de un rectangulo
   * @return double -- area de un rectangulo
   */
  public double area() {
    return largo * ancho;
  }

  /** 
   * Metodo para calcular el perimetro de un rectangulo
   * @return double -- perimetro de un rectangulo
   */
  public double perimetro() {
    return 2* (largo + ancho);
  }
  /**
   * Metodo para inflar un rectangulo
   * @param int -- cantidad en que crecera el largo y el ancho del rectangulo
   */
  public void inflar (int cuanto) {
    if (cuanto >0) {
      largo += cuanto;
      ancho += cuanto;
    }
  }
  /**
   * Metodo para desinflar un rectangulo
   * @param int -- cantidad en que decrecera el largo y el ancho del rectangulo
   */
  public void desinflar (int cuanto) {
    if (cuanto > 0) {
      largo -= cuanto;
      ancho -= cuanto;
    }
  }
  /**
   * Metodo para obtener la representacion en cadena del rectangulo
   * @return String -- Cadena con la representacion del rectangulo
   */
  public String toString() {
    return "Rectangulo con centro en "+centro+", largo "+largo+" y ancho "+ ancho;
  }
}

