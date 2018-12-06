/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Matricula;

/**
 *
 * @author Student
 */
  @Repository
public class MatriculaDaoImpl extends SysDataAccess<Integer,Matricula> implements MatriculaDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Matricula> listarEntidad(){return getListAll();}
    @Override
    public Matricula buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Matricula matricula){savev(matricula);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Matricula matricula){update(matricula);}
}

