/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Silabo;
/**
 *
 * @author USUARIO
 */
public interface SilaboServicioI {
    public List<Silabo> listarEntidad();
    public Silabo buscarEntidadId(int id);
    public void guardadEntidad(Silabo silabo);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Silabo silabo);
}
