/**
 *
 * Clase para alamacenar y manipular informacion de personas
 *
 * @author  Amparo López Gaona
 * @version Tercera edición
 *
 */
public class Persona{
  protected String nombre;
  protected String direccion;
    protected String curp;

  /**
   * Constructor de un persona a partir del nombre
   * @param nombre -- nombre de la persona
   */
  public Persona(String nombre){
      this(nombre,"Tlalcoligia 98","abc12345");
  }

  /**
   * Constructor de un persona a partir de sus datos personales
   * @param nombre -- nombre de la persona
   * @param direccion -- direccion de la persona
   * @param curp -- curp de la persona
   */
    public Persona(String nombre, String direccion, String curp){
      this.nombre = nombre;
      this.direccion = direccion;
      this.curp = curp;
  }

  /**
   * Metodo para obtener el nombre de una persona
   * @return String -- nombre de la persona
   */
  public String obtenerNombre(){
   return nombre;
  }

  /**
   * Metodo para obtener la representacion en cadena de la persona
   * @return String -- datos de la persona
   */
  public String toString(){
    return "Persona llamada " + nombre;
  }
}
