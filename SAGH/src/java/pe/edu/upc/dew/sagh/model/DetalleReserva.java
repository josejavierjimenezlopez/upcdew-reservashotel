package pe.edu.upc.dew.sagh.model;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.58EDF8BC-F3B1-2FFF-EE29-0D55B13D0AA6]
// </editor-fold> 
public class DetalleReserva {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D638C904-AF86-59FE-9B78-DCD6E0CE0D60]
    // </editor-fold> 
    private Integer numeroDiasEstancia;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0745DE8C-4261-1088-8A17-4361E6E718B1]
    // </editor-fold> 
    private Habitacion habitacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8CE73977-A5AB-1FA1-3BA3-1F1195E961A0]
    // </editor-fold> 
    public DetalleReserva () {
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C1F87821-5F88-7C5D-3BF1-020405FF0FB0]
    // </editor-fold> 
    public Habitacion getHabitacion () {
        return habitacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7E701E82-973B-7AFC-9C80-064BBAF766FD]
    // </editor-fold> 
    public void setHabitacion (Habitacion val) {
        this.habitacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D4D807E8-7E2A-6C50-363D-F0CDC29C517B]
    // </editor-fold> 
    public Integer getNumeroDiasEstancia () {
        return numeroDiasEstancia;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.435A048B-19EA-AF60-350B-A61246848D39]
    // </editor-fold> 
    public void setNumeroDiasEstancia (Integer val) {
        this.numeroDiasEstancia = val;
    }

}

