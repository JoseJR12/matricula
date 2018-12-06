/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.TipoPago;
import pe.matricula.matriculaidioma.dao.TipoPagoDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import pe.matricula.matriculaidioma.modelo.TipoPago;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class TipoPagoServicioImpl implements TipoPagoServicioI {
     @Autowired
    public TipoPagoDaoI dao;

    
    @Override
    public List<TipoPago> listarEntidad(){return dao.listarEntidad();};

    @Override
    public TipoPago buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(TipoPago tipoPago){dao.guardadEntidad(tipoPago);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(TipoPago tipoPago){dao.modificarEntidad(tipoPago);};
}


