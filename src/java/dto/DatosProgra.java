
package dto;


public class DatosProgra {
    int id;
    int grupo;
    int id_proceso;
    String nombre_curso;
    String nombre_tutor;
    String apellido_tutor;
    public DatosProgra() {
    }

    public DatosProgra(int id, int grupo, int id_proceso, String nombre_curso, String nombre_tutor) {
        this.id = id;
        this.grupo = grupo;
        this.id_proceso = id_proceso;
        this.nombre_curso = nombre_curso;
        this.nombre_tutor = nombre_tutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getId_proceso() {
        return id_proceso;
    }

    public void setId_proceso(int id_proceso) {
        this.id_proceso = id_proceso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public String getNombre_tutor() {
        return nombre_tutor;
    }

    public void setNombre_tutor(String nombre_tutor) {
        this.nombre_tutor = nombre_tutor;
    }
    
    
    
    public String getApellido_tutor() {
        return apellido_tutor;
    }

    public void setApellido_tutor(String apellido_tutor) {
        this.apellido_tutor = apellido_tutor;
    }
    
}
