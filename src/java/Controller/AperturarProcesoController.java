
package Controller;

import dto.Alumno;
import dto.ProcesoTutoria;
import dto.ProgramacionAcademica;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AperturarProcesoController {
    
    @RequestMapping("/Principal/AperturarProceso.htm")
   public ModelAndView AperturarProceso()
   {
       ModelAndView aperturar=new ModelAndView("AperturarProceso","command",new ProcesoTutoria());
       return aperturar;
   }
   
    @RequestMapping("/Principal/ProgramacionAcademica.htm")
   public ModelAndView ProgramacionAcademica()
   {
       ModelAndView programacion=new ModelAndView("ProgramacionAcademica","command",new ProgramacionAcademica());
       return programacion;
   }
   
   
   @RequestMapping("/Principal/AsignacionAlumnos.htm")
   public ModelAndView AsignacionAlumnos()
   {
       ModelAndView asignacion=new ModelAndView("AsignacionAlumnos","command",new Alumno());
       return asignacion;
   }
}
