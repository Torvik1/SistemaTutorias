
package dto;


public class GrupoHorario {
    private int id;
    private int id_programacion;
    private int id_horario;

    public GrupoHorario() {
    }

    public GrupoHorario(int id_programacion, int id_horario) {
        this.id_programacion = id_programacion;
        this.id_horario = id_horario;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_programacion() {
        return id_programacion;
    }

    public void setId_programacion(int id_programacion) {
        this.id_programacion = id_programacion;
    }
    
    
}
