
/**
 * Persona a la que se le asigna boleto de la clase BoletoMuseo
 * Está relacionada por asociación de navegabilidad unidireccional hacia {@link BoletoMuseo}
 */
public class Persona {
    /**
     * Cadena de carácteres para nombre de la persona
     */
    private String nombre;
    
    /**
     * Cadena de carácteres para identificación de la persona 
     */
    private String identificacion;
    
    /**
     * Boleto único asignado a la persona de tipo BoletoMuseo
     */
    private BoletoMuseo miBoleto;
    
    /**
     * método constructor que crea objetos tipo Persona con un nombre y una identificación
     * @param nombre nombre de la persona
     * @param ident identificación de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    /**
     * método constructor que crea objetos tipo Persona con un nombre
     * @param nombre nombre de la persona 
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * asigna la identificación al objeto tipo Persona
     * @param pIdentificacion la identificacion que se va a asignar a la persona
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    
    /**
     * asigna el numero de boleto único al objeto tipo Persona
     * @param pMiBoleto que es un objeto tipo BoletoMuseo
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }
    
    /**
     * consulta la el número de boleto que fue aignado al objeto tipo Persona
     * @return devuelve el numero de boleto al llamar el metodo getNumeroBoleto en la clase BoletoMuseo
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto(); 
    }
    
    /**
     * da la información disponible del objeto tipo Persona
     * @return cadena de carácteres con nombre, identificación y el numero de boleto asignado
     */
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if(miBoleto != null) 
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        else
            msg += " Boleto asignado: (ninguno)\n";
        return msg;
    }
}