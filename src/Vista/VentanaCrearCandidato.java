/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.GestionCandidato;
import Modelo.Candidato;
import javax.swing.JOptionPane;
/**
 *
 * @author VICTOR
 */
public class VentanaCrearCandidato extends javax.swing.JFrame 
{
    public VentanaCrearCandidato() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        hola = new javax.swing.JLabel();
        nom_candit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apel_candi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Dni_candi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        parti_candi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apelma_candi = new javax.swing.JTextField();
        guardarCandidato = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CANDIDATO");

        hola.setText("Nombre");

        nom_candit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_canditActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("DNI");

        Dni_candi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dni_candiActionPerformed(evt);
            }
        });

        jLabel4.setText("Partido Politico");

        jLabel5.setText("Apellido Materno");

        guardarCandidato.setText("Guardar");
        guardarCandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCandidatoActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hola)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(91, 91, 91)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Dni_candi)
                            .addComponent(nom_candit, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(apelma_candi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(apel_candi)
                            .addComponent(parti_candi))
                        .addGap(154, 154, 154))))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(guardarCandidato)
                .addGap(65, 65, 65)
                .addComponent(regresar)
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hola)
                    .addComponent(nom_candit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apel_candi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apelma_candi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dni_candi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(parti_candi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarCandidato)
                    .addComponent(regresar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nom_canditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_canditActionPerformed
   
    }//GEN-LAST:event_nom_canditActionPerformed

    private void guardarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCandidatoActionPerformed
        String nom = this.nom_candit.getText();
        String apel1 = this.apel_candi.getText();
        String apel2 = this.apelma_candi.getText();
        String dni = this.Dni_candi.getText();
        String parti = this.parti_candi.getText();
        if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(this, "El DNI debe ser un número de 8 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        GestionCandidato.getLista().add(new Candidato(nom, apel1, apel2, dni, parti));
        JOptionPane.showMessageDialog(this, "Candidato registrado correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        Limpiar();
    }//GEN-LAST:event_guardarCandidatoActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        VentanaGestionElecciones objVentanaGestionElecciones = new VentanaGestionElecciones();
        objVentanaGestionElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void Dni_candiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dni_candiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dni_candiActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCrearCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCrearCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaCrearCandidato().setVisible(true);
            }
        });
    }
    
    public void Limpiar(){
        this.nom_candit.setText("");
        this.apel_candi.setText("");
        this.apelma_candi.setText("");
        this.Dni_candi.setText("");
        this.parti_candi.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dni_candi;
    private javax.swing.JTextField apel_candi;
    private javax.swing.JTextField apelma_candi;
    private javax.swing.JButton guardarCandidato;
    private javax.swing.JLabel hola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nom_candit;
    private javax.swing.JTextField parti_candi;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
