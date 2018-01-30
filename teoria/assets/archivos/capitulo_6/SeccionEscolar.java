/**
 * Clase que programa el manejo de la información de alumnos en una escuela.
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class SeccionEscolar {
  Alumno [] poblacionEst ;
  int nAlumnos;

  /** 
   * Constructor por omisión. Declara espacio para cien alumnos y el
   * número de alumnos en el arreglo es cero. 
   */
  public SeccionEscolar () {
      this(100);
  }

  /** 
   * Constructor. Declara espacio para el número de alumnos especificado si
   * el tamaño es negativo se crea un arreglo de 100 localidades. En ambos 
   * casos, el número de alumnos en el arreglo es cero.
   * @param tam - cantidad de alumnos que se pueden almacenar.
   */
  public SeccionEscolar (int tam) {
    poblacionEst = (tam > 0) ? new Alumno[tam]: new Alumno[100];
    nAlumnos = 0;
  }
  
  /**
   * Método buscar.
   * @param alumn - Alumno que se buscará en el arreglo.
   * @return int - posicion donde se encuentra el alumno o -1 si no está
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
   * Método para dar de alta un alumno en la seccion escolar 
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
   * Método para consultar la informacion de un alumno particular. Si el
   * alumno no está registrado se avisa de ello.
   * @param alumn - Nombre del alumno a buscar
   */
  public void consultar(Alumno alumn) {
    int pos = buscar(alumn);

    if (pos != -1) {
      System.out.println(poblacionEst[pos]);
    } else {
      System.out.println("El alumno "+ alumn +" no está registrado");
    }
  }
}
