/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  pe.matricula.matriculaidioma.servicio;
import java.util.List;
import pe.matricula.matriculaidioma.modelo.Login;
import pe.matricula.matriculaidioma.dao.LoginDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import pe.matricula.matriculaidioma.modelo.Login;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author USUARIO
 */
@Service
@Transactional
public class LoginServicioImpl implements LoginServicioI {
     @Autowired
    public LoginDaoI dao;

    
    @Override
    public List<Login> listarEntidad(){return dao.listarEntidad();};

    @Override
    public Login buscarEntidadId(int id){return dao.buscarEntidadId(id);};

    @Override
    public void guardadEntidad(Login login){dao.guardadEntidad(login);};

    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);};

    @Override
    public void modificarEntidad(Login login){dao.modificarEntidad(login);};
}


