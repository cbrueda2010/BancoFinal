package formularios;

import clases.Banco;
import clases.CDT;
import clases.Usuario;
import java.util.Date;
import java.util.Objects;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class FrmConsulta extends JInternalFrame {

    private Usuario cliente;
    private Banco banco;
    
    public FrmConsulta(Banco banco,int indiceUsuario) {
        initComponents();
        this.banco = banco;
        cliente = banco.getUsuarios().get(indiceUsuario);
        txtIdentificacion.setText(cliente.getIdentificacion());
        txtNombre.setText(cliente.getNombre());
        txtNumeroAhorros.setText(String.valueOf(cliente.getAhorros().getNumero()));
        txtNumeroCorriente.setText(String.valueOf(cliente.getCorriente().getNumero()));
        txtFecha.setText(new Date().toString());
        txtSaldoAhorros.setText(String.valueOf(cliente.getAhorros().getSaldo()));
        txtSaldoCorriente.setText(String.valueOf(cliente.getCorriente().getSaldo()));
       
        if(Objects.isNull(cliente.getCdt())){
            chkCerrado.setSelected(true);
            btnAbrirCdt.setEnabled(true);
        }else{
            chkAbierto.setSelected(true);
            btnCerrarCdt.setEnabled(true);
            txtMontoCdt.setText(String.valueOf(cliente.getCdt().getMonto()));
            txtInteresCdt.setText(String.valueOf(cliente.getCdt().getInteres()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        pnlCtaAhorros = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSaldoAhorros = new javax.swing.JTextField();
        btnConsignarAhorros = new javax.swing.JButton();
        btnRetirarAhorros = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtNumeroAhorros = new javax.swing.JTextField();
        pnlCtaCorriente = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSaldoCorriente = new javax.swing.JTextField();
        btnConsignarCorriente = new javax.swing.JButton();
        btnRetirarCorriente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNumeroCorriente = new javax.swing.JTextField();
        pnlCDT = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtInteresCdt = new javax.swing.JTextField();
        chkAbierto = new javax.swing.JRadioButton();
        chkCerrado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        txtMontoCdt = new javax.swing.JTextField();
        btnCerrarCdt = new javax.swing.JButton();
        btnAbrirCdt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Zona Transaccional - Productos");

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel5.setText("Identificación:");

        txtIdentificacion.setEnabled(false);

        txtNombre.setEnabled(false);

        txtFecha.setEnabled(false);

        pnlCtaAhorros.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Ahorros"));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel6.setText("Saldo:");

        txtSaldoAhorros.setEnabled(false);

        btnConsignarAhorros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        btnConsignarAhorros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/in.png"))); // NOI18N
        btnConsignarAhorros.setText("Consignar");
        btnConsignarAhorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarAhorrosActionPerformed(evt);
            }
        });

        btnRetirarAhorros.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        btnRetirarAhorros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/out.png"))); // NOI18N
        btnRetirarAhorros.setText("Retirar");
        btnRetirarAhorros.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRetirarAhorros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarAhorrosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel11.setText("Numero:");

        txtNumeroAhorros.setEnabled(false);

        javax.swing.GroupLayout pnlCtaAhorrosLayout = new javax.swing.GroupLayout(pnlCtaAhorros);
        pnlCtaAhorros.setLayout(pnlCtaAhorrosLayout);
        pnlCtaAhorrosLayout.setHorizontalGroup(
            pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtaAhorrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCtaAhorrosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCtaAhorrosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCtaAhorrosLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(btnConsignarAhorros)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetirarAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSaldoAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );

        pnlCtaAhorrosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnConsignarAhorros, btnRetirarAhorros});

        pnlCtaAhorrosLayout.setVerticalGroup(
            pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtaAhorrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtNumeroAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSaldoAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtaAhorrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsignarAhorros)
                    .addComponent(btnRetirarAhorros))
                .addGap(25, 25, 25))
        );

        pnlCtaAhorrosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConsignarAhorros, btnRetirarAhorros});

        pnlCtaCorriente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta Corriente"));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel7.setText("Saldo:");

        txtSaldoCorriente.setEnabled(false);

        btnConsignarCorriente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        btnConsignarCorriente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/in.png"))); // NOI18N
        btnConsignarCorriente.setText("Consignar");
        btnConsignarCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarCorrienteActionPerformed(evt);
            }
        });

        btnRetirarCorriente.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        btnRetirarCorriente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/out.png"))); // NOI18N
        btnRetirarCorriente.setText("Retirar");
        btnRetirarCorriente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnRetirarCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarCorrienteActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel12.setText("Numero:");

        txtNumeroCorriente.setEnabled(false);

        javax.swing.GroupLayout pnlCtaCorrienteLayout = new javax.swing.GroupLayout(pnlCtaCorriente);
        pnlCtaCorriente.setLayout(pnlCtaCorrienteLayout);
        pnlCtaCorrienteLayout.setHorizontalGroup(
            pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtaCorrienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCtaCorrienteLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeroCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCtaCorrienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCtaCorrienteLayout.createSequentialGroup()
                                .addComponent(btnConsignarCorriente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetirarCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addComponent(txtSaldoCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        pnlCtaCorrienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnConsignarCorriente, btnRetirarCorriente});

        pnlCtaCorrienteLayout.setVerticalGroup(
            pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCtaCorrienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumeroCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSaldoCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCtaCorrienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsignarCorriente)
                    .addComponent(btnRetirarCorriente))
                .addGap(20, 20, 20))
        );

        pnlCtaCorrienteLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnConsignarCorriente, btnRetirarCorriente});

        pnlCDT.setBorder(javax.swing.BorderFactory.createTitledBorder("CDT"));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel8.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel9.setText("Interés:");

        txtInteresCdt.setEnabled(false);

        chkAbierto.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chkAbierto.setText("Abierto");
        chkAbierto.setEnabled(false);

        chkCerrado.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        chkCerrado.setText("Cerrado");
        chkCerrado.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        jLabel10.setText("Monto:");

        txtMontoCdt.setEnabled(false);

        btnCerrarCdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock-lock.png"))); // NOI18N
        btnCerrarCdt.setText("Cerrar");
        btnCerrarCdt.setEnabled(false);
        btnCerrarCdt.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCerrarCdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCdtActionPerformed(evt);
            }
        });

        btnAbrirCdt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock-open.png"))); // NOI18N
        btnAbrirCdt.setText("Abrir");
        btnAbrirCdt.setEnabled(false);
        btnAbrirCdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCdtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCDTLayout = new javax.swing.GroupLayout(pnlCDT);
        pnlCDT.setLayout(pnlCDTLayout);
        pnlCDTLayout.setHorizontalGroup(
            pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCDTLayout.createSequentialGroup()
                .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCDTLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAbrirCdt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrarCdt)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCDTLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(14, 14, 14)
                        .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCDTLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(chkAbierto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkCerrado)
                                .addGap(30, 30, 30))
                            .addComponent(txtMontoCdt)
                            .addComponent(txtInteresCdt))))
                .addGap(113, 113, 113))
        );

        pnlCDTLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAbrirCdt, btnCerrarCdt});

        pnlCDTLayout.setVerticalGroup(
            pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCDTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(chkAbierto)
                    .addComponent(chkCerrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMontoCdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtInteresCdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnlCDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarCdt)
                    .addComponent(btnAbrirCdt))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo - copia.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCtaAhorros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdentificacion)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(pnlCtaCorriente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlCtaAhorros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCtaCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlCDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsignarAhorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarAhorrosActionPerformed
        String valorConsignacion;
        do{
            valorConsignacion = JOptionPane.showInputDialog("Ingrese el valor a cosnignar");
        }while(valorConsignacion.isEmpty());
        
        try{
            cliente.getAhorros().consignar(Float.parseFloat(valorConsignacion));
        }catch(NumberFormatException e){
            
        }
        banco.actualizar(Double.parseDouble(valorConsignacion));
        txtSaldoAhorros.setText(String.valueOf(cliente.getAhorros().getSaldo()));
    }//GEN-LAST:event_btnConsignarAhorrosActionPerformed

    private void btnRetirarAhorrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarAhorrosActionPerformed
        String valorRetiro = JOptionPane.showInputDialog("Ingrese el valor a retirar");
        if(Double.valueOf(valorRetiro)>cliente.getAhorros().getSaldo()){
            JOptionPane.showMessageDialog(this, "El valor a retirar es mayor que el saldo");
        }else{
            cliente.getAhorros().retirar(Float.parseFloat(valorRetiro));
            txtSaldoAhorros.setText(String.valueOf(cliente.getAhorros().getSaldo()));
        }
    }//GEN-LAST:event_btnRetirarAhorrosActionPerformed

    private void btnConsignarCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarCorrienteActionPerformed
        String valorConsignacion = JOptionPane.showInputDialog("Ingrese el valor a cosnignar");
        cliente.getCorriente().consignar(Float.parseFloat(valorConsignacion));
        txtSaldoCorriente.setText(String.valueOf(cliente.getCorriente().getSaldo()));
        banco.actualizar(Double.parseDouble(valorConsignacion));
 
    }//GEN-LAST:event_btnConsignarCorrienteActionPerformed

    private void btnRetirarCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarCorrienteActionPerformed
        String valorRetiro = JOptionPane.showInputDialog("Ingrese el valor a retirar");
         if(Double.valueOf(valorRetiro)>cliente.getAhorros().getSaldo()){
            JOptionPane.showMessageDialog(this, "El valor a retirar es mayor que el saldo");
        }else{
            cliente.getCorriente().retirar(Float.parseFloat(valorRetiro));
            txtSaldoCorriente.setText(String.valueOf(cliente.getCorriente().getSaldo()));
        }
    }//GEN-LAST:event_btnRetirarCorrienteActionPerformed

    private void btnAbrirCdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCdtActionPerformed
        String montoCdt = JOptionPane.showInputDialog("Ingrese el monto del cdt");
        String interesCdt = JOptionPane.showInputDialog("Ingrese el Inteŕes del cdt");
        CDT cdt = new CDT();
        cdt.setInteres(Float.parseFloat(interesCdt));
        cdt.setMonto(Float.parseFloat(montoCdt));
        banco.actualizar(Double.valueOf(montoCdt));
        cliente.setCdt(cdt);
        txtMontoCdt.setText(montoCdt);
        txtInteresCdt.setText(interesCdt);
        btnAbrirCdt.setEnabled(false);
        btnCerrarCdt.setEnabled(true);
        chkAbierto.setSelected(true);
        chkCerrado.setSelected(false);
        
    }//GEN-LAST:event_btnAbrirCdtActionPerformed

    private void btnCerrarCdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCdtActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Esta seguro que desea cerrar el CDT?");
        if(respuesta == 0){
            double liquidacion = cliente.getCdt().liquidar();
            cliente.getCorriente().consignar((float) liquidacion);
            txtSaldoCorriente.setText(String.valueOf(cliente.getCorriente().getSaldo()));
            btnAbrirCdt.setEnabled(true);
            btnCerrarCdt.setEnabled(false);
            chkCerrado.setSelected(true);
            chkAbierto.setSelected(false);
            txtMontoCdt.setText("");
            txtInteresCdt.setText("");
        }
    }//GEN-LAST:event_btnCerrarCdtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirCdt;
    private javax.swing.JButton btnCerrarCdt;
    private javax.swing.JButton btnConsignarAhorros;
    private javax.swing.JButton btnConsignarCorriente;
    private javax.swing.JButton btnRetirarAhorros;
    private javax.swing.JButton btnRetirarCorriente;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton chkAbierto;
    private javax.swing.JRadioButton chkCerrado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlCDT;
    private javax.swing.JPanel pnlCtaAhorros;
    private javax.swing.JPanel pnlCtaCorriente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtInteresCdt;
    private javax.swing.JTextField txtMontoCdt;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroAhorros;
    private javax.swing.JTextField txtNumeroCorriente;
    private javax.swing.JTextField txtSaldoAhorros;
    private javax.swing.JTextField txtSaldoCorriente;
    // End of variables declaration//GEN-END:variables
}
