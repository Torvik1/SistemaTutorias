
package dao.implement;

import dao.DaoPAtutorando;
import dto.PAtutorando;
import dto.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import parainfo.sql.ConectaDb;


public class DaoPAtutorandoimpl implements DaoPAtutorando{

     private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoPAtutorandoimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }
    
    @Override
    public String PAtutorandoIns(PAtutorando PAtutorando) {
       
        sql.delete(0, sql.length())
                .append("INSERT INTO curso_grupo_tutor_tutorando(")
                .append("user_codigo, ")
                .append("curso_grupo_tutor_oid")
                .append(") VALUES(?,?)");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

          
            ps.setInt(1, PAtutorando.getId_user());
            ps.setInt(2, PAtutorando.getId_programacion_academica());
            
            
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
    public List<Persona> PAtutorandoqry(int id_PAtutorando) {
         List<Persona> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("curso_grupo_tutor_tutorando.oid,")
                .append("user.codigo,")
                .append("persona.nombres,")
                .append("persona.apellidos,")
                .append("persona.telefono,")
                .append("persona.email_1,")
                .append("persona.email_2 ")
                .append("FROM user,curso_grupo_tutor_tutorando,persona,curso_grupo_tutor ")
                .append("where curso_grupo_tutor_tutorando.curso_grupo_tutor_oid= curso_grupo_tutor.oid and curso_grupo_tutor_tutorando.user_codigo=user.codigo  and persona.dni=user.persona_dni and grupo_tutor_tutorando.oid=")
                .append(id_PAtutorando);
                
               try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
               Persona persona=new Persona();
               persona.setId(rs.getInt(1));
               persona.setId_usuario(rs.getInt(2));
               persona.setNombres(rs.getString(3));
               persona.setApellidos(rs.getString(4));
               persona.setTelefono(rs.getString(5));
               persona.setEmail(rs.getString(6));
               persona.setEmail2(rs.getString(7));
               
               list.add(persona);
               
                
        
                }
       } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }

    
    
}
