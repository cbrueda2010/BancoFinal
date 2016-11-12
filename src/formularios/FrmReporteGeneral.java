package formularios;

import clases.Banco;
import clases.Usuario;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;

public class FrmReporteGeneral extends javax.swing.JInternalFrame {

    private Banco banco;
    private DefaultTableModel tablaReporte;

    public FrmReporteGeneral(Banco banco) {
        initComponents();
        this.banco = banco;
        crearReporte();
        totalizar();
    }

    private void crearReporte() {
        String encabezados[] = {"Identificación", "Nombre", "Saldo Ahorros", "Saldo Corriente",
            "CDT", "Interes"};
        String linea[] = new String[6];
        tablaReporte = new DefaultTableModel(null, encabezados);
        for (Usuario usuario : banco.getUsuarios()) {
            linea[0] = usuario.getIdentificacion();
            linea[1] = usuario.getNombre();
            linea[2] = String.valueOf(usuario.getAhorros().getSaldo());
            linea[3] = String.valueOf(usuario.getCorriente().getSaldo());
            if (Objects.isNull(usuario.getCdt())) {
                linea[4] = "0";
                linea[5] = "0";
            } else {
                linea[4] = String.valueOf(usuario.getCdt().getMonto());
                linea[5] = String.valueOf(usuario.getCdt().getInteres());
            }
            tablaReporte.addRow(linea);
            txtTotalAhorro.setText(String.valueOf(banco.getTotal()));
        }
        tblReporte.setModel(tablaReporte);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTotalAhorro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalCorriente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotalCdt = new javax.swing.JTextField();
        txtGranTotal = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 36, 225));
        jLabel1.setText("Reporte General");

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReporte.setEnabled(false);
        jScrollPane1.setViewportView(tblReporte);

        jLabel2.setText("TOTAL:");

        txtTotalAhorro.setEditable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo - copia.png"))); // NOI18N

        jLabel3.setText("Ahorros:");

        jLabel4.setText("Corriente:");

        txtTotalCorriente.setEditable(false);

        jLabel6.setText("CDT:");

        txtTotalCdt.setEditable(false);

        txtGranTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTotalAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGranTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTotalCdt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGranTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTextField txtGranTotal;
    private javax.swing.JTextField txtTotalAhorro;
    private javax.swing.JTextField txtTotalCdt;
    private javax.swing.JTextField txtTotalCorriente;
    // End of variables declaration//GEN-END:variables

    private void totalizar() {
        int lineas = tablaReporte.getRowCount();
        float totalAhorros = 0;
        float totalCorriente = 0;
        float totalCdt = 0;
        for(int i=0;i<lineas;i++){
            totalAhorros += Float.parseFloat(tablaReporte.getValueAt(i, 2).toString());
            totalCorriente += Float.parseFloat(tablaReporte.getValueAt(i, 3).toString());
            totalCdt += Float.parseFloat(tablaReporte.getValueAt(i, 4).toString());
        }
        txtTotalAhorro.setText(String.valueOf(totalAhorros));
        txtTotalCorriente.setText(String.valueOf(totalCorriente));
        txtTotalCdt.setText(String.valueOf(totalCdt));
        txtGranTotal.setText(String.valueOf(totalAhorros + totalCdt + totalCorriente));
    }
}
