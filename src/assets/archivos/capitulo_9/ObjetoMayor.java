import java.util.Comparator;
/**
 * Clase para determinar el mayor de un arreglo de objetos.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
class ObjetoMayor {
  private Object [] arreglo;
  private final Comparator prueba;

  /**
   * Constructor para la clase Objeto Mayor
   * @param c - un comparador
   * @param o - arreglo de objetos donde se buscará
   */
  ObjetoMayor(Comparator c, Object [] o) {
    arreglo = o;
    prueba = c;
  }
/**
 * Método para comparar objetos de un arreglo, utilizando un comparador
 * @return int. posicion del objeto mayor.
 */
 public Object mayor() {
    Object max = arreglo[0];

    for (int i = 1; i < arreglo.length; i++) 
      if (prueba.compare(max,arreglo[i]) < 0) 
        max = arreglo[i];  
    return max;
  }
}

