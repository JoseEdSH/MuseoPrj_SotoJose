import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
/**
 * Registro que lleva los datos de los objetos de la clase BoletoMuseo creados
 * Está relacionada por agregación de navegabilidad unidireccional hacia {@link BoletoMuseo}
 */
public class VentaDelDia {
    /**
     * Cadena de carácteres para fecha en la que realiza la venta del boleto
     */
    private String fechaDeLaVenta;
    
    /**
     * lista boletosVendidos de objetos tipo BoletoMuseo
     */
    private List<BoletoMuseo>boletosVendidos;
    
    /**
     * Método constructor que crea objetos tipo VentaDelDia con la fecha establecida de la venta del boleto y prepara la lista de los boletos vendidos
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    
    /**
     * Añade los objetos BoletoMuseo vendido a boletosVendidos
     * @param boleto de tipo BoletoMuseo 
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    
    /**
     * Calcula el total de dinero obtenido de los boletos tipo BoletoMuseo vendidos en el día
     * @return el monto total de las ventas de boletos del día
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for(BoletoMuseo b : boletosVendidos) { // Recorre los obtejos b de tipo BoletoMuseo almacenados en boletosVendidos
            total += b.getPrecio(); 
        }
        return total;
    }
    
    /**
     * Establece la fecha en la que se vende el boleto
     * @return cadena de caracteres en forma de año, día y fecha
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Da la información disponible del objeto tipo VentaDelDia
     * @return cadena de carácteres con fecha de la venta, cantidad de boletos vendidos en el día, la lista de boletos vendidos (con su número único y precio asignado) y el monto total por la venta de boletos del día
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " + fechaDeLaVenta + "\n";
        msg += " Cantida de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for(BoletoMuseo b : boletosVendidos) { // Recorre los obtejos b de tipo BoletoMuseo almacenados en boletosVendidos
            msg += "  -Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}