/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Roles;
import pe.matricula.matriculaidioma.dao.RolesDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class RolesServicioImpl implements RolesServicioI {
     @Autowired
    public RolesDaoI dao;

    
    @Override
    public List<Roles> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Roles buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Roles roles){dao.guardadEntidad(roles);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Roles roles){dao.modificarEntidad(roles);};
}


