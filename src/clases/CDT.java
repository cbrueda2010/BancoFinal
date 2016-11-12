package clases;

import java.io.Serializable;

public class CDT  implements Serializable {

    private float interes;
    private double monto;
    private Mes mes;

    public CDT() {
        interes = 0;
        monto = 0;
        mes = new Mes();
    }

    public void aumentar() {
        mes.actualizarMes();
    }

    public double liquidar() {
        double valor = 0;
        valor = monto + ((monto * interes)/100 * mes.getNumero());
        return valor;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
