package edu.pe.benedicto.sistema.adacsis.model;

import edu.pe.benedicto.sistema.adacsis.bean.Cliente;
import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import java.util.ArrayList;
import java.util.List;


public class ClienteDao {
    public static List<Cliente> objL_listaCliente = new ArrayList<Cliente>();
    
    public boolean filtrarProspecto(Prospecto objA_entidad){        
        boolean sw = false;
        ProspectoDao objProspecto = new ProspectoDao();
        for(Cliente objL_cliente : ClienteDao.objL_listaCliente){ 
            if (objProspecto.filtrarProspecto(objA_entidad,objL_cliente.getObjPv_prospecto())){                       
                sw = true;break;
            }                        
        }
        return sw; 
    }
    
    public List<Cliente> filtrar(Cliente objA_cliente){
        List<Cliente> objL_listaClienteT = new ArrayList<Cliente>();
        ProspectoDao objProspecto = new ProspectoDao();
        for(Cliente objL_cliente : ClienteDao.objL_listaCliente){ 
            if (objProspecto.filtrar(objL_cliente.getObjPv_prospecto()) != null){
                objL_listaClienteT.add(objL_cliente);
            }
        }
        return objL_listaClienteT.isEmpty() ? null : objL_listaClienteT;
    }
    
    public boolean insertar(Cliente objA_entidad){    
        ProspectoDao objL_prospecto = new ProspectoDao();
        boolean sw = false;
        if (! objL_prospecto.filtrarProspecto( objA_entidad.getObjPv_prospecto() ) ){
            sw = ClienteDao.objL_listaCliente.add(objA_entidad);
        }        
        return sw;
    }
    
    public boolean eliminar(Cliente objA_entidad){        
        return ClienteDao.objL_listaCliente.remove(objA_entidad);
    }
    
    public boolean actualizar(int intA_index, Cliente objA_entidad){                
        return ClienteDao.objL_listaCliente.set(intA_index,objA_entidad) != null ;
    }
}
