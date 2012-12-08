package edu.pe.benedicto.sistema.adacsis.bean;
/**
 * @author Cesar Miguel Illesca Cangalaya
 */
public class Prospecto extends Persona {
    private String strPv_cidProspecto;    
    
    public Prospecto(){
        
    }

    public Prospecto(String strPv_cidProspecto) {
        this.strPv_cidProspecto = strPv_cidProspecto;        
    }        

    public String getStrPv_cidProspecto() {
        return strPv_cidProspecto;
    }

    public void setStrPv_cidProspecto(String strPv_cidProspecto) {
        this.strPv_cidProspecto = strPv_cidProspecto;
    }
    
}
