package pe.matricula.matriculaidioma.servicio;

import java.util.List;
import pe.matricula.matriculaidioma.modelo. Notascursos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public interface NotascursosServiceI {
     public List< Notascursos> listarEntidad();
    public  Notascursos buscarEntidadId(int id);
    public void guardadEntidad( Notascursos  notascursos);
    public void eliminarEntidad(int id);
    public void modificarEntidad( Notascursos  notascursos);
}
