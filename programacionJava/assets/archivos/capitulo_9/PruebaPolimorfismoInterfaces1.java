/**
 * Programa para probar el usi de polimorfismo con interfaces
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
class PruebaPolimorfismoInterfaces {
  public static void main(String[] pps) {
    Inflable [] figuras = new Inflable[5];

    figuras[0] = new Rectangulo(new Punto(4,4),30,5);
    figuras[1] = new Rectangulo();
    figuras[2] = new Circulo();
    figuras[3] = new Circulo(new Punto(-20,14), 10);
    figuras[4] = new Rectangulo(new Punto(-1,-1), 20,3);

    for (int i= 0; i < figuras.length; i++){ 
      System.out.println(figuras[i]);
    }

    for (int i= 0; i < figuras.length; i++) {
      figuras[i].inflar(2);
    }
    System.out.println("Despues de inflar");
    for (int i= 0; i < figuras.length; i++) {
      System.out.println(figuras[i]);
    }
  }
}
