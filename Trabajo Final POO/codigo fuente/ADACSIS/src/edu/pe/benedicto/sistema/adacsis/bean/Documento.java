package edu.pe.benedicto.sistema.adacsis.bean;

import java.util.Date;

/**
 * @author Cesar Miguel Illesca Cangalaya
 */
public class Documento {
    private Date datPv_fechaPago;
    private double dblPv_igv;
    private double dblPv_subTotal;
    private String strPv_concepto;
    private String strPv_moneda;
    private Evento objPv_Evento;

    public Date getDatPv_fechaPago() {
        return datPv_fechaPago;
    }

    public void setDatPv_fechaPago(Date datPv_fechaPago) {
        this.datPv_fechaPago = datPv_fechaPago;
    }

    public double getDblPv_igv() {
        return dblPv_igv;
    }

    public void setDblPv_igv(double dblPv_igv) {
        this.dblPv_igv = dblPv_igv;
    }

    public double getDblPv_subTotal() {
        return dblPv_subTotal;
    }

    public void setDblPv_subTotal(double dblPv_subTotal) {
        this.dblPv_subTotal = dblPv_subTotal;
    }

    public Evento getObjPv_Evento() {
        return objPv_Evento;
    }

    public void setObjPv_Evento(Evento objPv_Evento) {
        this.objPv_Evento = objPv_Evento;
    }

    public String getStrPv_concepto() {
        return strPv_concepto;
    }

    public void setStrPv_concepto(String strPv_concepto) {
        this.strPv_concepto = strPv_concepto;
    }

    public String getStrPv_moneda() {
        return strPv_moneda;
    }

    public void setStrPv_moneda(String strPv_moneda) {
        this.strPv_moneda = strPv_moneda;
    }
    
    
}
