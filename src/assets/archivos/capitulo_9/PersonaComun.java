/**
*
* Clase para almacenar y manipular informacion de personas comunes
*
* @author Amparo Lopez Gaona
* @version Noviembre 2010
*
*/
public class PersonaComun extends Persona {

  public PersonaComun(String n){
    super(n);
  }
  
  public String clasificar(){
    return " clasifica sus peliculas";
  }
  
  public String resolverProblemas(){
    return " resuelve problemas con ayuda";
  }
  
  public String verTV(){
    return " ve todos los partidos de futbol";
  }
  
  public String toString(){
    return "Persona comun llamada " + obtenerNombre();
  }
  

}
