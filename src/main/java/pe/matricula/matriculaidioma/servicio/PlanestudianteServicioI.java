/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Planestudiante;
/**
 *
 * @author USUARIO
 */

public interface PlanestudianteServicioI {
    public List<Planestudiante> listarEntidad();
    public Planestudiante buscarEntidadId(int id);
    public void guardadEntidad(Planestudiante planestudiante);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Planestudiante planestudiante);
}
