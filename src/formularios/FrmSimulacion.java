package formularios;

import clases.Banco;
import clases.Usuario;
import java.util.Objects;

public class FrmSimulacion extends javax.swing.JInternalFrame {

    Banco banco;
    
    public FrmSimulacion(Banco banco) {
        initComponents();
        this.banco = banco;
        txtAdmin.setText(banco.getUsuarios().get(0).getNombre());
        txtMes.setText(String.valueOf(banco.getMes().getNumero()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        btnAvance = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Simulación avance mes");

        jLabel2.setText("Administrador:");

        txtAdmin.setEnabled(false);

        btnAvance.setText("Avanzar Mes");
        btnAvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvanceActionPerformed(evt);
            }
        });

        jLabel3.setText("Mes actual:");

        txtMes.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdmin)
                            .addComponent(txtMes, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(btnAvance)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAvance, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanceActionPerformed
        for(Usuario usuario :banco.getUsuarios()){
            usuario.getAhorros().liquidarMes();
            banco.getMes().actualizarMes();
            if(Objects.nonNull(usuario.getCdt())){
                usuario.getCdt().aumentar();
            }
        }
        txtMes.setText(String.valueOf(banco.getMes().getNumero()));
    }//GEN-LAST:event_btnAvanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAvance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtMes;
    // End of variables declaration//GEN-END:variables
}
