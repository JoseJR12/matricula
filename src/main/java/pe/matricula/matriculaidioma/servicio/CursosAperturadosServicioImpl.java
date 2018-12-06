/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.CursosAperturados;
import pe.matricula.matriculaidioma.dao.CursosAperturadosDaoI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class CursosAperturadosServicioImpl implements CursosAperturadosServicioI {
     @Autowired
    public CursosAperturadosDaoI dao;

    
    @Override
    public List<CursosAperturados> listarEntidad(){return dao.listarEntidad();};

    @Override
    public CursosAperturados buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(CursosAperturados cursosAperturados){dao.guardadEntidad(cursosAperturados);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(CursosAperturados cursosAperturados){dao.modificarEntidad(cursosAperturados);};
}

