
package Controller;

import dto.DatosProgra;
import dao.implement.DaoCursoimpl;
import dao.implement.DaoGrupoHorarioimpl;
import dao.implement.DaoHorarioimpl;
import dao.implement.DaoPersonasimpl;
import dao.implement.DaoProcesoimpl;
import dao.implement.DaoPrograimpl;
import dto.Alumno;
import dto.Curso;
import dto.GrupoHorario;
import dto.Horario;
import dto.Persona;
import dto.ProcesoTutoria;
import dto.ProgramacionAcademica;
import java.util.Iterator;
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
    int id_curso_grupo_tutor_actual;
    
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
    public ModelAndView ProgramacionAcademica(HttpServletRequest request)
   {
       ModelAndView programacion=new ModelAndView();
       List<Curso> Datocursos=new DaoCursoimpl().cursosQry();
       List<Persona> DatosTutores=new DaoPersonasimpl().personasQry("tutor");
       List<DatosProgra> DatosProgramacion=new DaoPrograimpl().programacionQry();
       List<Horario> DatosHorario=new DaoHorarioimpl().horariosQry();
       List<Horario> DatosGrupoHorario=new DaoHorarioimpl().horariosGrupo(id_curso_grupo_tutor_actual);
       String id = request.getParameter("id");
       
       programacion.addObject("id",id);
       programacion.addObject("cursos",Datocursos);
       programacion.addObject("tutores", DatosTutores);
       programacion.addObject("programaciones", DatosProgramacion);
       programacion.addObject("horarios", DatosHorario);
       programacion.setViewName("ProgramacionAcademica");
        
       return programacion;
   }
   
    @RequestMapping(value = "/Principal/AgregarProgramacion.htm", method =RequestMethod.POST )
    public String AgregarProgra(
            @RequestParam("id_proceso") String id_proceso,
            @RequestParam("id_curso") String id_curso,
            @RequestParam("id_tutor") String id_tutor,
            @RequestParam("nro_grupo") String nro_grupo 
            
    )
    {
        int id_proceso2=Integer.parseInt(id_proceso);
        int id_curso2=Integer.parseInt(id_curso);
        int id_tutor2=Integer.parseInt(id_tutor);
        int nro_grupo2=Integer.parseInt(nro_grupo);
        
        ProgramacionAcademica programacion=new ProgramacionAcademica(nro_grupo2,id_curso2,id_tutor2,id_proceso2);
        String mensaje=new DaoPrograimpl().programacionIns(programacion);
        System.out.print(mensaje);
        
        return "redirect:/Principal/ProgramacionAcademica.htm?id="+id_proceso;
       
    }
    
    @RequestMapping(value = "/Principal/AgregarHorario.htm", method = RequestMethod.POST)
    public String AgregarHorario
        (@RequestParam("id_hora") String id_hor,
        @RequestParam("id_programacion") String id_progra,
        @RequestParam("id_proceso") String id_proceso
        )
    {
        int id_hora=Integer.parseInt(id_hor);
        int id_programacion=Integer.parseInt(id_progra);
        
        GrupoHorario gp=new GrupoHorario(id_programacion,id_hora);
        String mensaje=new DaoGrupoHorarioimpl().grupoHorarioins(gp);
        System.out.print(mensaje);
        
        return "redirect:/Principal/ProgramacionAcademica.htm?id="+id_proceso;
    }
    
    
    
    public void ListaCursos(ModelAndView mav)
    {
        List<Curso> curso=new DaoCursoimpl().cursosQry();
        mav.addObject("cursos",curso);
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
