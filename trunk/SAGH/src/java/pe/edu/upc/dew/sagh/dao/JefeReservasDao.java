/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.upc.dew.sagh.model.Counter;
import pe.edu.upc.dew.sagh.model.DetalleReserva;
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.model.Reserva;

/**
 *
 * @author gecs
 */
public class JefeReservasDao {

    public List<Reserva> obtenerReservas() {
        List<Reserva> lista = new ArrayList();

        Reserva reserva = new Reserva();
        reserva.setCodigoReserva(1);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            reserva.setFechaRegistroReserva(df.parse("20/02/2010"));
            reserva.setFechaArriboHospedante(df.parse("25/02/2010"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        

        Counter counter = new Counter();
        counter.setIdUsuario(1);
        counter.setUsername("amillones");
        counter.setPassword("123");
        counter.setNombres("Alvaro");
        counter.setApellidoPaterno("Millones");
        counter.setApellidoMaterno("Millones");
        counter.setTipoUsuario(2); // user counter

        reserva.setCounter(counter);

        reserva.setNombreHospedante("Pepito Perez");

        DetalleReserva detalleReserva = new DetalleReserva();

        Habitacion habitacion = new Habitacion();
        habitacion.setCodigoHabitacion(2);
        habitacion.setDescripcionHabitacion("Habitación simple con piscina");
        habitacion.setTipoHabitacion(2);
        habitacion.setPrecioXNoche(500.0);
        habitacion.setCapacidadHabitacion(15);

        detalleReserva.setHabitacion(habitacion);
        detalleReserva.setNumeroDiasEstancia(2);

        reserva.setDetalleReserva(detalleReserva);
        reserva.setEstado(1);

        lista.add(reserva);


        // ------------- Reserva #2 -------------

        reserva = new Reserva();
        reserva.setCodigoReserva(2);

        try {
            reserva.setFechaRegistroReserva(df.parse("19/02/2010"));
            reserva.setFechaArriboHospedante(df.parse("24/02/2010"));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

        reserva.setCounter(counter);

        reserva.setNombreHospedante("Juanito Gomez");

        detalleReserva = new DetalleReserva();

        habitacion = new Habitacion();
        habitacion.setCodigoHabitacion(3);
        habitacion.setDescripcionHabitacion("Habitación con vista al mar");
        habitacion.setTipoHabitacion(3);
        habitacion.setPrecioXNoche(800.0);
        habitacion.setCapacidadHabitacion(10);

        detalleReserva.setHabitacion(habitacion);
        detalleReserva.setNumeroDiasEstancia(2);

        reserva.setDetalleReserva(detalleReserva);

        reserva.setEstado(1);

        lista.add(reserva);

        return lista;
    }


}
