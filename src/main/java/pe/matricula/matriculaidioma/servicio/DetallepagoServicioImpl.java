
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Detallepago;
import pe.matricula.matriculaidioma.dao.DetallepagoDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class DetallepagoServicioImpl implements DetallepagoDaoI {
     @Autowired
    public DetallepagoDaoI dao;
   

    
    @Override
    public List<Detallepago> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Detallepago buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Detallepago detallepago){dao.guardadEntidad(detallepago);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Detallepago detallepago){dao.modificarEntidad(detallepago);};
    
    
}

