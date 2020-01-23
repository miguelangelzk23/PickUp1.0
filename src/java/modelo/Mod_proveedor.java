
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mod_proveedor {
    
    Conexion conectar_bd = new Conexion();
    Connection cnn = conectar_bd.conexiondb();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    
    public ArrayList<Mod_proveedor_get_set> consultarProveedor ()
    {
        ArrayList<Mod_proveedor_get_set> lista_proveedor = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select * from tb_proveedor");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Mod_proveedor_get_set datos_proveedor = new Mod_proveedor_get_set(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6),rs.getInt(7),rs.getInt(8));
                
                lista_proveedor.add(datos_proveedor);
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al consultar proveedor");
        }
        
        return  lista_proveedor;
    }
    
    public boolean insertarProveedor (Mod_proveedor_get_set provegs)
    {
        boolean reg = false;
        int dat = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO tb_Proveedor (prove_nit,prove_nombre,"
                    + "prove_telefono,prove_email,prove_horario,prove_direccion,prove_usu_id,prove_tipo_codigo)VALUES(?,?,?,?,?,?,?,?)");
            ps.setString(1, provegs.getProve_nit());
            ps.setString(2, provegs.getProve_nombre());
            ps.setString(3, provegs.getProve_telefono());
            ps.setString(4, provegs.getProve_email());
            ps.setString(5, provegs.getProve_horario());
            ps.setString(6, provegs.getProve_diceccion());
            ps.setInt(7, provegs.getProve_usu_id());
            ps.setInt(8, provegs.getProve_tipo_codigo());
            
            dat = ps.executeUpdate();
            if(dat > 0)
            {
                reg = true;
            }
            else
            {
                reg = false;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al insertar un Proveedor" + e);
            
        }
        
        return reg;
    }
}
