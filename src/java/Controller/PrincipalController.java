
package Controller;

import Modelos.Alumno;
import Modelos.ProcesoTutoria;
import Modelos.ProgramacionAcademica;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class PrincipalController 
{
 @RequestMapping("Principal.htm")
   public ModelAndView principal()
   {
       ModelAndView principal=new ModelAndView();
       principal.setViewName("Principal");
       return principal;
   }
   
   
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
   
   @RequestMapping("/Principal/CargarTutores.htm")
   public ModelAndView CargarTutores()
   {
       ModelAndView importar=new ModelAndView();
       importar.setViewName("CargarTutores");
       return importar;
      
   }
   
   
   @RequestMapping("/Principal/CargarAlumnos.htm")
   public ModelAndView CargarAlumnos()
   {
       ModelAndView importar=new ModelAndView();
       importar.setViewName("CargarAlumnos");
       return importar;
      
   }
   
    @RequestMapping("/Principal/Seguimiento.htm")
   public ModelAndView Seguimiento()
   {
       ModelAndView seguimiento=new ModelAndView();
       seguimiento.setViewName("Seguimiento");
       return seguimiento;
      
   }
}
