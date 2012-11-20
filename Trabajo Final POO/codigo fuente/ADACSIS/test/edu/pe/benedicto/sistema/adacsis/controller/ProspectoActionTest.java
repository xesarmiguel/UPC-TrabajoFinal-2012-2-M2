/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.controller;

import edu.pe.benedicto.sistema.adacsis.bean.Persona;
import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import edu.pe.benedicto.sistema.adacsis.view.ProspectoForm;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class ProspectoActionTest {
    
    @Test
    public void filtrar(ProspectoForm objA_form){
        ProspectoAction objL_prospectoAction = new ProspectoAction();                       
        assertTrue(objL_prospectoAction.filtrar(objA_form));
    }
    
    public void insertar(ProspectoForm objA_form){
        ProspectoAction objL_prospectoAction = new ProspectoAction();                       
        assertTrue(objL_prospectoAction.insertar(objA_form));
    }
    

}
