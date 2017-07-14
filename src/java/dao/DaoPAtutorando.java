
package dao;

import dto.PAtutorando;
import dto.Persona;
import java.util.List;


public interface DaoPAtutorando {
    
    public String PAtutorandoIns(PAtutorando PAtutorando);
    public List<Persona> PAtutorandoqry(int id_PAtutorando);
}
