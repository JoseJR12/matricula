/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Notascursos;

/**
 *
 * @author Student
 */
  @Repository
public class NotascursosDaoImpl extends SysDataAccess<Integer,Notascursos> implements NotascursosDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Notascursos> listarEntidad(){return getListAll();}
    @Override
    public Notascursos buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Notascursos notascursos){savev(notascursos);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Notascursos notascursos){update(notascursos);}
}

 