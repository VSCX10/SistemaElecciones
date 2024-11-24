package Vista;
import Control.*;
import Modelo.*;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco Luna
 */
public class VentanaRegistroVotos extends javax.swing.JFrame {

    public VentanaRegistroVotos() {
        initComponents();
        setLocationRelativeTo(null);
        cargarElecciones();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxSeleccionarEleccion = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbxSeleccionarCandidato = new javax.swing.JComboBox<>();
        cbxSeleccionarMesa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        btnAgregarObservacion = new javax.swing.JButton();
        intVotantesRegistrados = new javax.swing.JSpinner();
        intVotantesEfectivos = new javax.swing.JSpinner();
        intVotosBlancos = new javax.swing.JSpinner();
        intVotosNulos = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        intVotosCandidato = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("REGISTRO DE VOTOS - ACTA ELECTORAL");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Seleccionar Elección:");

        cbxSeleccionarEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarEleccionActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Seleccionar Candidato:");

        cbxSeleccionarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarCandidatoActionPerformed(evt);
            }
        });

        cbxSeleccionarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarMesaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Seleccionar Mesa:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Votantes Registrados");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Votantes Efectivos");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Votos Blancos");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Votos Nulos");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Observaciones");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        jScrollPane1.setViewportView(txtObservacion);

        btnAgregarObservacion.setText("Agregar Observación");
        btnAgregarObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarObservacionActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Votos por Candidato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAgregarObservacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regresar)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intVotosCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(intVotantesRegistrados)
                                        .addComponent(intVotantesEfectivos)
                                        .addComponent(intVotosBlancos)
                                        .addComponent(intVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxSeleccionarEleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxSeleccionarCandidato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxSeleccionarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxSeleccionarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxSeleccionarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSeleccionarCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(intVotosCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(intVotantesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(intVotantesEfectivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(intVotosBlancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(intVotosNulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(btnAgregar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxSeleccionarEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarEleccionActionPerformed
        int index = cbxSeleccionarEleccion.getSelectedIndex();
        cbxSeleccionarMesa.removeAllItems();
        if (index >= 0) {
            MiembroMesa miembroActivo = SesionActiva.getUsuarioActivo();
            Eleccion eleccion = GestionEleccion.getLista().get(index);
            for (MesaElectoral mesa : eleccion.getMesas()) {
                if (mesa.getPresidente().equals(miembroActivo) || 
                    mesa.getSecretario().equals(miembroActivo) || 
                    mesa.getVocal().equals(miembroActivo)) {
                    cbxSeleccionarMesa.addItem(mesa.getNumero() + " - " + mesa.getUbicacion());
                }
            }
        }
    }//GEN-LAST:event_cbxSeleccionarEleccionActionPerformed

    private void cbxSeleccionarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarCandidatoActionPerformed
            actualizarSpinnerVotos();
    }//GEN-LAST:event_cbxSeleccionarCandidatoActionPerformed

    private void cbxSeleccionarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarMesaActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexMesa = cbxSeleccionarMesa.getSelectedIndex();
        if (indexEleccion < 0 || GestionEleccion.getLista().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione una elección válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
        LinkedList<MesaElectoral> listaMesas = eleccion.getMesas();
        if (listaMesas == null || listaMesas.isEmpty() || indexMesa < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione una mesa válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        MesaElectoral mesa = listaMesas.get(indexMesa);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaEleccion = dateFormat.format(eleccion.getFecha());
        if (mesa.getActa() == null) {
            mesa.generarActaElectoral(fechaEleccion);
            JOptionPane.showMessageDialog(this, "Acta generada: " + mesa.getActa().getTitulo(), "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        cargarCandidatos(eleccion);
    }//GEN-LAST:event_cbxSeleccionarMesaActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        VentanaPrincipalMiembroMesa objVentanaPrincipalMiembroMesa = new VentanaPrincipalMiembroMesa();
        objVentanaPrincipalMiembroMesa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void btnAgregarObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarObservacionActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexMesa = cbxSeleccionarMesa.getSelectedIndex();
        if (indexEleccion >= 0 && indexMesa >= 0) {
            Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
            MesaElectoral mesa = eleccion.getMesas().get(indexMesa);
            ActaElectoral acta = mesa.getActa();
            String observacion = txtObservacion.getText().trim();
            if (observacion.isEmpty()) {
                JOptionPane.showMessageDialog(this, "La observación no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (acta != null) {
                acta.agregarObservacion(observacion);
                JOptionPane.showMessageDialog(this, "Observación agregada exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtObservacion.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el acta seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una elección y una mesa.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarObservacionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexMesa = cbxSeleccionarMesa.getSelectedIndex();
        int indexCandidato = cbxSeleccionarCandidato.getSelectedIndex();

        if (indexEleccion >= 0 && indexMesa >= 0 && indexCandidato >= 0) {
            Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
            MesaElectoral mesa = eleccion.getMesas().get(indexMesa);
            ActaElectoral acta = mesa.getActa();
            if (acta == null) {
                JOptionPane.showMessageDialog(this, "El acta electoral no está asociada a la mesa. Por favor, genere el acta primero.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int votantesRegistrados = (int) intVotantesRegistrados.getValue();
            int votantesEfectivos = (int) intVotantesEfectivos.getValue();
            int votosBlancos = (int) intVotosBlancos.getValue();
            int votosNulos = (int) intVotosNulos.getValue();
            if (votantesEfectivos > votantesRegistrados) {
                JOptionPane.showMessageDialog(this, "Los votantes efectivos no pueden ser mayores que los registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (votantesRegistrados < votantesEfectivos + votosBlancos + votosNulos) {
                JOptionPane.showMessageDialog(this, "Los votantes registrados deben ser mayores que la suma de votantes efectivos, votos blancos y votos nulos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            acta.setTotalVotantesRegistrados(votantesRegistrados);
            acta.setTotalVotantesEfectivos(votantesEfectivos);
            acta.setVotosBlanco(votosBlancos);
            acta.setVotosNulos(votosNulos);
            Candidato candidatoSeleccionado = eleccion.getCandidatos().get(indexCandidato);
            int votosCandidato = (int) intVotosCandidato.getValue();

            try {
                acta.registrarVotos(candidatoSeleccionado, votosCandidato);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(this, "Datos registrados exitosamente en el acta electoral.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una elección, una mesa y un candidato.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cargarDatosCandidato(int index) {
        LinkedList<Candidato> lista = GestionCandidato.getLista();
        if (index >= 0 && index < lista.size()) {
            Candidato candidato = lista.get(index);
        }
    }
    
    private void cargarElecciones() {
        cbxSeleccionarEleccion.removeAllItems();
        MiembroMesa miembroActivo = SesionActiva.getUsuarioActivo();
        if (miembroActivo == null) {
            JOptionPane.showMessageDialog(this, "No se detectó un usuario activo. Por favor, inicie sesión.", "Error", JOptionPane.ERROR_MESSAGE);
            bloquearInterfaz();
            return;
        }
        LinkedList<Eleccion> elecciones = GestionEleccion.getLista();
        boolean hayElecciones = false;
        for (Eleccion eleccion : elecciones) {
            boolean tieneMesas = false;
            for (MesaElectoral mesa : eleccion.getMesas()) {
                if (mesa.getPresidente().equals(miembroActivo) || 
                    mesa.getSecretario().equals(miembroActivo) || 
                    mesa.getVocal().equals(miembroActivo)) {
                    tieneMesas = true;
                    break;
                }
            }
            if (tieneMesas) {
                cbxSeleccionarEleccion.addItem(eleccion.getTipo() + " - " + eleccion.getFecha());
                hayElecciones = true;
            }
        }
        if (!hayElecciones) {
            JOptionPane.showMessageDialog(this, "No tiene mesas asignadas en ninguna elección.", "Información", JOptionPane.INFORMATION_MESSAGE);
            bloquearInterfaz();
        }
    }
    
    private void actualizarSpinnerVotos() {
        int indexCandidato = cbxSeleccionarCandidato.getSelectedIndex();
        if (indexCandidato >= 0) {
            Eleccion eleccion = GestionEleccion.getLista().get(cbxSeleccionarEleccion.getSelectedIndex());
            Candidato candidatoSeleccionado = eleccion.getCandidatos().get(indexCandidato);
            ActaElectoral acta = eleccion.getMesas().get(cbxSeleccionarMesa.getSelectedIndex()).getActa();
            int votosActuales = 0;
            if (acta != null) {
                for (VotoCandidato voto : acta.getVotosPorCandidato()) {
                    if (voto.getCandidato().equals(candidatoSeleccionado)) {
                        votosActuales = voto.getVotos();
                        break;
                    }
                }
            }
            intVotosCandidato.setValue(votosActuales);
        }
    }
    
    private void cargarCandidatos(Eleccion eleccion) {
        cbxSeleccionarCandidato.removeAllItems();
        if (eleccion == null || eleccion.getCandidatos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay candidatos registrados para esta elección.", "Información", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        for (Candidato candidato : eleccion.getCandidatos()) {
            cbxSeleccionarCandidato.addItem(candidato.getNombre());
        }
        if (cbxSeleccionarCandidato.getItemCount() > 0) {
            cbxSeleccionarCandidato.setSelectedIndex(0);
            actualizarSpinnerVotos(); 
        }
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
            java.util.logging.Logger.getLogger(VentanaRegistroVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroVotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroVotos().setVisible(true);
            }
        });
    }
    
    private void bloquearInterfaz() {
        cbxSeleccionarEleccion.setEnabled(false);
        cbxSeleccionarMesa.setEnabled(false);
        cbxSeleccionarCandidato.setEnabled(false);
        intVotantesRegistrados.setEnabled(false);
        intVotantesEfectivos.setEnabled(false);
        intVotosBlancos.setEnabled(false);
        intVotosNulos.setEnabled(false);
        intVotosCandidato.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnAgregarObservacion.setEnabled(false);
        txtObservacion.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarObservacion;
    private javax.swing.JComboBox<String> cbxSeleccionarCandidato;
    private javax.swing.JComboBox<String> cbxSeleccionarEleccion;
    private javax.swing.JComboBox<String> cbxSeleccionarMesa;
    private javax.swing.JSpinner intVotantesEfectivos;
    private javax.swing.JSpinner intVotantesRegistrados;
    private javax.swing.JSpinner intVotosBlancos;
    private javax.swing.JSpinner intVotosCandidato;
    private javax.swing.JSpinner intVotosNulos;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea txtObservacion;
    // End of variables declaration//GEN-END:variables
}
