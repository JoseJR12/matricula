/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Detallematricula;

/**
 *
 * @author Student
 */
  @Repository
public class DetallematriculaDaoImpl extends SysDataAccess<Integer,Detallematricula> implements DetallematriculaDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Detallematricula> listarEntidad(){return getListAll();}
    @Override
    public Detallematricula buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Detallematricula detallematricula){savev(detallematricula);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Detallematricula detallematricula){update(detallematricula);}
}




