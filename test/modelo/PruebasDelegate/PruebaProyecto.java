/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.PruebasDelegate;
import java.util.List;
import modelo.delegate.ProyectoDelegate;
import modelo.dto.Proyecto;
import modelo.formularios.ProyectoUI;
/**
 *
 * @author Nate
 */
public class PruebaProyecto {
    public static void main(String[] args) {
              ProyectoUI ui=new ProyectoUI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
//        ProyectoDelegate del=new ProyectoDelegate();
//        List<Proyecto> list=del.findAll();
//        for (Proyecto proyecto : list) {
//            System.out.println(proyecto);
//        }
        
    }
    
}
