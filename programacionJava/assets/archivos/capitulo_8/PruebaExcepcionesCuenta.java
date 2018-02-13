import java.util.Scanner;

/**
*
* Clase para probar las excepciones creadas.
* @author  Amparo López Gaona
* @version Tercera edición
*/
public class PruebaExcepcionesCuenta {
  static public void main(String pps[]) {
      Cuenta cuenta = null; 
    double monto;
    Scanner io = new Scanner(System.in);

    try{
      System.out.println("Proporciona el monto inicial");
      monto = io.nextDouble();
      cuenta =  new Cuenta(monto);

      System.out.println("Proporciona el monto del déposito");
      monto = io.nextDouble();
      cuenta.depositar(monto);

      System.out.println("El saldo actual es"+cuenta.obtenerDisponible());

      System.out.println("Proporciona el monto del retiro");
      monto =io.nextDouble(); 
      cuenta.retirar(monto);

      System.out.println("El saldo actual es"+cuenta.obtenerDisponible());

    } catch (ExcepcionDepositoNegativo e) {
       System.out.println(e);
       //    } catch (ExcepcionRetiroNegativo e) {
       //       System.out.println(e);
    } catch (ExcepcionBancaria e) {
       System.out.println(e);
    }

    System.out.println("Fin del programa");
  }
}
