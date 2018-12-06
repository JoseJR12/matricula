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
import pe.matricula.matriculaidioma.modelo.Detallepago;
import pe.matricula.matriculaidioma.servicio.DetallepagoServicioI;

        
/**
 *
 * @author USUARIO
 */
@Controller
public class detallePagoControl {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    DetallepagoServicioI detallepagoServicioI;

    
    Logger logger = Logger.getLogger(detallePagoControl.class.getName());
    
@RequestMapping(value = {"/DpagoMain" }, method = RequestMethod.GET)    
public ModelAndView inicio(Locale locale, Map<String,Object> model){
    String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
    List<Detallepago> lista=detallepagoServicioI.listarEntidad();

    model.put("ListaPersona", lista);
    model.put("message", welcome);
    model.put("startMeeting", "09:10");
    
    return new ModelAndView("global/Dpago/DpagoMain");
}
    
    @RequestMapping(value = {"/buscarDpago"}, method = RequestMethod.POST)
    public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
        String welcome=messageSource.getMessage("welcome.message", new Object[]{"David Mamani"}, locale);
        String dato=r.getParameter("dato");
        List<Detallepago> lista=detallepagoServicioI.listarEntidad();
        model.put("ListaPersona", lista);
        model.put("message", welcome);
        model.put("startMeeting", "09:10");    
    return new ModelAndView("global/Dpago/DpagoMain");
    } 
    
    @RequestMapping(value = {"/elimDpago" }, method = RequestMethod.GET)
    public ModelAndView eliminarPersona(HttpServletRequest r){
        int idEntidad=Integer.parseInt(r.getParameter("id"));
        detallepagoServicioI.eliminarEntidad(idEntidad);
    return new ModelAndView(new RedirectView("/DpagoMain"));
    }

@RequestMapping(value = "/formDpago", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloPago")Detallepago detallepago,
        BindingResult result, Model model){
            Map<String,String> genero = new LinkedHashMap<String,String>();
           
        genero.put("F", "Femenino");
        genero.put("M", "Masculino");
        
         model.addAttribute("ListGenero", genero);
        model.addAttribute("urlAccion", "guardarDpago");  
        
    return new ModelAndView("global/Dpago/DpagoMain");
}

@RequestMapping(value = "/guardarDpago", method = RequestMethod.POST)
public ModelAndView guardarEntidad(@ModelAttribute("modeloDpago")Detallepago detallepago,
        BindingResult result, HttpServletRequest r){

        try {
        detallepagoServicioI.guardarEntidad(detallepago);
        return new ModelAndView(new RedirectView("/detallepagoMain"));
        } catch (Exception e) {
        logger.info("Error Guardar: "+e.getMessage());
        return new ModelAndView(new RedirectView("/formDpago"));
        }
}

@RequestMapping(value = "/formModif5Persona", method = RequestMethod.GET)
public String irModificar2persona(HttpServletRequest r, Model model ){
   int id=Integer.parseInt(r.getParameter("id"));
       Detallepago detallePago=null;
       detallePago=detallepagoServicioI.buscarEntidadId(id);
       
     
        model.addAttribute("modeloPersona", detallePago);  
        
        model.addAttribute("urlAccion", "actualizarDpago");              
    return "global/Dpago/DpagoMain";
}


@RequestMapping(value = "actualizarDpago", method = RequestMethod.POST)
public ModelAndView actualizarPersona(@ModelAttribute("modeloDpago") Detallepago entidad,
                                      BindingResult result, HttpServletRequest r ){
        try {
        detallepagoServicioI.modificarEntidad(entidad);
        return new ModelAndView(new RedirectView(r.getContextPath()+"/DpagoMain"));
    } catch (Exception e) {
        logger.info("Error al modificar: "+e.getMessage());
        return new ModelAndView(new RedirectView(r.getContextPath()+"/formModif4Persona?id="+entidad.getIdFactura()));
    }
    
}

}

