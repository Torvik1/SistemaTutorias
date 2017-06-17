/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implement;

import dao.DaoPersonas;
import dto.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import parainfo.sql.ConectaDb;
public class DaoPersonasimpl implements DaoPersonas{
    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoPersonasimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }
    
    @Override
    public List<Persona> personasQry(String tipoUsuario) {
        List<Persona> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("persona_id,")
                .append("persona_nombres,")
                .append("persona_apellidos,")
                .append("persona_telefono ")
                .append("FROM persona as p inner join usuario as u ")
                .append("on p.persona_id=u.persona_usuario_id ")
                .append("where u.usuario_tipo='")
                .append(tipoUsuario)
                .append("'");
        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                Persona personas = new Persona();

                personas.setId(rs.getString(1));
                personas.setNombres(rs.getString(2));
                personas.setApellidos(rs.getString(3));
                personas.setTelefono(rs.getString(4));
                list.add(personas);
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }
    
     @Override
    public String personasIns(Persona personas) {
        return "hola";
    }
    
    @Override
    public String personasDel(List<String> ids) {
    return "hola";
    }
    
   
}
