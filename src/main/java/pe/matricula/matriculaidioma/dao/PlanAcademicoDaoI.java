
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.PlanAcademico;
/**
 *
 * @author USUARIO
 */
public interface PlanAcademicoDaoI  {
    
     public List<PlanAcademico> listarEntidad();
    public PlanAcademico buscarEntidadId(int id);
    public void guardadEntidad(PlanAcademico planAcademico);
    public void eliminarEntidad(int id);
    public void modificarEntidad(PlanAcademico planAcademico);
    
}