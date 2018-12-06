/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Aula;
import pe.matricula.matriculaidioma.dao.AulaDaoI;
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
public class AulaServicioImpl implements AulaServicioI {
     @Autowired
    public AulaDaoI dao;

    
    @Override
    public List<Aula> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Aula buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Aula aula){dao.guardadEntidad(aula);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Aula aula){dao.modificarEntidad(aula);};
}
