/**
*
* CLase para almacenar y manipular informacion de biomatematicos
*
* @author  Amparo López Gaona
* @version Tercera edición
*
*/
public class Biomatematico extends Persona implements Clasificable, Solucionable{

  public Biomatematico(String n){
    super(n);
  }

  public String clasificar(){
    return "Clasifica Bichos";
  }

  public String resolverProblemas(){
    return "Resuelve problemas matematicos";
  }

  public String toString(){
    return "Biomatemático " + obtenerNombre();
  }
}
