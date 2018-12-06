/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Facultad;

/**
 *
 * @author Student
 */
  @Repository
public class FacultadDaoImpl extends SysDataAccess<Integer,Facultad> implements FacultadDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Facultad> listarEntidad(){return getListAll();}
    @Override
    public Facultad buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Facultad facultad){savev(facultad);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Facultad facultad){update(facultad);}
}

