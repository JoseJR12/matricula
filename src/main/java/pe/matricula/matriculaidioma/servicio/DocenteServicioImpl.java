/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Docente;
import pe.matricula.matriculaidioma.dao.DocenteDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class DocenteServicioImpl implements  DocenteServicioI {
    @Autowired
    public DocenteDaoI dao;
    
    @Override
    public List<Docente> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Docente buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Docente docente){dao.guardadEntidad(docente);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Docente docente){dao.modificarEntidad(docente);};
   
}
