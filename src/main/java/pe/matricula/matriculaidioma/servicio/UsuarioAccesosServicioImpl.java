/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.UsuarioAccesos;
import pe.matricula.matriculaidioma.dao.UsuarioAccesosDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class UsuarioAccesosServicioImpl implements  UsuarioAccesosI {
     @Autowired
    public UsuarioAccesosDaoI dao;

    
    @Override
    public List<UsuarioAccesos> listarEntidad(){return dao.listarEntidad();};

    @Override
    public UsuarioAccesos buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(UsuarioAccesos usuarioAccesos){dao.guardadEntidad(usuarioAccesos);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(UsuarioAccesos usuarioAccesos){dao.modificarEntidad(usuarioAccesos);};
}


