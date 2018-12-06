/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Detallematricula;

/**
 *
 * @author USUARIO
 */
public interface DetallematriculaServicioI {
    public List<Detallematricula> listarEntidad();
    public Detallematricula buscarEntidadId(int id);
    public void guardadEntidad(Detallematricula detallematricula);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Detallematricula detallematricula);
}
