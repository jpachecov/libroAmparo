/**
 * Programa para ilustrar el paso de parametros por valor
 *
 * @author  Amparo López Gaona
 * @version Tercera edición
 */ 
public class Cambios{

  /**
   * Método que recibe un arreglo y duplica el valor de cada elemento.
   * @param x - arreglo de enteros que será modificado.
   */
  static void modificar(int [] x) {
    for (int i = 0; i < x.length; i ++)
      x[i] *= 2;
  }

  /**
   * Método que recibe un entero y duplica el valor.
   * @param x - entero que será modificado.
   */
  static void modificar(int x) {
    x *= 2;
  }

  static public void main (String [] pps) {
    int a[] = {0,1,2,3,4,5,6};      // Definición de un arreglo de enteros.
                                  
    System.out.println("El arreglo original tiene ");  
    for (int i = 0; i < a.length; i ++) {        // Imprime el arreglo 
      System.out.print(" " + a[i]);
    }             
    modificar(a);                  // Llama al método con el arreglo.
    System.out.println("\nEl arreglo ahora tiene ");  
    for (int i = 0; i < a.length; i ++) {        // Imprime el arreglo 
      System.out.print(" " + a[i]);
    }
    modificar(a[4]);           // Llama al método con un elemento del arreglo.
    System.out.println("\nEl arreglo ahora tiene ");
    for (int i = 0; i < a.length; i ++) {       // Imprime el arreglo 
      System.out.print(" " + a[i]);
    }
  }
}
