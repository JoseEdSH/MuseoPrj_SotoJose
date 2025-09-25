import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un boleto de museo con un precio, número único y fecha de emisión.
 */
public class BoletoMuseo {
    /**
     * double para precio que se le asigna al boleto
     */
    private double precio;
    
    /**
     * int para número único que se asigna al boleto
     */
    private int numeroBoleto;
    
    /**
     * Cadena de carácteres para fecha en la que se emite el boleto
     */
    private String fechaEmision;
    
    /**
     * int contador global de los objetos tipo BoletoMuseo creados
     */
    private static int contador = 0;
    
    /**
     * Método constructor que crea objetos tipo BoletoMuseo con el precio, numero único de boleto y fecha de emisión
     * @param precio precio del boleto
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    
    /**
     * Establece la fecha en la que se crea el objeto tipo BoletoMuse (fecha en la que se emite el boleto)
     * @return cadena de caracteres en forma de año, día y fecha
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Metodo global que determina el número de objetos tipo BoletoMuseo que se han creado
     * @return el numero del contador global
     */
    public static int getContador() {
        return contador;
    }
    
    /**
     * Determina el numero único asignado al objeto tipo BoletoMuseo
     * @return el numero asignado al boleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }
    
    /**
     * Determina el precio asignado al objeto tipo BoletoMuseo
     * @return el numero del precio
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Da la información disponible del objeto tipo BoletoMuseo
     * @return cadena de carácteres con número único, precio y fecha de emisión del objeto tipo BoletoMuseo
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg +=" Numero: " + numeroBoleto + "\n";
        msg +=" Precio: " + precio + "\n";
        msg +=" Fecha Emisión: " + fechaEmision;
        return msg;
    }
}