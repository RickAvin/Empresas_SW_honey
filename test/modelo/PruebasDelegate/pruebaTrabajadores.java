/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.PruebasDelegate;

import java.util.List;
import modelo.delegate.TrabajadoresDelegate;
import modelo.dto.Trabajadores;

/**
 *
 * @author Nate
 */
public class pruebaTrabajadores {
    public static void main(String[] args) {
        TrabajadoresDelegate del=new  TrabajadoresDelegate();
        List<Trabajadores> list=del.findAll();
        for (Trabajadores trabajadores : list) {
            System.out.println(trabajadores);
        }
    }
    
}
