
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
    
    public ArrayList<Mod_mensajeros_get_set> consultar_un_Mensajero ( String men_nombre)
    {
        ArrayList<Mod_mensajeros_get_set> lista_mensajeros = new ArrayList<>();
        try {
            ps = cnn.prepareStatement("select men_nombre , men_id, men_usu_id from tb_mensajero where men_nombre = '"+men_nombre+"' ");
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
    
    public boolean insertarMensajero (Mod_mensajeros_get_set mengs)
    {
        boolean reg = false;
        int dat = 0;
        try {
            ps = cnn.prepareStatement("INSERT INTO tb_Mensajero (men_cedula,men_nombre,men_direccion,men_barrio,men_descripcion,men_telefono,men_email,men_usu_id)"
                    + " VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1,mengs.getMen_cedula());
            ps.setString(2, mengs.getMen_nombre());
            ps.setString(3, mengs.getMen_direccion());
            ps.setString(4, mengs.getMen_barrio());
            ps.setString(5, mengs.getMen_descripcion());
            ps.setString(6, mengs.getMen_telefono());
            ps.setString(7, mengs.getMen_email());
            ps.setString(8, mengs.getMen_usu_id());
            dat = ps.executeUpdate();
            if(dat > 0 )
            {
                reg = true;
            }
            else
            {
                reg = false;
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al insertar mensajero " + e);
        }
        return reg;
    }
}
