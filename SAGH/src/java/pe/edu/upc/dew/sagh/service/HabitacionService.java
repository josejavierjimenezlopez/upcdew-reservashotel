/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.service;

import java.util.List;
import pe.edu.upc.dew.sagh.model.Habitacion;
import pe.edu.upc.dew.sagh.dao.HabitacionDao;

/**
 *
 * @author gecs
 */
public class HabitacionService {

   private HabitacionDao habitacionDao;

   public HabitacionService() {
       habitacionDao = new HabitacionDao();
   }

    

}
