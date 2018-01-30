/**
*
* Clase de circulos que pueden escalarse
*
* @author  Amparo López Gaona
* @version Tercera edición
*/
public class Circulo implements Inflable{
  private Punto centro;
  private int radio;
  
  /**
  * COnstructorpor omision. Crea el circulo de radio 1 y centro en el origen
  *
  */
  public Circulo(){
    this(new Punto(), 1);
  }

  /**
  *
  * Metodo que recibe un punto y la longitud del radio
  * 
  * @param Punto el origen del punto
  * @param num el radio del circulo
  *
  */
  public Circulo(Punto pun, int num){
    centro = pun;
    radio = num;
  }
  
  /**
  * Metodo para calcular el area de un circulo
  *
  * @return double -- area del circulo
  *
  */
  public double area(){
    return Math.PI*radio*radio;
  }
  
  /**
  *
  * Metodo para calcular el perimetro de un circulo
  *
  * @return double -- perimetro de un circulo
  */
  public double perimetro(){
    return Math.PI*radio*2;
  }
  
  /**
  *
  * Metodo para inflar un circulo
  *
  * @param int -- cantidad en que va a crecer un circulo
  */
  public void inflar(int cuanto){
    if (cuanto > 0)
      radio += cuanto;
  }

  /**
  *
  * Metodo para desinflar un circulo 
  *
  * @param int -- cantidad que va a decrecer el circulo
  */
  public void desinflar(int cuanto){
    if (cuanto >0)
      radio -= cuanto;
  }

  /**
  *
  * Metodo para obtener la representacion del circulo como cadena
  *
  * @return String -- cadena que tiene la representacion del circulo
  */
  public String toString(){
    return "Circulo con centro en " + centro + " y radio " + radio; 
  }
}
