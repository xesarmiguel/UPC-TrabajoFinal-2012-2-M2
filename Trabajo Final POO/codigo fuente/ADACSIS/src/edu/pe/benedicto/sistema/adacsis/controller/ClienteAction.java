package edu.pe.benedicto.sistema.adacsis.controller;

import edu.pe.benedicto.sistema.adacsis.bean.Cliente;
import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import edu.pe.benedicto.sistema.adacsis.model.ClienteDao;
import edu.pe.benedicto.sistema.adacsis.view.ClienteForm;
import java.util.List;

public class ClienteAction {
    public List<Cliente> filtrar(ClienteForm objA_form){     
        Cliente objL_cliente = new Cliente();      
        ClienteDao objL_clienteDao = new ClienteDao();
        
        Prospecto objL_prospecto = new Prospecto();      
        // Setiamos los valores de la vista
        objL_prospecto.setStrPv_apellidoMaterno(objA_form.getStrPv_apellidoMaterno());
        objL_prospecto.setStrPv_apellidoPaterno(objA_form.getStrPv_apellidoPaterno());
        objL_prospecto.setStrPv_nombre(objA_form.getStrPv_nombre());
        objL_prospecto.setStrPv_celular(objA_form.getStrPv_celular());
        objL_prospecto.setStrPv_dni(objA_form.getStrPv_dni());
        objL_prospecto.setStrPv_email(objA_form.getStrPv_email());
        objL_prospecto.setStrPv_telefono(objA_form.getStrPv_telefono());
        
        objL_cliente.setObjPv_prospecto(objL_prospecto);
        
        return objL_clienteDao.filtrar(objL_cliente);
    }
    
    public int insertar(ClienteForm objA_form){
        int intL_result = 0;        
        // Insertamos el cliente
        Prospecto objL_prospecto = new Prospecto();      
        // Setiamos los valores de la vista
        objL_prospecto.setStrPv_apellidoMaterno(objA_form.getStrPv_apellidoMaterno());
        objL_prospecto.setStrPv_apellidoPaterno(objA_form.getStrPv_apellidoPaterno());
        objL_prospecto.setStrPv_nombre(objA_form.getStrPv_nombre());
        objL_prospecto.setStrPv_celular(objA_form.getStrPv_celular());
        objL_prospecto.setStrPv_dni(objA_form.getStrPv_dni());
        objL_prospecto.setStrPv_email(objA_form.getStrPv_email());
        objL_prospecto.setStrPv_telefono(objA_form.getStrPv_telefono());                
        
        Cliente objL_cliente = new Cliente();  
        
        objL_cliente.setObjPv_prospecto(objL_prospecto);
        
        ClienteDao objL_clienteDao = new ClienteDao();
        if (objL_clienteDao.insertar(objL_cliente)){
            intL_result = 1;
        }
        return intL_result;
    }
    
}
