/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.formularios;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.delegate.EmpresasDelegate;
import modelo.dto.Empresas;

/**
 *
 * @author Nate
 */
public class EmpresasUI extends javax.swing.JFrame {

    EmpresasDelegate del = null;
    Empresas dto = null;

    public EmpresasUI() {
        initComponents();
        dto = new Empresas();
        llenarTodo();
    }

    private void llenarTodo() {

        EmpresasDelegate del = new EmpresasDelegate();
        Empresas dto;
        try {
            String[] columnas = {"id", "Nombre", "RFC", "Razon Social", "Municipio", "Colonia", "Calle", "Telefono"};
            List lista;
            int fila = -1;
            Object[][] data = new Object[del.findAll().size()][8];
            del = new EmpresasDelegate();
            lista = del.findAll();
//fac.listaVendedores();
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                dto = (Empresas) it.next();
                fila++;
                data[fila][0] = dto.getId();
                data[fila][1] = dto;
                data[fila][2] = dto.getRfc();
                data[fila][3] = dto.getRazonSocial();
                data[fila][4] = dto.getMunicipio();
                data[fila][5] = dto.getColonia();
                data[fila][6] = dto.getCalle();
                data[fila][7] = dto.getTelefono();

            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
        } catch (Exception ex) {
            Logger.getLogger(EmpresasUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1Nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1RFC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1RazonSocial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Municipio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Colonia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1Calle = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1Telefono = new javax.swing.JTextField();
        jButton2Crear = new javax.swing.JButton();
        jButton2Actualizar = new javax.swing.JButton();
        jButton3Eliminar = new javax.swing.JButton();
        jButton4Buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1Id = new javax.swing.JTextField();
        jButton2Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre: ");

        jLabel2.setText("RFC: ");

        jLabel3.setText("Razon social:");

        jLabel4.setText("Municipio: ");

        jLabel5.setText("Colonia:");

        jLabel6.setText("Calle: ");

        jLabel7.setText("Telefono: ");

        jButton2Crear.setText("Crear");
        jButton2Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CrearActionPerformed(evt);
            }
        });

        jButton2Actualizar.setText("Actualizar");
        jButton2Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActualizarActionPerformed(evt);
            }
        });

        jButton3Eliminar.setText("Eliminar");
        jButton3Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3EliminarActionPerformed(evt);
            }
        });

        jButton4Buscar.setText("Buscar");
        jButton4Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4BuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Id:");

        jButton2Limpiar.setText("Limpiar");
        jButton2Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2Crear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2Actualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3Eliminar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel8))
                                            .addGap(40, 40, 40)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField1RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField1Municipio)
                                                .addComponent(jTextField1RazonSocial)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField1Telefono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4Buscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2Limpiar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(27, 27, 27)
                                        .addComponent(jTextField1Calle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1Colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jTextField1Calle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1RazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2Crear)
                    .addComponent(jButton2Actualizar)
                    .addComponent(jButton3Eliminar)
                    .addComponent(jButton4Buscar)
                    .addComponent(jButton2Limpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CrearActionPerformed
        del = new EmpresasDelegate();
        dto = new Empresas();
        dto = getCampos();
        try {
            del.persist(dto);
            JOptionPane.showConfirmDialog(this, "Registro Creado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        } catch (Exception e) {
        }
        llenarTodo();
    }//GEN-LAST:event_jButton2CrearActionPerformed

    private void jButton2ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActualizarActionPerformed
        del = new EmpresasDelegate();

        try {
            dto = getCampos();
            if (jTextField1Id.getText().isEmpty()) {
                 
                
            } else {
                    //dto = del.findById(Integer.parseInt(jTextField1Id.getText()));

            dto.setId(Integer.parseInt(jTextField1Id.getText()));
            del.update(dto);
            JOptionPane.showConfirmDialog(this, "Registro Actualizado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showConfirmDialog(this, "Sara Sergio te AMA", " S & S(giglipuff)",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    llenarTodo();
            limpiarCampos();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton2ActualizarActionPerformed

    private void jButton4BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4BuscarActionPerformed
        // TODO add your handling code here:
        del = new EmpresasDelegate();
        dto = new Empresas();
        try {
            dto = del.findById(Integer.parseInt(jTextField1Id.getText()));

            if (dto != null) {
                setCampos(dto);
            } else {
                JOptionPane.showConfirmDialog(this, "El registro no se encuentra", "Aviso del sistema",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            Logger.getLogger(EmpresasUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4BuscarActionPerformed

    private void jButton3EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3EliminarActionPerformed
        del = new EmpresasDelegate();
        dto = new Empresas();
        try {
            if (jTextField1Id.getText().isEmpty()) {
                JOptionPane.showConfirmDialog(this, "Campo \"Id\" vacio", "Aviso del sistema",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

            } else {

                dto.setId(Integer.parseInt(jTextField1Id.getText()));
                //dto = del.findById(dto.getId());
                if (dto == null) {
                    JOptionPane.showConfirmDialog(this, "El registro no exite", "Aviso del sistema",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
                    //dto = new Empresas();
                } else {

                    del.deleteById(dto.getId());
                    limpiarCampos();
                    llenarTodo();
                    JOptionPane.showConfirmDialog(this, "El registro se elimino", "Aviso del sistema",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(EmpresasUI.class.getName()).log(Level.SEVERE, null, e);

        }

    }//GEN-LAST:event_jButton3EliminarActionPerformed

    private void jButton2LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButton2LimpiarActionPerformed
    private void setCampos(Empresas dto) {
       

            jTextField1Id.setText(String.valueOf(dto.getId()));
            jTextField1Calle.setText(dto.getCalle());
            jTextField1Colonia.setText(dto.getColonia());
            jTextField1Municipio.setText(dto.getMunicipio());
            jTextField1Nombre.setText(dto.getNombre());
            jTextField1RFC.setText(dto.getRfc());
            jTextField1RazonSocial.setText(dto.getRazonSocial());
            jTextField1Telefono.setText(dto.getTelefono());
        
    }

    private Empresas getCampos() {
        if (jTextField1Calle.getText().isEmpty() || jTextField1Colonia.getText().isEmpty() || jTextField1Municipio.getText().isEmpty()
                || jTextField1Nombre.getText().isEmpty() || jTextField1RFC.getText().isEmpty() || jTextField1RazonSocial.getText().isEmpty()
                || jTextField1Telefono.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Campo vacio", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } else {

            Empresas empresa = new Empresas();
            empresa.setNombre(jTextField1Nombre.getText());
            empresa.setCalle(jTextField1Calle.getText());
            empresa.setColonia(jTextField1Colonia.getText());
            empresa.setMunicipio(jTextField1Municipio.getText());
            empresa.setRazonSocial(jTextField1RazonSocial.getText());
            empresa.setTelefono(jTextField1Telefono.getText());
            empresa.setRfc(jTextField1RFC.getText());
            return empresa;

        }
        return null;
    }

    private void limpiarCampos() {
        jTextField1Id.setText("");
        jTextField1Calle.setText(" ");
        jTextField1Colonia.setText(" ");
        jTextField1Municipio.setText(" ");
        jTextField1Nombre.setText(" ");
        jTextField1RFC.setText(" ");
        jTextField1RazonSocial.setText(" ");
        jTextField1Telefono.setText(" ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2Actualizar;
    private javax.swing.JButton jButton2Crear;
    private javax.swing.JButton jButton2Limpiar;
    private javax.swing.JButton jButton3Eliminar;
    private javax.swing.JButton jButton4Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Calle;
    private javax.swing.JTextField jTextField1Colonia;
    private javax.swing.JTextField jTextField1Id;
    private javax.swing.JTextField jTextField1Municipio;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField1RFC;
    private javax.swing.JTextField jTextField1RazonSocial;
    private javax.swing.JTextField jTextField1Telefono;
    // End of variables declaration//GEN-END:variables
}
