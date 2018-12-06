/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Accesos;

/**
 *
 * @author USUARIO
 */
@Repository
public class AccesosDaoImpl extends SysDataAccess<Integer, Accesos> implements AccesosDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Accesos> listarEntidad(){return getListAll();}
    @Override
    public Accesos buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Accesos accesos){savev(accesos);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Accesos accesos){update(accesos);}
}
