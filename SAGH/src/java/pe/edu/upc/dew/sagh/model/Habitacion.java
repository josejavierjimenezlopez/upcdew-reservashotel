package pe.edu.upc.dew.sagh.model;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.50A8F8A9-F22F-3ADE-660B-45EE28EE0D42]
// </editor-fold> 
public class Habitacion {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A710BB50-C909-15C8-C57F-8A2262C1AB79]
    // </editor-fold> 
    private Integer codigoHabitacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28FCD5CC-ED4F-61BE-440A-109B7558B3C4]
    // </editor-fold> 
    private String descripcionHabitacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.62540AAF-92DD-2354-AA99-98F31470F228]
    // </editor-fold>
    // 1 --> Simple
    // 2 --> Suite
    // 3 --> Matrimonial
    private Integer tipoHabitacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5E61BA43-AF35-C3B0-AD9E-8E177904C11F]
    // </editor-fold> 
    private Double precioXNoche;

    private Integer capacidadHabitacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker ">
    // #[regen=yes,id=DCE.AC416945-4742-39E6-055C-A0B6E6C4DF86]
    // </editor-fold> 
    public Habitacion () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.52820272-737C-A9A7-D874-C1A21AA964D8]
    // </editor-fold> 
    public Integer getCodigoHabitacion () {
        return codigoHabitacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.016A44F2-C501-08A2-321F-768AC626E3EC]
    // </editor-fold> 
    public void setCodigoHabitacion (Integer val) {
        this.codigoHabitacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.27C015A9-26E5-F65D-69DE-2CCDD6FE1EA4]
    // </editor-fold> 
    public String getDescripcionHabitacion () {
        return descripcionHabitacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.24C6AB31-B994-C10A-53C8-46A5008B2579]
    // </editor-fold> 
    public void setDescripcionHabitacion (String val) {
        this.descripcionHabitacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FEDAD111-0E64-5573-10E7-3B232074A3E6]
    // </editor-fold> 
    public Double getPrecioXNoche () {
        return precioXNoche;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EFFCA108-5F26-51B9-4531-DE6DEEB15304]
    // </editor-fold> 
    public void setPrecioXNoche (Double val) {
        this.precioXNoche = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C2041D4F-ECFD-CEBD-7162-76E93E049F1E]
    // </editor-fold> 
    public Integer getTipoHabitacion () {
        return tipoHabitacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C715D6C2-7353-5F73-4D15-D68A94EF7952]
    // </editor-fold> 
    public void setTipoHabitacion (Integer val) {
        this.tipoHabitacion = val;
    }

    public Integer getCapacidadHabitacion() {
        return capacidadHabitacion;
    }

    public void setCapacidadHabitacion(Integer capacidadHabitacion) {
        this.capacidadHabitacion = capacidadHabitacion;
    }

    public String getDescripcionTipo(){
        String descripcion = "";
        if (tipoHabitacion == 1){
            descripcion = "Simple";
        }
        else if (tipoHabitacion == 2){
            descripcion = "Suite";
        }
        else {
            descripcion = "Matrimonial";
        }
        return descripcion;
    }

}

