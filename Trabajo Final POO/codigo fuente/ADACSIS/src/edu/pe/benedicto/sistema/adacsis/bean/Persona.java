/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.bean;

/**
 *
 * @author Admin
 */
public class Persona {
    private Long   lngPv_nidPersona;
    private String strPv_nombre;
    private String strPv_apellidoPaterno;
    private String strPv_apellidoMaterno;
    private String strPv_dni;
    private String strPv_telefono;
    private String strPv_celular;
    private String strPv_email;

    public Persona(Long lngPv_nidPersona, String strPv_nombre, String strPv_apellidoPaterno, String strPv_apellidoMaterno, String strPv_dni, String strPv_telefono, String strPv_celular, String strPv_email) {
        this.lngPv_nidPersona = lngPv_nidPersona;
        this.strPv_nombre = strPv_nombre;
        this.strPv_apellidoPaterno = strPv_apellidoPaterno;
        this.strPv_apellidoMaterno = strPv_apellidoMaterno;
        this.strPv_dni = strPv_dni;
        this.strPv_telefono = strPv_telefono;
        this.strPv_celular = strPv_celular;
        this.strPv_email = strPv_email;
    }        

    public Long getStrPv_cidPersona() {
        return lngPv_nidPersona;
    }

    public void setStrPv_cidPersona(Long lngPv_nidPersona) {
        this.lngPv_nidPersona = lngPv_nidPersona;
    }

    public String getStrPv_nombre() {
        return strPv_nombre;
    }

    public void setStrPv_nombre(String strPv_nombre) {
        this.strPv_nombre = strPv_nombre;
    }

    public String getStrPv_apellidoPaterno() {
        return strPv_apellidoPaterno;
    }

    public void setStrPv_apellidoPaterno(String strPv_apellidoPaterno) {
        this.strPv_apellidoPaterno = strPv_apellidoPaterno;
    }

    public String getStrPv_apellidoMaterno() {
        return strPv_apellidoMaterno;
    }

    public void setStrPv_apellidoMaterno(String strPv_apellidoMaterno) {
        this.strPv_apellidoMaterno = strPv_apellidoMaterno;
    }

    public String getStrPv_dni() {
        return strPv_dni;
    }

    public void setStrPv_dni(String strPv_dni) {
        this.strPv_dni = strPv_dni;
    }

    public String getStrPv_telefono() {
        return strPv_telefono;
    }

    public void setStrPv_telefono(String strPv_telefono) {
        this.strPv_telefono = strPv_telefono;
    }

    public String getStrPv_celular() {
        return strPv_celular;
    }

    public void setStrPv_celular(String strPv_celular) {
        this.strPv_celular = strPv_celular;
    }

    public String getStrPv_email() {
        return strPv_email;
    }

    public void setStrPv_email(String strPv_email) {
        this.strPv_email = strPv_email;
    }
    
    
}
