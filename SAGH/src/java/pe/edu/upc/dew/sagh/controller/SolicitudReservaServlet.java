/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.edu.upc.dew.sagh.model.Counter;
import pe.edu.upc.dew.sagh.model.DetalleReserva;
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.model.Reserva;
import pe.edu.upc.dew.sagh.model.Usuario;
import pe.edu.upc.dew.sagh.service.CounterService;

/**
 *
 * @author gecs
 */
public class SolicitudReservaServlet extends HttpServlet {

    CounterService counterService;

    public SolicitudReservaServlet(){
        counterService = new CounterService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        System.out.println("=============Inicio SolicitudReservaServlet=============");
        System.out.println("Entro al doPost");

        // se lee los parametros
        String fechaArribo = req.getParameter("txtFechaArribo");
        String fechaRegistro = req.getParameter("txtFechaRegistro");
        String nombreHospedante = req.getParameter("txtHospedante");

        System.out.println("Valor fechaArribo: [" + fechaArribo + "]");
        System.out.println("Valor fechaRegistro: [" + fechaRegistro + "]");
        System.out.println("Valor nombreHospedante: [" + nombreHospedante + "]");

        // se inicializa el objeto
        Reserva reserva = new Reserva();
        System.out.println("llego hasta aqui....0");

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fecha1 = df.parse(fechaArribo);
            reserva.setFechaArriboHospedante(fecha1);
            Date fecha2 = df.parse(fechaRegistro);
            reserva.setFechaRegistroReserva(fecha2);
            // System.out.println("Today = " + df.format(today));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        reserva.setNombreHospedante(nombreHospedante);

        System.out.println("llego hasta aqui....1");

        Usuario usuario = (Usuario)req.getSession().getAttribute("usuario");
        System.out.println("se obtuvo al usuario --> " + usuario);
        
        reserva.setCounter((Counter)usuario);

        System.out.println("llego hasta aqui....2");

        DetalleReserva detalleReserva = new DetalleReserva();
        System.out.println("llego hasta aqui....3");

//        Habitacion habitacionAReservar = (Habitacion)req.getAttribute("habitacionAReservar");

        // x el momento se obtiene del session
        Habitacion habitacionAReservar = (Habitacion)req.getSession().
                                            getAttribute("habitacionAReservar");

        detalleReserva.setHabitacion(habitacionAReservar);
        System.out.println("habitacionAReservar --> " + habitacionAReservar);

        System.out.println("llego hasta aqui....4");
        detalleReserva.setNumeroDiasEstancia(Integer.parseInt(
                req.getParameter("txtNumDiasEstancia")));
        System.out.println("llego hasta aqui....5");

        System.out.println("DetalleReserva.Habitacion.Codigo: [" +
                detalleReserva.getHabitacion().getCodigoHabitacion() + "]");
        System.out.println("DetalleReserva.Habitacion.Descripcion: [" +
                detalleReserva.getHabitacion().getDescripcionHabitacion() + "]");
        System.out.println("DetalleReserva.NumeroDiasEstancia: [" +
                detalleReserva.getNumeroDiasEstancia() + "]");
        
        reserva.setDetalleReserva(detalleReserva);

        System.out.println("Valor total: [" + reserva.getTotal() + "]");

        // se registra la Reserva
        Integer codigoGenerado = counterService.solicitarReserva(reserva);

        if (codigoGenerado != -1){ // si todo salio ok
            req.setAttribute("tipoMensaje", "exito");
            req.setAttribute("textoMensaje", "Se solicitó la reserva satisfactoriamente.");
        }
        else{
            req.setAttribute("tipoMensaje", "error");
            req.setAttribute("textoMensaje", "Ocurrio un error al solicitar la reserva.");
        }

        req.getRequestDispatcher("Mensaje.jsp").forward(req, resp);

        System.out.println("=============Fin SolicitudReservaServlet=============");

        
    }

    
    
}
