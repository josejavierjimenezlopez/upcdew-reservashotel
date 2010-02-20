/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.service.CounterService;

/**
 *
 * @author gecs
 */
public class ListadoHabitacionesServlet extends HttpServlet {

    private CounterService counterService;

    public ListadoHabitacionesServlet() {
        counterService = new CounterService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("=============Inicio ListadoHabitacionesServlet=============");
        System.out.println("Entro al doGet");
        
        List<Habitacion> lista = counterService.obtenerHabitaciones();

        // se pinta la lista
        for (Habitacion habitacion : lista) {
            System.out.println("codigo: [" + habitacion.getCodigoHabitacion() + "]");
            System.out.println("descripcion: [" + habitacion.getDescripcionHabitacion() + "]");
        }

        req.setAttribute("listaHabitaciones", lista);
        req.getRequestDispatcher("listadoHabitaciones.jsp").forward(req, resp);

        System.out.println("=============Fin ListadoHabitacionesServlet=============");

    }


   
}
