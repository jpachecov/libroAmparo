/**
 *  Clase para generar boletos para acceso al Metro.
 *  @author Amparo López Gaona
 *  @version  2da. ed.
 */ 
class Boleto {
  private final double precio;    // Precio del boleto

/**
 * Constructor por omision. Inicializa el precio del boleto en $3.00
 */
  public Boleto() {
      this(3.0);
  }

/**
 * Constructor. Inicializa el precio del boleto en la cantidad indicada.
 * @param valor - costo del boleto.
 */
  public Boleto(double valor) {
    precio = valor;
  }

/**
 * Método de acceso que devuelv el precio del boleto
 * @return double - precio del boleto.
 */
  public double obtenerPrecio() {
    return precio;
  }

/**
 * Método para imprimir un boleto.
 */
  public void imprimir(){
      System.out.println(this);
  }

/**
 * Método para obtener el boleto como una cadena de caracteres.
 */
  public String toString(){
    return "+-----------------------+\n" +
           "| Boleto para el metro  |\n" +
           "|derjere0ranfeore       |\n" +
           "+-----------------------+\n" ;
  }
}

