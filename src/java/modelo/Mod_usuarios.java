
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Mod_usuarios {
    
    Conexion conectar_bd = new Conexion();
    Connection cnn = conectar_bd.conexiondb();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
public boolean insertarUusario (Mod_usuarios_get_set usugs)
{
    boolean reg = false;
    int dat = 0;
    try {
        ps = cnn.prepareStatement("INSERT INTO tb_Usuario (usu_nombre,usu_password,usu_rol,usu_estado,usu_foto) VALUES (?,?,?,?,?)");
        ps.setString(1, usugs.getUsu_nombre());
        ps.setString(2, usugs.getUsu_password());
        ps.setString(3,usugs.getUsu_rol());
        ps.setString(4, usugs.getUsu_estado());
        ps.setString(5, usugs.getUsu_foto());
        
        dat = ps.executeUpdate();
        if (dat > 0)
        {
            reg = true;
        }
        else
        {
            reg = false;
        }
    } catch (Exception e) {
     
        JOptionPane.showMessageDialog(null, "datos no se registraron correctamente" + e);
    }
    
    return reg;
}
    
}
