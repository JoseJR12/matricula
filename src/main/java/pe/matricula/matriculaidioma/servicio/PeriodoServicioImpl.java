/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Periodo;
import pe.matricula.matriculaidioma.dao.PeriodoDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import pe.matricula.matriculaidioma.modelo.Periodo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class PeriodoServicioImpl implements PeriodoServicioI {
     @Autowired
    public PeriodoDaoI dao;

    
    @Override
    public List<Periodo> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Periodo buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Periodo periodo){dao.guardadEntidad(periodo);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Periodo periodo){dao.modificarEntidad(periodo);};
}



