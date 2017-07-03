
package dao.implement;

import dao.DaoUsuarios;
import dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import parainfo.sql.ConectaDb;


public class DaoUsuarioimpl implements DaoUsuarios
{
    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoUsuarioimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }
    
    
     @Override
    public String usuarioIns(Usuario usuario) {
        sql.delete(0, sql.length())
                .append("INSERT INTO user(")
                .append("codigo, ")
                .append("username, ")
                .append("password, ")
                .append("perfil_oid, ")
                .append("persona_dni, ")
                .append("estado, ")
                .append("tipo_usuario")
                .append(") VALUES(?,?,?,?,?,?,?)");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

          
            ps.setInt(1, usuario.getId());
            ps.setString(2, usuario.getUsername());
            ps.setString(3, usuario.getPassword());
            ps.setInt(4,1); 
            ps.setInt(5,usuario.getPersona_id());
            ps.setString(6, usuario.getEstado());
            ps.setString(7, usuario.getTipo());  
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
    public String usuarioDel(Usuario user)
    {
        
        sql.delete(0, sql.length())
                .append("UPDATE user SET ")
                .append("estado = ? ")
                .append("WHERE persona_dni = ?");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

            ps.setString(1, user.getEstado());
            ps.setInt(2, user.getPersona_id());

            int ctos = ps.executeUpdate();
            if (ctos == 0) {
                throw new SQLException("0 filas afectadas");
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return message;
    }
    
    @Override
    public Usuario usuarioGet(String idautor)
    {
        return new Usuario();
    }

    @Override
    public List<Usuario> usuariosQry(String tipoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
