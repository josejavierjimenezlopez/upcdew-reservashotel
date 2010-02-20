
import pe.edu.upc.dew.sagh.model.Counter;
import pe.edu.upc.dew.sagh.model.Usuario;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gecs
 */
public class Main {

    public static void main(String args[]){

        /*
        Counter user = new Counter();
        user.setIdUsuario(1);
        user.setNombres("aaaa");
        user.setApellidoPaterno("ssss");
        user.setApellidoMaterno("dddd");
        user.setUsername("gecs");
        user.setPassword("123");
        user.setTipoUsuario(1);

        System.out.println("usuario creado");

        Usuario user2 = (Usuario)user;
        System.out.println(user2.getNombreCompleto());
        */

        // Aplicando Herencia
        Usuario user = new Counter();
        user.setIdUsuario(1);
        user.setNombres("aaaa");
        user.setApellidoPaterno("ssss");
        user.setApellidoMaterno("dddd");
        user.setUsername("gecs");
        user.setPassword("123");
        user.setTipoUsuario(1);

        Counter counter = (Counter)user;
        System.out.println(counter.getNombreCompleto());




    }


}
