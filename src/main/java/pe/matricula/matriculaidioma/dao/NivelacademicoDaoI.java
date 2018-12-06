
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Nivelacademico;
/**
 *
 * @author USUARIO
 */
public interface NivelacademicoDaoI  {
    
     public List<Nivelacademico> listarEntidad();
    public Nivelacademico buscarEntidadId(int id);
    public void guardadEntidad(Nivelacademico nivelacademico);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Nivelacademico nivelacademico);
    
}