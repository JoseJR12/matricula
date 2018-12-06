/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;

import java.util.List;
import org.hibernate.mapping.IdGenerator;
import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Persona;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Repository
public class PersonaDaoImpl extends SysDataAccess<Integer, Persona> implements PersonaDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Persona> listarEntidad(){ return getListAll();}    
        
    
    @Override
    public IdGenerator idPersonaGenerator(){
        IdGenerator to=null;
     
        try {     
        to= (IdGenerator) sessionFactory.getCurrentSession()
                .createNativeQuery(" SELECT ((CASE WHEN MAX(a.idpersona) IS NULL THEN 0 ELSE MAX(a.idpersona) END)+1) AS id FROM glo_personas a ", IdGenerator.class)                
               .uniqueResult();           
        }catch (Exception e) { logger.info("Mensage de Error en idPersonaGenerator() "+e.getMessage());   }
              
        return to;           
    }  
    
    @Override
    public Persona validarLogin(Persona user) {
    Persona resultado=null;   
    String usuario=user.getUsuario(); 
    String pasword=user.getPassword();
    try {           
       resultado= (Persona) sessionFactory.getCurrentSession()
                                .createQuery("SELECT p from GloPersonas p WHERE p.usuario=?1 and p.clave=?2")
                                .setParameter(1, usuario)
                                .setParameter(2, pasword).uniqueResult();                                 
        }catch (Exception e) { logger.info("Mensage de Error en validarPersona() "+e.getMessage());   }
        finally{ sessionFactory.close(); }            
        return resultado;
    }
    
  
    
    @Override
    public Persona buscarEntidadId(int id){ return getById(id);}
    
    @Override
    public void guardarEntidad(Persona persona){savev(persona);}
    @Override
    public void eliminarEntidad(int id){delete(id);}
    @Override
    public void modificarEntidad(Persona persona){update(persona);}

}
