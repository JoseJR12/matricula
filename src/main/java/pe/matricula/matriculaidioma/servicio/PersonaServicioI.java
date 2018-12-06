/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.servicio;

import java.util.List;
import pe.matricula.matriculaidioma.modelo.Persona;
/**
 *
 * @author TOSHIBA
 */
public interface PersonaServicioI {
     public List<Persona> listarEntidad();
    public Persona buscarEntidadId(int id);
    
    public void eliminarEntidad(int id);
    public void modificarEntidad(Persona persona);

    

    public void guardarEntidad(Persona persona);
}
