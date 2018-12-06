/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Detallematricula;
import pe.matricula.matriculaidioma.dao.DetallematriculaDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class DetallematriculaServicioImpl implements DetallematriculaServicioI {
     @Autowired
    public DetallematriculaDaoI dao;
   

    
    @Override
    public List<Detallematricula> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Detallematricula buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Detallematricula detallematricula){dao.guardadEntidad(detallematricula);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Detallematricula detallematricula){dao.modificarEntidad(detallematricula);};
}

