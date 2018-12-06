/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.TipoPago;

/**
 *
 * @author Student
 */
  @Repository
public class TipoPagoDaoImpl extends SysDataAccess<Integer,TipoPago> implements TipoPagoDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<TipoPago> listarEntidad(){return getListAll();}
    @Override
    public TipoPago buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(TipoPago tipoPago){savev(tipoPago);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(TipoPago tipoPago){update(tipoPago);}
}

 