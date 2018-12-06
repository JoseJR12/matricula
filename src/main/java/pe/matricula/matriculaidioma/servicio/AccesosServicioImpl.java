/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Accesos;
import pe.matricula.matriculaidioma.dao.AccesosDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class AccesosServicioImpl implements AccesosServicioI {
     @Autowired
    public AccesosDaoI dao;

    
    @Override
    public List<Accesos> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Accesos buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Accesos accesos){dao.guardadEntidad(accesos);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Accesos accesos){dao.modificarEntidad(accesos);};
}
