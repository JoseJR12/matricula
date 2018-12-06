/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Facultad;
import pe.matricula.matriculaidioma.dao.FacultadDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class FacultadServicioImpl implements FacultadServicioI{
      @Autowired
    public FacultadDaoI dao;
      
      @Override
    public List<Facultad> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Facultad buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Facultad facultad){dao.guardadEntidad(facultad);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Facultad facultad){dao.modificarEntidad(facultad);};

}


