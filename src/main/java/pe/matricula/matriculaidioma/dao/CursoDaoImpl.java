/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Curso;

/**
 *
 * @author Student
 */
  @Repository
public class CursoDaoImpl extends SysDataAccess<Integer, Curso> implements CursoDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Curso> listarEntidad(){return getListAll();}
    @Override
    public Curso buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Curso curso){savev(curso);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Curso curso){update(curso);}
}


