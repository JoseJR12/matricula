/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Aula;
/**
 *
 * @author USUARIO
 */
public interface AulaDaoI {
    
     public List<Aula> listarEntidad();
    public Aula buscarEntidadId(int id);
    public void guardadEntidad(Aula aula);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Aula aula);
    

}
