
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Matricula;
/**
 *
 * @author USUARIO
 */
public interface MatriculaDaoI  {
    
     public List<Matricula> listarEntidad();
    public Matricula buscarEntidadId(int id);
    public void guardadEntidad(Matricula matricula);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Matricula matricula);
    
}