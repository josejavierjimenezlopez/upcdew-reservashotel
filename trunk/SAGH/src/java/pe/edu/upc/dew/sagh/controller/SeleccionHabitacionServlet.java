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
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.service.CounterService;

/**
 *
 * @author gecs
 */
public class SeleccionHabitacionServlet extends HttpServlet{

    CounterService counterService;

    public SeleccionHabitacionServlet(){
        counterService = new CounterService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        System.out.println("=============Inicio SeleccionHabitacionServlet=============");
        System.out.println("Entro al doPost");

        // Para mosrar todos los parametros de un jsp
/*        Enumeration paramNames = req.getParameterNames();
        int i = 0;
        while(paramNames.hasMoreElements()) {
            String paramName = (String)paramNames.nextElement();
            System.out.println("paramName[" + i + "]: [" + paramName + "]");
            i+=1;
        }
 */

        // se lee el codigo seleccionado
        Integer codigoHabitacion = Integer.parseInt(req.getParameter("rbTipoSeleccionado"));
        System.out.println("Valor codigoHabitacion: [" + codigoHabitacion + "]");

        // se obtiene la habitacion
        Habitacion habitacion = counterService.obtenerHabitacionXCodigo(codigoHabitacion);
        System.out.println("Valor habitacion.codigo: [" + habitacion.getCodigoHabitacion() + "]");
        System.out.println("Valor habitacion.descripcion: [" + habitacion.getDescripcionHabitacion() + "]");

        // se setea la habitacion
//        req.setAttribute("habitacionAReservar", habitacion);

        req.getSession().setAttribute("habitacionAReservar", habitacion); // x el momento

        // se redirije al JSP respectivo
        req.getRequestDispatcher("solicitudReserva.jsp").forward(req, resp);

        System.out.println("=============Fin SeleccionHabitacionServlet=============");

    }



}
