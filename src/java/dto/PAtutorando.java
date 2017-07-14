
package dto;


public class PAtutorando
{
int id;
int id_user;
int id_programacion_academica;

    public PAtutorando() {
    }

    public PAtutorando(int id, int id_user, int id_programacion_academica) {
        this.id = id;
        this.id_user = id_user;
        this.id_programacion_academica = id_programacion_academica;
    }

    public PAtutorando(int id_user, int id_programacion_academica) {
        this.id_user = id_user;
        this.id_programacion_academica = id_programacion_academica;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_programacion_academica() {
        return id_programacion_academica;
    }

    public void setId_programacion_academica(int id_programacion_academica) {
        this.id_programacion_academica = id_programacion_academica;
    }

    

}
