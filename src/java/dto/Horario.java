
package dto;


public class Horario {

    private int id;
    private String dia;
    private int inicio;
    private int fin;

    public Horario() {
    }

    public Horario(int id, String dia, int inicio, int fin) {
        this.id = id;
        this.dia = dia;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
    
}
