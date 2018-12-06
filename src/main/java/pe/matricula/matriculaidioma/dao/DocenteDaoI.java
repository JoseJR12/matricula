
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Docente;
/**
 *
 * @author USUARIO
 */
public interface DocenteDaoI  {
    
     public List<Docente> listarEntidad();
    public Docente buscarEntidadId(int id);
    public void guardadEntidad(Docente docente);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Docente docente);
    
}