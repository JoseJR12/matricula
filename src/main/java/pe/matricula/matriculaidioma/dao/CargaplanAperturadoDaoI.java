/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.CargaplanAperturado;

/**
 *
 * @author USUARIO
 */
public interface CargaplanAperturadoDaoI {
    
     public List<CargaplanAperturado> listarEntidad();
    public CargaplanAperturado buscarEntidadId(int id);
    public void guardadEntidad(CargaplanAperturado cargaplanaperturado);
    public void eliminarEntidad(int id);
    public void modificarEntidad(CargaplanAperturado cargaplanaperturado);
    

}
