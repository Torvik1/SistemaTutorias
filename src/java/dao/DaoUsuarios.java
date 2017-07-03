/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Usuario;
import java.util.List;


public interface DaoUsuarios {
    
     public List<Usuario> usuariosQry(String tipoUsuario);
    
    public String usuarioIns(Usuario usuario);
    
    public String usuarioDel(Usuario usuario);
    
    public Usuario usuarioGet(String idautor);
    
   // public String personasUpd(Persona autores);
    
   // public List<Object[]> personasCbo();
    
  //  public String getMessage();
}

