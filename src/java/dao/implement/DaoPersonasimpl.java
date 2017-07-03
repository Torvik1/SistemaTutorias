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
                .append("dni,")
                .append("nombres,")
                .append("apellidos,")
                .append("fecha_nacimiento,")
                .append("telefono,")
                .append("direccion,")
                .append("email_1,")
                .append("email_2 ")
                .append("FROM persona as p inner join user as u ")
                .append("on p.dni=u.persona_dni ")
                .append("where u.tipo_usuario='")
                .append(tipoUsuario)
                .append("' and u.estado='activo'");
        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                Persona personas = new Persona();

                personas.setId(rs.getInt(1));
                personas.setNombres(rs.getString(2));
                personas.setApellidos(rs.getString(3));
                personas.setFecha_nacimiento(rs.getDate(4));
                personas.setTelefono(rs.getString(5));
                personas.setDireccion(rs.getString(6));
                personas.setEmail(rs.getString(7));
                personas.setEmail2(rs.getString(8));
                
                list.add(personas);
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }
    
    @Override
    public Persona personasGet(String persona_id) {
        Persona persona = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("*FROM persona ")
                .append("WHERE persona_id = ?");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

            ps.setString(1, persona_id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    persona = new Persona();

                    persona.setId(rs.getInt(1));
                    persona.setNombres(rs.getString(2));
                    persona.setApellidos(rs.getString(3));
                    persona.setFecha_nacimiento(rs.getDate(4));
                    persona.setTelefono(rs.getString(5));
                    persona.setDireccion(rs.getString(6));
                    persona.setEmail(rs.getString(7));
                    persona.setEmail2(rs.getString(8));

                } else {
                    message = "fila de id " + persona_id + " no existe";
                }

            } catch (SQLException e) {
                message = e.getMessage();
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return persona;
    }
    
     @Override
    public String personasIns(Persona persona) {
        sql.delete(0, sql.length())
                .append("INSERT INTO persona(")
                .append("dni, ")
                .append("nombres, ")
                .append("apellidos, ")
                .append("fecha_nacimiento, ")
                .append("telefono, ")
                .append("direccion, ")
                .append("email_1, ")
                .append("email_2")
                .append(") VALUES(?,?,?,?,?,?,?,?)");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

            ps.setInt(1, persona.getId());
            ps.setString(2, persona.getNombres());
            ps.setString(3, persona.getApellidos());
            ps.setDate(4,  persona.getFecha_nacimiento());
            ps.setString(5, persona.getTelefono());
            ps.setString(6, persona.getDireccion());
            ps.setString(7, persona.getEmail());
            ps.setString(8, persona.getEmail2());
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
    public String personaUpd(Persona persona) {
        sql.delete(0, sql.length())
                .append("UPDATE persona SET ")
                .append("nombres = ?,")
                .append("apellidos = ?,")
                .append("fecha_nacimiento = ?,")
                .append("telefono = ?,")
                .append("direccion = ?,")
                .append("email_1 = ?,")
                .append("email_2 = ? ")
                .append("WHERE dni = ?");

        try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {
                ps.setString(1,persona.getNombres());
                ps.setString(2,persona.getApellidos());
                ps.setDate(3,persona.getFecha_nacimiento());
                ps.setString(4,persona.getTelefono());
                ps.setString(5,persona.getDireccion());
                ps.setString(6,persona.getEmail());
                ps.setString(7,persona.getEmail2());
                ps.setInt(8,persona.getId());
          

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
    public String personasDel(String ids) {
    return "hola";
    }
    
   
}
