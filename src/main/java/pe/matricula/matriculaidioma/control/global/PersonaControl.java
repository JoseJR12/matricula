/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.matricula.matriculaidioma.control.global;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.matricula.matriculaidioma.modelo.Persona;
import pe.matricula.matriculaidioma.servicio.PersonaServicioI;

        
/**
 *
 * @author USUARIO
 */
@Controller
public class PersonaControl {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    PersonaServicioI personaServicioI;

    
    Logger logger = Logger.getLogger(PersonaControl.class.getName());
    
@RequestMapping(value = {"/personaMain" }, method = RequestMethod.GET)    
public ModelAndView inicio(Locale locale, Map<String,Object> model){
    String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
    List<Persona> lista=personaServicioI.listarEntidad();

    model.put("ListaPersona", lista);
    model.put("message", welcome);
    model.put("startMeeting", "09:10");
    
    return new ModelAndView("global/persona/mainPersona");
}
    
    @RequestMapping(value = {"/buscarPer"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
        String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
        String dato=r.getParameter("dato");
        List<Persona> lista=personaServicioI.listarEntidad();
        model.put("ListaPersona", lista);
        model.put("message", welcome);
        model.put("startMeeting", "09:10");    
    return new ModelAndView("global/persona/mainPersona");
    } 
    
    @RequestMapping(value = {"/elimpersona" }, method = RequestMethod.GET)
    public ModelAndView eliminarPersona(HttpServletRequest r){
        int idEntidad=Integer.parseInt(r.getParameter("id"));
        personaServicioI.eliminarEntidad(idEntidad);
    return new ModelAndView(new RedirectView("/personaMain"));
    }

@RequestMapping(value = "/formPersona", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloPersona")Persona persona,
        BindingResult result, Model model){
     
        List<Persona> lista=personaServicioI.listarEntidad();
        model.addAttribute("ListaPersona", lista);
     
            Map<String,String> genero = new LinkedHashMap<String,String>();
           
        genero.put("F", "Femenino");
        genero.put("M", "Masculino");
        
         model.addAttribute("ListGenero", genero);
        model.addAttribute("urlAccion", "guardarPersona");  
        
    return new ModelAndView("global/persona/formPersona");
}

@RequestMapping(value = "/guardarPersona", method = RequestMethod.POST)
public ModelAndView guardarEntidad(@ModelAttribute("modeloPersona")Persona persona,
        BindingResult result, HttpServletRequest r){

        try {
        personaServicioI.guardarEntidad(persona);
        return new ModelAndView(new RedirectView("/personaMain"));
        } catch (Exception e) {
        logger.info("Error Guardar: "+e.getMessage());
        return new ModelAndView(new RedirectView("/formPersona"));
        }
}

@RequestMapping(value = "/formModif2Persona", method = RequestMethod.GET)
public String irModificar2persona(HttpServletRequest r, Model model ){
   int id=Integer.parseInt(r.getParameter("id"));
       Persona persona=null;
       persona=personaServicioI.buscarEntidadId(id);
       logger.info("Error Fecha Real "+persona.getFechaNacimiento());
     
        model.addAttribute("modeloPersona", persona);  
        
        model.addAttribute("urlAccion", "actualizarPersona");              
    return "global/persona/formPersona";
}


@RequestMapping(value = "actualizarPersona", method = RequestMethod.POST)
public ModelAndView actualizarPersona(@ModelAttribute("modeloPersona") Persona entidad,
                                      BindingResult result, HttpServletRequest r ){
        try {
        personaServicioI.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView(r.getContextPath()+"/personaMain"));
    } catch (Exception e) {
        logger.info("Error al modificar: "+e.getMessage());
        return new ModelAndView(new RedirectView(r.getContextPath()+"/formModif2Persona?id="+entidad.getIdPersona()));
    }
    
}

}
