/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.implement;

import dao.DaoProceso;
import dto.ProcesoTutoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import parainfo.sql.ConectaDb;


public class DaoProcesoimpl implements DaoProceso {
    private final ConectaDb db;
    private final StringBuilder sql;
    private String message;

    public DaoProcesoimpl() {
        this.db = new ConectaDb();
        this.sql = new StringBuilder();
    }
    
    
    
    @Override
    public List<ProcesoTutoria> procesoQry() {
        List<ProcesoTutoria> list = null;
        sql.delete(0, sql.length())
                .append("SELECT ")
                .append("oid,")
                .append("periodo_academico,")
                .append("fecha_inicio,")
                .append("fecha_cierre,")
                .append("ley_universitaria,")
                .append("estado ")
                .append("FROM proceso ");
                
               try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString());
                ResultSet rs = ps.executeQuery()) {

            list = new LinkedList<>();

            while (rs.next()) {
                ProcesoTutoria proceso = new ProcesoTutoria();
                proceso.setId(rs.getInt(1));
                proceso.setperiodo(rs.getString(2));
                proceso.setFechaApertura(rs.getString(3));
                proceso.setFechaClausura(rs.getString(4));
                proceso.setLeyuniversitaria(rs.getString(5));
                proceso.setEstado(rs.getString(6));
               
                list.add(proceso);
            }

        } catch (SQLException e) {
            message = e.getMessage();
        }

        return list;
    }
    

    @Override
    public String procesoIns(ProcesoTutoria proceso) {
       sql.delete(0, sql.length())
                .append("INSERT INTO proceso(")
                .append("periodo_academico, ")
                .append("fecha_inicio, ")
                .append("fecha_cierre, ")
                .append("ley_universitaria, ")
                .append("estado")
                .append(") VALUES(?,?,?,?,?)");
       try (Connection cn = db.getConnection();
                PreparedStatement ps = cn.prepareStatement(sql.toString())) {

           
            ps.setString(1, proceso.getperiodo());
            ps.setString(2, proceso.getFechaApertura());
            ps.setString(3, proceso.getFechaClausura());
            ps.setString(4, proceso.getLeyuniversitaria());
            ps.setString(5, proceso.getEstado());
          
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
    public String procesoDel(int ids) {

       return "hola";
    }
    
}
