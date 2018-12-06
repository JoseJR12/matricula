/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Aula;


/**
 *
 * @author Student
 */
@Repository
public class AulaDaoImpl extends SysDataAccess<Integer, Aula> implements AulaDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Aula> listarEntidad(){return getListAll();}
    @Override
    public Aula buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Aula aula){savev(aula);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Aula aula){update(aula);}
}
