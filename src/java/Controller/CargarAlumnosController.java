
package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class CargarAlumnosController
{
     @RequestMapping("/Principal/CargarAlumnos.htm")
   public ModelAndView CargarAlumnos()
   {
       ModelAndView importar=new ModelAndView();
       importar.setViewName("CargarAlumnos");
       return importar;
      
   }
    
}
