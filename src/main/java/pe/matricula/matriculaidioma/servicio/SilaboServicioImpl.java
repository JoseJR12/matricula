/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Silabo;
import pe.matricula.matriculaidioma.dao.SilaboDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class SilaboServicioImpl implements SilaboServicioI {
     @Autowired
    public SilaboDaoI dao;

    
    @Override
    public List<Silabo> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Silabo buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Silabo silabo){dao.guardadEntidad(silabo);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Silabo silabo){dao.modificarEntidad(silabo);};
}


