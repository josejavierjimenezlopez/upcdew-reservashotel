package pe.edu.upc.dew.sagh.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.58E2B808-4941-47BD-F061-629D1E39249C]
// </editor-fold> 
public class Reserva {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4457CD8E-E7EB-BC1D-064F-41AF7F13A1FF]
    // </editor-fold> 
    private Integer codigoReserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B7B4DBA7-0312-C10D-6D54-4409BD2634E8]
    // </editor-fold> 
    private Date fechaRegistroReserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.25B4543A-C8A6-46DF-885B-52705170833B]
    // </editor-fold> 
    private Date fechaArriboHospedante;

    private Counter counter;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.16A54FAE-7063-9D43-A259-DEC238F24A67]
    // </editor-fold> 
    private String nombreHospedante;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1F7962B4-11D9-CF69-3984-8151C16A7B46]
    // </editor-fold> 
    private DetalleReserva detalleReserva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.18B40CB9-3439-F3A7-A9B4-63E14D3ABDE5]
    // </editor-fold>
    private Double total;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.1EE4BEFB-DBEF-9088-2700-629B2B32310A]
    // </editor-fold>
    private Integer estado;


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AA76EFDB-B5DC-D0F7-30F3-FB59E9E4037F]
    // </editor-fold> 
    public Reserva () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.11BB758A-297A-A8FD-C30D-B075BDA13ECE]
    // </editor-fold> 
    public Integer getCodigoReserva () {
        return codigoReserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.307B4CA0-855E-1713-3A7E-CCA1EE8DC23D]
    // </editor-fold> 
    public void setCodigoReserva (Integer val) {
        this.codigoReserva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.84A6B809-34E6-503E-E731-EB1B95852AE8]
    // </editor-fold> 
    public DetalleReserva getDetalleReserva () {
        return detalleReserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.265F78CC-3DB1-72D6-B672-E75B44FFFB27]
    // </editor-fold> 
    public void setDetalleReserva (DetalleReserva val) {
        this.detalleReserva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DBE82E2A-DC86-6326-BBD4-5313EE47D2A4]
    // </editor-fold> 
    public Integer getEstado () {
        return estado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.62C0AEB0-9E4E-67E0-6D6F-1DD7F6A0E8AD]
    // </editor-fold> 
    public void setEstado (Integer val) {
        this.estado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.60F90C82-815B-84F7-B180-E8B462EABA33]
    // </editor-fold> 
    public Date getFechaArriboHospedante () {
        return fechaArriboHospedante;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7D8E30CA-3895-841A-459E-1E23D1D6869A]
    // </editor-fold> 
    public void setFechaArriboHospedante (Date val) {
        this.fechaArriboHospedante = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4693B204-8497-33DB-95B2-4375F1FE2120]
    // </editor-fold> 
    public Date getFechaRegistroReserva () {
        return fechaRegistroReserva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4F9E2968-7562-ADBF-1933-2EE717B8ADC0]
    // </editor-fold> 
    public void setFechaRegistroReserva (Date val) {
        this.fechaRegistroReserva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E9471F5D-5422-7E34-E041-D5851A2F225B]
    // </editor-fold> 
    public String getNombreHospedante () {
        return nombreHospedante;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2F64E01A-09E2-C019-7478-FE97A54143C7]
    // </editor-fold> 
    public void setNombreHospedante (String val) {
        this.nombreHospedante = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.329B8A14-0015-6418-C1AF-D14C4330B317]
    // </editor-fold> 
    public Double getTotal () {
        Double total = 0.0;

        total = detalleReserva.getHabitacion().getPrecioXNoche() *
                detalleReserva.getNumeroDiasEstancia();

        return total;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public String getDescripcionEstado(){
        String descripcion = "";
        if (estado == 1){
            descripcion = "Pendiente";
        }
        else if (estado == 2){
            descripcion = "Confirmada";
        }
        else {
            descripcion = "No existe";
        }
        return descripcion;
    }

    public String getFechaArriboFormateada(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(fechaArriboHospedante);
    }

    public String getFechaRegistroFormateada(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(fechaRegistroReserva);
    }


}

