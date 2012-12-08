package edu.pe.benedicto.sistema.adacsis.bean;
/**
 * @author Cesar Miguel Illesca Cangalaya
 */
public class Venta {
    private String strPv_venta;
    private GrupoEstudio objPv_grupo;
    private Cliente objPv_cliente;

    public Cliente getObjPv_cliente() {
        return objPv_cliente;
    }

    public void setObjPv_cliente(Cliente objPv_cliente) {
        this.objPv_cliente = objPv_cliente;
    }

    public GrupoEstudio getObjPv_grupo() {
        return objPv_grupo;
    }

    public void setObjPv_grupo(GrupoEstudio objPv_grupo) {
        this.objPv_grupo = objPv_grupo;
    }

    public String getStrPv_venta() {
        return strPv_venta;
    }

    public void setStrPv_venta(String strPv_venta) {
        this.strPv_venta = strPv_venta;
    }
    
    
}
