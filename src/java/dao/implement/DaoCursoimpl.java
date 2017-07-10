
package dao.implement;

import dao.DaoCurso;
import dto.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import parainfo.sql.ConectaDb;


public class DaoCursoimpl implements DaoCurso{
    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoCursoimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }

    @Override
    public List<Curso> cursosQry() {
       List<Curso> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("oid,")
                .append("nombre,")
                .append("credito,")
                .append("ciclo,")
                .append("plan_oid ")
                .append("FROM curso");
                
        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                Curso cursos = new Curso();
                
                cursos.setId(rs.getInt(1));
                cursos.setNombre(rs.getString(2));
                cursos.setCredito(rs.getInt(3));
                cursos.setCiclo(rs.getInt(4));
                cursos.setCod_plan(rs.getInt(5));
               
                
                list.add(cursos);
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }
}
