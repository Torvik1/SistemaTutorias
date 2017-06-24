

package dto;

public class Usuario 
{
    private String id;
    private String username;
    private String password;
    private String tipo;
    private String persona_id;
    public Usuario(String id, String username, String password, String tipo, String persona_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tipo = tipo;
        this.persona_id = persona_id;
    }

  
    public Usuario(String id, String username, String password, String tipo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tipo = tipo;
    }
  

    public Usuario() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
      public String getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(String persona_id) {
        this.persona_id = persona_id;
    }
    
}
