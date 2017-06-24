
package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class SeguimientoController {
    
     @RequestMapping("/Principal/Seguimiento.htm")
   public ModelAndView Seguimiento()
   {
       ModelAndView seguimiento=new ModelAndView();
       seguimiento.setViewName("Seguimiento");
       return seguimiento;
      
   }
}
