
package modelo;


public class Mod_show_provedor_get_set {
    
   
    private String usu_nombre;
    private String usu_rol;
    private String usu_estado;
    private String usu_foto;
    private String prove_nit;
    private String prove_nombre;
    private String prove_telefono;
    private String prove_email;
    private String prove_horario;
    private String prove_diceccion;
    
    private int prove_tipo_codigo;

    public Mod_show_provedor_get_set() {
    }

    public Mod_show_provedor_get_set(String usu_nombre, String usu_rol, String usu_estado, String usu_foto, String prove_nit, String prove_nombre, String prove_telefono, String prove_email, String prove_horario, String prove_diceccion, int prove_tipo_codigo) {
        this.usu_nombre = usu_nombre;
        this.usu_rol = usu_rol;
        this.usu_estado = usu_estado;
        this.usu_foto = usu_foto;
        this.prove_nit = prove_nit;
        this.prove_nombre = prove_nombre;
        this.prove_telefono = prove_telefono;
        this.prove_email = prove_email;
        this.prove_horario = prove_horario;
        this.prove_diceccion = prove_diceccion;
        this.prove_tipo_codigo = prove_tipo_codigo;
    }

    public Mod_show_provedor_get_set(String usu_estado, String usu_foto, String prove_nit, String prove_nombre, String prove_telefono, String prove_email, String prove_horario, String prove_diceccion, int prove_tipo_codigo) {
        this.usu_estado = usu_estado;
        this.usu_foto = usu_foto;
        this.prove_nit = prove_nit;
        this.prove_nombre = prove_nombre;
        this.prove_telefono = prove_telefono;
        this.prove_email = prove_email;
        this.prove_horario = prove_horario;
        this.prove_diceccion = prove_diceccion;
        this.prove_tipo_codigo = prove_tipo_codigo;
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

    public String getProve_nit() {
        return prove_nit;
    }

    public void setProve_nit(String prove_nit) {
        this.prove_nit = prove_nit;
    }

    public String getProve_nombre() {
        return prove_nombre;
    }

    public void setProve_nombre(String prove_nombre) {
        this.prove_nombre = prove_nombre;
    }

    public String getProve_telefono() {
        return prove_telefono;
    }

    public void setProve_telefono(String prove_telefono) {
        this.prove_telefono = prove_telefono;
    }

    public String getProve_email() {
        return prove_email;
    }

    public void setProve_email(String prove_email) {
        this.prove_email = prove_email;
    }

    public String getProve_horario() {
        return prove_horario;
    }

    public void setProve_horario(String prove_horario) {
        this.prove_horario = prove_horario;
    }

    public String getProve_diceccion() {
        return prove_diceccion;
    }

    public void setProve_diceccion(String prove_diceccion) {
        this.prove_diceccion = prove_diceccion;
    }


    public int getProve_tipo_codigo() {
        return prove_tipo_codigo;
    }

    public void setProve_tipo_codigo(int prove_tipo_codigo) {
        this.prove_tipo_codigo = prove_tipo_codigo;
    }
    
}
