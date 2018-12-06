
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.DocumentoPago;
/**
 *
 * @author USUARIO
 */
public interface DocumentoPagoDaoI  {
    
     public List<DocumentoPago> listarEntidad();
    public DocumentoPago buscarEntidadId(int id);
    public void guardadEntidad(DocumentoPago documentoPago);
    public void eliminarEntidad(int id);
    public void modificarEntidad(DocumentoPago documentoPago);
    
}