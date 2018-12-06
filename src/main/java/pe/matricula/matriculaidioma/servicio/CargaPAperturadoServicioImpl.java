/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.CargaplanAperturado;
import pe.matricula.matriculaidioma.dao.CargaplanAperturadoDaoI;;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class CargaPAperturadoServicioImpl implements CargaPAperturadoServicioI {
     @Autowired
    public CargaplanAperturadoDaoI dao;

    
    @Override
    public List<CargaplanAperturado> listarEntidad(){return dao.listarEntidad();};

    @Override
    public CargaplanAperturado buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(CargaplanAperturado cargaplanAperturado){dao.guardadEntidad(cargaplanAperturado);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(CargaplanAperturado cargaplanAperturado){dao.modificarEntidad(cargaplanAperturado);};
}
