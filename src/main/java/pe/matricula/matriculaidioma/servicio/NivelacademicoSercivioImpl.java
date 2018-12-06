/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Nivelacademico;
import pe.matricula.matriculaidioma.dao.NivelacademicoDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import pe.matricula.matriculaidioma.modelo.Nivelacademico;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class NivelacademicoSercivioImpl implements NivelacademicoSercivioI {
     @Autowired
    public NivelacademicoDaoI dao;

    
    @Override
    public List<Nivelacademico> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Nivelacademico buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Nivelacademico nivelacademico){dao.guardadEntidad(nivelacademico);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Nivelacademico nivelacademico){dao.modificarEntidad(nivelacademico);};
}


