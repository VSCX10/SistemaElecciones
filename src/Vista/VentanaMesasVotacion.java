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
public class VentanaMesasVotacion extends javax.swing.JFrame {
    
    public VentanaMesasVotacion() {
        initComponents();
        setLocationRelativeTo(null);
        txtUbicacion.setEditable(false);

        txtNombrePresidente.setEditable(false);
        txtApellidoPaternoPresidente.setEditable(false);
        txtApellidoMaternoPresidente.setEditable(false);
        txtDNIPresidente.setEditable(false);
        txtPasswordPresidente.setEditable(false);

        txtNombreSecretario.setEditable(false);
        txtApellidoPaternoSecretario.setEditable(false);
        txtApellidoMaternoSecretario.setEditable(false);
        txtDNISecretario.setEditable(false);
        txtPasswordSecretario.setEditable(false);

        txtNombreVocal.setEditable(false);
        txtApellidoPaternoVocal.setEditable(false);
        txtApellidoMaternoVocal.setEditable(false);
        txtDNIVocal.setEditable(false);
        txtPasswordVocal.setEditable(false);
        
        cargarElecciones();
        cbxSeleccionarEleccion.setSelectedIndex(0);
        if (cbxSeleccionarEleccion.getSelectedIndex() >= 0) {
            cargarMesas(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbxSeleccionarEleccion = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbxSeleccionarMesa = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreVocal = new javax.swing.JTextField();
        txtNombrePresidente = new javax.swing.JTextField();
        txtNombreSecretario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtUbicacion = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtDNIPresidente = new javax.swing.JTextField();
        txtApellidoPaternoPresidente = new javax.swing.JTextField();
        txtApellidoMaternoPresidente = new javax.swing.JTextField();
        txtPasswordPresidente = new javax.swing.JTextField();
        txtDNISecretario = new javax.swing.JTextField();
        txtApellidoPaternoSecretario = new javax.swing.JTextField();
        txtApellidoMaternoSecretario = new javax.swing.JTextField();
        txtPasswordSecretario = new javax.swing.JTextField();
        txtApellidoPaternoVocal = new javax.swing.JTextField();
        txtDNIVocal = new javax.swing.JTextField();
        txtApellidoMaternoVocal = new javax.swing.JTextField();
        txtPasswordVocal = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Seleccionar Elección");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("MESAS DE VOTACIÓN");

        cbxSeleccionarEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarEleccionActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Seleccionar Mesa");

        cbxSeleccionarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarMesaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Ubicación");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Información de Mesa");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("Secretario");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setText("Presidente");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("Vocal");

        txtNombrePresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePresidenteActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Miembros de Mesa");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Nombre");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Apellido Paterno");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Apellido Materno");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Contraseña");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("DNI");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Nombre");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Apellido Paterno");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Apellido Materno");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("DNI");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Contraseña");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Nombre");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("Apellido Paterno");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("Apellido Materno");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("DNI");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("Contraseña");

        txtDNIPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIPresidenteActionPerformed(evt);
            }
        });

        txtApellidoPaternoPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoPresidenteActionPerformed(evt);
            }
        });

        txtApellidoMaternoPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoPresidenteActionPerformed(evt);
            }
        });

        txtPasswordPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordPresidenteActionPerformed(evt);
            }
        });

        txtDNISecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNISecretarioActionPerformed(evt);
            }
        });

        txtApellidoPaternoSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoSecretarioActionPerformed(evt);
            }
        });

        txtApellidoMaternoSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoSecretarioActionPerformed(evt);
            }
        });

        txtPasswordSecretario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordSecretarioActionPerformed(evt);
            }
        });

        txtApellidoPaternoVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoVocalActionPerformed(evt);
            }
        });

        txtDNIVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIVocalActionPerformed(evt);
            }
        });

        txtApellidoMaternoVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoMaternoVocalActionPerformed(evt);
            }
        });

        txtPasswordVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordVocalActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(cbxSeleccionarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel26))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidoPaternoSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDNISecretario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidoMaternoSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPasswordSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(3, 3, 3)))
                                    .addComponent(txtApellidoPaternoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoMaternoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDNIPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPasswordPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombrePresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14)
                            .addComponent(jLabel29))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel31)
                                                    .addComponent(jLabel32)
                                                    .addComponent(jLabel33)
                                                    .addComponent(jLabel34))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtApellidoPaternoVocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDNIVocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtApellidoMaternoVocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPasswordVocal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNombreVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(131, 131, 131))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxSeleccionarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnGuardar)
                                            .addComponent(btnEliminar))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRegresar)
                                            .addComponent(btnAgregar))
                                        .addGap(186, 186, 186))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnModificar)
                                        .addGap(245, 245, 245))))))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbxSeleccionarEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSeleccionarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombrePresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtApellidoPaternoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtDNIPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtPasswordPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtApellidoMaternoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(txtNombreVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtApellidoPaternoVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtApellidoMaternoVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtDNIVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtPasswordVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtNombreSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtApellidoPaternoSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtApellidoMaternoSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtDNISecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtPasswordSecretario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnAgregar))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnRegresar))))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void txtNombrePresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePresidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePresidenteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        VentanaGestionElecciones ventanaGestionElecciones = new VentanaGestionElecciones();
        ventanaGestionElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexMesa = cbxSeleccionarMesa.getSelectedIndex();

        if (indexEleccion >= 0 && indexMesa >= 0) {
            Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
            MesaElectoral mesa = eleccion.getMesas().get(indexMesa);
            int confirm = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro de que desea eliminar la mesa seleccionada?",
                    "Confirmación de eliminación",
                    JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                eleccion.eliminarMesa(mesa);
                cargarMesas(indexEleccion);
                limpiar();
                JOptionPane.showMessageDialog(this, "Mesa eliminada exitosamente.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una mesa para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        if (indexEleccion >= 0) {
            Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
            MesaElectoral nuevaMesa = new MesaElectoral();
            nuevaMesa.setUbicacion("");
            nuevaMesa.setPresidente(new MiembroMesa("", "", "", "", ""));
            nuevaMesa.setSecretario(new MiembroMesa("", "", "", "", ""));
            nuevaMesa.setVocal(new MiembroMesa("", "", "", "", ""));
            eleccion.añadirMesa(nuevaMesa);
            cargarMesas(indexEleccion);
            JOptionPane.showMessageDialog(this, "Nueva mesa agregada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una elección para agregar una mesa.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexMesa = cbxSeleccionarMesa.getSelectedIndex();
        if (indexEleccion >= 0 && indexMesa >= 0) {
            Eleccion eleccion = GestionEleccion.getLista().get(indexEleccion);
            MesaElectoral mesa = eleccion.getMesas().get(indexMesa);
            guardarDatosMesa(mesa);
            JOptionPane.showMessageDialog(this, "Datos de la mesa guardados exitosamente.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbxSeleccionarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarMesaActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        int indexMesa = cbxSeleccionarMesa.getSelectedIndex();

        if (indexEleccion >= 0 && indexMesa >= 0) {
            LinkedList<Eleccion> elecciones = GestionEleccion.getLista();
            if (indexEleccion < elecciones.size()) {
                Eleccion eleccion = elecciones.get(indexEleccion);
                LinkedList<MesaElectoral> mesas = eleccion.getMesas();
                if (indexMesa < mesas.size()) {
                    MesaElectoral mesa = mesas.get(indexMesa);
                    actualizarDatosMesa(mesa);
                    return;
                }
            }
        }
        limpiar();
    }//GEN-LAST:event_cbxSeleccionarMesaActionPerformed

    private void cbxSeleccionarEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarEleccionActionPerformed
        int indexEleccion = cbxSeleccionarEleccion.getSelectedIndex();
        if (indexEleccion >= 0) {
            cargarMesas(indexEleccion);
        } else {
            cbxSeleccionarMesa.removeAllItems();
            cbxSeleccionarMesa.addItem("No hay mesas disponibles");
            cbxSeleccionarMesa.setEnabled(false);
        }
    }//GEN-LAST:event_cbxSeleccionarEleccionActionPerformed

    private void txtDNIPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIPresidenteActionPerformed
        txtDNIPresidente.setEditable(true);
        txtDNIPresidente.requestFocus();
    }//GEN-LAST:event_txtDNIPresidenteActionPerformed

    private void txtApellidoPaternoPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoPresidenteActionPerformed
        txtApellidoPaternoPresidente.setEditable(true);
        txtApellidoPaternoPresidente.requestFocus();
    }//GEN-LAST:event_txtApellidoPaternoPresidenteActionPerformed

    private void txtApellidoMaternoPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoPresidenteActionPerformed
        txtApellidoMaternoPresidente.setEditable(true);
        txtApellidoMaternoPresidente.requestFocus();
    }//GEN-LAST:event_txtApellidoMaternoPresidenteActionPerformed

    private void txtPasswordPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordPresidenteActionPerformed
        txtPasswordPresidente.setEditable(true);
        txtPasswordPresidente.requestFocus();
    }//GEN-LAST:event_txtPasswordPresidenteActionPerformed

    private void txtDNISecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNISecretarioActionPerformed
        txtDNISecretario.setEditable(true);
        txtDNISecretario.requestFocus();
    }//GEN-LAST:event_txtDNISecretarioActionPerformed

    private void txtApellidoPaternoSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoSecretarioActionPerformed
        txtApellidoPaternoSecretario.setEditable(true);
        txtApellidoPaternoSecretario.requestFocus();
    }//GEN-LAST:event_txtApellidoPaternoSecretarioActionPerformed

    private void txtApellidoMaternoSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoSecretarioActionPerformed
        txtApellidoMaternoSecretario.setEditable(true);
        txtApellidoMaternoSecretario.requestFocus();
    }//GEN-LAST:event_txtApellidoMaternoSecretarioActionPerformed

    private void txtPasswordSecretarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordSecretarioActionPerformed
        txtPasswordSecretario.setEditable(true);
        txtPasswordSecretario.requestFocus();
    }//GEN-LAST:event_txtPasswordSecretarioActionPerformed

    private void txtApellidoPaternoVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoVocalActionPerformed
        txtApellidoPaternoVocal.setEditable(true);
        txtApellidoPaternoVocal.requestFocus();
    }//GEN-LAST:event_txtApellidoPaternoVocalActionPerformed

    private void txtDNIVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIVocalActionPerformed
        txtDNIVocal.setEditable(true);
        txtDNIVocal.requestFocus();
    }//GEN-LAST:event_txtDNIVocalActionPerformed

    private void txtApellidoMaternoVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoMaternoVocalActionPerformed
        txtApellidoMaternoVocal.setEditable(true);
        txtApellidoMaternoVocal.requestFocus();
    }//GEN-LAST:event_txtApellidoMaternoVocalActionPerformed

    private void txtPasswordVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordVocalActionPerformed
        txtPasswordVocal.setEditable(true);
        txtPasswordVocal.requestFocus();
    }//GEN-LAST:event_txtPasswordVocalActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtUbicacion.setEditable(true);
        
        txtNombrePresidente.setEditable(true);
        txtApellidoPaternoPresidente.setEditable(true);
        txtApellidoMaternoPresidente.setEditable(true);
        txtDNIPresidente.setEditable(true);
        txtPasswordPresidente.setEditable(true);

        txtNombreSecretario.setEditable(true);
        txtApellidoPaternoSecretario.setEditable(true);
        txtApellidoMaternoSecretario.setEditable(true);
        txtDNISecretario.setEditable(true);
        txtPasswordSecretario.setEditable(true);

        txtNombreVocal.setEditable(true);
        txtApellidoPaternoVocal.setEditable(true);
        txtApellidoMaternoVocal.setEditable(true);
        txtDNIVocal.setEditable(true);
        txtPasswordVocal.setEditable(true);

        JOptionPane.showMessageDialog(this, "Todos los campos están listos para ser editados.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void limpiar() {
        txtUbicacion.setText("");

        txtNombrePresidente.setText("");
        txtApellidoPaternoPresidente.setText("");
        txtApellidoMaternoPresidente.setText("");
        txtDNIPresidente.setText("");
        txtPasswordPresidente.setText("");

        txtNombreSecretario.setText("");
        txtApellidoPaternoSecretario.setText("");
        txtApellidoMaternoSecretario.setText("");
        txtDNISecretario.setText("");
        txtPasswordSecretario.setText("");

        txtNombreVocal.setText("");
        txtApellidoPaternoVocal.setText("");
        txtApellidoMaternoVocal.setText("");
        txtDNIVocal.setText("");
        txtPasswordVocal.setText("");

        txtUbicacion.setEditable(false);
        
        txtNombrePresidente.setEditable(false);
        txtApellidoPaternoPresidente.setEditable(false);
        txtApellidoMaternoPresidente.setEditable(false);
        txtDNIPresidente.setEditable(false);
        txtPasswordPresidente.setEditable(false);

        txtNombreSecretario.setEditable(false);
        txtApellidoPaternoSecretario.setEditable(false);
        txtApellidoMaternoSecretario.setEditable(false);
        txtDNISecretario.setEditable(false);
        txtPasswordSecretario.setEditable(false);

        txtNombreVocal.setEditable(false);
        txtApellidoPaternoVocal.setEditable(false);
        txtApellidoMaternoVocal.setEditable(false);
        txtDNIVocal.setEditable(false);
        txtPasswordVocal.setEditable(false);
    }
    
    private void cargarElecciones() {
        cbxSeleccionarEleccion.removeAllItems();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        LinkedList<Eleccion> elecciones = GestionEleccion.getLista();
        if (!elecciones.isEmpty()) {
            for (int i = 0; i < elecciones.size(); i++) {
                Eleccion eleccion = elecciones.get(i);
                cbxSeleccionarEleccion.addItem("Elección: " + eleccion.getTipo() + " - Fecha: " + dateFormat.format(eleccion.getFecha()));
            }
            cbxSeleccionarEleccion.setEnabled(true);
        } else {
            cbxSeleccionarEleccion.addItem("No hay elecciones disponibles");
            cbxSeleccionarEleccion.setEnabled(false);
        }
    }

    private void cargarMesas(int indexEleccion) {
        cbxSeleccionarMesa.removeAllItems();
        LinkedList<Eleccion> elecciones = GestionEleccion.getLista();
        if (indexEleccion >= 0 && indexEleccion < elecciones.size()) {
            Eleccion eleccion = elecciones.get(indexEleccion);
            LinkedList<MesaElectoral> mesas = eleccion.getMesas();
            if (!mesas.isEmpty()) {
                for (MesaElectoral mesa : mesas) {
                    cbxSeleccionarMesa.addItem("Mesa " + mesa.getNumero());
                }
                cbxSeleccionarMesa.setEnabled(true);
            } else {
                cbxSeleccionarMesa.addItem("No hay mesas disponibles");
                cbxSeleccionarMesa.setEnabled(false);
            }
        } else {
            cbxSeleccionarMesa.addItem("No hay elecciones válidas");
            cbxSeleccionarMesa.setEnabled(false);
        }
    }
    
    private void actualizarDatosMesa(MesaElectoral mesa) {
        if (mesa != null) {
            txtUbicacion.setText(mesa.getUbicacion());
            txtNombrePresidente.setText(mesa.getPresidente().getNombre());
            txtApellidoPaternoPresidente.setText(mesa.getPresidente().getApellidoPaterno());
            txtApellidoMaternoPresidente.setText(mesa.getPresidente().getApellidoMaterno());
            txtDNIPresidente.setText(mesa.getPresidente().getDNI());
            txtPasswordPresidente.setText(mesa.getPresidente().getPassword());

            txtNombreSecretario.setText(mesa.getSecretario().getNombre());
            txtApellidoPaternoSecretario.setText(mesa.getSecretario().getApellidoPaterno());
            txtApellidoMaternoSecretario.setText(mesa.getSecretario().getApellidoMaterno());
            txtDNISecretario.setText(mesa.getSecretario().getDNI());
            txtPasswordSecretario.setText(mesa.getSecretario().getPassword());

            txtNombreVocal.setText(mesa.getVocal().getNombre());
            txtApellidoPaternoVocal.setText(mesa.getVocal().getApellidoPaterno());
            txtApellidoMaternoVocal.setText(mesa.getVocal().getApellidoMaterno());
            txtDNIVocal.setText(mesa.getVocal().getDNI());
            txtPasswordVocal.setText(mesa.getVocal().getPassword());
        } else {
            limpiar();
        }
}

    private void guardarDatosMesa(MesaElectoral mesa) {
        if (mesa != null) {
                mesa.setUbicacion(txtUbicacion.getText());

                MiembroMesa presidente = mesa.getPresidente();
                if (!esDNIVALIDO(txtDNIPresidente.getText())) {
                    JOptionPane.showMessageDialog(this, "El DNI del presidente debe tener 8 dígitos.", "Error de validación", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                presidente.setNombre(txtNombrePresidente.getText());
                presidente.setApellidoPaterno(txtApellidoPaternoPresidente.getText());
                presidente.setApellidoMaterno(txtApellidoMaternoPresidente.getText());
                presidente.setDNI(txtDNIPresidente.getText());
                presidente.setPassword(txtPasswordPresidente.getText());

                MiembroMesa secretario = mesa.getSecretario();
                if (!esDNIVALIDO(txtDNISecretario.getText())) {
                    JOptionPane.showMessageDialog(this, "El DNI del secretario debe tener 8 dígitos.", "Error de validación", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                secretario.setNombre(txtNombreSecretario.getText());
                secretario.setApellidoPaterno(txtApellidoPaternoSecretario.getText());
                secretario.setApellidoMaterno(txtApellidoMaternoSecretario.getText());
                secretario.setDNI(txtDNISecretario.getText());
                secretario.setPassword(txtPasswordSecretario.getText());

                MiembroMesa vocal = mesa.getVocal();
                if (!esDNIVALIDO(txtDNIVocal.getText())) {
                    JOptionPane.showMessageDialog(this, "El DNI del vocal debe tener 8 dígitos.", "Error de validación", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                vocal.setNombre(txtNombreVocal.getText());
                vocal.setApellidoPaterno(txtApellidoPaternoVocal.getText());
                vocal.setApellidoMaterno(txtApellidoMaternoVocal.getText());
                vocal.setDNI(txtDNIVocal.getText());
                vocal.setPassword(txtPasswordVocal.getText());
        }
    }
    
    private boolean esDNIVALIDO(String dni) {
        return dni != null && dni.matches("\\d{8}");
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
            java.util.logging.Logger.getLogger(VentanaMesasVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMesasVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMesasVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMesasVotacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMesasVotacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxSeleccionarEleccion;
    private javax.swing.JComboBox<String> cbxSeleccionarMesa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtApellidoMaternoPresidente;
    private javax.swing.JTextField txtApellidoMaternoSecretario;
    private javax.swing.JTextField txtApellidoMaternoVocal;
    private javax.swing.JTextField txtApellidoPaternoPresidente;
    private javax.swing.JTextField txtApellidoPaternoSecretario;
    private javax.swing.JTextField txtApellidoPaternoVocal;
    private javax.swing.JTextField txtDNIPresidente;
    private javax.swing.JTextField txtDNISecretario;
    private javax.swing.JTextField txtDNIVocal;
    private javax.swing.JTextField txtNombrePresidente;
    private javax.swing.JTextField txtNombreSecretario;
    private javax.swing.JTextField txtNombreVocal;
    private javax.swing.JTextField txtPasswordPresidente;
    private javax.swing.JTextField txtPasswordSecretario;
    private javax.swing.JTextField txtPasswordVocal;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
