/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.TipoPago;
/**
 *
 * @author USUARIO
 */
public interface TipoPagoServicioI {
    public List<TipoPago> listarEntidad();
    public TipoPago buscarEntidadId(int id);
    public void guardadEntidad(TipoPago tipoPago);
    public void eliminarEntidad(int id);
    public void modificarEntidad(TipoPago tipoPago);
}
