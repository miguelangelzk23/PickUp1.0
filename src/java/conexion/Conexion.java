
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    Connection cnn;

    public Connection conexiondb()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_pickup","root","");
            JOptionPane.showMessageDialog(null, "Conexion ok");
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "error al connectar" + e);
        }
        return cnn;
    }
    public static void main(String[] args)
    {
        Conexion conectar_bd = new Conexion();
        conectar_bd.conexiondb();
    }
}
