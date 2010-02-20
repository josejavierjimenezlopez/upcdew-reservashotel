/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.sagh.model;

/**
 *
 * @author u921344
 */
public class Usuario {

    private Integer idUsuario;
    private String username;
    private String password;
    private Integer tipoUsuario; // 1 --> admin, 2 --> counter, 3 --> recepcionista

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;


    public Usuario(){
        //this.roles = new ArrayList<Rol>();
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    boolean validarPassword(String passwordIngresado) {
        if (password.equals(passwordIngresado)){
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Integer tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /*
    public void agregarRol(Rol rol){
        roles.add(rol);
    }*/

    public String getNombreCompleto(){
        return getNombres() + " " + getApellidoPaterno() + getApellidoMaterno();
    }

    public String getDescripcionTipo(){

        String descripcion;

        if (tipoUsuario == 1){
            descripcion = "Administrador";
        }
        else if (tipoUsuario == 2){
            descripcion = "Counter";
        }
        else {
            descripcion = "Recepcionista";
        }

        return descripcion;
        /*switch (tipoUsuario){
            case 1: return "Administrado";
            case 2: return "Counter";
            case 3: return "Recepcionista";
            default: return "No existe";
        }*/
    }


}
