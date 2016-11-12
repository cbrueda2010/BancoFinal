package formularios;

import clases.Banco;
import clases.Usuario;
import javax.swing.JOptionPane;

public class FrmUsuarios extends javax.swing.JInternalFrame {

    private Banco banco;
    private int indiceActual;
    private boolean modificar;
    
    public FrmUsuarios(Banco banco) {
        initComponents();
        this.banco = banco;
        cargarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbPerfil = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmar = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Administración Usuarios");

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Identificación:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Confirmar contraseña:");

        txtIdentificacion.setEnabled(false);
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Tipo Usuario:");

        cmbPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Cliente", "Administrador" }));
        cmbPerfil.setEnabled(false);
        cmbPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPerfilActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);

        btnPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/first.png"))); // NOI18N
        btnPrimero.setAlignmentY(0.0F);
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/last.png"))); // NOI18N
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar.png"))); // NOI18N
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar.png"))); // NOI18N
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtPassword.setEnabled(false);

        txtConfirmar.setEnabled(false);

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/guardar.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo - copia.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtConfirmar))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionar, btnAnterior, btnCerrar, btnGuardar, btnModificar, btnPrimero, btnSiguiente, btnUltimo, btneliminar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPerfilActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar = true;
        habilitarCampos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        txtIdentificacion.setText("");
        txtNombre.setText("");
        txtPassword.setText("");
        txtConfirmar.setText("");
        habilitarCampos();
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String clave = new String(txtPassword.getPassword());
        String confirmar = new String(txtConfirmar.getPassword());
        
        if(txtIdentificacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese número de identificación del usuario", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(txtIdentificacion.getText().length()<6){
            JOptionPane.showMessageDialog(this, "El numero de identificacion debe ser minimo de 6 caracteres", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(cmbPerfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Por favor ingrese el perfil del usuario", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre completo del usuario", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(txtPassword.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Por favor ingrese contraseña para el usuario", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(txtConfirmar.getPassword().length == 0){
            JOptionPane.showMessageDialog(this, "Por favor confirme la contraseña para el usuario", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else if(!clave.equals(confirmar)){
            JOptionPane.showMessageDialog(this, "Las claves no coinciden", 
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            registrarUsuario();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        indiceActual --;
        if(indiceActual == -1){
            indiceActual = banco.cantidadUsuarios()-1;
        }
        cargarUsuario();
       
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        indiceActual = 0;
        cargarUsuario();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
       indiceActual = banco.getUsuarios().size()-1;
       cargarUsuario();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       indiceActual ++;
       if(indiceActual == banco.cantidadUsuarios()){
           indiceActual = 0;
       }
       cargarUsuario();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int eliminar = JOptionPane.showConfirmDialog(this, "Esta seguro que desea eliminar el usuario");
        
        if(eliminar == 0){
            banco.getUsuarios().remove(indiceActual);
            indiceActual = 0;
            cargarUsuario();
            JOptionPane.showMessageDialog(this, "El usuario ha sido eliminado con éxito");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btneliminar;
    private javax.swing.JComboBox<String> cmbPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

    private void cargarUsuario() {
        Usuario usuario = banco.getUsuarios().get(indiceActual);
        txtIdentificacion.setText(usuario.getIdentificacion());
        txtNombre.setText(usuario.getNombre());
        txtPassword.setText(usuario.getClave());
        txtConfirmar.setText(usuario.getClave());
        cmbPerfil.setSelectedIndex(usuario.getTipo());
    }
    
    private void habilitarCampos(){
        txtIdentificacion.setEnabled(true);
        cmbPerfil.setEnabled(true);
        txtNombre.setEnabled(true);
        txtPassword.setEnabled(true);
        txtConfirmar.setEnabled(true);
        btnGuardar.setEnabled(true);
    }

    private void registrarUsuario() {
        if(modificar){
            banco.getUsuarios().get(indiceActual).setIdentificacion(txtIdentificacion.getText());
            banco.getUsuarios().get(indiceActual).setNombre(txtNombre.getText());
            banco.getUsuarios().get(indiceActual).setClave(String.valueOf(txtPassword.getPassword()));
            banco.getUsuarios().get(indiceActual).setTipo((short) cmbPerfil.getSelectedIndex());
        }else{
            if(banco.existeUsuario(txtIdentificacion.getText())){
                JOptionPane.showMessageDialog(this, "El usuario con el numero de identificación " + 
                        txtIdentificacion.getText() +" ya existe",
                        "Error en registro de usuario", JOptionPane.ERROR_MESSAGE);
                return;
            }else{
                Usuario nuevo = new Usuario(txtIdentificacion.getText(),
                txtNombre.getText(), 
                new String(txtPassword.getPassword()), 
                        (short) cmbPerfil.getSelectedIndex());
                banco.getUsuarios().add(nuevo);
                indiceActual++;
            }
        }        
        JOptionPane.showMessageDialog(this, "El usuario ha sido guardado con exito", 
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        txtIdentificacion.setEnabled(false);
        cmbPerfil.setEnabled(false);
        txtNombre.setEnabled(false);
        txtPassword.setEnabled(false);
        txtConfirmar.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
}
