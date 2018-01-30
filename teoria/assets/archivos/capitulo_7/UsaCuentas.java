import java.util.Scanner;

/**
 * Programa para probar la jerarquia de cuentas
 * @author  Amparo López Gaona
 * @version Tercera edición
 */
public class UsaCuentas {
  static double  capital;
  static Scanner  io=new Scanner(System.in);
  static CuentaConServicios cuenta;

    /**
     * Menu de opciones para trabajar con una cuenta de servicios
     */
  public static void menu () {
    System.out.println("1. Retirar capital");
    System.out.println("2. Depositar capital");
    System.out.println("3. Consultar disponible");
    System.out.println("4. Pagar telefono");
    System.out.println("0. Terminar");
  }

/**
* Envia un mensaje solicitando una cantidad de dinero, la lee y la verifica
* que sea positiva
* 
* @param mensaje -- mensaje que se despliega
*/
  public static double cantidadValida(String mensaje) {
    double cantidad;

    do {
      System.out.println(mensaje);
      cantidad=io.nextDouble();
    } while (capital <= 0);
    return cantidad;
  }

/**
*
* Ejecuta las acciones adecuadas, segun la opcion elegida
* @param opcion -- opcion elegida por el usuario
*/
  public static boolean realizarAccion(int opcion) {
    switch(opcion) {
    case 1:            //Retiro
      capital= cantidadValida("?Cuanto dinero quieres retirar?");
      cuenta.retirar(capital);
      break;
    case 2:            //Deposito
      capital = cantidadValida("?Que cantidad deseas depositar?");
      cuenta.depositar(capital);
      break;
    case 3:            // Disponible
      System.out.println("Tu saldo disponible es de:$" + cuenta.obtenerDisponible());
      break;
    case 4:            // Pago de telefono
      capital = cantidadValida("?Cuanto dinero vas a pagar?");
      cuenta.pagarTelefono(capital);
      System.out.println("Telefono pagado, gracias");
      break;
    case 0:              //Fin del programa
      System.out.println("***   Hasta pronto.   ***");
      return false;
    default:
      System.out.println("Opcion invalida");
    }
    return true;
  }

  public static void main(String[] pps)   {
    boolean otraMas=true;
                                       // Solicita capital inicial
    System.out.println("?Con cuanto quieres iniciar tu cuenta?");
    capital=io.nextDouble();
    while(capital<2500) {   //Valida el deposito inicial para una cuenta
      System.out.println("La cantidad minima es de $2500");
      System.out.println("Indica de nuevo la cantidad");
      capital=io.nextDouble();
    }
    cuenta=new CuentaConServicios(capital);  // Crea la cuenta
    do {        //Muestra menu de opciones y pide seleccionar alguna
      menu();
      int opcion = io.nextInt();
      otraMas = realizarAccion(opcion);
    } while(otraMas==true); 
  }
}
