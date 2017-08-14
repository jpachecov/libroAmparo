/**
 * Programa para probar la clase Alumno e introducir parametros al main
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
  class PruebaAlumno{

    public static void main(String [] pps){
      Alumno alumn = new Alumno("Andrea", "Calle Chica 56", "921404", 10);
      int [] cal = {10, 8, 9, 9, 10};
      alumn.asignarCalificaciones(cal);
      
      if(pps.length >= 1){
	if(pps.length == 4){  //Crea el alumno
	  alumn = new Alumno(pps[1], pps[2], pps[3], 10);
	  alumn.asignarCalificaciones(cal);
      }

      for(int i = 0; i<pps[0].length(); i++){
	switch(pps[0].charAt(i)){
	case 'c':  //Muestra calificaciones
	  System.out.println(alumn + " tiene las siguientes calificaciones: ");
	  cal = alumn.obtenerCalificaciones();
	  for(int j=0; j<cal.length; j++){
	    System.out.println(cal[j] + " ");
	  }
	  System.out.println();
	  break;

	case 'p':  //promedio del alumno
	  System.out.println(alumn + " tiene " + alumn.promedio() + " de promedio.");
	  break;  

	case 't': //Todos los dieces
	  System.out.println(alumn + " tiene 10 en los cursos ");
	  cal = alumn.todosLosDieces();
	  for(int j= 1; j < cal[0]+1; j++){
	    System.out.println(cal[j] + " ");
	  }
	  System.out.println();
	  break;
	
	default:
	  System.out.println("Opcion Incorrecta");
	  break;
      }   
    }
  } else {

      System.out.println("El programa debe ejecutarse como sigue: " + "PruebaAlumnos...");

    }
  }
}