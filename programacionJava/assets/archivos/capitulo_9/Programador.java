/**
*
* CLase para almacenar y manipular informacion de programadores
*
* @author  Amparo López Gaona
* @version Tercera edición
*
*/
public class Programador extends Persona implements Solucionable{

  public Programador(String n){
    super(n);
  }
  
  public String resolverProblemas(){
    return "resuelve problemas usando la computadora";
  }
  
  public String toString(){
    return "Programador llamado " + obtenerNombre();
  }

}
