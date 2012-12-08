package edu.pe.benedicto.sistema.adacsis.bean;
/**
 * @author Cesar Miguel Illesca Cangalaya
 */
public class Cliente {
    
    private Prospecto objPv_prospecto;
    private String strPv_codigo;
    private int flgPv_estado;

    public int getFlgPv_estado() {
        return flgPv_estado;
    }

    public void setFlgPv_estado(int flgPv_estado) {
        this.flgPv_estado = flgPv_estado;
    }

    public Prospecto getObjPv_prospecto() {
        return objPv_prospecto;
    }

    public void setObjPv_prospecto(Prospecto objPv_prospecto) {
        this.objPv_prospecto = objPv_prospecto;
    }

    public String getStrPv_codigo() {
        return strPv_codigo;
    }

    public void setStrPv_codigo(String strPv_codigo) {
        this.strPv_codigo = strPv_codigo;
    }
    
    
    
}
