/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Estudiante;
import pe.matricula.matriculaidioma.dao.EstudianteDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class EstudianteServicioImpl implements EstudianteServicioI{
      @Autowired
    public EstudianteDaoI dao;
      
      @Override
    public List<Estudiante> listarEntidad(){return dao.listarEntidad();};
    
    @Override
    public List<Estudiante> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}
    @Override
    public Estudiante buscarEntidadId(int id){return dao.buscarEntidadId(id);};
     @Override
    public void guardarEntidad(Estudiante estudiante){dao.guardarEntidad(estudiante);};
    

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Estudiante estudiante){dao.modificarEntidad(estudiante);};
    
    @Override
         public int operacionProcedure(int idEntidad){return dao.operacionProcedure(idEntidad);}

}

