/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Login;
/**
 *
 * @author USUARIO
 */
public interface LoginServicioI {
    public List<Login> listarEntidad();
    public Login buscarEntidadId(int id);
    public void guardadEntidad(Login login);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Login login);
}
