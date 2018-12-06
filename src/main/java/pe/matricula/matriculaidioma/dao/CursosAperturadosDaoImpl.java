/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.CursosAperturados;


/**
 *
 * @author Student
 */
  @Repository
public class CursosAperturadosDaoImpl extends SysDataAccess<Integer, CursosAperturados> implements CursosAperturadosDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<CursosAperturados> listarEntidad(){return getListAll();}
    @Override
    public CursosAperturados buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(CursosAperturados cursosaperturados){savev(cursosaperturados);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(CursosAperturados cursosaperturados){update(cursosaperturados);}
}


