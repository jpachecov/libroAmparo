/**
 * Programa para probar el usi de polimorfismo con interfaces
 * @author Amparo Lopez Gaona
 * @version Noviembre 2010
 */
class PruebaPolimorfismoInterfaces{

  public static void main(String [] pps){
    Persona [] gente = new Persona[5];
  
    gente[0] = new PersonaComun("Sergio");
    gente[1] = new Programador("Salvador");
    gente[2] = new Programador("Amparo");
    gente[3] = new Biomatematico("Andrea");
    gente[4] = new Persona("Blanca");
  
    for(int i = 0; i< gente.length; i++){
      System.out.println(gente[i]);
    }
  }
}

