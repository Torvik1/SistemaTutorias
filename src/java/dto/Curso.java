
package dto;


public class Curso {
    private int id;
    private String nombre;
    private int credito;
    private int ciclo;
    private int cod_plan;

    public Curso() {
    }

    public Curso(int id, String nombre, int credito, int ciclo, int cod_plan) {
        this.id = id;
        this.nombre = nombre;
        this.credito = credito;
        this.ciclo = ciclo;
        this.cod_plan = cod_plan;
    }

    public int getCod_plan() {
        return cod_plan;
    }

    public void setCod_plan(int cod_plan) {
        this.cod_plan = cod_plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    
    
}
