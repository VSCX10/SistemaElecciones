package Vista;
import Control.*;
import Modelo.*;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Franco Luna
 */
public class VentanaGestionElecciones extends javax.swing.JFrame {

    private DefaultTableModel model ;
    private final String[] COLUMNS = new String[]{
            "Fecha", "Tipo"
        };
    public VentanaGestionElecciones() {
        initComponents();
        setLocationRelativeTo(null);
        model = new DefaultTableModel();
        moverArregloATabla();
    }
    
    public void moverArregloATabla(){
        LinkedList<Eleccion> lista = GestionEleccion.getLista();
        limpiarTabla();
        String [] fila = new String[COLUMNS.length];
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        for (Eleccion objEleccion : lista) {
            
            fila[0] = formatter.format(objEleccion.getFecha());
            fila[1] = String.valueOf(objEleccion.getTipo());
            model.addRow(fila);
        }
    }
    
    public void limpiarTabla(){
        this.tb_elecciones.setModel(model);        
        for (String column : COLUMNS) {
           model.addColumn(column); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_elecciones = new javax.swing.JTable();
        btnVerMesasVotacion = new javax.swing.JButton();
        btnCrearEleccion = new javax.swing.JButton();
        btnEditarEleccion = new javax.swing.JButton();
        btnCrearCandidato = new javax.swing.JButton();
        btnEditarCandidato = new javax.swing.JButton();
        btnAgregarCandidatoAEleccion = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("GESTIÓN DE ELECCIONES");

        tb_elecciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tb_elecciones);

        btnVerMesasVotacion.setText("Ver Mesas de Votación");
        btnVerMesasVotacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMesasVotacionActionPerformed(evt);
            }
        });

        btnCrearEleccion.setText("Crear Elección");
        btnCrearEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEleccionActionPerformed(evt);
            }
        });

        btnEditarEleccion.setText("Editar Elección");
        btnEditarEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEleccionActionPerformed(evt);
            }
        });

        btnCrearCandidato.setText("Crear Candidato");
        btnCrearCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCandidatoActionPerformed(evt);
            }
        });

        btnEditarCandidato.setText("Editar Candidato");
        btnEditarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCandidatoActionPerformed(evt);
            }
        });

        btnAgregarCandidatoAEleccion.setText("Agregar Candidato a Elección");
        btnAgregarCandidatoAEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCandidatoAEleccionActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(295, 295, 295))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnVerMesasVotacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearCandidato)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarCandidato)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarCandidatoAEleccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegresar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerMesasVotacion)
                    .addComponent(btnCrearEleccion)
                    .addComponent(btnEditarEleccion)
                    .addComponent(btnCrearCandidato)
                    .addComponent(btnEditarCandidato)
                    .addComponent(btnAgregarCandidatoAEleccion)
                    .addComponent(btnRegresar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1009, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCandidatoActionPerformed
        VentanaCrearCandidato candi= new VentanaCrearCandidato();
        candi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearCandidatoActionPerformed

    private void btnCrearEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEleccionActionPerformed
        VentanaCrearEleccion objVentanaCrearEleccion= new VentanaCrearEleccion();
        objVentanaCrearEleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearEleccionActionPerformed

    private void btnEditarEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEleccionActionPerformed
        VentanaModificarEleccion objVentanaModificarEleccion = new VentanaModificarEleccion();
        objVentanaModificarEleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarEleccionActionPerformed

    private void btnVerMesasVotacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMesasVotacionActionPerformed
        VentanaMesasVotacion objVentanaMesasVotacion = new VentanaMesasVotacion();
        objVentanaMesasVotacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerMesasVotacionActionPerformed

    private void btnEditarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCandidatoActionPerformed
        VentanaModificarCandidato objVentanaModificarCandidato = new VentanaModificarCandidato();
        objVentanaModificarCandidato.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarCandidatoActionPerformed

    private void btnAgregarCandidatoAEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCandidatoAEleccionActionPerformed
        VentanaAgregarCandidatoAEleccion objVentanaAgregarCandidatoAEleccion = new VentanaAgregarCandidatoAEleccion();
        objVentanaAgregarCandidatoAEleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarCandidatoAEleccionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaPrincipalAdmin objVentanaPrincipalAdmin = new VentanaPrincipalAdmin();
        objVentanaPrincipalAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGestionElecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGestionElecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCandidatoAEleccion;
    private javax.swing.JButton btnCrearCandidato;
    private javax.swing.JButton btnCrearEleccion;
    private javax.swing.JButton btnEditarCandidato;
    private javax.swing.JButton btnEditarEleccion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerMesasVotacion;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_elecciones;
    // End of variables declaration//GEN-END:variables
}
