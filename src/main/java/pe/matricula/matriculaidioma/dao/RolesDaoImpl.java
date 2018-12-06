/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Roles;

/**
 *
 * @author Student
 */
  @Repository
public class RolesDaoImpl extends SysDataAccess<Integer,Roles> implements RolesDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Roles> listarEntidad(){return getListAll();}
    @Override
    public Roles buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Roles roles){savev(roles);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Roles roles){update(roles);}
}

 