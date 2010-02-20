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
import pe.edu.upc.dew.sagh.model.Reserva;
import pe.edu.upc.dew.sagh.service.JefeReservasService;

/**
 *
 * @author gecs
 */
public class ListadoReservasServlet extends HttpServlet {

    private JefeReservasService jefeReservasService;

    public ListadoReservasServlet() {
        jefeReservasService = new JefeReservasService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        System.out.println("=============Inicio ListadoReservasServlet=============");
        System.out.println("Entro al doGet");
        
        List<Reserva> lista = jefeReservasService.obtenerReservas();

        // se pinta la lista
        for (Reserva reserva : lista) {
            System.out.println("codigoReserva: [" + reserva.getCodigoReserva() + "]");
            System.out.println("estadoReserva: [" + reserva.getDescripcionEstado() + "]");
            System.out.println("totalReserva: [" + reserva.getTotal() + "]");
        }

        req.setAttribute("listaReservas", lista);
        req.getRequestDispatcher("listadoReservas.jsp").forward(req, resp);

        System.out.println("=============Fin ListadoReservasServlet=============");

    }


   
}
