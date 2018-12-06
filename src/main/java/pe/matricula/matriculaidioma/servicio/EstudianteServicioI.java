/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Estudiante;
/**
 *
 * @author USUARIO
 */
public interface EstudianteServicioI {
    public List<Estudiante> listarEntidad();
    public Estudiante buscarEntidadId(int id);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Estudiante estudiante);
    public void guardarEntidad(Estudiante estudiante);
    public List<Estudiante> listarEntidadDato(String dato);

    public int operacionProcedure(int idEntidad);
    
}
