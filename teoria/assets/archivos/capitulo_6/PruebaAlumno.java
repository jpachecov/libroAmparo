/**
 * Programa para probar la clase Alumno e introducir la instruccion switch
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
class PruebaAlumno {
  static Alumno alumnoPrueba = null;   //Alumno del cual se pedirá informacion
  static java.util.Scanner in;
  
  //Metodo que muestra todas las opciones del menu
  private static void menu() {
    System.out.println("Menu para probar alumnos\n");
    System.out.println("1. Crear un alumno");
    System.out.println("2. Asignar calificaciones");
    System.out.println("3. Calcular el promedio de calificaciones");
    System.out.println("4. Indicar la calificacion mas alta");
    System.out.println("5. Indicar el curso con la calificacion especificada");
    System.out.println("0. Fin");
    System.out.println("\nElige una opcion");
  }
  
  //Metodo que realiza la opcion elegida de un menu
  private static void realizarAccion(int opcion) {
    switch (opcion) {
      case 0:
        break;
      case 1:       // Crear un alumno
        System.out.print("Dar el nombre del alumno");
        String nombre = in.next();
        System.out.print("Dar la direccion del alumno");
        String dir = in.next();
        
        alumnoPrueba = new Alumno(nombre, dir, "12345", 5);
        System.out.println("se creo el alumno "+alumnoPrueba);
        break;
      case 2:       // Asigna calificaciones
        if (alumnoPrueba == null) {
	    System.out.println("No se ha dado de alta un alumno");
	} else {
	    alumnoPrueba.asignarCalificaciones();
	}
	break;
      case 3:       //Calcula el promedio
        if (alumnoPrueba == null) {
	    System.out.println("No se ha dado de alta un alumno");
	} else {
	    System.out.println("El promedio de "+alumnoPrueba.obtenerNombre()+" es "+
                           alumnoPrueba.promedio());
      }
      break;
      case 4:   // Encuentra la mayor calificacion
        if (alumnoPrueba == null) {
        System.out.println("No se ha dado de alta un alumno");
	} else {
	    System.out.println("La mayor calificacion de "+alumnoPrueba.obtenerNombre()+
                           " es "+alumnoPrueba.mayorCalificacion());
	}
	break;
      case 5:    //Busca el curso con la calificacion indicada
        if (alumnoPrueba == null) {
	    System.out.println("No se ha dado de alta un alumno");
	} else {
	    System.out.println("Dar la calificacion");
	    int cal = in.nextInt();
	    int curso = alumnoPrueba.buscarCurso(cal);
	    if (curso != -1) {
		System.out.println("El alumno "+alumnoPrueba.obtenerNombre()+" tiene "+cal+
                             " en el curso "+curso);
	    } else {
		System.out.println("El alumno "+alumnoPrueba.obtenerNombre()+
                             " no tiene curso con "+cal+ " de calificacion");
	    }
	}
	break;
    default:
        System.out.println("Opcion incorrecta");
    }
  }
  
  public static void main(String [] pps) {
    int opcion;
    in = new java.util.Scanner(System.in);

    do {
      menu();                    //Muestra opciones
      opcion = in.nextInt();    //Lee opcion elegida
      realizarAccion(opcion);    //Ejecuta la opcion elegida
    } while (opcion != 0);
  }
}
