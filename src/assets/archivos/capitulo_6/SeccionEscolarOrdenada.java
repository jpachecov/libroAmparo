/**
 * Clase que programa el manejo de la informaci�n de alumnos en una escuela.
 * @author  Amparo L�pez Gaona
 * @version Tercera edici�n
 */
class SeccionEscolar {
  Alumno [] poblacionEst ;
  int nAlumnos;
  /** 
   * Constructor por omisi�n. Declara espacio para cien alumnos y el
   * n�mero de alumnos en el arreglo es cero. 
   */
  public SeccionEscolar () {
      this(100);
  }
  /** 
   * Constructor. Declara espacio para el n�mero de alumnos especificado si
   * el tama�o es negativo se crea un arreglo de 100 localidades. En ambos 
   * casos, el n�mero de alumnos en el arreglo es cero.
   * @param tam - cantidad de alumnos que se pueden almacenar.
   */
  public SeccionEscolar (int tam) {
    poblacionEst = (tam > 0) ? new Alumno[tam]: new Alumno[100];
    nAlumnos = 0;
  }
  
  /**
   * M�todo buscar.
   * @param alumn - Alumno que se buscar� en el arreglo.
   * @return int - posicion donde se encuentra el alumno o -1 si no est�
   */
    public int buscar(Alumno alumn) {
	return busquedaBinaria(alumn.obtenerNombre());
    }

  /**
   * M�todo de b�squeda binaria para buscar un elemento en un arreglo ordenado.
   * @param buscado -- Nombre del alumno que se busca
   * @return int -- posicion donde est� el alumno o -1 si no est�.
   */
  private int busquedaBinaria(String buscado) {
    int inf = 0, sup = nAlumnos, mitad;
    
    buscado = buscado.trim().toUpperCase();
    while (inf <= sup) {
      mitad = (inf + sup)/2;       // Calcula la mitad del arreglo
      
      if (poblacionEst[mitad].obtenerNombre().compareTo(buscado) < 0) {
        inf = mitad + 1;           // Buscar� en la mitad inferior
      } else if (poblacionEst[mitad].obtenerNombre().compareTo(buscado) > 0) {
        sup = mitad - 1;    // Buscar� en la mitad superior
      } else {
        return mitad;              // Lo encontr�
      }
    }
    return -1;
  }
  
  /**
   * M�todo insertar. Inserta un alumno en la localidad del arreglo que 
   * le corresponde para dejar ordenado el arreglo.
   * @param alumn - Alumno que se insertara
   */
  public void insertar(Alumno alum) {
    String alumn = alum.obtenerNombre();
    int i = 0;
    int compara = 1;
    
    if (nAlumnos < poblacionEst.length) {
      while (i < nAlumnos && compara > 0) {
        compara = alumn.compareTo(poblacionEst[i++].obtenerNombre());
      } 
      
      if (compara != 0) {          // Se trata de un alumno nuevo
        for (int j = nAlumnos; j > i; j--) { //Hace espacio para el alumno
          poblacionEst[j] = poblacionEst[j-1];
        }
        poblacionEst[i] = alum;   // Inserta el nuevo alumno
        nAlumnos++;
      }
    } else {
      System.out.println("Arreglo lleno");
    }
  }
  
  /**
   * M�todo para consultar la informacion de un alumno particular. Si el
   * alumno no est� registrado se avisa de ello.
   * @param alumn - Nombre del alumno a buscar
   */
  public void consultar(Alumno alumn) {
      int pos = buscar(alumn);
    if (pos != -1) {
      System.out.println(poblacionEst[pos]);
    } else {
      System.out.println("El alumno "+ alumn +" no est� registrado");
    }
  }
}
