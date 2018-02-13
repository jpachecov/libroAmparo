import java.util.Scanner;

/**
*
* Clase en la que se cachan excepciones usando bloques try-catch distintos.
*
* @author  Amparo López Gaona
* @version Tercera edición
*/
public class ExcepcionesCon2Try {
  static public void main(String pps[]) {
    Cuenta cuenta = new Cuenta(3000);
    double monto = 0;
    Scanner io = new Scanner (System.in);

      // Algunas instrucciones
    try{

      System.out.println("Proporciona el monto del déposito");
      monto = io.nextDouble();
      cuenta.depositar(monto);
    } catch(ExcepcionDepositoNegativo e) {
      System.out.println(e + " (en la cuenta cuenta.obtenerNumCuenta).");
    }

      //Otras instrucciones

    monto = cuenta.obtenerDisponible();  // Esta no dispara excepciones..
    System.out.println("El saldo actual es "+cuenta.obtenerDisponible());

    if (monto > 10000) {
      try {
        System.out.println("Proporciona el monto del retiro");
        monto =io.nextDouble(); 
        cuenta.retirar(monto);
      } catch(ExcepcionRetiroNegativo e) {
        System.out.println(e + " (en la cuenta cuenta.obtenerNumCuenta).");
      } catch(ExcepcionFaltaDeFondos e) {
        System.out.println(e + " (en la cuenta cuenta.obtenerNumCuenta).");
      } 
    }
    // Otras instrucciones
  }
}
