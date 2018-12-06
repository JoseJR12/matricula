/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.DocumentoPago;
import pe.matricula.matriculaidioma.dao.DocumentoPagoDaoI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class DocumentoPagoServicioImpl implements DocumentoPagoServicioI{
      @Autowired
    public DocumentoPagoDaoI dao;
      
      @Override
    public List<DocumentoPago> listarEntidad(){return dao.listarEntidad();};

    @Override
    public DocumentoPago buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(DocumentoPago documentoPago){dao.guardadEntidad(documentoPago);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(DocumentoPago documentoPago){dao.modificarEntidad(documentoPago);};

}
