
package modelo;

public class Mod_tipo_proveedor_get_set {
    
    private int tipo_codigo;
    private String tipo_nombre;
    private  String tipo_descripcion;

    public Mod_tipo_proveedor_get_set() {
    }

    public Mod_tipo_proveedor_get_set(int tipo_codigo, String tipo_nombre, String tipo_descripcion) {
        this.tipo_codigo = tipo_codigo;
        this.tipo_nombre = tipo_nombre;
        this.tipo_descripcion = tipo_descripcion;
    }

    public int getTipo_codigo() {
        return tipo_codigo;
    }

    public void setTipo_codigo(int tipo_codigo) {
        this.tipo_codigo = tipo_codigo;
    }

    public String getTipo_nombre() {
        return tipo_nombre;
    }

    public void setTipo_nombre(String tipo_nombre) {
        this.tipo_nombre = tipo_nombre;
    }

    public String getTipo_descripcion() {
        return tipo_descripcion;
    }

    public void setTipo_descripcion(String tipo_descripcion) {
        this.tipo_descripcion = tipo_descripcion;
    }
    
}
