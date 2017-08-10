/**
*
* CLase para almacenar y manipular informacion de biomatematicos
*
* @author Amparo Lopez Gaona
* @version Noviembre 2010
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
