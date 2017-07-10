
package dto;

import java.util.Date;


public class ProgramacionAcademica {
    private int id;
    private int grupo;
    private int codigo_curso;
    private int codigo_tutor;
    private int codigo_proceso;

    public ProgramacionAcademica() {
    }

    public ProgramacionAcademica(int grupo, int codigo_curso, int codigo_tutor, int codigo_proceso) {
        this.grupo = grupo;
        this.codigo_curso = codigo_curso;
        this.codigo_tutor = codigo_tutor;
        this.codigo_proceso = codigo_proceso;
    }

    public ProgramacionAcademica(int id, int grupo, int codigo_curso, int codigo_tutor, int codigo_proceso) {
        this.id = id;
        this.grupo = grupo;
        this.codigo_curso = codigo_curso;
        this.codigo_tutor = codigo_tutor;
        this.codigo_proceso = codigo_proceso;
    }

    public int getCodigo_proceso() {
        return codigo_proceso;
    }

    public void setCodigo_proceso(int codigo_proceso) {
        this.codigo_proceso = codigo_proceso;
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

    public int getCodigo_curso() {
        return codigo_curso;
    }

    public void setCodigo_curso(int codigo_curso) {
        this.codigo_curso = codigo_curso;
    }

    public int getCodigo_tutor() {
        return codigo_tutor;
    }

    public void setCodigo_tutor(int codigo_tutor) {
        this.codigo_tutor = codigo_tutor;
    }
    

    
    
}
