package edu.pe.benedicto.sistema.adacsis.model;

import edu.pe.benedicto.sistema.adacsis.bean.Persona;
import edu.pe.benedicto.sistema.adacsis.bean.Prospecto;
import java.util.ArrayList;
import java.util.List;

public class ProspectoDao {
    public static List<Prospecto> objL_listaProspecto = new ArrayList<Prospecto>();
    
    public boolean filtrar(Prospecto objA_entidad){        
        List<Prospecto> objL_listaProspectoT = new ArrayList<Prospecto>();
        for(Prospecto objA_prospecto : objL_listaProspecto){
            Persona objL_persona = objA_prospecto.getObjPv_persona();
            if (
                objL_persona.getStrPv_nombre().equals(objL_persona.getStrPv_nombre()) ||
                objL_persona.getStrPv_apellidoMaterno().equals(objL_persona.getStrPv_apellidoMaterno()) ||
                objL_persona.getStrPv_apellidoPaterno().equals(objL_persona.getStrPv_apellidoPaterno()) ||
                objL_persona.getStrPv_celular().equals(objL_persona.getStrPv_celular()) ||
                objL_persona.getStrPv_telefono().equals(objL_persona.getStrPv_telefono())    
            ){
                objL_listaProspectoT.add(objA_prospecto);
            }            
        }
        return objL_listaProspectoT.size() > 0; 
    }
    
    public boolean insertar(Prospecto objA_entidad){        
        return ProspectoDao.objL_listaProspecto.add(objA_entidad);
    }
    
    public boolean eliminar(Prospecto objA_entidad){        
        return ProspectoDao.objL_listaProspecto.remove(objA_entidad);
    }
    
    public boolean actualizar(Prospecto objA_entidad){        
        return ProspectoDao.objL_listaProspecto.add(objA_entidad);
    }
            
}
