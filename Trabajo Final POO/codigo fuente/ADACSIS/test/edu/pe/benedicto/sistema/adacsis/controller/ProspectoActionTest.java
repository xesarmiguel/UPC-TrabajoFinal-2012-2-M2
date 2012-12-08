/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pe.benedicto.sistema.adacsis.controller;

import edu.pe.benedicto.sistema.adacsis.view.ClienteForm;
import edu.pe.benedicto.sistema.adacsis.view.ProspectoForm;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WINDOWS 7
 */
public class ProspectoActionTest {
    
    public ProspectoActionTest() {
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
    public void insertSuccess(){
        
        ProspectoAction objL_prospectoAction = new ProspectoAction();          
        ProspectoForm objL_prospecto = new ProspectoForm();
        
        objL_prospecto.setStrPv_nombre("miguel");
        objL_prospecto.setStrPv_apellidoPaterno("illesca");
        objL_prospecto.setStrPv_apellidoMaterno("cangalaya");
        objL_prospecto.setStrPv_celular("982350260");
        objL_prospecto.setStrPv_dni("46229036");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        assertEquals(1,objL_prospectoAction.insertar(objL_prospecto));
    }
    @Test
    public void insertFailedNombre(){
        
        ProspectoAction objL_prospectoAction = new ProspectoAction();          
        ProspectoForm objL_prospecto = new ProspectoForm();
        
        objL_prospecto.setStrPv_nombre("");
        objL_prospecto.setStrPv_apellidoPaterno("illesca");
        objL_prospecto.setStrPv_apellidoMaterno("cangalaya");
        objL_prospecto.setStrPv_celular("982350260");
        objL_prospecto.setStrPv_dni("46229036");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        assertEquals(-1,objL_prospectoAction.insertar(objL_prospecto));
    }    
    @Test
    public void insertFailedPaterno(){
        
        ProspectoAction objL_prospectoAction = new ProspectoAction();          
        ProspectoForm objL_prospecto = new ProspectoForm();
        
        objL_prospecto.setStrPv_nombre("cesar");
        objL_prospecto.setStrPv_apellidoPaterno("");
        objL_prospecto.setStrPv_apellidoMaterno("cangalaya");
        objL_prospecto.setStrPv_celular("982350260");
        objL_prospecto.setStrPv_dni("46229036");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        assertEquals(-2,objL_prospectoAction.insertar(objL_prospecto));
    }
    @Test
    public void insertFailedEmail(){
        
        ProspectoAction objL_prospectoAction = new ProspectoAction();          
        ProspectoForm objL_prospecto = new ProspectoForm();
        
        objL_prospecto.setStrPv_nombre("cesar");
        objL_prospecto.setStrPv_apellidoPaterno("dillesca");
        objL_prospecto.setStrPv_apellidoMaterno("dcangalaya");
        objL_prospecto.setStrPv_celular("282350260");
        objL_prospecto.setStrPv_dni("36229036");
        objL_prospecto.setStrPv_email("");
        objL_prospecto.setStrPv_telefono("2480201");
        
        assertEquals(-3,objL_prospectoAction.insertar(objL_prospecto));
    }
    
    @Test
    public void findSuccess(){
        
        ProspectoAction objL_prospectoAction = new ProspectoAction();          
        ProspectoForm objL_prospecto = new ProspectoForm();
        
        objL_prospecto.setStrPv_nombre("cesar");
        objL_prospecto.setStrPv_apellidoPaterno("illesca");
        objL_prospecto.setStrPv_apellidoMaterno("cangalaya");
        objL_prospecto.setStrPv_celular("982350260");
        objL_prospecto.setStrPv_dni("46229036");
        objL_prospecto.setStrPv_email("cillesca@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        objL_prospectoAction.insertar(objL_prospecto);
        
        ProspectoForm objL_prospecto_filtrar = new ProspectoForm();        
        objL_prospecto_filtrar.setStrPv_nombre("cesar");  
        objL_prospecto_filtrar.setStrPv_apellidoPaterno("");
        objL_prospecto_filtrar.setStrPv_apellidoMaterno("");
        objL_prospecto_filtrar.setStrPv_celular("");
        objL_prospecto_filtrar.setStrPv_dni("");
        objL_prospecto_filtrar.setStrPv_email("");
        objL_prospecto_filtrar.setStrPv_telefono("");
                      
        assertNotNull(objL_prospectoAction.filtrar(objL_prospecto_filtrar));
    }
    
    @Test
    public void findFailed(){
        
        ProspectoAction objL_prospectoAction = new ProspectoAction();          
        ProspectoForm objL_prospecto = new ProspectoForm();
        
        objL_prospecto.setStrPv_nombre("juan");
        objL_prospecto.setStrPv_apellidoPaterno("peres");
        objL_prospecto.setStrPv_apellidoMaterno("alvaro");
        objL_prospecto.setStrPv_celular("982350262");
        objL_prospecto.setStrPv_dni("46229046");
        objL_prospecto.setStrPv_email("jalcva@tecnosix.com.pe");
        objL_prospecto.setStrPv_telefono("2880201");
        
        objL_prospectoAction.insertar(objL_prospecto);
        
        ProspectoForm objL_prospecto_filtrar = new ProspectoForm();        
        objL_prospecto_filtrar.setStrPv_nombre("cesar no esta");  
        objL_prospecto_filtrar.setStrPv_apellidoPaterno("");
        objL_prospecto_filtrar.setStrPv_apellidoMaterno("");
        objL_prospecto_filtrar.setStrPv_celular("");
        objL_prospecto_filtrar.setStrPv_dni("");
        objL_prospecto_filtrar.setStrPv_email("");
        objL_prospecto_filtrar.setStrPv_telefono("");
                      
        assertNull(objL_prospectoAction.filtrar(objL_prospecto_filtrar));
    }
    
    @Test
    public void insertClienteExist(){
        
        ClienteAction objL_clienteAction = new ClienteAction();    
        ProspectoAction objL_prospectoAction = new ProspectoAction();
        ClienteForm objL_cliente = new ClienteForm();
        ProspectoForm objL_prospecto = new ProspectoForm();
                
        objL_prospecto.setStrPv_nombre("miguelz");
        objL_prospecto.setStrPv_apellidoPaterno("illescaz");
        objL_prospecto.setStrPv_apellidoMaterno("cangalayaz");
        objL_prospecto.setStrPv_celular("982350261");
        objL_prospecto.setStrPv_dni("46229031");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pez");
        objL_prospecto.setStrPv_telefono("2880233");
        
        objL_prospectoAction.insertar(objL_prospecto);
        
        objL_cliente.setStrPv_nombre("miguel");
        objL_cliente.setStrPv_apellidoPaterno("illesca");
        objL_cliente.setStrPv_apellidoMaterno("cangalaya");
        objL_cliente.setStrPv_celular("982350260");
        objL_cliente.setStrPv_dni("46229036");
        objL_cliente.setStrPv_email("miguel@tecnosix.com.pe");
        objL_cliente.setStrPv_telefono("2880201");
        
        objL_clienteAction.insertar(objL_cliente);
        
        objL_prospecto.setStrPv_nombre("miguelz");
        objL_prospecto.setStrPv_apellidoPaterno("illescaz");
        objL_prospecto.setStrPv_apellidoMaterno("cangalayaz");
        objL_prospecto.setStrPv_celular("982350261");
        objL_prospecto.setStrPv_dni("46229031");
        objL_prospecto.setStrPv_email("miguel@tecnosix.com.pez");
        objL_prospecto.setStrPv_telefono("2880233");
        
        assertEquals(0,objL_prospectoAction.insertar(objL_prospecto));
        
    }
}
