
package modelo;


public class Mod_show_mensajero_get_set {
    
    private int men_id;
    private String usu_nombre;
    private String usu_rol;
    private String usu_estado;
    private String usu_foto;
    private String men_nombre;
    private String men_cedula;
    private String men_direccion;
    private String men_barrio;
    private String men_descripcion;
    private String men_telefono;
    private String men_email;

    public Mod_show_mensajero_get_set() {
    }

    public Mod_show_mensajero_get_set(int men_id) {
        this.men_id = men_id;
    }

    public Mod_show_mensajero_get_set(int men_id, String usu_nombre, String usu_rol, String usu_estado, String usu_foto, String men_nombre, String men_cedula, String men_direccion, String men_barrio, String men_descripcion, String men_telefono, String men_email) {
        this.men_id = men_id;
        this.usu_nombre = usu_nombre;
        this.usu_rol = usu_rol;
        this.usu_estado = usu_estado;
        this.usu_foto = usu_foto;
        this.men_nombre = men_nombre;
        this.men_cedula = men_cedula;
        this.men_direccion = men_direccion;
        this.men_barrio = men_barrio;
        this.men_descripcion = men_descripcion;
        this.men_telefono = men_telefono;
        this.men_email = men_email;
    }

    public int getMen_id() {
        return men_id;
    }

    public void setMen_id(int men_id) {
        this.men_id = men_id;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_rol() {
        return usu_rol;
    }

    public void setUsu_rol(String usu_rol) {
        this.usu_rol = usu_rol;
    }

    public String getUsu_estado() {
        return usu_estado;
    }

    public void setUsu_estado(String usu_estado) {
        this.usu_estado = usu_estado;
    }

    public String getUsu_foto() {
        return usu_foto;
    }

    public void setUsu_foto(String usu_foto) {
        this.usu_foto = usu_foto;
    }

    public String getMen_nombre() {
        return men_nombre;
    }

    public void setMen_nombre(String men_nombre) {
        this.men_nombre = men_nombre;
    }

    public String getMen_cedula() {
        return men_cedula;
    }

    public void setMen_cedula(String men_cedula) {
        this.men_cedula = men_cedula;
    }

    public String getMen_direccion() {
        return men_direccion;
    }

    public void setMen_direccion(String men_direccion) {
        this.men_direccion = men_direccion;
    }

    public String getMen_barrio() {
        return men_barrio;
    }

    public void setMen_barrio(String men_barrio) {
        this.men_barrio = men_barrio;
    }

    public String getMen_descripcion() {
        return men_descripcion;
    }

    public void setMen_descripcion(String men_descripcion) {
        this.men_descripcion = men_descripcion;
    }

    public String getMen_telefono() {
        return men_telefono;
    }

    public void setMen_telefono(String men_telefono) {
        this.men_telefono = men_telefono;
    }

    public String getMen_email() {
        return men_email;
    }

    public void setMen_email(String men_email) {
        this.men_email = men_email;
    }
    
    
}
