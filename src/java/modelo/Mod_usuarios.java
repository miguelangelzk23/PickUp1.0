
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mod_usuarios {
    
    Conexion conectar_bd = new Conexion();
    Connection cnn = conectar_bd.conexiondb();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
public ArrayList<Mod_usuarios_get_set> consultarUnUsuario (String nom_usuario)
{
    ArrayList<Mod_usuarios_get_set> lista = new ArrayList<>();
    try {
        ps = cnn.prepareStatement("select usu_id,usu_nombre from tb_usuario where usu_nombre = '"+nom_usuario+"'");
        rs = ps.executeQuery();
        while(rs.next())
        {
            Mod_usuarios_get_set consuta_un_usuario = new Mod_usuarios_get_set(rs.getInt(1),rs.getString(2));
            lista.add(consuta_un_usuario);
        }
    } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "error al consultar un mensajero "+ e);
    }
    
    return lista;
}
    
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
