/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Roles;
/**
 *
 * @author USUARIO
 */
public interface RolesServicioI {
    public List<Roles> listarEntidad();
    public Roles buscarEntidadId(int id);
    public void guardadEntidad(Roles roles);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Roles roles);
}
