

package dto;

public class Usuario 
{
    private int id;
    private String username;
    private String password;
    private String tipo;
    private int persona_id;
    private String estado;
    
    public Usuario(int id, String username, String password, String tipo, int persona_id,String estado) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tipo = tipo;
        this.persona_id = persona_id;
        this.estado=estado;
    }

  
    
  

    public Usuario() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
