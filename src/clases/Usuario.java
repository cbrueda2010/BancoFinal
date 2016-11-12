package clases;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String identificacion;
    private String nombre;
    private Short tipo;
    private String clave;
    private Double total;
    private Ahorros ahorros;
    private Corriente corriente;
    private CDT cdt;
    
    public Double getTotal() {
        return total;
    }

    public Ahorros getAhorros() {
        return ahorros;
    }

    public CDT getCdt() {
        return cdt;
    }

    public void setCdt(CDT cdt) {
        this.cdt = cdt;
    }

    public Corriente getCorriente() {
        return corriente;
    }
    
    
    public Usuario(String identificacion, String nombre, String clave, short tipo){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.clave = clave;
        this.tipo = tipo;
        this.ahorros = new Ahorros(identificacion,tipo);
        this.corriente = new Corriente(identificacion,tipo);
    }
    
    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public short getTipo() {
        return tipo;
    }

}
