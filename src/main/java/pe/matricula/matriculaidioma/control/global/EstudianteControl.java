/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.control.global;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import oracle.net.aso.r;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.matricula.matriculaidioma.modelo.Estudiante;
import pe.matricula.matriculaidioma.servicio.EstudianteServicioI;


/**
 *
 * @author Student
 */
@Controller
public class EstudianteControl {
     
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    EstudianteServicioI EstudianteServicioI;

    Logger logger = Logger.getLogger(EstudianteServicioI.class.getName());
    
    @RequestMapping(value = {"/EstudianteMain" }, method = RequestMethod.GET)    
    public ModelAndView inicioEstudiante(Locale locale, Map<String,Object> model){
        String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);

        List<Estudiante> lista=EstudianteServicioI.listarEntidad();

        model.put("ListaEstudiante", lista);
        model.put("message", welcome);
        model.put("startMeeting", "09:10");        
        return new ModelAndView("global/estudiante/mainEstudiante");
    } 
    
    @RequestMapping(value = {"/buscarEstudiante"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidadd(Locale locale, Map<String,Object> model, HttpServletRequest r){
        String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
        String dato=r.getParameter("dato");
        List<Estudiante> lista=EstudianteServicioI.listarEntidadDato(dato);
        model.put("ListaEstudiante", lista);
        model.put("message", welcome);
        model.put("startMeeting", "09:10");    
    return new ModelAndView("global/estudiante/mainEstudiante");
    } 
    
    @RequestMapping(value = {"/elimAlm" }, method = RequestMethod.GET)
    public ModelAndView eliminarAlmacen(HttpServletRequest r){
        int idEntidad=Integer.parseInt(r.getParameter("id"));
       int dato= EstudianteServicioI.operacionProcedure(idEntidad);
       
      logger.info("Mensaje Mostrado Procedure: "+dato);
        //almacenServicioI.eliminarEntidad(idEntidad);
    return new ModelAndView(new RedirectView("/EstudianteMain"));
    }
    
//    @RequestMapping(value = "/formAlmacen", method = RequestMethod.GET)
//public String irModificarAlmacen(HttpServletRequest r, Model model ){
//        int id=Integer.parseInt(r.getParameter("id"));
//        GloAlmacen almacen=null;
//        almacen=almacenServicioI.buscarEntidadId(id);
//        
//        return "inventario/almacen/formAlmacen";
//}


}
