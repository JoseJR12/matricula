/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Periodo;

/**
 *
 * @author Student
 */
  @Repository
public class PeriodoDaoImpl extends SysDataAccess<Integer,Periodo> implements PeriodoDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Periodo> listarEntidad(){return getListAll();}
    @Override
    public Periodo buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Periodo periodo){savev(periodo);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Periodo periodo){update(periodo);}
}

 