/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.UsuarioAccesos;

/**
 *
 * @author Student
 */
  @Repository
public class UsuarioAccesosDaoImpl extends SysDataAccess<Integer,UsuarioAccesos> implements UsuarioAccesosDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<UsuarioAccesos> listarEntidad(){return getListAll();}
    @Override
    public UsuarioAccesos buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(UsuarioAccesos usuarioaccesos){savev(usuarioaccesos);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(UsuarioAccesos usuarioaccesos){update(usuarioaccesos);}
}

 