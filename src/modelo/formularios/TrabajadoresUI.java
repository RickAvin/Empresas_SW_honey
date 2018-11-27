/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.formularios;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.delegate.EmpresasDelegate;
import modelo.delegate.TrabajadoresDelegate;
import modelo.dto.Empresas;
import modelo.dto.Trabajadores;

/**
 *
 * @author Nate
 */
public class TrabajadoresUI extends javax.swing.JFrame {

    TrabajadoresDelegate del = null;
    Trabajadores dto = null;

    /**
     * Creates new form TrabajadoresUI
     */
    public TrabajadoresUI() {
        initComponents();
        dto = new Trabajadores();
        llenarTodo();
    }

    private void llenarTodo() {

        TrabajadoresDelegate del = new TrabajadoresDelegate();
        Trabajadores dto;
        try {
            String[] columnas = {"id", "Nombre", "Paterno", "Materno", "RFC"};
            List lista;
            int fila = -1;
            Object[][] data = new Object[del.findAll().size()][5];
            del = new TrabajadoresDelegate();
            lista = del.findAll();
//fac.listaVendedores();
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                dto = (Trabajadores) it.next();
                fila++;
                data[fila][0] = dto.getId();
                data[fila][1] = dto;
                data[fila][2] = dto.getPaterno();
                data[fila][3] = dto.getMaterno();
                data[fila][4] = dto.getRfc();

            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
        } catch (Exception ex) {
            Logger.getLogger(EmpresasUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1RFC = new javax.swing.JTextField();
        jButton1Crear = new javax.swing.JButton();
        jButton1Actualizar = new javax.swing.JButton();
        jButton2Buscar = new javax.swing.JButton();
        jButton1Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1Id = new javax.swing.JTextField();
        jTextField1Nombre = new javax.swing.JTextField();
        jTextField1Paterno = new javax.swing.JTextField();
        jTextField1Materno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1Crear.setText("Crear");
        jButton1Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CrearActionPerformed(evt);
            }
        });

        jButton1Actualizar.setText("Actualizar");
        jButton1Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarActionPerformed(evt);
            }
        });

        jButton2Buscar.setText("Buscar");
        jButton2Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BuscarActionPerformed(evt);
            }
        });

        jButton1Eliminar.setText("Eliminar");
        jButton1Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EliminarActionPerformed(evt);
            }
        });

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

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Paterno:");

        jLabel4.setText("Materno:");

        jLabel5.setText("RFC:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1Id)
                            .addComponent(jTextField1Nombre)
                            .addComponent(jTextField1Paterno)
                            .addComponent(jTextField1Materno)
                            .addComponent(jTextField1RFC, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1Crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(35, 35, 35))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Crear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1Materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Eliminar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CrearActionPerformed
        del = new TrabajadoresDelegate();

        try {
                    dto = getCampos();
                    if (dto==null) {
                 JOptionPane.showConfirmDialog(this, "Campo vacio", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }else{
            del.persist(dto);
            JOptionPane.showConfirmDialog(this, "Registro Creado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            llenarTodo();
                        
                    }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, "Registro no Creado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton1CrearActionPerformed

    private void jButton2BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BuscarActionPerformed
        del = new TrabajadoresDelegate();
        dto = new Trabajadores();
        if (jTextField1Id.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Campo vacio", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } else {
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
        }

    }//GEN-LAST:event_jButton2BuscarActionPerformed

    private void jButton1ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarActionPerformed
        del = new TrabajadoresDelegate();
        dto = new Trabajadores();

        try {
            dto = getCampos();
            if (jTextField1Id.getText().isEmpty()) {

            } else {
                // dto = del.findById(Integer.parseInt(jTextField1Id.getText()));

                dto.setId(Integer.parseInt(jTextField1Id.getText()));
                del.update(dto);
                JOptionPane.showConfirmDialog(this, "Registro Actualizado", "Aviso del sistema",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                llenarTodo();
                limpiarCampos();
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1ActualizarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EliminarActionPerformed
        if (jTextField1Id.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Campo vacio", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        } else {
            try {
            del = new TrabajadoresDelegate();
            dto = new Trabajadores();
            dto.setId(Integer.parseInt(jTextField1Id.getText()));
            del.deleteById(dto.getId());
            llenarTodo();

            JOptionPane.showConfirmDialog(this, "Registro Borrado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        } catch (Exception e) {
        }
        }
        


    }//GEN-LAST:event_jButton1EliminarActionPerformed
    private void limpiarCampos() {
        jTextField1Id.setText(" ");
        jTextField1Materno.setText(" ");
        jTextField1Nombre.setText(" ");
        jTextField1Paterno.setText(" ");
        jTextField1RFC.setText(" ");

    }

    public Trabajadores getCampos() {
        if (jTextField1Materno.getText().isEmpty() || jTextField1Nombre.getText().isEmpty() || jTextField1Paterno.getText().isEmpty()
                || jTextField1RFC.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Campo vacio", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        } else {
            Trabajadores dto = new Trabajadores();

            dto.setMaterno(jTextField1Materno.getText());
            dto.setNombre(jTextField1Nombre.getText());
            dto.setPaterno(jTextField1Paterno.getText());
            dto.setRfc(jTextField1RFC.getText());
            return dto;
        }
        return null;
    }

    public void setCampos(Trabajadores dto) {

        jTextField1Id.setText(String.valueOf(dto.getId()));
        jTextField1Materno.setText(dto.getMaterno());
        jTextField1Nombre.setText(dto.getNombre());
        jTextField1Paterno.setText(dto.getPaterno());
        jTextField1RFC.setText(dto.getRfc());

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Actualizar;
    private javax.swing.JButton jButton1Crear;
    private javax.swing.JButton jButton1Eliminar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Id;
    private javax.swing.JTextField jTextField1Materno;
    private javax.swing.JTextField jTextField1Nombre;
    private javax.swing.JTextField jTextField1Paterno;
    private javax.swing.JTextField jTextField1RFC;
    // End of variables declaration//GEN-END:variables
}
