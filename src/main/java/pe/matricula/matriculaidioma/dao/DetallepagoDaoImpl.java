/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Detallepago;

/**
 *
 * @author Student
 */
  @Repository
public class DetallepagoDaoImpl extends SysDataAccess<Integer,Detallepago> implements DetallepagoDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Detallepago> listarEntidad(){return getListAll();}
    @Override
    public Detallepago buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Detallepago detallepago){savev(detallepago);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Detallepago detallepago){update(detallepago);}
}

