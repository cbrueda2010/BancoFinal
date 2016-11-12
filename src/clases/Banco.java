package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Banco implements Serializable {
   
    private Mes mes;
    private List<Usuario>usuarios;
    private long nit;
    private String nombre;
    private double total;

    public Banco() {
        mes = new Mes();
        usuarios = new ArrayList<>();
        nit = 12345678L;
        nombre = "BBVA FRANCES";
        total = 0;        
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }
    
    public void actualizar(double val){
        total += val;
    }

    public double getTotal() {
        return total;
    }
    
    public void crearAdministrador() {
       Usuario administrador = new Usuario("12345678","admin",
               "12345678", (short)2);
       usuarios.add(administrador);
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public boolean existeUsuario(String identificacion){
        boolean existe = false;
        for (Usuario usuario : usuarios){
            if(usuario.getIdentificacion().equals(identificacion)){
                existe = true;
            }
        }
        return existe;
    }
    
    public int cantidadUsuarios(){
        return usuarios.size();
    }
}
