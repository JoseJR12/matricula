/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Curso;

/**
 *
 * @author USUARIO
 */
public interface CursoDaoI {
    
     public List<Curso> listarEntidad();
    public Curso buscarEntidadId(int id);
    public void guardadEntidad(Curso curso);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Curso curso);
    

}
