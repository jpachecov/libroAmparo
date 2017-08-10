/**
 * Clase para vender boletos
 * @autor Amparo Lopez Gaona
 * @version 2da. ed.
 */
public class Expendedora {
    public static void main(String[] pps) {
	MaquinaBoletos maq = new MaquinaBoletos();

	while (maq.obtenerTotalBoletos() > 0) {
	  maq.ventaBoletos();
	}
	System.out.println("El total vendido es de "+maq.corteDeCaja());

    }
}
