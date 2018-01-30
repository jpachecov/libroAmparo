import java.util.Scanner;

/**
* Clase de pruebas para la clase Cuenta
* @author  Amparo López Gaona
* @version Tercera edición
*/
public class PruebaCuentas{

  static Cuenta cuenta = null;
  static  double capital;

  static Scanner in = new Scanner(System.in);

    /**
     * Menu de opciones para trabajar con cuentas de diferentes clases
     */
  public static void menu(){
    System.out.println("1. Crear cuenta");
    System.out.println("2. Retirar capital");
    System.out.println("3. Depositar Capital");	
    System.out.println("4. Consultar disponible");
    System.out.println("5. Pago de servicios");
    System.out.println("6. Comprar a credito");
    System.out.println("0. Terminar");
  }

  /**
   * Envia un mensaje solicitando una cantidad de dinero, la lee y la verifica
   * que sea positiva
   * @param mensaje -- mensaje que se despliega
   */
  public static double cantidadValida(String mensaje){
    double cantidad;

    do{
      System.out.println(mensaje);
      cantidad = in.nextDouble();
    } while (capital <= 0);
  
    return cantidad;
  }

  /**
  * Ejecuta las acciones adecuadas, segun la opcion elegida
  * @param opcion -- opcion elegida por el usuario
  */
  public static void realizarAccion(int opcion){
    switch(opcion){
    case 1:          // creacion de una cuenta
      System.out.println("1. Debito");
      System.out.println("2. Credito");
      System.out.println("3. Con pago a servicios");
      opcion = in.nextInt();
      switch(opcion){
      case 1: 
	do{
	    System.out.println("Introduce tu deposito inicial");
	    capital = in.nextInt();
	}while(capital < 2500);
	cuenta = new Cuenta(capital);
	break;
    
      case 3:
	do{
	    System.out.println("Introduce tu deposito inicial");
	    capital = in.nextDouble();
	}while(capital < 2500);
	cuenta = new CuentaConServicios(capital);
	break;

      case 2:
        System.out.println("Tu limite de credito es de $5,000.00");
        cuenta = new CuentaDeCredito(5000);
        break;
    
       default: 
	 System.out.println("No existe este tipo de cuentas");
         break;
      }
      break;

      case 2:                //Retiro
        System.out.println("Indica la cantidad que deseas retirar");
        capital = in.nextDouble();
        cuenta.retirar(capital);
      break;

      case 3:                //Deposito
        System.out.println("Indica la cantidad que deseas depositar");
        capital = in.nextDouble();
        cuenta.depositar(capital);
        break;

      case 4:                // Disponible
        cuenta.obtenerDisponible();
        System.out.println("Tu disponible es de: $" + cuenta.obtenerDisponible());
        break;

      case 5:               //  Pago de telefono
        if(cuenta instanceof CuentaConServicios){
          CuentaConServicios cs = (CuentaConServicios)cuenta;
          capital = cantidadValida("Indica la cantidad a pagar a tu cuenta telefónica");
          cs.pagarTelefono(capital);
          cuenta = cs; 
        }else {
          System.out.println("Tu cuenta no tiene habilitdo el servicio");
        }
        break;

	case 6:               //Compra con tarjeta de credito
          if(cuenta instanceof CuentaDeCredito){
            CuentaDeCredito cc = (CuentaDeCredito) cuenta;
	    capital = cantidadValida("Cuanto vas a comprar?");
            cuenta = cc;
          } else {
             System.out.println("Tu cuenta no tiene habilitado el servicio");
          }
          break;

        case 0:     // Terminar
	    break;
      }
    }

    public static void main(String [] pps){
	int opcion;

	do{
	  menu();
	  opcion = in.nextInt();
	  realizarAccion(opcion);
	}while(opcion!=0);
     }
}
