package clases;

import com.sun.awt.AWTUtilities;
import formularios.FrmLogin;
import formularios.FrmPrincipal;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;

public class SplashBanco extends JFrame {

    private JProgressBar barra;
    
    public SplashBanco() {
        setSize(600, 250);
        setLocationRelativeTo(null);
        setLayout(null);
        setUndecorated(true);
        AWTUtilities.setWindowOpaque(this, false);
        initSplash();
        iniciar();
    }
    
    private void initSplash() {
        JLabel label = new JLabel();
        label.setSize(600, 130);
        ImageIcon img = new ImageIcon(getClass().getResource("/images/logo.png"));
        Icon icon = new ImageIcon(img.getImage().getScaledInstance(label.getWidth(),
                label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        label.repaint();

        barra = new JProgressBar(0, 100);
        barra.setBounds(100, 150, 400, 30);
        barra.setStringPainted(true);

        this.add(label);
        this.add(barra);
    }

    private void iniciar() {
        Thread hilo = new Thread(new Runnable() {
            int tiempo = 0;

            @Override
            public void run() {

                try {
                    while (tiempo < 100) {
                        barra.setValue(tiempo);
                        tiempo++;
                        Thread.sleep(10);
                    }
                    dispose();
                    try {
                        UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    //Iniciamos el banco y creamos el formulario de Login
                    Banco banco = cargarDatos();
                    FrmLogin login = new FrmLogin(banco);
                    login.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        hilo.start();
    }
    
     private Banco cargarDatos(){
          Banco datos = null;
         try {
            ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(new File("datos.bin")));
            datos = (Banco) archivo.readObject();
        } catch (IOException ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.INFO, 
                    "El archivo de datos no fue encontrado, se creo un nuevo Banco", ex);
             datos = new Banco();
             datos.crearAdministrador();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SplashBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
    }

}
