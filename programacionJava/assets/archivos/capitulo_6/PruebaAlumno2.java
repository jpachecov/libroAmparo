/**
 * Programa para probar la clase Alumno con arreglos como parámetro y como valor
 * de retorno
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
class PruebaAlumno {

  public static void main(String [] pps) {
    String [] materia = {"Algebra", "Calculo","Programación", "Estructuras de Datos", "Bases de Datos"};
    int[] excelentes; 
    
    Alumno alumn= new Alumno("Andrea","Calle Chica 56","921404",5);
    
    int[] cal = {10,10,10,9,10};
    alumn.asignarCalificaciones(cal);
    
    System.out.println("La mayor calificacion de "+alumn.obtenerNombre()+
                       " con numCta "+alumn.obtenerNumeroDeCuenta()+ 
                       " es "+alumn.mayorCalificacion());
    System.out.println("El promedio es "+alumn.promedio());
    if (alumn.buscarCurso (10) != -1)
      System.out.println("El curso con diez es "+alumn.buscarCurso(10));
    int [] prom = {10, 6,10,10,8};
    if (alumn.compararPromedio(prom) >0)
      System.out.println("Estas por arriba del promedio");
    else if (alumn.compararPromedio(prom) < 0)
      System.out.println("Estas por abajo del promedio");
    else 
      System.out.println("Estas en el promedio");
    
    
    excelentes = alumn.todosLosDieces();
    for (int i = 1; i<=excelentes[0]; i++)
      System.out.println("Obtuvo 10 en "+materia[excelentes[i]]);
     
  }
}
