
package Controller;

import dao.DaoPersonas;
import dao.implement.DaoPersonasimpl;
import dto.Alumno;
import dto.Persona;
import dto.ProcesoTutoria;
import dto.ProgramacionAcademica;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
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
       
}
