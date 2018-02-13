import java.util.Scanner;

/**
 *  Clase para simular el funcionamiento de un maquina expendedora de boletos
 *  @author  Amparo L&oacute;pez Gaona
 *  @version Tercera edici&oacute;n
 */ 
class MaquinaBoletos {
    private int totalBoletos;
    private final double precioBoleto;
    private Caja cajita;
    private Cajero pepe;
    private Scanner in;

    /**
     * Constructor por omision.
     * La maquina cuenta con 100 boletos, el precio de cada uno es de $3.0 y
     * la caja abre con $100.00
     */
    public MaquinaBoletos() {
	this(100, 3.0, 100.0);
    }

    /**
     * Constructor para 100 boletos, el precio es el especificado en el parametro
     * la caja abre con $100.00
     * @param precio -- precio de cada boleto
     */
    public MaquinaBoletos(double precio) {
	this(100, precio, 100.0);
    }

    /**
     * Constructor para la cantidad de boletos especificados en la crecion
     * de la maquina expendedora. El precio de cada uno es de $3.0 y
     * la caja abre con $100.00
     * @param nBoletos -- cantidad de boletos que se podr&aacute; vender
     */
    public MaquinaBoletos(int nBoletos) {
	this(nBoletos, 3.0, 100.0);
    }

    /**
     * Constructor de una maquina expendedora de boletos la cantidad de 
     * boletos especificada y al precio especificado. La caja iniciar&aacute; con
     * la cantidad de dinero especificada
     * @param nBoletos -- cantidad de boletos que se podr&aacute; vender
     * @param precio -- precio de cada boleto
     * @param dinero -- cnatidad de dinero ara abrir la caja
     */
    public MaquinaBoletos(int nBoletos, double precio, double dinero) {
	totalBoletos = nBoletos;
	precioBoleto = precio;
	cajita = new Caja(dinero);
	pepe = new Cajero(cajita);
	in = new Scanner(System.in);
    }

    /**
     * Metodo para conocer la cantidad de boletos que se desean comprar
     * @return int -- cantidad de boletos que desea comprar el cliente
     */
    private int solicitarCantidadDeBoletos () {
	int nBoletos = 0;

	do {
	System.out.println("¿Cuántos boletos quieres?");
	nBoletos = in.nextInt();
	} while (nBoletos <= 0) ;
	if (totalBoletos < nBoletos) {
	    System.out.println("Lo siento no tengo esa cantidad de boletos");
	    System.exit(0);
	}
	return nBoletos;
    }

    /*
     * Metodo para imprimir la cantidad de boletos solicitada
     * @param n -- cantidad de boletos solicitada
     */
    private void expedirBoletos(int n) {
	for (int i = 0; i < n; i++) {
	    Boleto b = new Boleto(precioBoleto);
	    b.imprimir();
	}
	totalBoletos -= n;
    }

    /**
     * Metodo para dar la bienvenida al usuario
     */
    public void bienvenida() {
	System.out.println("Bienvenidos al sistema de venta automatica de boletos");
	System.out.println("El precio de cada boleto es de "+obtenerPrecioBoleto());
	System.out.println("\n");

    }

    /**
     * Metodo pra realizar la venta de boletos soclicitados por el usuario
     */
    public void ventaBoletos() {
	bienvenida();
	int nBoletos = solicitarCantidadDeBoletos();
	double importe = nBoletos*precioBoleto;
	System.out.println("El importe a pagar es "+importe);
	System.out.println("Introducelo en la \"ranura\" ");
	pepe.cobrar(importe);
	expedirBoletos(nBoletos);
    }

    /**
     * Devuelve el precio de cada boleto
     * @return double -- precio del boleto
     */
    public double obtenerPrecioBoleto() {
	return precioBoleto;
    }

    /**
     * Devuelve la cantidad de boletos que tiene la maquina expendedora
     * @return double -- cantidad de dinero acumulada
     */
    public int obtenerTotalBoletos() {
	return totalBoletos;
    }

    /** 
     * Metodo para saber cuanto dinero hay en la caja
     * @return double -- dinero en la caja
     */
    public double corteDeCaja() {
	return cajita.corteDeCaja();
    }

}
