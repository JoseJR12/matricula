/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Accesos;
/**
 *
 * @author USUARIO
 */

    public interface AccesosServicioI  {
     public List<Accesos> listarEntidad();
    public Accesos buscarEntidadId(int id);
    public void guardadEntidad(Accesos accesos);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Accesos accesos);
    }

