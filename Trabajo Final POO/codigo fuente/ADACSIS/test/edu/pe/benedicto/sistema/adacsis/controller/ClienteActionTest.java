/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.controller;

import edu.pe.benedicto.sistema.adacsis.view.ProspectoForm;
import edu.pe.benedicto.sistema.adacsis.view.ClienteForm;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINDOWS 7
 */
public class ClienteActionTest {
    
    public ClienteActionTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test
    public void testSomeMethod() {
    }
    @Test
    public void insertFailedPropectoNotExist(){
        
        ClienteAction objL_clienteAction = new ClienteAction();          
        ClienteForm objL_prospecto = new ClienteForm();
        
        objL_prospecto.setStrPv_nombre("miguel");
        objL_prospecto.setStrPv_apellidoPaterno("illesca");
        objL_prospecto.setStrPv_apellidoMaterno("cangalaya");
        objL_prospecto.setStrPv_celular("982350260");
        objL_prospecto.setStrPv_dni("46229036");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        assertEquals(0,objL_clienteAction.insertar(objL_prospecto));
    }
    
    @Test
    public void insertSuccess(){
        
        ClienteAction objL_clienteAction = new ClienteAction();    
        ProspectoAction objL_prospectoAction = new ProspectoAction();
        ClienteForm objL_cliente = new ClienteForm();
        ProspectoForm objL_prospecto = new ProspectoForm();
                
        objL_prospecto.setStrPv_nombre("miguel");
        objL_prospecto.setStrPv_apellidoPaterno("illesca");
        objL_prospecto.setStrPv_apellidoMaterno("cangalaya");
        objL_prospecto.setStrPv_celular("982350260");
        objL_prospecto.setStrPv_dni("46229036");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        objL_prospectoAction.insertar(objL_prospecto);
        
        objL_cliente.setStrPv_nombre("miguel");
        objL_cliente.setStrPv_apellidoPaterno("illesca");
        objL_cliente.setStrPv_apellidoMaterno("cangalaya");
        objL_cliente.setStrPv_celular("982350260");
        objL_cliente.setStrPv_dni("46229036");
        objL_cliente.setStrPv_email("miguel@tecnosix.com.pe");
        objL_cliente.setStrPv_telefono("2880201");
        
        assertEquals(1,objL_clienteAction.insertar(objL_cliente));
    }
    
    
    
}
