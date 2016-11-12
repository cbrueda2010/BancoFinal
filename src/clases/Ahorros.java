package clases;

import java.io.Serializable;


public class Ahorros extends Cuenta implements Serializable{
    
    public final static float INTERES = new Float(0.006);

    public Ahorros(String documento, short tipo) {
        super(documento, tipo);
    }
    
    public void liquidarMes(){
        saldo += saldo * INTERES;
    }
}
