
package dto;

public class ProcesoTutoria 
{
    String codigoperiodo;
    String periodo;
    String leyuniversitaria;

    public ProcesoTutoria() {
    }

    public ProcesoTutoria(String codigoperiodo, String periodo, String leyuniversitaria) {
        this.codigoperiodo = codigoperiodo;
        this.periodo = periodo;
        this.leyuniversitaria = leyuniversitaria;
    }

    public String getCodigoperiodo() {
        return codigoperiodo;
    }

    public void setCodigoperiodo(String codigoperiodo) {
        this.codigoperiodo = codigoperiodo;
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
    
    
    
}
