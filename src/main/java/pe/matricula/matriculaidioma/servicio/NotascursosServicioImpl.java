/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Notascursos;
import pe.matricula.matriculaidioma.dao.NotascursosDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import pe.matricula.matriculaidioma.modelo.Notascursos;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class NotascursosServicioImpl implements NotascursosServiceI {
     @Autowired
    public NotascursosDaoI dao;

    
    @Override
    public List<Notascursos> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Notascursos buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Notascursos notascursos){dao.guardadEntidad(notascursos);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Notascursos notascursos){dao.modificarEntidad(notascursos);};
}



