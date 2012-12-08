package edu.pe.benedicto.sistema.adacsis.bean;

import java.util.Date;

/**
 * @author Cesar Miguel Illesca Cangalaya
 */
public class Evento {
    
    public static final int NUEVO = 1;
    public static final int ANULADO = 2;
    public static final int CANCELADO = 3;
    
    private Date datPv_fechaEmision;
    private int  intPv_estado;
    private double dblPv_mont;

    public Date getDatPv_fechaEmision() {
        return datPv_fechaEmision;
    }

    public void setDatPv_fechaEmision(Date datPv_fechaEmision) {
        this.datPv_fechaEmision = datPv_fechaEmision;
    }

    public double getDblPv_mont() {
        return dblPv_mont;
    }

    public void setDblPv_mont(double dblPv_mont) {
        this.dblPv_mont = dblPv_mont;
    }

    public int getIntPv_estado() {
        return intPv_estado;
    }

    public void setIntPv_estado(int intPv_estado) {
        this.intPv_estado = intPv_estado;
    }
    
}
