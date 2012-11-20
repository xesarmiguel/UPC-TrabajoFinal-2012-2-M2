/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.bean;

/**
 *
 * @author Admin
 */
public class Prospecto {
    private String strPv_cidProspecto;
    private Persona objPv_persona;
    
    public Prospecto(){
        
    }

    public Prospecto(String strPv_cidProspecto, Persona objPv_persona) {
        this.strPv_cidProspecto = strPv_cidProspecto;
        this.objPv_persona = objPv_persona;
    }        

    public String getStrPv_cidProspecto() {
        return strPv_cidProspecto;
    }

    public void setStrPv_cidProspecto(String strPv_cidProspecto) {
        this.strPv_cidProspecto = strPv_cidProspecto;
    }

    public Persona getObjPv_persona() {
        return objPv_persona;
    }

    public void setObjPv_persona(Persona objPv_persona) {
        this.objPv_persona = objPv_persona;
    }
    
    
}
