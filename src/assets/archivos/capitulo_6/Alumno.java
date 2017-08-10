import java.util.Scanner;

/**
 * Clase de Alumnos para almacenar con informaci�n de alumnos 
 *
 * @author  Amparo L�pez Gaona
 * @version 2da. ed.
 */

class Alumno {
  protected final String nombre;
  private String direccion;
  private String telefono;
  protected final String numRegistro;
  private static int folio = 2010;
  private int [] calificaciones;


  /**
   * Constructor que recibe los datos personales del alumno.
   * @param n - Cadena que representa el nombre del alumno
   * @param d - Cadena que representa el n�mero de registro del alumno
   * @param t - Caracter que representa el tel�fono del alumno
   * @param nCalif - entero que especifica la cantidad de calificaciones
   */
  public Alumno (String n, String d, String t, int nCalif) {
    nombre = n.trim();
    direccion = d.trim();
    telefono = t.trim();
    numRegistro = "UNAM-"+ folio++;
    calificaciones = new int[(nCalif > 0)? nCalif : 15];
  }    

  /** 
   * M�todo para obtener el nombre del alumno.
   * @return String - nombre del alumno.
   */
  public String obtenerNombre() {
    return nombre;
  }

  /**
   * M�todo para obtener el n�mero de cuenta del alumno.
   * @return String - n�mero de cuenta del alumno.
   */
  public String obtenerNumeroDeCuenta() {
    return numRegistro;
  }

  /**
   * M�todo para obtener la cantidad de calificaciones del alumno.
   * @return int -- cantidad de calificaciones del alumno.
   */
  public int obtenrNumCalificaciones() {
    return calificaciones.length;
  }

  /**
   * Compara las calificaciones del alumno con las calificaciones
   * promedio
   * @param int[] -- arreglo con los promedios que se compara al alumno.
   * @return int -- 1 si el alumno est� por arriba del promedio del grupo,
   * -1 si est� por debajo y 0 si est� en el promedio del grupo.
   */
  public int compararPromedio(int [] promedio) {
    int menor = 0, mayor = 0, igual = 0;

    if (promedio.length != calificaciones.length)
	new Error("No es posible comparar con arreglos de distinto tamanio");
    for (int i = 0; i < calificaciones.length; i++) {
      if (calificaciones[i] < promedio[i]) {
        menor ++;
      } else if (calificaciones[i] > promedio[i]) {
         mayor ++;
      } else {
         igual ++;
      }
    }
    if (mayor > menor && mayor > igual) return 1;
    if (menor > mayor && menor > igual) return -1;
    return 0;
  }
  
/**
  * Asigna calificaci�n siempre y cuando sea mayor que cero
  * @param curso -- curso al que se asigna una calificaci�n
  * @param cal -- calificaci�n que se asigna
  *
  */
  public void asignarCalificacion(int curso, int cal) {
    if(curso >= 0 && curso < calificaciones.length){
      if(cal >= 0 && cal <= 10){
        calificaciones[curso] = cal;
      } else {
        new Error("Calificaci�n incorrecta");
      }
    }else{
      new Error("N�mero de Curso incorrecto");
    }  
  }

  /**
   * Asigna las calificaciones al alumno
   */
  public void asignarCalificaciones() {
    Scanner in = new Scanner(System.in);
    int cal;
    
    for(int i = 0; i<calificaciones.length; i++){
      
      do{ //valida la calificaci�n
        System.out.println("Dar la calificaci�n para el curso " + (i+1) + " ");
        cal = in.nextInt();
      }while (cal < 0 || cal > 10);
      asignarCalificacion(i, cal);
    }
  }

  /**
   * Calcula el promedio de las calificaciones del alumno.
   * @return double - promedio de calificaciones
   */
  public double promedio() {
    double suma = 0;

    for (int i = 0; i< calificaciones.length; i++){ 
      suma += calificaciones[i];
    }
    return suma/calificaciones.length;
  }

  /**
   * Calcula la calificaci�n m�s alta del alumno.
   * @return int - la calificaci�n mayor
   */
  public int mayorCalificacion () {
    int mayor = calificaciones[0];

    for (int i = 1; i < calificaciones.length; i++) {
      if (calificaciones[i] > mayor) {
        mayor = calificaciones[i];
      }
    }
    return mayor;
  }

  /**
   * Busca el curso con calificaci�n dada.
   * @param cal  - calificaci�n buscada
   * @return int - curso con calificaci�n igual a la solicitada y -1 en
   *               caso que no haya curso con la calificaci�n dada.
   */
  public int buscarCurso (int cal) {
    int i = 0;
    while ((i < calificaciones.length) && (calificaciones[i] != cal)) {
      i++;
    }
    return (i == calificaciones.length) ? -1 : i+1;
  }

  /**
   * Obtiene todos los cursos en los cuales la calificaci�n es de diez.
   * @return int[] - arreglo con los cursos con calificaci�n igual a diez.
   */
  public int[] todosLosDieces () {
    int j = 0;
    int [] dieces = new int[calificaciones.length + 1];

    for (int i = 0; i < calificaciones.length; i++) {
      if (calificaciones[i] == 10) {
        dieces[++j] = i;
      }
    }
    dieces[0] = j ;    //Para indicar el n�mero de elementos ocupados
                     //Notar que si no hay cursos con 10, se almacena un 0.
    return dieces;
  }

  /**
  * Devuelve todas las calificaciones del alumno
  * @return int [] -- arreglo con las calificaciones del alumno
  */
  public int[] obtenerCalificaciones(){
    return calificaciones;
  }

  /**
  * Asigna Calificaciones al alumno
  * @param c -- arreglo de calificaciones del alumno
  */
  public void asignarCalificaciones(int [] c){
    calificaciones = c;
  }

    /**
     * Metodo para obtener la representacion en cadena de un alumno
     * @return String -- cadena con los datos del alumno
     */
  public String toString() {
    return nombre +"\t\t"+ numRegistro;
  }
}
