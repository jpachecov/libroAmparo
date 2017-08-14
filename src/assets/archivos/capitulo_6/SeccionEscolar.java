/**
 * Clase que programa el manejo de la informaci�n de alumnos en una escuela.
 * @author  Amparo L�pez Gaona
 * @version Tercera edici�n
 */
public class SeccionEscolar {
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
	return buscar(alumn.obtenerNombre());
    }

    private int buscar(String alumn) {
      int i = 0;
      boolean encontro = false;

      alumn = alumn.trim();
      for (i = 0; i < nAlumnos && !encontro; i++) {
        if (poblacionEst[i].obtenerNombre().equalsIgnoreCase(alumn)) {
          encontro = true;
        } 
      }
      return (encontro) ? i - 1 : -1;
   }
  
  /**
   * M�todo para dar de alta un alumno en la seccion escolar 
   * @param alumn - Alumno que se insertara
   */
  public void insertar(Alumno alumn) {
    if (nAlumnos < poblacionEst.length) {
      if (buscar(alumn) == -1) {     // Se trata de un alumno nuevo
        poblacionEst[nAlumnos] = alumn;   // Inserta el nuevo alumno
        nAlumnos++;
      } else {
        System.out.println("El alumno "+alumn.obtenerNombre()+" ya esta dado de alta");
      }
    } else {
      System.out.println("Cupo lleno. No es posible dar de alta a " +
			 alumn.obtenerNombre());
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
