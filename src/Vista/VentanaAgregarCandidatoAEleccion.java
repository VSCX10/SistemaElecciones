package Vista;
import Control.*;
import Modelo.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Franco Luna
 */
public class VentanaAgregarCandidatoAEleccion extends javax.swing.JFrame {

    public VentanaAgregarCandidatoAEleccion() {
        initComponents();
        setLocationRelativeTo(null);
        cargarElecciones();
        cargarCandidatos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbxSeleccionarCandidato = new javax.swing.JComboBox<>();
        cbxSeleccionarEleccion = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("AGREGAR CANDIDATO");

        jLabel13.setText("Seleccionar Elección");

        jLabel14.setText("Seleccionar Candidato");

        cbxSeleccionarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarCandidatoActionPerformed(evt);
            }
        });

        cbxSeleccionarEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal", "Nacional", "Referéndum", " " }));
        cbxSeleccionarEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarEleccionActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSeleccionarEleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxSeleccionarCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnAgregar)
                .addGap(46, 46, 46)
                .addComponent(btnRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(143, 143, 143))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbxSeleccionarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxSeleccionarCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnRegresar)
                    .addComponent(btnRemover))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSeleccionarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarCandidatoActionPerformed
        
    }//GEN-LAST:event_cbxSeleccionarCandidatoActionPerformed

    private void cbxSeleccionarEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarEleccionActionPerformed
        int index = cbxSeleccionarEleccion.getSelectedIndex();
        if (index >= 0 && !GestionEleccion.getLista().isEmpty()) {
            Eleccion eleccion = GestionEleccion.getLista().get(index);
        }
    }//GEN-LAST:event_cbxSeleccionarEleccionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexCandidato = cbxSeleccionarCandidato.getSelectedIndex();
        if (indexEleccion < 0 || indexCandidato < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una elección y un candidato.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
        Candidato candidato = GestionCandidato.getLista().get(indexCandidato);
        if (eleccion.getCandidatos().contains(candidato)) {
            JOptionPane.showMessageDialog(this, "El candidato ya está asignado a esta elección.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for (Eleccion e : GestionEleccion.getLista()) {
            if (e.getCandidatos().contains(candidato)) {
                JOptionPane.showMessageDialog(this, "El candidato ya pertenece a otra elección.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        eleccion.añadirCandidato(candidato);
        JOptionPane.showMessageDialog(this, "Candidato agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaGestionElecciones ventanaGestionElecciones = new VentanaGestionElecciones();
        ventanaGestionElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexCandidato = cbxSeleccionarCandidato.getSelectedIndex();
        if (indexEleccion < 0 || indexCandidato < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una elección y un candidato.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
        Candidato candidato = GestionCandidato.getLista().get(indexCandidato);
        if (!eleccion.getCandidatos().contains(candidato)) {
            JOptionPane.showMessageDialog(this, "El candidato no pertenece a esta elección.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        eleccion.eliminarCandidato(candidato);
        JOptionPane.showMessageDialog(this, "Candidato removido correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void cargarElecciones() {
        cbxSeleccionarEleccion.removeAllItems();
        LinkedList<Eleccion> elecciones = GestionEleccion.getLista();
        if (elecciones.isEmpty()) {
            cbxSeleccionarEleccion.addItem("No hay elecciones disponibles");
            cbxSeleccionarEleccion.setEnabled(false);
            btnAgregar.setEnabled(false);
            btnRemover.setEnabled(false);
            return;
        }
        cbxSeleccionarEleccion.setEnabled(true);
        for (Eleccion eleccion : elecciones) {
            cbxSeleccionarEleccion.addItem(eleccion.getTipo() + " - " + eleccion.getFecha());
        }
        btnAgregar.setEnabled(true);
        btnRemover.setEnabled(true);
    }

    private void cargarCandidatos() {
        cbxSeleccionarCandidato.removeAllItems();
        LinkedList<Candidato> candidatos = GestionCandidato.getLista();

        if (candidatos.isEmpty()) {
            cbxSeleccionarCandidato.addItem("No hay candidatos disponibles");
            cbxSeleccionarCandidato.setEnabled(false);
            btnAgregar.setEnabled(false);
            btnRemover.setEnabled(false);
            return;
        }

        cbxSeleccionarCandidato.setEnabled(true);
        for (Candidato candidato : candidatos) {
            cbxSeleccionarCandidato.addItem(candidato.getNombre() + " " + candidato.getApellidoPaterno());
        }
        btnAgregar.setEnabled(true);
        btnRemover.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(VentanaAgregarCandidatoAEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCandidatoAEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCandidatoAEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregarCandidatoAEleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregarCandidatoAEleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbxSeleccionarCandidato;
    private javax.swing.JComboBox<String> cbxSeleccionarEleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}
