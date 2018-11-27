/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.PruebasDelegate;

import java.util.List;
import modelo.delegate.EmpresasDelegate;
import modelo.dto.Empresas;
import modelo.formularios.EmpresasUI;
import modelo.formularios.ProyectoUI;

/**
 *
 * @author Nate
 */
public class PruebaEmpresas {
    public static void main(String[] args) {
        
        EmpresasUI ui=new EmpresasUI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
       // EmpresasDelegate del=new EmpresasDelegate();
//        Empresas dto=new Empresas();
//        dto.setCalle("Calle");
//        dto.setColonia("Colonia");
//        dto.setMunicipio("Texcoco");
//        dto.setNombre("Nueva");
//        dto.setRazonSocial("Razon Social");
//        dto.setRfc("rfc");
//        dto.setTelefono("5959595959");
//        del.persist(dto);
//        List<Empresas> list=del.findAll();
//        
//        for (Empresas empresas : list) {
//            System.out.println(empresas);
//        }
    }
    
}
