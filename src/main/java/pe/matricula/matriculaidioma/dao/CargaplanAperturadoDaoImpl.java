/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;

import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.CargaplanAperturado;

/**
 *
 * @author Student
 */
  @Repository
public class CargaplanAperturadoDaoImpl extends SysDataAccess<Integer, CargaplanAperturado> implements CargaplanAperturadoDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<CargaplanAperturado> listarEntidad(){return getListAll();}
    @Override
    public CargaplanAperturado buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(CargaplanAperturado cargaplanaperturado){savev(cargaplanaperturado);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(CargaplanAperturado cargaplanaperturado){update(cargaplanaperturado);}
}


