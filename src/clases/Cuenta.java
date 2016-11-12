package clases;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuenta  implements Serializable {

    private static int consecutivo;
    protected long numero;
    protected float saldo;

    public Cuenta(String documento, short tipo) {
        generarNumero(documento, tipo);
        this.saldo = 0;
    }

    public void consignar(float monto){
        this.saldo = saldo + monto;
    }
    
    public void retirar(float monto){
        this.saldo = saldo - monto;
    }
    
    public void generarNumero(String documento, short tipo){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String numero = "";
        Date fecha = new Date();

        numero = numero.concat(sdf.format(fecha));
        numero = numero.concat(documento.substring(documento.length()-3));
        numero = numero.concat(String.valueOf(consecutivo));
        numero = numero.concat(String.valueOf(tipo));
        consecutivo++;
        this.numero = Long.valueOf(numero);
        
    }
    
    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
