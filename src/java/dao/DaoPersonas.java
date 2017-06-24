
package dao;

import dto.Persona;
import java.util.List;


public interface DaoPersonas
{
    public List<Persona> personasQry(String tipoUsuario);
    
    public String personasIns(Persona persona);
    
    public String personasDel(List<String> ids);
    
    public Persona personasGet(String idautor);
    
   // public String personasUpd(Persona autores);
    
   // public List<Object[]> personasCbo();
    
  //  public String getMessage();
}
