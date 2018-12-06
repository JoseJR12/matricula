
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Periodo;
/**
 *
 * @author USUARIO
 */
public interface PeriodoDaoI  {
    
     public List<Periodo> listarEntidad();
    public Periodo buscarEntidadId(int id);
    public void guardadEntidad(Periodo periodo);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Periodo periodo);
    
}