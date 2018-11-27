/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.PruebasDelegate;

import java.util.List;
import modelo.delegate.TrabajadoresProyectosDelegate;
import modelo.dto.TrabajadorProyecto;
import modelo.formularios.TrabajadorProyectoUI;

/**
 *
 * @author Nate
 */
public class PruebaTrabajadorProyecto {
    public static void main(String[] args) {
        TrabajadorProyectoUI ui=new TrabajadorProyectoUI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
//        TrabajadoresProyectosDelegate del=new TrabajadoresProyectosDelegate();
//        List<TrabajadorProyecto> list=del.findAll();
//        for (TrabajadorProyecto trabajadorProyecto : list) {
//            System.out.println(trabajadorProyecto);
//        }
    }
    
}
