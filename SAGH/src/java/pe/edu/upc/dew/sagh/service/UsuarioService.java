/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.service;

import pe.edu.upc.dew.sagh.dao.UsuarioDao;
import pe.edu.upc.dew.sagh.model.Usuario;

/**
 *
 * @author u921344
 */
public class UsuarioService {

    private UsuarioDao usuarioDao;
    
    public UsuarioService(){
        usuarioDao = new UsuarioDao();
    }

    public boolean login(Usuario usuario){
        Usuario usuarioBd = usuarioDao.getUsuarioXUsername(usuario.getUsername());
        if (usuario.getPassword().equals(usuarioBd.getPassword())){
            usuario.setIdUsuario(1);
            usuario.setNombres("Alvaro");
            usuario.setApellidoPaterno("Millones");
            usuario.setApellidoMaterno("Millones");
            usuario.setTipoUsuario(2); // user counter
            return true;
        }
        return false;
    }

}
