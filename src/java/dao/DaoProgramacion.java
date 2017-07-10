
package dao;

import dto.DatosProgra;
import dto.ProgramacionAcademica;
import java.util.List;


public interface DaoProgramacion {
    public String programacionIns(ProgramacionAcademica programacion);
    public List<DatosProgra> programacionQry();
}
