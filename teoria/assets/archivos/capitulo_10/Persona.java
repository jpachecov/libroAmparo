import java.io.Serializable;

/**
 *
 * Clase para almacenar y manipular informacion de personas serializables
 *
 * @author Amparo Lopez Gaona 
 * @version 2da. ed.
 *
 */
public class Persona implements Serializable{

  private String nombre;
  private int peso;
  private double estatura;

  /**
   * Constructor de un persona a partir de sus datos personales
   * @param nombre -- nombre de la persona
   * @param peso -- peso de la persona
   * @param altura -- altura de la persona
   */
  public Persona(String nombre, int peso, double altura){
    this.nombre = nombre;
    this.peso = peso;
    estatura = altura;
  }

  /**
   * Constructor de copia
   * @param p -- persona cuyos datos se tomar para crear la nueva
   */
  public Persona(Persona p){
    nombre = p.obtenerNombre();
    peso = p.obtenerPeso();
    estatura = p.obtenerEstatura();
  }

  /**
   * Metodo para obtener el nombre de una persona
   * @return String -- nombre de la persona
   */
  public String obtenerNombre(){
    return nombre;
  }

  /**
   * Metodo para obtener el peso de una persona
   * @return int -- peso de la persona
   */
  public int obtenerPeso(){
    return peso;
  }

  /**
   * Metodo para obtener la estatura de una persona
   * @return double -- estatura de la persona
   */
  public double obtenerEstatura(){
    return estatura;
  }

  /**
   * Metodo para asingar nombre a una persona
   * @param nombre -- nombre de la persona
   */
  public void asignarNombre(String nombre){
    this.nombre = nombre;
  }

  /**
   * Metodo para asignar peso a una persona
   * @param peso -- peso de la persona
   */
  public void asignarPeso(int peso){
    this.peso = peso;
  }

  /**
   * Metodo para asignar estatura a una persona
   * @param altura -- estatura de la persona
   */
  public void asignarEstatura(double altura){
    estatura = altura;
  }

  /**
   * Metodo para obtener la representacion en cadena de la persona
   * @return String -- datos de la persona
   */
  public String toString(){
    return "Nombre: " + nombre + "\nPeso: " + peso + "\nestatura: " + estatura;
  }
}
