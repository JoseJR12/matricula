/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Detallepago;
/**
 *
 * @author USUARIO
 */
public interface DetallepagoServicioI {
    public List<Detallepago> listarEntidad();
    public Detallepago buscarEntidadId(int id);
    
    public void eliminarEntidad(int id);
    public void modificarEntidad(Detallepago detallepago);

    public void guardarEntidad(Detallepago detallepago);
}
