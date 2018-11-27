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
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.delegate.EmpresasDelegate;
import modelo.delegate.ProyectoDelegate;
import modelo.dto.Empresas;
import modelo.dto.Proyecto;

/**
 *
 * @author Nate
 */
public class ProyectoUI extends javax.swing.JFrame {

    ProyectoDelegate del = null;
    Proyecto dto = null;
    EmpresasDelegate empresasDel = new EmpresasDelegate();

    public ProyectoUI() {
        initComponents();
        dto = new Proyecto();
        llenarTodo();
        llenarComboEmpresas();
    }

    private void llenarComboEmpresas() {
        empresasDel = new EmpresasDelegate();
        try {
            List lista = empresasDel.findAll();
            jComboBox1.setModel(new DefaultComboBoxModel(lista.toArray()));

        } catch (Exception ex) {
            Logger.getLogger(ProyectoUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void llenarTodo() {

        ProyectoDelegate del = new ProyectoDelegate();
        Proyecto dto;
        try {
            String[] columnas = {"id", "Nombre", "Fecha Inicial", "Fecha Final", "Fecha Final Real"};
            List lista;
            int fila = -1;
            Object[][] data = new Object[del.findAll().size()][5];
            del = new ProyectoDelegate();
            lista = del.findAll();
//fac.listaVendedores();
            Iterator it = lista.iterator();
            while (it.hasNext()) {
                dto = (Proyecto) it.next();
                fila++;
                data[fila][0] = dto.getId();
                data[fila][1] = dto;
                data[fila][2] = dto.getFechaInicial();
                data[fila][3] = dto.getFechaFinal();
                data[fila][4] = dto.getFechaRealFinal();

            }
            jTable1.setModel(new javax.swing.table.DefaultTableModel(data, columnas));
        } catch (Exception ex) {
            Logger.getLogger(EmpresasUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jTextField1Nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1Inicio = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser2Fin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser3FinReal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1Salir = new javax.swing.JButton();
        jButton1Crear = new javax.swing.JButton();
        jButton1Buscar = new javax.swing.JButton();
        jButton1Actualizar = new javax.swing.JButton();
        jButton1Eliminar = new javax.swing.JButton();
        jTextField1Id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Fecha Inicio: ");

        jLabel3.setText("Fecha Fin:");

        jLabel4.setText("Fecha Fin Real:");

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

        jButton1Salir.setText("Salir");
        jButton1Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SalirActionPerformed(evt);
            }
        });

        jButton1Crear.setText("Crear");
        jButton1Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CrearActionPerformed(evt);
            }
        });

        jButton1Buscar.setText("Buscar");
        jButton1Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BuscarActionPerformed(evt);
            }
        });

        jButton1Actualizar.setText("Actualizar");
        jButton1Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActualizarActionPerformed(evt);
            }
        });

        jButton1Eliminar.setText("Eliminar");
        jButton1Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1EliminarActionPerformed(evt);
            }
        });

        jLabel5.setText("Id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser2Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton1Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateChooser1Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1Actualizar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser3FinReal, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField1Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jDateChooser2Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4))
                            .addComponent(jDateChooser3FinReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Crear)
                            .addComponent(jButton1Actualizar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1Buscar)
                            .addComponent(jButton1Eliminar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CrearActionPerformed
        del = new ProyectoDelegate();
        dto = new Proyecto();
        try {
            dto = getCampos();
            del.persist(dto);
            JOptionPane.showConfirmDialog(this, "Registro Creado", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            llenarTodo();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton1CrearActionPerformed

    private void jButton1BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BuscarActionPerformed
        del = new ProyectoDelegate();
        dto = new Proyecto();
        try {

            dto = del.findById(Integer.parseInt(jTextField1Id.getText()));
            setCampos(dto);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1BuscarActionPerformed

    private void jButton1ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActualizarActionPerformed
        del=new ProyectoDelegate();
        dto = new Proyecto();

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

    private void jButton1EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1EliminarActionPerformed
        del=new ProyectoDelegate();
        dto=new Proyecto();
        if (jTextField1Id.getText().isEmpty()) {
            JOptionPane.showConfirmDialog(this, "Campo vacio", "Aviso del sistema",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        } else {
        try {
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

    private void jButton1SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1SalirActionPerformed
    public void setCampos(Proyecto dto) {
        jTextField1Id.setText(String.valueOf(dto.getId()));
        jTextField1Nombre.setText(dto.getNombre());
        jDateChooser1Inicio.setDate(dto.getFechaInicial());
        jDateChooser2Fin.setDate(dto.getFechaFinal());
        jDateChooser3FinReal.setDate(dto.getFechaRealFinal());
        //jComboBox1.setModel((ComboBoxModel<String>) dto.getEmpresas());
    }

    public void limpiarCampos() {
        jTextField1Id.setText(" ");
        jTextField1Nombre.setText(" ");
        jDateChooser1Inicio.setDate(null);
        jDateChooser2Fin.setDate(null);
        jDateChooser3FinReal.setDate(null);
    }

    public Proyecto getCampos() {
        Proyecto dto = new Proyecto();

        dto.setEmpresas((Empresas) jComboBox1.getSelectedItem());
        dto.setFechaFinal(jDateChooser2Fin.getDate());
        dto.setFechaInicial(jDateChooser1Inicio.getDate());
        dto.setFechaRealFinal(jDateChooser3FinReal.getDate());
        dto.setNombre(jTextField1Nombre.getText());
        return dto;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Actualizar;
    private javax.swing.JButton jButton1Buscar;
    private javax.swing.JButton jButton1Crear;
    private javax.swing.JButton jButton1Eliminar;
    private javax.swing.JButton jButton1Salir;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1Inicio;
    private com.toedter.calendar.JDateChooser jDateChooser2Fin;
    private com.toedter.calendar.JDateChooser jDateChooser3FinReal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1Id;
    private javax.swing.JTextField jTextField1Nombre;
    // End of variables declaration//GEN-END:variables
}
