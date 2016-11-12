package formularios;

import clases.Banco;
import java.util.Arrays;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FrmCambioPassword extends JInternalFrame {

    private Banco banco;
    private int indiceusuario;
    
    public FrmCambioPassword(Banco banco, int indiceUsuario) {
        initComponents();
        this.banco = banco;
        this.indiceusuario = indiceUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAnterior = new javax.swing.JPasswordField();
        txtNueva = new javax.swing.JPasswordField();
        txtConfirmar = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Cambio de contraseña");

        jLabel1.setText("Contraseña anterior");

        jLabel2.setText("Nueva contraseña");

        jLabel3.setText("Confimar nueva contraseña");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(btnAceptar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(txtAnterior.getPassword().length < 1){
            JOptionPane.showMessageDialog(this, "Por favor digite su contraseña anterior");
            txtAnterior.requestFocusInWindow();
        }else if(txtNueva.getPassword().length < 1){
            JOptionPane.showMessageDialog(this, "Por favor digite su nueva contraseña");
            txtNueva.requestFocusInWindow();
        }else if(txtConfirmar.getPassword().length < 1){
            JOptionPane.showMessageDialog(this, "Por favor confirme la contraseña");
            txtConfirmar.requestFocusInWindow();
        }else if(txtAnterior.getPassword().equals(txtNueva.getPassword())){
            JOptionPane.showMessageDialog(this, "La contraseña anterior es igual a la nueva, por favor digite una diferente");
            txtNueva.setText("");
            txtNueva.requestFocusInWindow();
        }else if(!Arrays.equals(txtNueva.getPassword(), txtConfirmar.getPassword())){
            JOptionPane.showMessageDialog(this, "Las contraseñas son diferentes");
            txtNueva.setText("");
            txtConfirmar.setText("");
            txtNueva.requestFocusInWindow();
        }else if (!String.valueOf(txtAnterior.getPassword()).equals(banco.getUsuarios().get(indiceusuario).getClave())){
            JOptionPane.showMessageDialog(this, "La contraseña anterior no coincide");
            txtAnterior.setText("");
            txtAnterior.requestFocusInWindow();
        }
        
        else{
            banco.getUsuarios().get(indiceusuario).setClave(String.valueOf(txtNueva.getPassword()));
            JOptionPane.showMessageDialog(this, "La contraseña se actualizo correctamente");
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtAnterior;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JPasswordField txtNueva;
    // End of variables declaration//GEN-END:variables
}
