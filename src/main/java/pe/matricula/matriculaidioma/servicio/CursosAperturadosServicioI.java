/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.CursosAperturados;

/**
 *
 * @author USUARIO
 */
public interface CursosAperturadosServicioI {
     public List<CursosAperturados> listarEntidad();
    public CursosAperturados buscarEntidadId(int id);
    public void guardadEntidad(CursosAperturados cursosAperturados);
    public void eliminarEntidad(int id);
    public void modificarEntidad(CursosAperturados cursosAperturados);
}
