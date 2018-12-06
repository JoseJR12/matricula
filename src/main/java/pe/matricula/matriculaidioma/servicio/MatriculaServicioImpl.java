/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Matricula;
import pe.matricula.matriculaidioma.dao.MatriculaDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import pe.matricula.matriculaidioma.modelo.Matricula;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class MatriculaServicioImpl implements MatriculaServicioI {
     @Autowired
    public MatriculaDaoI dao;

    
    @Override
    public List<Matricula> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Matricula buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Matricula matricula){dao.guardadEntidad(matricula);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Matricula matricula){dao.modificarEntidad(matricula);};
}




