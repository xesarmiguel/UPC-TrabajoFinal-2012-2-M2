package edu.pe.benedicto.sistema.adacsis.bean;

import java.util.Date;
import java.util.List;

/**
 * @author Cesar Miguel Illesca Cangalaya
 */
public class GrupoEstudio {
    private Date datPv_fechaFin;
    private Date datPv_fechaInicio;
    private int  intPv_estado;
    private String strPv_academia;
    private String strPv_curso;
    private String strPv_descripcion;
    private String strPv_nombre;
    private String strPv_silabus;
    private List<Instructor> objPv_listaInstructores;

    public Date getDatPv_fechaFin() {
        return datPv_fechaFin;
    }

    public void setDatPv_fechaFin(Date datPv_fechaFin) {
        this.datPv_fechaFin = datPv_fechaFin;
    }

    public Date getDatPv_fechaInicio() {
        return datPv_fechaInicio;
    }

    public void setDatPv_fechaInicio(Date datPv_fechaInicio) {
        this.datPv_fechaInicio = datPv_fechaInicio;
    }

    public int getIntPv_estado() {
        return intPv_estado;
    }

    public void setIntPv_estado(int intPv_estado) {
        this.intPv_estado = intPv_estado;
    }

    public List<Instructor> getObjPv_listaInstructores() {
        return objPv_listaInstructores;
    }

    public void setObjPv_listaInstructores(List<Instructor> objPv_listaInstructores) {
        this.objPv_listaInstructores = objPv_listaInstructores;
    }

    public String getStrPv_academia() {
        return strPv_academia;
    }

    public void setStrPv_academia(String strPv_academia) {
        this.strPv_academia = strPv_academia;
    }

    public String getStrPv_curso() {
        return strPv_curso;
    }

    public void setStrPv_curso(String strPv_curso) {
        this.strPv_curso = strPv_curso;
    }

    public String getStrPv_descripcion() {
        return strPv_descripcion;
    }

    public void setStrPv_descripcion(String strPv_descripcion) {
        this.strPv_descripcion = strPv_descripcion;
    }

    public String getStrPv_nombre() {
        return strPv_nombre;
    }

    public void setStrPv_nombre(String strPv_nombre) {
        this.strPv_nombre = strPv_nombre;
    }

    public String getStrPv_silabus() {
        return strPv_silabus;
    }

    public void setStrPv_silabus(String strPv_silabus) {
        this.strPv_silabus = strPv_silabus;
    }
    
    
}
