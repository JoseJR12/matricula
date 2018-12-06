/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Curso;
import pe.matricula.matriculaidioma.dao.CursoDaoI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USUARIO
 */
public class CursoServicioImpl implements CursoServicioI {
     @Autowired
    public CursoDaoI dao;

    
    @Override
    public List<Curso> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Curso buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Curso curso){dao.guardadEntidad(curso);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Curso curso){dao.modificarEntidad(curso);};
}
