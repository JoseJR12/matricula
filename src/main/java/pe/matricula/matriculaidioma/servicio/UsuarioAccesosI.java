/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.UsuarioAccesos;
/**
 *
 * @author USUARIO
 */
public interface UsuarioAccesosI {
    public List<UsuarioAccesos> listarEntidad();
    public UsuarioAccesos buscarEntidadId(int id);
    public void guardadEntidad(UsuarioAccesos usuarioAccesos);
    public void eliminarEntidad(int id);
    public void modificarEntidad(UsuarioAccesos usuarioAccesos);
}
