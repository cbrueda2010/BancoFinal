package formularios;

import clases.Banco;
import clases.DesktopConFondo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmPrincipal extends JFrame {
    
    private Banco banco;
    private int indiceUsuario;
    private BufferedImage imagen;

    public FrmPrincipal(Banco banco, int indiceUsuario) {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.banco = banco;
        this.indiceUsuario= indiceUsuario;
        cargarOpciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new DesktopConFondo();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAdminUsuarios = new javax.swing.JMenuItem();
        menuCambioClave = new javax.swing.JMenuItem();
        menuAdmonMes = new javax.swing.JMenuItem();
        menuActualizar = new javax.swing.JMenuItem();
        menuCerrarSesión = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenu();
        manuConsulta = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        jmiReporteGeneral = new javax.swing.JMenuItem();
        jmiReporteClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        dpPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 793, Short.MAX_VALUE)
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        jMenu1.setText("Administración");
        jMenu1.setToolTipText("Menú administrativo");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        menuAdminUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menuAdminUsuarios.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        menuAdminUsuarios.setText("Administrar Usuarios");
        menuAdminUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdminUsuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menuAdminUsuarios);

        menuCambioClave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuCambioClave.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        menuCambioClave.setText("Cambio de clave");
        menuCambioClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambioClaveActionPerformed(evt);
            }
        });
        jMenu1.add(menuCambioClave);

        menuAdmonMes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        menuAdmonMes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        menuAdmonMes.setText("Administración meses");
        menuAdmonMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdmonMesActionPerformed(evt);
            }
        });
        jMenu1.add(menuAdmonMes);

        menuActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        menuActualizar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        menuActualizar.setText("Actualizar datos");
        menuActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarActionPerformed(evt);
            }
        });
        jMenu1.add(menuActualizar);

        menuCerrarSesión.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        menuCerrarSesión.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        menuCerrarSesión.setText("Cerrar Sesión");
        menuCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesiónActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrarSesión);

        jMenuBar1.add(jMenu1);

        jmProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coins.png"))); // NOI18N
        jmProductos.setText("Productos");
        jmProductos.setToolTipText("Zona transaccional ususarios");
        jmProductos.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        manuConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        manuConsulta.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        manuConsulta.setText("Consulta de productos");
        manuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manuConsultaActionPerformed(evt);
            }
        });
        jmProductos.add(manuConsulta);

        jMenuBar1.add(jmProductos);

        menuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallet.png"))); // NOI18N
        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N

        jmiReporteGeneral.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jmiReporteGeneral.setText("Reporte General");
        jmiReporteGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReporteGeneralActionPerformed(evt);
            }
        });
        menuReportes.add(jmiReporteGeneral);

        jmiReporteClientes.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jmiReporteClientes.setText("Reporte Clientes");
        jmiReporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiReporteClientesActionPerformed(evt);
            }
        });
        menuReportes.add(jmiReporteClientes);

        jMenuBar1.add(menuReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAdminUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdminUsuariosActionPerformed
        FrmUsuarios users = new FrmUsuarios(banco);
        dpPrincipal.add(users);
        users.setVisible(true);
    }//GEN-LAST:event_menuAdminUsuariosActionPerformed

    private void menuCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesiónActionPerformed
        this.dispose();
        FrmLogin login = new FrmLogin(banco);
        login.setVisible(true);
    }//GEN-LAST:event_menuCerrarSesiónActionPerformed

    private void menuCambioClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambioClaveActionPerformed
        FrmCambioPassword cambio = new FrmCambioPassword(banco, indiceUsuario);
        dpPrincipal.add(cambio);
        cambio.setVisible(true);
       
    }//GEN-LAST:event_menuCambioClaveActionPerformed

    private void manuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manuConsultaActionPerformed
        FrmConsulta consulta = new FrmConsulta(banco,indiceUsuario);
        dpPrincipal.add(consulta);
        consulta.setVisible(true);
    }//GEN-LAST:event_manuConsultaActionPerformed

    private void menuAdmonMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdmonMesActionPerformed
        FrmSimulacion simulador = new FrmSimulacion(banco);
        dpPrincipal.add(simulador);
        simulador.setVisible(true);
    }//GEN-LAST:event_menuAdmonMesActionPerformed

    private void menuActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarActionPerformed
       guardarDatos();
    }//GEN-LAST:event_menuActualizarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       ((DesktopConFondo) dpPrincipal).setImagen("/images/fondo.jpg");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        guardarDatos();
    }//GEN-LAST:event_formWindowClosing

    private void jmiReporteGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReporteGeneralActionPerformed
       FrmReporteGeneral reporte = new FrmReporteGeneral(banco);
       dpPrincipal.add(reporte);
       reporte.setVisible(true);
    }//GEN-LAST:event_jmiReporteGeneralActionPerformed

    private void jmiReporteClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiReporteClientesActionPerformed
       FrmReporteCliente reporte = new FrmReporteCliente(banco, indiceUsuario);
       dpPrincipal.add(reporte);
       reporte.setVisible(true);
    }//GEN-LAST:event_jmiReporteClientesActionPerformed

    public JDesktopPane getDpPrincipal() {
        return dpPrincipal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenuItem jmiReporteClientes;
    private javax.swing.JMenuItem jmiReporteGeneral;
    private javax.swing.JMenuItem manuConsulta;
    private javax.swing.JMenuItem menuActualizar;
    private javax.swing.JMenuItem menuAdminUsuarios;
    private javax.swing.JMenuItem menuAdmonMes;
    private javax.swing.JMenuItem menuCambioClave;
    private javax.swing.JMenuItem menuCerrarSesión;
    private javax.swing.JMenu menuReportes;
    // End of variables declaration//GEN-END:variables

    private void cargarOpciones() {
        if(banco.getUsuarios().get(indiceUsuario).getTipo() == (short)1){
            menuAdminUsuarios.setVisible(false);
            menuAdmonMes.setVisible(false);
            menuActualizar.setVisible(false);
            jmiReporteGeneral.setVisible(false);
        }else{
            jmProductos.setVisible(false);
            jmiReporteClientes.setVisible(false);
        }
    }
    
    private void guardarDatos(){
     Integer respuesta = JOptionPane.showConfirmDialog(this, "Desea salir de la aplicación y guardar los datos");
        if(respuesta == 0){
            try {
                ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(new File("datos.bin")));
                archivo.writeObject(banco);
                archivo.close();
                this.dispose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
