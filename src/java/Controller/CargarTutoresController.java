
package Controller;

import dao.implement.DaoPersonasimpl;
import dao.implement.DaoUsuarioimpl;
import dto.Persona;
import dto.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class CargarTutoresController {
    
    @RequestMapping("/Principal/CargarTutores.htm")
   public ModelAndView CargarTutores()
   {
       ModelAndView importar=new ModelAndView();
       List<Persona> DatosTutores;
       DaoPersonasimpl tutores=new DaoPersonasimpl();
       DatosTutores=tutores.personasQry("tutor");
       importar.addObject("valores", DatosTutores);
       importar.setViewName("CargarTutores");
       return importar;
      
   }
   
  
   
 /*  @RequestMapping("tablaTutores.htm")
   public ModelAndView cargarTabla()
   {
       ModelAndView mav=new ModelAndView("tablaTutores");
       List<Persona> DatosTutores;
       DaoPersonasimpl tutores=new DaoPersonasimpl();
        DatosTutores=tutores.personasQry("tutor");
       mav.addObject("valores", DatosTutores);
       return mav;
   }*/
   
   
     @RequestMapping(value="/Principal/Editar.htm",method=RequestMethod.POST)
     public String update(
      @RequestParam("codigo") String codigo,
        @RequestParam("nombres") String nombres,
        @RequestParam("apellidos") String apellidos,
        @RequestParam("fnacimiento") String fnacimiento,
        @RequestParam("telefono") String telefono,
        @RequestParam("direccion") String direccion,
        @RequestParam("email") String email,
        @RequestParam("email2") String email2
     )
     {
         int codigo2=Integer.parseInt(codigo);
         Persona persona=new Persona(codigo2,nombres,apellidos,aDate2(fnacimiento),telefono,email,email2,direccion);
         String mensaje=new DaoPersonasimpl().personaUpd(persona);
         System.out.print(mensaje);
                 
         return ("redirect:/Principal/CargarTutores.htm");
     }
     
     
     @RequestMapping(value="/Principal/Agregar.htm", method = RequestMethod.POST)
     public String agregar(
        @RequestParam("codigo") String codigo,
        @RequestParam("nombres") String nombres,
        @RequestParam("apellidos") String apellidos,
        @RequestParam("fnacimiento") String fnacimiento,
        @RequestParam("telefono") String telefono,
        @RequestParam("direccion") String direccion,
        @RequestParam("email") String email,
        @RequestParam("email2") String email2,
        @RequestParam("id_usuario")String id,
        @RequestParam("username") String username,
        @RequestParam("password") String password
        )
     {
         int codigo2=Integer.parseInt(codigo);
         int id2=Integer.parseInt(id);
         
         Usuario usuario=new Usuario(id2,username,password,"tutor",codigo2,"activo");
         Persona persona=new Persona(codigo2,nombres,apellidos,aDate(fnacimiento),telefono,email,email2,direccion);
         String mensaje=new DaoPersonasimpl().personasIns(persona);
         String mensaje2=new DaoUsuarioimpl().usuarioIns(usuario);
         System.out.println(mensaje+mensaje2);
         
         return "redirect:/Principal/CargarTutores.htm";
     }
     
        @RequestMapping(value = "/Principal/Eliminar.htm",method=RequestMethod.POST)
        public String eliminar(@RequestParam("codigo") String codigo )
        {
            Usuario user=new Usuario();
            user.setPersona_id(Integer.parseInt(codigo));
            user.setEstado("inactivo");
            String mensaje=new DaoUsuarioimpl().usuarioDel(user);
            System.out.println(mensaje);
            
            return "redirect:/Principal/CargarTutores.htm";
        }
        
     
     
     public static Date aDate(String fecha) {
        Date result = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);//No permite ingresar fechas u horas incorrectas

        try {
            java.util.Date utilDate = sdf.parse(fecha);
            result = new java.sql.Date(utilDate.getTime());

        } catch (ParseException ex) {
        }

        return result;
    }
     public static Date aDate2(String fecha) {
        Date result = null;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false);//No permite ingresar fechas u horas incorrectas

        try {
            java.util.Date utilDate = sdf.parse(fecha);
            result = new java.sql.Date(utilDate.getTime());

        } catch (ParseException ex) {
        }

        return result;
    }
}
