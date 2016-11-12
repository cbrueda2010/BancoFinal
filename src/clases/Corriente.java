package clases;

import java.io.Serializable;

public class Corriente extends Cuenta implements Serializable {
    
    public Corriente(String documento, short tipo) {
        super(documento, tipo);
    }
    
    
}
