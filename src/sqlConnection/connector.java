
package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author SOHAG
 */
public class connector {
    public Connection con=null;
    public Statement st=null;
    public connector(){
    }
    
        
    public Connection createConnection(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventoryDb", "root", "");
            //JOptionPane.showMessageDialog(null, "Connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(connector.class.getName()).log(Level.SEVERE, null, ex);
        }
         return con;
    }
}
