
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Notascursos;
/**
 *
 * @author USUARIO
 */
public interface NotascursosDaoI  {
    
     public List<Notascursos> listarEntidad();
    public Notascursos buscarEntidadId(int id);
    public void guardadEntidad(Notascursos notascursos);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Notascursos notascursos);
    
}