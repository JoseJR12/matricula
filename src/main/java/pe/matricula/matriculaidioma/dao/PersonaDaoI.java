    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.hibernate.mapping.IdGenerator;
import pe.matricula.matriculaidioma.modelo.Persona;

/**
 *
 * @author Student
 */
public interface PersonaDaoI {
    public List<Persona> listarEntidad();
    public Persona buscarEntidadId(int id);
    public Persona validarLogin(Persona user);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Persona persona);
    public IdGenerator idPersonaGenerator();
    public void guardarEntidad(Persona persona);
}
