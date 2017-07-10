
package dao;

import dto.Horario;
import java.util.List;


public interface DaoHorario {
    
    public List<Horario> horariosQry();
    public List<Horario> horariosGrupo(int id);
}
