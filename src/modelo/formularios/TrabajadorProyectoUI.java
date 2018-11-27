/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.formularios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.delegate.EmpresasDelegate;
import modelo.delegate.ProyectoDelegate;
import modelo.delegate.TrabajadoresDelegate;
import modelo.delegate.TrabajadoresProyectosDelegate;
import modelo.dto.Proyecto;
import modelo.dto.TrabajadorProyecto;
import modelo.dto.Trabajadores;

/**
 *
 * @author Nate
 */
public class TrabajadorProyectoUI extends javax.swing.JFrame {

    TrabajadoresProyectosDelegate del = new TrabajadoresProyectosDelegate();
    TrabajadorProyecto dto = new TrabajadorProyecto();
    EmpresasDelegate empresasDel = new EmpresasDelegate();

    public TrabajadorProyectoUI() {
        initComponents();
        llenarTodo();
        llenarComboEmpresas();
        llenarComboEmpresas2();
    }

    private void llenarTodo() {

        TrabajadoresProyectosDelegate del = new TrabajadoresProyectosDelegate();
        TrabajadorProyecto dto;
        try {
            String[] columnas = {"id", "Profesion", "Hrs", "Descripcion"};
            List lista;
            int fila = -1;
            Object[][] data = new Object[del.findAll().size()][4];
            del = new TrabajadoresProyectosDelegate();
            lista = del.findAll();
//fac.listaVendedores();
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                dto = (TrabajadorProyecto) it.next();
                fila++;
                data[fila][0] = dto.getId();
                data[fila][1] = dto;
                data[fila][2] = dto.getHorasTrabajadas();
                data[fila][3] = dto.getDescripcion();
                

            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
        } catch (Exception ex) {
            Logger.getLogger(TrabajadorProyectoUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void llenarComboEmpresas() {
        TrabajadoresDelegate del = new TrabajadoresDelegate();
        try {
            List lista = del.findAll();
            jComboBox1Trabajadores.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (Exception ex) {
            Logger.getLogger(ProyectoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void llenarComboEmpresas2() {
        ProyectoDelegate del = new ProyectoDelegate();
        try {
            List lista = del.findAll();
            jComboBox2Proyecto.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (Exception ex) {
            Logger.getLogger(ProyectoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1Trabajadores = new javax.swing.JComboBox<>();
        jComboBox2Proyecto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1Profesion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2Hrs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Des = new javax.swing.JTextField();
        jButton1Crear = new javax.swing.JButton();
        jButton1buscar = new javax.swing.JButton();
        jButton1Actualizar = new javax.swing.JButton();
        jButton2Delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1Id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel1.setText("Profesion:");

        jLabel2.setText("Hrs Trabajadas:");

        jLabel3.setText("Descripcion: ");

        jButton1Crear.setText("Crear");
        jButton1Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CrearActionPerformed(evt);
            }
        });

        jButton1buscar.setText("buscar");
        jButton1buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1buscarActionPerformed(evt);
            }
        });

        jButton1Actualizar.setText("Actualizar");
        jButton1Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarActionPerformed(evt);
            }
        });

        jButton2Delete.setText("Delete");
        jButton2Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2DeleteActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1Des))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1Id)
                                        .addComponent(jTextField1Profesion, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1Trabajadores, 0, 104, Short.MAX_VALUE)
                            .addComponent(jComboBox2Proyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1Crear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1buscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1Actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2Delete)
                                .addGap(73, 73, 73)
                                .addComponent(jButton1)))
                        .addGap(0, 112, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jComboBox1Trabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1Profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2Proyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1Des, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Crear)
                    .addComponent(jButton1buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Actualizar)
                    .addComponent(jButton2Delete)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2DeleteActionPerformed
        del = new TrabajadoresProyectosDelegate();
        dto = new TrabajadorProyecto();
        try {
            dto.setId(Integer.parseInt(jTextField1Id.getText()));
            del.deleteById(dto.getId());
            llenarTodo();
            JOptionPane.showConfirmDialog(this, "Registro Eliminado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2DeleteActionPerformed

    private void jButton1CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CrearActionPerformed
        // TODO add your handling code here:
        del = new TrabajadoresProyectosDelegate();
        dto = new TrabajadorProyecto();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        java.util.Date date;
        try {
            date = sdf.parse(jTextField2Hrs.getText());

            dto.setHorasTrabajadas(new java.sql.Date(date.getTime()));

        } catch (Exception e) {
        }
        // SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        // sdf.parse(jTextField2Hrs.getText());
        dto.setDescripcion(jTextField1Des.getText());
        dto.setProfesion(jTextField1Profesion.getText());
        dto.setProyecto((Proyecto) jComboBox2Proyecto.getSelectedItem());
        dto.setTrabajadores((Trabajadores) jComboBox1Trabajadores.getSelectedItem());
        del.persist(dto);
        llenarTodo();
        JOptionPane.showConfirmDialog(this, "Registro Creado", "Aviso del sistema",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();


    }//GEN-LAST:event_jButton1CrearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1buscarActionPerformed
        // TODO add your handling code here:
        del = new TrabajadoresProyectosDelegate();
        try {
            dto = del.findById(Integer.parseInt(jTextField1Id.getText()));
            set(dto);
            llenarTodo();
            JOptionPane.showConfirmDialog(this, "Registro Encontrado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            //  limpiarCampos();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1buscarActionPerformed

    private void jButton1ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarActionPerformed
        del = new TrabajadoresProyectosDelegate();
        dto = new TrabajadorProyecto();
        try {
            dto = get();
            dto.setId(Integer.parseInt(jTextField1Id.getText()));

            del.update(dto);
            llenarTodo();
            JOptionPane.showConfirmDialog(this, "Registro Actualizado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActualizarActionPerformed
    private void set(TrabajadorProyecto dto) {
        jTextField1Des.setText(dto.getDescripcion());
        jTextField1Profesion.setText(dto.getProfesion());
        jTextField2Hrs.setText(String.valueOf(dto.getHorasTrabajadas()));

    }

    public void limpiarCampos() {
        jTextField1Des.setText("");
        jTextField1Id.setText("");
        jTextField1Profesion.setText("");
        jTextField2Hrs.setText("");
    }

    public TrabajadorProyecto get() {
        TrabajadorProyecto dto = new TrabajadorProyecto();
        dto.setDescripcion(jTextField1Des.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        java.util.Date date;
        try {
            date = sdf.parse(jTextField2Hrs.getText());

            dto.setHorasTrabajadas(new java.sql.Date(date.getTime()));

        } catch (Exception e) {
        }
        dto.setProfesion(jTextField1Profesion.getText());
        dto.setProyecto((Proyecto) jComboBox2Proyecto.getSelectedItem());
        dto.setTrabajadores((Trabajadores) jComboBox1Trabajadores.getSelectedItem());
        return dto;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Actualizar;
    private javax.swing.JButton jButton1Crear;
    private javax.swing.JButton jButton1buscar;
    private javax.swing.JButton jButton2Delete;
    private javax.swing.JComboBox<String> jComboBox1Trabajadores;
    private javax.swing.JComboBox<String> jComboBox2Proyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Des;
    private javax.swing.JTextField jTextField1Id;
    private javax.swing.JTextField jTextField1Profesion;
    private javax.swing.JTextField jTextField2Hrs;
    // End of variables declaration//GEN-END:variables
}
