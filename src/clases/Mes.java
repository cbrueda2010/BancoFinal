package clases;

import java.io.Serializable;

public class Mes implements Serializable {
    
    private short numero;

    public Mes() {
        numero = 1;
    }

    public void actualizarMes(){
        numero ++;
    }
    
    public short getNumero() {
        return numero;
    }
}
