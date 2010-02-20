package pe.edu.upc.dew.sagh.model;

import java.util.ArrayList;
import java.util.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B3484596-593B-3C73-9409-D9EFB95CB1FA]
// </editor-fold> 
public class Counter extends Usuario{

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.62F472FC-355D-4BEB-E0F2-7462CF2AD4AB]
    // </editor-fold> 
    private List<Reserva> reservas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B759520-D108-FF13-2BE9-728F06189285]
    // </editor-fold> 
    public Counter () {
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

