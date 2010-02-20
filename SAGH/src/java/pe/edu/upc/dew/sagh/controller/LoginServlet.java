/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.sagh.model.Counter;
import pe.edu.upc.dew.sagh.model.Usuario;
import pe.edu.upc.dew.sagh.service.UsuarioService;

/**
 *
 * @author gecs
 */
public class LoginServlet extends HttpServlet {

   private UsuarioService usuarioService;

    public LoginServlet(){
        usuarioService = new UsuarioService();
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        System.out.println("=============Inicio LoginServlet=============");
        System.out.println("Entro al doPost");

        // lectura de parametros
        String username = req.getParameter("txtUsuario");
        String password = req.getParameter("txtPassword");

        System.out.println("llego hasta aqui....0");

        // se instancia objetos del model
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);

        System.out.println("username --> [" + username + "]");
        System.out.println("password --> [" + password + "]");

        System.out.println("llego hasta aqui....1");

        // se valida al usuario a traves del Service
        if (usuarioService.login(usuario)){

            Usuario userLogueado = null;

            if (usuario.getTipoUsuario() == 2){
                userLogueado = new Counter();
                userLogueado.setIdUsuario(usuario.getIdUsuario());
                userLogueado.setNombres(usuario.getNombres());
                userLogueado.setApellidoPaterno(usuario.getApellidoPaterno());
                userLogueado.setApellidoMaterno(usuario.getApellidoMaterno());
                userLogueado.setUsername(usuario.getUsername());
                userLogueado.setPassword(usuario.getPassword());
                userLogueado.setTipoUsuario(usuario.getTipoUsuario());
            }

            System.out.println("llego hasta aqui....2");

            // con este metodo se pasa parametros del Servlet al JSP
            // en este caso se pasa el usuario al JSP para renderizarlo
            req.getSession().setAttribute("usuario", userLogueado);
            System.out.println("llego hasta aqui....3");

            // req.setAttribute("roles", roles);

            // se redirige el control hacia "bienvenida.jsp"
            req.getRequestDispatcher("home.jsp").forward(req, resp);
            System.out.println("llego hasta aqui....4");
        }
        else { // si el user no pasa se redirige al "login.jsp"
            req.setAttribute("mensajeError", "Usuario y/o Password incorrecto.");

            req.getRequestDispatcher("login.jsp").forward(req, resp);
            System.out.println("llego hasta aqui....5");
        }

        System.out.println("=============Fin LoginServlet=============");
        
    }

}
