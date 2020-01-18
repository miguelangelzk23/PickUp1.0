
package modelo;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mod_mensajeros {
    
    Conexion conectar_bd = new Conexion();
    Connection cnn = conectar_bd.conexiondb();
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    public ArrayList<Mod_mensajeros_get_set> consultarMensajero ()
    {
        ArrayList<Mod_mensajeros_get_set> lista_mensajeros = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select * from tb_mensajero");
            rs = ps.executeQuery();
            while(rs.next())
            {
                Mod_mensajeros_get_set datos_mensajero = new Mod_mensajeros_get_set(rs.getInt(1),
                  rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                      rs.getString(7),rs.getString(8));
                
                lista_mensajeros.add(datos_mensajero);
                
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al consultar mensajero");
        }
        
        return lista_mensajeros;
    }
}
