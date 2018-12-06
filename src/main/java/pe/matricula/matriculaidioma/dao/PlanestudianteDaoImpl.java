/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Planestudiante;

/**
 *
 * @author Student
 */
  @Repository
public class PlanestudianteDaoImpl extends SysDataAccess<Integer,Planestudiante> implements PlanestudianteDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Planestudiante> listarEntidad(){return getListAll();}
    @Override
    public Planestudiante buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Planestudiante planestudiante){savev(planestudiante);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Planestudiante planestudiante){update(planestudiante);}
}

 