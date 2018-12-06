/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Planestudiante;
import pe.matricula.matriculaidioma.dao.PlanestudianteDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class PlanestudianteServicioImpl implements PlanestudianteServicioI {
     @Autowired
    public PlanestudianteDaoI dao;

    
    @Override
    public List<Planestudiante> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Planestudiante buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Planestudiante planestudiante){dao.guardadEntidad(planestudiante);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Planestudiante planestudiante){dao.modificarEntidad(planestudiante);};
}

