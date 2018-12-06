/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.dao;
import java.util.List;
import org.springframework.stereotype.Repository;
import pe.matricula.matriculaidioma.SysDataAccess;
import pe.matricula.matriculaidioma.modelo.Login;

/**
 *
 * @author Student
 */
  @Repository
public class LoginDaoImpl extends SysDataAccess<Integer,Login> implements LoginDaoI{
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Login> listarEntidad(){return getListAll();}
    @Override
    public Login buscarEntidadId(int id){return getById(id);}
    @Override
    public void guardadEntidad(Login login){savev(login);};
    @Override
    public void eliminarEntidad(int id){delete(id);};
    @Override
    public void modificarEntidad(Login login){update(login);}
}

