/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.controller;

import edu.pe.benedicto.sistema.adacsis.bean.Persona;
import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import edu.pe.benedicto.sistema.adacsis.model.ProspectoDao;
import edu.pe.benedicto.sistema.adacsis.view.ProspectoForm;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProspectoAction {
    public List<Prospecto> filtrar(ProspectoForm objA_form){     
        Prospecto objL_prospecto = new Prospecto();      
        // Setiamos los valores de la vista
        objL_prospecto.setStrPv_apellidoMaterno(objA_form.getStrPv_apellidoMaterno());
        objL_prospecto.setStrPv_apellidoPaterno(objA_form.getStrPv_apellidoPaterno());
        objL_prospecto.setStrPv_nombre(objA_form.getStrPv_nombre());
        objL_prospecto.setStrPv_celular(objA_form.getStrPv_celular());
        objL_prospecto.setStrPv_dni(objA_form.getStrPv_dni());
        objL_prospecto.setStrPv_email(objA_form.getStrPv_email());
        objL_prospecto.setStrPv_telefono(objA_form.getStrPv_telefono());
        // Insertamos el prospecto
        ProspectoDao objL_prospectoDao = new ProspectoDao();
        return objL_prospectoDao.filtrar(objL_prospecto);
    }
    
    public int insertar(ProspectoForm objA_form){
        int intL_result = 0;
        Prospecto objL_prospecto = new Prospecto();        
        // Setiamos los valores de la vista
        objL_prospecto.setStrPv_apellidoMaterno(objA_form.getStrPv_apellidoMaterno());
        objL_prospecto.setStrPv_apellidoPaterno(objA_form.getStrPv_apellidoPaterno());
        objL_prospecto.setStrPv_nombre(objA_form.getStrPv_nombre());
        objL_prospecto.setStrPv_celular(objA_form.getStrPv_celular());
        objL_prospecto.setStrPv_dni(objA_form.getStrPv_dni());
        objL_prospecto.setStrPv_email(objA_form.getStrPv_email());   
        objL_prospecto.setStrPv_telefono(objA_form.getStrPv_telefono());
        // Insertamos el prospecto
        ProspectoDao objL_prospectoDao = new ProspectoDao();
        intL_result = validar(objL_prospecto);
        if (intL_result > 0){
            if (objL_prospectoDao.insertar(objL_prospecto)){
                intL_result = 1;
            }else{
                intL_result = 0;
            }
        }
        return intL_result;
    }
    
    private int validar(Prospecto objA_prospecto){
        int intL_result = 0;
        if (objA_prospecto.getStrPv_nombre().equals(""))
            intL_result = -1;
        else if (objA_prospecto.getStrPv_apellidoPaterno().equals(""))
            intL_result = -2;
        else if (objA_prospecto.getStrPv_email().equals(""))
            intL_result = -3;
        else 
            intL_result = 1;
        return intL_result;
    }
    
}
