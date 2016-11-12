package formularios;

import clases.Banco;
import clases.Usuario;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;

public class FrmReporteCliente extends JInternalFrame {

    private DefaultTableModel tablaReporte;
    private Usuario usuario;

    public FrmReporteCliente(Banco banco, int indiceUsuario) {
        initComponents();
        usuario = banco.getUsuarios().get(indiceUsuario);
        generarReporteProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Reporte de Productos");

        jLabel1.setText("Reporte de Productos");

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblReporte.setEnabled(false);
        jScrollPane1.setViewportView(tblReporte);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo - copia.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReporte;
    // End of variables declaration//GEN-END:variables

    private void generarReporteProductos() {
        String encabezados[] = {"Producto", "Saldo"};
        tablaReporte = new DefaultTableModel(null, encabezados);
        String linea[] = new String[2];
        linea[0] = "Ahorros";
        linea[1] = String.valueOf(usuario.getAhorros().getSaldo());
        tablaReporte.addRow(linea);
        linea[0] = "Corriente";
        linea[1] = String.valueOf(usuario.getCorriente().getSaldo());
        tablaReporte.addRow(linea);
        if (usuario.getCdt() != null) {
            linea[0] = "CDT";
            linea[1] = String.valueOf(usuario.getCdt().getMonto());
            tablaReporte.addRow(linea);
            linea[0] = "Interés";
            linea[1] = String.valueOf(usuario.getCdt().getInteres());
            tablaReporte.addRow(linea);
        }
        tblReporte.setModel(tablaReporte);
    }
}
