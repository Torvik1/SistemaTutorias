
package dto;

import java.util.Date;

public class ProcesoTutoria 
{
     int id;
     String periodo;
     String leyuniversitaria;

    
     String fechaApertura;
     String  fechaClausura;
     String estado;
    public ProcesoTutoria() {
    }

    public ProcesoTutoria( int id,String periodo, String leyuniversitaria, String fechaApertura, String fechaClausura,String estado) {
        this.id=id;
        this.periodo = periodo;
        this.leyuniversitaria = leyuniversitaria;
    }

    public ProcesoTutoria( String periodo, String leyuniversitaria, String fechaApertura, String fechaClausura,String estado) {
        
        this.periodo = periodo;
        this.leyuniversitaria = leyuniversitaria;
        this.fechaApertura = fechaApertura;
        this.fechaClausura = fechaClausura;
        this.estado=estado;
    }

  public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  

    public String getperiodo() {
        return periodo;
    }

    public void setperiodo(String periodo) {
        this.periodo = periodo;
    }

    public String getLeyuniversitaria() {
        return leyuniversitaria;
    }

    public void setLeyuniversitaria(String leyuniversitaria) {
        this.leyuniversitaria = leyuniversitaria;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaClausura() {
        return fechaClausura;
    }

    public void setFechaClausura (String fechaClausura) {
        this.fechaClausura = fechaClausura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
