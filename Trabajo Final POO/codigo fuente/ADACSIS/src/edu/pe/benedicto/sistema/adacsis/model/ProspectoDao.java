package edu.pe.benedicto.sistema.adacsis.model;

import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import java.util.ArrayList;
import java.util.List;

public class ProspectoDao {
    public static List<Prospecto> objL_listaProspecto = new ArrayList<Prospecto>();
    
    public List<Prospecto> filtrar(Prospecto objA_entidad){        
        List<Prospecto> objL_listaProspectoT = new ArrayList<Prospecto>();
        for(Prospecto objL_prospecto : ProspectoDao.objL_listaProspecto){ 
            if (
                    objL_prospecto.getStrPv_nombre().equals(objA_entidad.getStrPv_nombre())
                    ||
                    objL_prospecto.getStrPv_apellidoMaterno().equals(objA_entidad.getStrPv_apellidoMaterno())
                    ||
                    objL_prospecto.getStrPv_apellidoPaterno().equals(objA_entidad.getStrPv_apellidoPaterno())
                    ||
                    objL_prospecto.getStrPv_celular().equals(objA_entidad.getStrPv_celular())
                    ||
                    objL_prospecto.getStrPv_dni().equals(objA_entidad.getStrPv_dni())
                    ||
                    objL_prospecto.getStrPv_telefono().equals(objA_entidad.getStrPv_telefono())
                    
            ){                       
                objL_listaProspectoT.add(objL_prospecto);
            }            
            
        }
        return objL_listaProspectoT.isEmpty() ? null : objL_listaProspectoT; 
    }
    
    public boolean filtrarProspecto(Prospecto objA_entidad, Prospecto objL_prospecto){        
        boolean sw = true;        
            if (
                    objL_prospecto.getStrPv_nombre().equals(objA_entidad.getStrPv_nombre())
                    &&
                    objL_prospecto.getStrPv_apellidoMaterno().equals(objA_entidad.getStrPv_apellidoMaterno())
                    &&
                    objL_prospecto.getStrPv_apellidoPaterno().equals(objA_entidad.getStrPv_apellidoPaterno())
                    &&
                    objL_prospecto.getStrPv_celular().equals(objA_entidad.getStrPv_celular())
                    &&
                    objL_prospecto.getStrPv_dni().equals(objA_entidad.getStrPv_dni())
                    &&
                    objL_prospecto.getStrPv_telefono().equals(objA_entidad.getStrPv_telefono())
                    
            ){                       
                sw = false;
            }                               
        return sw; 
    }
    
    public boolean filtrarProspecto(Prospecto objA_entidad){        
        boolean sw = true;      
        for (Prospecto objL_prospecto : ProspectoDao.objL_listaProspecto){
            if (
                    objL_prospecto.getStrPv_nombre().equals(objA_entidad.getStrPv_nombre())
                    &&
                    objL_prospecto.getStrPv_apellidoMaterno().equals(objA_entidad.getStrPv_apellidoMaterno())
                    &&
                    objL_prospecto.getStrPv_apellidoPaterno().equals(objA_entidad.getStrPv_apellidoPaterno())
                    &&
                    objL_prospecto.getStrPv_celular().equals(objA_entidad.getStrPv_celular())
                    &&
                    objL_prospecto.getStrPv_dni().equals(objA_entidad.getStrPv_dni())
                    &&
                    objL_prospecto.getStrPv_telefono().equals(objA_entidad.getStrPv_telefono())
                    
            ){                       
                sw = false;break;
            }   
        }
        return sw; 
    }
    
    public boolean insertar(Prospecto objA_entidad){           
        boolean sw = false;
        ClienteDao clienteDao = new ClienteDao();
        if (!clienteDao.filtrarProspecto(objA_entidad)){
            sw = ProspectoDao.objL_listaProspecto.add(objA_entidad);
        }
        return sw;
    }
    
    public boolean eliminar(Prospecto objA_entidad){        
        return ProspectoDao.objL_listaProspecto.remove(objA_entidad);
    }
    
    public boolean actualizar(int intA_index, Prospecto objA_entidad){                
        return ProspectoDao.objL_listaProspecto.set(intA_index,objA_entidad) != null ;
    }
            
}
