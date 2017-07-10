
package dao.implement;

import dao.DaoGrupoHorario;
import dto.GrupoHorario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import parainfo.sql.ConectaDb;


public class DaoGrupoHorarioimpl implements DaoGrupoHorario{

     private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoGrupoHorarioimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }
    
    @Override
    public String grupoHorarioins(GrupoHorario grupohorario) {
       
        
        sql.delete(0, sql.length())
                .append("INSERT INTO programacion_academica(")
                .append("horario_oid, ")
                .append("curso_grupo_tutor_oid")
                .append(") VALUES(?,?)");
        
       try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

           
            ps.setInt(1, grupohorario.getId_horario());
            ps.setInt(2, grupohorario.getId_programacion());
           
            int ctos = ps.executeUpdate();
            if (ctos == 0) {
                throw new SQLException("0 filas afectadas");
            }
            else
            {
                message="exito";
                cn.close();
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return message;
            
    }
    
}
