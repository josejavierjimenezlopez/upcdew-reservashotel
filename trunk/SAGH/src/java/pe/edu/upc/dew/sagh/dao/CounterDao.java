/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.model.Reserva;

/**
 *
 * @author Administrador
 */
public class CounterDao {

    public Integer solicitarReserva(Reserva nuevaReserva){
        Integer codigoReserva = -1;

        // se registra en BD
        codigoReserva = 1;
        nuevaReserva.setCodigoReserva(codigoReserva);

        nuevaReserva.getCounter().getReservas().add(nuevaReserva);
        
        return codigoReserva;
    }

    public List<Habitacion> obtenerHabitaciones() {
        List<Habitacion> lista = new ArrayList();

        Habitacion habitacion = new Habitacion();
        habitacion.setCodigoHabitacion(1);
        habitacion.setDescripcionHabitacion("Habitación simple con baño");
        habitacion.setTipoHabitacion(1);
        habitacion.setPrecioXNoche(100.0);
        habitacion.setCapacidadHabitacion(20);


        lista.add(habitacion);

        habitacion = new Habitacion();
        habitacion.setCodigoHabitacion(2);
        habitacion.setDescripcionHabitacion("Habitación simple con piscina");
        habitacion.setTipoHabitacion(2);
        habitacion.setPrecioXNoche(500.0);
        habitacion.setCapacidadHabitacion(15);

        lista.add(habitacion);

        habitacion = new Habitacion();
        habitacion.setCodigoHabitacion(3);
        habitacion.setDescripcionHabitacion("Habitación con vista al mar");
        habitacion.setTipoHabitacion(3);
        habitacion.setPrecioXNoche(800.0);
        habitacion.setCapacidadHabitacion(10);

        lista.add(habitacion);

        return lista;
    }

    public Habitacion obtenerHabitacionXCodigo(Integer codigoHabitacion){
        Habitacion habitacionBuscada = null;
        habitacionBuscada = new Habitacion();
        habitacionBuscada.setCodigoHabitacion(codigoHabitacion);
        if (codigoHabitacion == 1){
            habitacionBuscada.setDescripcionHabitacion("Habitación simple con baño");
            habitacionBuscada.setTipoHabitacion(1);
            habitacionBuscada.setPrecioXNoche(100.0);
            habitacionBuscada.setCapacidadHabitacion(20);
        }
        else if (codigoHabitacion == 2){
            habitacionBuscada.setCodigoHabitacion(2);
            habitacionBuscada.setDescripcionHabitacion("Habitación simple con piscina");
            habitacionBuscada.setTipoHabitacion(2);
            habitacionBuscada.setPrecioXNoche(500.0);
            habitacionBuscada.setCapacidadHabitacion(15);
        }
        else {
            habitacionBuscada.setCodigoHabitacion(3);
            habitacionBuscada.setDescripcionHabitacion("Habitación con vista al mar");
            habitacionBuscada.setTipoHabitacion(3);
            habitacionBuscada.setPrecioXNoche(800.0);
            habitacionBuscada.setCapacidadHabitacion(10);
        }

        return habitacionBuscada;
    }

}
