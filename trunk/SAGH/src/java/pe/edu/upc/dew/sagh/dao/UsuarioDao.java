/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.dao;

import pe.edu.upc.dew.sagh.model.Usuario;

/**
 *
 * @author u921344
 */
public class UsuarioDao {

    /**
     * Obtiene un Usuario por username de la BD
     * @param username
     * @return
     */

    public Usuario getUsuarioXUsername(String username){
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1);
        usuario.setUsername("amillones");
        usuario.setPassword("123");
        usuario.setNombres("Alvaro");
        usuario.setApellidoPaterno("Millones");
        usuario.setApellidoMaterno("Millones");
        usuario.setTipoUsuario(2); // user counter
        return usuario;
    }

}
