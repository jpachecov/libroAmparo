/**
 * Clase para vender boletos
 * @author  Amparo López Gaona
 * @version Tercera edición
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
