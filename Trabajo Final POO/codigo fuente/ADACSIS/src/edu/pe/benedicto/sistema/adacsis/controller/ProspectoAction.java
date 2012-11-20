/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.controller;

import edu.pe.benedicto.sistema.adacsis.bean.Persona;
import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import edu.pe.benedicto.sistema.adacsis.model.ProspectoDao;
import edu.pe.benedicto.sistema.adacsis.view.ProspectoForm;

/**
 *
 * @author Admin
 */
public class ProspectoAction {
    public boolean filtrar(ProspectoForm objA_form){
        //-DATOS ------------------------------------------------
        objA_form.setStrPv_nombre("Cesar Miguel");
        objA_form.setStrPv_apellidoMaterno("Cangalaya");
        objA_form.setStrPv_apellidoPaterno("Illesca");
        objA_form.setStrPv_celular("982350260");
        objA_form.setStrPv_dni("46229036");
        objA_form.setStrPv_email("miguelhades@hotmail.com");        
        //-------------------------------------------------------
        Prospecto objL_prospecto = new Prospecto();
        Persona objL_persona = new Persona();
        // Setiamos los valores de la vista
        objL_persona.setStrPv_apellidoMaterno(objA_form.getStrPv_apellidoMaterno());
        objL_persona.setStrPv_apellidoPaterno(objA_form.getStrPv_apellidoPaterno());
        objL_persona.setStrPv_nombre(objA_form.getStrPv_nombre());
        objL_persona.setStrPv_celular(objA_form.getStrPv_celular());
        objL_persona.setStrPv_dni(objA_form.getStrPv_celular());
        objL_persona.setStrPv_email(objA_form.getStrPv_email());
        // Insertamos a la persona con el prospecto
        objL_prospecto.setObjPv_persona(objL_persona);
        // Insertamos el prospecto
        ProspectoDao objL_prospectoDao = new ProspectoDao();
        return objL_prospectoDao.filtrar(objL_prospecto);
    }
    
    public boolean insertar(ProspectoForm objA_form){
        //-DATOS ------------------------------------------------
        objA_form.setStrPv_nombre("Cesar Miguel");
        objA_form.setStrPv_apellidoMaterno("Cangalaya");
        objA_form.setStrPv_apellidoPaterno("Illesca");
        objA_form.setStrPv_celular("982350260");
        objA_form.setStrPv_dni("46229036");
        objA_form.setStrPv_email("miguelhades@hotmail.com");        
        //-------------------------------------------------------
        Prospecto objL_prospecto = new Prospecto();
        Persona objL_persona = new Persona();
        // Setiamos los valores de la vista
        objL_persona.setStrPv_apellidoMaterno(objA_form.getStrPv_apellidoMaterno());
        objL_persona.setStrPv_apellidoPaterno(objA_form.getStrPv_apellidoPaterno());
        objL_persona.setStrPv_nombre(objA_form.getStrPv_nombre());
        objL_persona.setStrPv_celular(objA_form.getStrPv_celular());
        objL_persona.setStrPv_dni(objA_form.getStrPv_celular());
        objL_persona.setStrPv_email(objA_form.getStrPv_email());
        // Insertamos a la persona con el prospecto
        objL_prospecto.setObjPv_persona(objL_persona);
        // Insertamos el prospecto
        ProspectoDao objL_prospectoDao = new ProspectoDao();
        return objL_prospectoDao.insertar(objL_prospecto);
    }
    
}
