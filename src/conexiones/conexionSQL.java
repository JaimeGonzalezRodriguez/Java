package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author J@mes
 */
public class conexionSQL {
    Connection con;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/escuela","usuario2","12345678");
            //JOptionPane.showMessageDialog(null,"Connection status: OK");
        }catch (Exception e)
        {
                    JOptionPane.showMessageDialog(null,"Connection error");
                            }
            return con;
    }    
    
}
