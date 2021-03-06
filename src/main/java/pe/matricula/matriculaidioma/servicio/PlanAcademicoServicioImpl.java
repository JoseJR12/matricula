/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.PlanAcademico;
import pe.matricula.matriculaidioma.dao.PlanAcademicoDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class PlanAcademicoServicioImpl implements PlanAcademicoServicioI {
     @Autowired
    public PlanAcademicoDaoI dao;

    
    @Override
    public List<PlanAcademico> listarEntidad(){return dao.listarEntidad();};

    @Override
    public PlanAcademico buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(PlanAcademico planAcademico){dao.guardadEntidad(planAcademico);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(PlanAcademico planAcademico){dao.modificarEntidad(planAcademico);};
}


