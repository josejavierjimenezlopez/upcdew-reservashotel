/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.service;

import java.util.List;
import pe.edu.upc.dew.sagh.dao.JefeReservasDao;
import pe.edu.upc.dew.sagh.model.Reserva;

/**
 *
 * @author gecs
 */
public class JefeReservasService {

    private JefeReservasDao administradorDao;

    public JefeReservasService() {
        administradorDao = new JefeReservasDao();
    }

    public List<Reserva> obtenerReservas() {
        return administradorDao.obtenerReservas();
    }

    

}
