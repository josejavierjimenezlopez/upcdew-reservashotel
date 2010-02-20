/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.service;

import java.util.List;
import pe.edu.upc.dew.sagh.dao.CounterDao;
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.model.Reserva;

/**
 *
 * @author Administrador
 */
public class CounterService {

    CounterDao counterDao;

    public CounterService(){
        counterDao = new CounterDao();
    }

    public Integer solicitarReserva(Reserva nuevaReserva){
        return counterDao.solicitarReserva(nuevaReserva);
    }

    public List<Habitacion> obtenerHabitaciones() {
        return counterDao.obtenerHabitaciones();
    }

    public Habitacion obtenerHabitacionXCodigo(Integer codigoHabitacion){
        return counterDao.obtenerHabitacionXCodigo(codigoHabitacion);
    }

}
