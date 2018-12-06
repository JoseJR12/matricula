/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Docente;

/**
 *
 * @author Student
 */
  @Repository
public class DocenteDaoImpl extends SysDataAccess<Integer,Docente> implements DocenteDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Docente> listarEntidad(){return getListAll();}
    @Override
    public Docente buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Docente docente){savev(docente);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Docente docente){update(docente);}
}

