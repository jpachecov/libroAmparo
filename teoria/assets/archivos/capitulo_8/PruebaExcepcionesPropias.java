import java.util.Scanner;

/**
* Clase para probar las excepciones creadas para manejo de cuentas bancarias
* 
* @author  Amparo López Gaona
* @version Tercera edición
*
*/
public class PruebaExcepcionesPropias{

  static public void main (String pps []){

      Cuenta cuenta;
      double monto = 0;
      Scanner io = new Scanner(System.in);
  
      try{
    	  System.out.println("Proporciona el monto inicial");
	  monto = io.nextDouble();
	  cuenta = new Cuenta(monto);
  
	  System.out.println("Proporciona el monto del deposito");
	  monto = io.nextDouble();
	  cuenta.depositar(monto);
  
	  System.out.println("Proporciona el monto del retiro");
	  monto = io.nextDouble();
	  cuenta.retirar(monto);
  
	  System.out.println("El saldo actual es de " + cuenta.obtenerDisponible());
  
      } catch(ExcepcionDepositoNegativo e){
	  System.out.println(e + " en la cuenta");
      } catch(ExcepcionRetiroNegativo e){
	  System.out.println(e + "en la cuenta");
      } catch(ExcepcionFaltaDeFondos e){
	  System.out.println(e + "en la cuenta");
      } catch(ExcepcionBancaria e){
	  System.out.println(e + "en la cuenta");
      } catch(Exception e){
	  System.out.println(e + "en la cuenta");
      }
      System.out.println("Fin del programa");
   }
}
