
package modelo;


public class Mod_usuarios_get_set {
    

    private String usu_nombre;
    private String usu_password;
    private String usu_rol;
    private String usu_estado;
    private String usu_foto;

    public Mod_usuarios_get_set() {
    }

    public Mod_usuarios_get_set(String usu_nombre, String usu_password, String usu_rol, String usu_estado, String usu_foto) {
        this.usu_nombre = usu_nombre;
        this.usu_password = usu_password;
        this.usu_rol = usu_rol;
        this.usu_estado = usu_estado;
        this.usu_foto = usu_foto;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_password() {
        return usu_password;
    }

    public void setUsu_password(String usu_password) {
        this.usu_password = usu_password;
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

    
    
}
