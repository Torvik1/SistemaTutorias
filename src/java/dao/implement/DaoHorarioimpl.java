
package dao.implement;

import dao.DaoHorario;
import dto.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import parainfo.sql.ConectaDb;


public class DaoHorarioimpl implements DaoHorario {

    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoHorarioimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }
    
    
    @Override
    public List<Horario> horariosQry() {
        List<Horario> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("oid,")
                .append("dia,")
                .append("hora_inicio,")
                .append("hora_fin ")
                .append("FROM horario");
                
                
                try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                Horario horario = new Horario();

                horario.setId(rs.getInt(1));
                horario.setDia(rs.getString(2));
                horario.setInicio(rs.getInt(3));
                horario.setFin(rs.getInt(4));
                        
                list.add(horario);
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }

    @Override
    public List<Horario> horariosGrupo(int id_curso_grupo_tutor) {
         List<Horario> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("programacion_academica.oid,")
                .append("dia,")
                .append("hora_inicio,")
                .append("hora_fin ")
                .append("FROM horario,programacion_academica,curso_grupo_tutor ")
                .append("where horario.oid=programacion_academica.horario_oid and curso_grupo_tutor.oid=programacion_academica.curso_grupo_tutor_oid and curso_grupo_tutor.oid=")
                .append(id_curso_grupo_tutor);
                
                
                try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                Horario horario = new Horario();
                horario.setId(rs.getInt(1));
                horario.setDia(rs.getString(2));
                horario.setInicio(rs.getInt(3));
                horario.setFin(rs.getInt(4));
                        
                list.add(horario);
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }
    
    
}