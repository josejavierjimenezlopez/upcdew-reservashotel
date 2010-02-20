package pe.edu.upc.dew.sagh.model;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E36CFC7C-B45A-049F-4695-D2043C6DDCA9]
// </editor-fold> 
public class AgenciaCliente {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CA52A235-F785-6474-D2AA-08D7FF8F3DC8]
    // </editor-fold> 
    private int codigoCliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8AA2D4AB-9FC9-4F79-ACAE-EAB79F95309B]
    // </editor-fold> 
    private String razonSocial;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.000BBF55-7EE0-0284-B589-6F2DBB697436]
    // </editor-fold> 
    private String RUC;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.43E51EB4-521E-53F6-2F50-F8881B9EDE59]
    // </editor-fold> 
    private int tipoCliente;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.411CF4F4-905D-F02B-D690-3DA6DCB9DDC8]
    // </editor-fold> 
    private double comision;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9E9D6F1C-0A5E-1377-5D86-7F328F220008]
    // </editor-fold> 
    private boolean estado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BEDADD18-458A-5FF4-2C18-9E71D904B131]
    // </editor-fold> 
    public AgenciaCliente () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FEA0FB36-F76B-868B-5F3E-46DA80D46FF5]
    // </editor-fold> 
    public String getRUC () {
        return RUC;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0EF20B2C-CCBF-D29B-10D2-A203E664B045]
    // </editor-fold> 
    public void setRUC (String val) {
        this.RUC = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C908B0A4-720B-95EA-5881-518C149DBD32]
    // </editor-fold> 
    public int getCodigoCliente () {
        return codigoCliente;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AE7224A6-7B23-9822-0371-108815355E85]
    // </editor-fold> 
    public void setCodigoCliente (int val) {
        this.codigoCliente = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E9790E8A-A47E-C43A-BDBA-CA805E851366]
    // </editor-fold> 
    public double getComision () {
        return comision;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8EB819CB-E4B0-441E-9920-CDD88D215E45]
    // </editor-fold> 
    public void setComision (double val) {
        this.comision = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B4C24553-FE1B-8952-C1B5-AA3AF74C02DD]
    // </editor-fold> 
    public boolean getEstado () {
        return estado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F416AFC0-3F43-A9BC-895E-237807936790]
    // </editor-fold> 
    public void setEstado (boolean val) {
        this.estado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.62935323-7632-2D0B-B028-82E76A13EC90]
    // </editor-fold> 
    public String getRazonSocial () {
        return razonSocial;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CDB1ECCC-36FF-08C6-300A-FC05BB3A6870]
    // </editor-fold> 
    public void setRazonSocial (String val) {
        this.razonSocial = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7654281A-0638-9EC3-4531-A88385E8E7E5]
    // </editor-fold> 
    public int getTipoCliente () {
        return tipoCliente;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.41A81D17-A8DD-71CA-423B-F48247819513]
    // </editor-fold> 
    public void setTipoCliente (int val) {
        this.tipoCliente = val;
    }

}

