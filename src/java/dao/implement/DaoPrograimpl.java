
package dao.implement;

import dao.DaoProgramacion;
import dto.DatosProgra;
import dto.ProgramacionAcademica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import parainfo.sql.ConectaDb;


public class DaoPrograimpl implements DaoProgramacion{
    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoPrograimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }

    @Override
    public String programacionIns(ProgramacionAcademica programacion) {
        sql.delete(0, sql.length())
                .append("INSERT INTO curso_grupo_tutor(")
                .append("grupo, ")
                .append("curso_oid, ")
                .append("user_codigo, ")
                .append("proceso_oid")
                .append(") VALUES(?,?,?,?)");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

            ps.setInt(1, programacion.getGrupo());
            ps.setInt(2, programacion.getCodigo_curso());
            ps.setInt(3, programacion.getCodigo_tutor());
            ps.setInt(4, programacion.getCodigo_proceso());
            
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

    @Override
    public List<DatosProgra> programacionQry(int id_proceso) {
        List<DatosProgra> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("curso_grupo_tutor.oid,")
                .append("curso_grupo_tutor.grupo,")
                .append("curso_grupo_tutor.proceso_oid,")
                .append("curso.nombre,")
                .append("persona.nombres,")
                .append("persona.apellidos ")
                .append("FROM proceso,curso,user,curso_grupo_tutor,persona ")
                .append("where curso_grupo_tutor.curso_oid=curso.oid and curso_grupo_tutor.user_codigo=user.codigo and curso_grupo_tutor.proceso_oid=proceso.oid and persona.dni=user.persona_dni and proceso.oid=")
                .append(id_proceso);
                
                
               try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                DatosProgra programacion = new DatosProgra();
                programacion.setId(rs.getInt(1));
                programacion.setGrupo(rs.getInt(2));
                programacion.setId_proceso(rs.getInt(3));
                programacion.setNombre_curso(rs.getString(4));
                programacion.setNombre_tutor(rs.getString(5));
                programacion.setApellido_tutor(rs.getString(6));
               
                list.add(programacion);
        
                }
       } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }
 }

