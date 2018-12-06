/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Nivelacademico;

/**
 *
 * @author Student
 */
  @Repository
public class NivelacademicoDaoImpl extends SysDataAccess<Integer,Nivelacademico> implements NivelacademicoDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Nivelacademico> listarEntidad(){return getListAll();}
    @Override
    public Nivelacademico buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Nivelacademico nivelacademico){savev(nivelacademico);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Nivelacademico nivelacademico){update(nivelacademico);}
}

 