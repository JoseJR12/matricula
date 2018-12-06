/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Silabo;

/**
 *
 * @author Student
 */
  @Repository
public class SilaboDaoImpl extends SysDataAccess<Integer,Silabo> implements SilaboDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Silabo> listarEntidad(){return getListAll();}
    @Override
    public Silabo buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Silabo silabo){savev(silabo);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Silabo silabo){update(silabo);}
}

 