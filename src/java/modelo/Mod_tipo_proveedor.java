
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mod_tipo_proveedor {
    
    Conexion conectar_bd = new Conexion();
    Connection cnn = conectar_bd.conexiondb();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public ArrayList<Mod_tipo_proveedor_get_set> consultarTipoProveedor ()
    {
        ArrayList<Mod_tipo_proveedor_get_set> listaTipos = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select * from tb_tipo_proveedor");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Mod_tipo_proveedor_get_set datos_tipos = new Mod_tipo_proveedor_get_set(rs.getInt(1), rs.getString(2),rs.getString(3));
                listaTipos.add(datos_tipos);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al consultar tipo de proveedor" + e);
        }
        
        return listaTipos;
    }
    
    
    public ArrayList<Mod_tipo_proveedor_get_set> consultar_un_TipoProveedor (int codigo_prove)
    {
        ArrayList<Mod_tipo_proveedor_get_set> lista_un_Tipos = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select * from tb_tipo_proveedor where tipo_codigo = '"+codigo_prove+"'");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Mod_tipo_proveedor_get_set datosun_tipos = new Mod_tipo_proveedor_get_set(rs.getInt(1),rs.getString(2),rs.getString(3));
                lista_un_Tipos.add(datosun_tipos);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al consultar  un tipo de proveedor" + e);
        }
        
        return lista_un_Tipos;
    }
}
