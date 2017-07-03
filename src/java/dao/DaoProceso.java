
package dao;

import dto.ProcesoTutoria;
import java.util.List;


public interface DaoProceso
{
     public List<ProcesoTutoria> procesoQry();
    
    public String procesoIns(ProcesoTutoria proceso);
    
    public String procesoDel(int ids);
}
