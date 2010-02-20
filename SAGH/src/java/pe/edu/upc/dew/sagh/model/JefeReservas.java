/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gecs
 */
public class JefeReservas extends Usuario {

    private List<Reserva> reservas;

    public JefeReservas () {
        reservas = new ArrayList<Reserva>();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.130687A6-DB35-8F29-77CD-960EA974719D]
    // </editor-fold>
    public List<Reserva> getReservas () {
        return reservas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,regenBody=yes,id=DCE.BB488CF1-4CBB-0F0A-31D4-46BC3D97B40C]
    // </editor-fold>
    public void setReservas (List<Reserva> val) {
        this.reservas = val;
    }

}
