
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Facultad;
/**
 *
 * @author USUARIO
 */
public interface FacultadDaoI  {
    
     public List<Facultad> listarEntidad();
    public Facultad buscarEntidadId(int id);
    public void guardadEntidad(Facultad facultad);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Facultad facultad);
    
}