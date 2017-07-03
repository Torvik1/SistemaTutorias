
package Controller;

import dao.implement.DaoProcesoimpl;
import dto.Alumno;
import dto.ProcesoTutoria;
import dto.ProgramacionAcademica;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AperturarProcesoController {
    
    @RequestMapping("/Principal/AperturarProceso.htm")
   public ModelAndView CargarProcesos()
   {
       ModelAndView aperturar=new ModelAndView();
       List<ProcesoTutoria> Datoprocesos;
       DaoProcesoimpl proceso =new DaoProcesoimpl();
       Datoprocesos=proceso.procesoQry();
       aperturar.addObject("valores", Datoprocesos);
       aperturar.setViewName("AperturarProceso");
       
       return aperturar;
   }
   
   @RequestMapping(value="/Principal/AgregarProceso.htm", method =RequestMethod.POST)
   public String AgregarProceso
        (
         @RequestParam("periodo") String periodo,
         @RequestParam("ley") String ley,
         @RequestParam("fapertura") String fapertura,
         @RequestParam("fclausura") String fcierre
        )
   {    
       
        ProcesoTutoria proceso=new ProcesoTutoria(periodo,ley,fapertura,fcierre,"aperturado");
        String mensaje=new DaoProcesoimpl().procesoIns(proceso);
        System.out.print(mensaje);
       
        return "redirect:/Principal/AperturarProceso.htm";
   }
   
        
    @RequestMapping("/Principal/ProgramacionAcademica.htm")
    public ModelAndView ProgramacionAcademica()
   {
       ModelAndView programacion=new ModelAndView();
        programacion.setViewName("ProgramacionAcademica");
        
       return programacion;
   }
    @RequestMapping("/Principal/ProgramacionAcademica.htm")
    @ModelAttribute("ListaCursos")
    public Map<Integer,String> ListaCursos()
    {
        Map<Integer,String> cursos=new LinkedHashMap<>();
        
        
        return cursos;
    }
    
   
   
   @RequestMapping("/Principal/AsignacionAlumnos.htm")
   public ModelAndView AsignacionAlumnos(
   )       
   {
       ModelAndView asignacion=new ModelAndView();
       asignacion.setViewName("AsignacionAlumnos");
       return asignacion;
   }
}
